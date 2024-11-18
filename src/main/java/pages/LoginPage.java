package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


    private By emailFiled = By.id("email");
    private By passwordFiled = By.cssSelector("input[data-test='password']");
    private By loginButton = By.cssSelector(".btnSubmit");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginUser(String username, String password){
        typeIn(emailFiled, username);
        typeIn(passwordFiled, password);
        clickOnElement(loginButton);
    }

    public boolean isOnLoginPage(){
        return true;// dodati validaciju da se korisnik nalazi na login formi
    }




//goToRegisterPage(){
// return new RegisterPage();
//}

}
