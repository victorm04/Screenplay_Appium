package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT =
            Target.the("email input field")
                    .located(By.id("org.wordpress.android:id/input"));
    public static final Target EMAIL_NEXT_BUTTOM =
            Target.the("Next button on email input page")
                    .located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target PASSWORD_LINK =
            Target.the("Option that allow us to insert the password")
                    .located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target PASSWORD_INPUT =
            Target.the("Password intput field")
                    .located(By.id("org.wordpress.android:id/input"));
    public static final Target PASSWORD_NEXT_BUTTON =
            Target.the("next button on password input page")
                    .located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target TEXT_VERIFY_LABEL =
            Target.the("header that show us we are logged")
                    .located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
