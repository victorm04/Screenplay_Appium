package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login with(String username, String password) {
        return Tasks.instrumented(Login.class,username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(EMAIL_INPUT),
                Click.on(EMAIL_NEXT_BUTTOM),
                WaitUntil.the(PASSWORD_LINK, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(PASSWORD_LINK),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(PASSWORD_NEXT_BUTTON),
                WaitUntil.the(TEXT_VERIFY_LABEL, isPresent()).forNoMoreThan(10).seconds()
        );
    }
}
