package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private final static By USER_NAME_INPUT = By.id("username");
    


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
