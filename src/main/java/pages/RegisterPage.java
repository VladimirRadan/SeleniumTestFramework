package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{


    private By firstNameFiled = By.id("first_name");
    private By lastNameFiled = By.id("last_name");
    private By dobFiled = By.id("dob");
    private By addressFiled = By.id("address");
    private By postCodeFiled = By.id("postcode");
    private By cityFiled = By.id("city");
    private By stateFiled = By.id("state");
    private By countryFiled = By.id("");
    private By phoneFiled = By.id("phone");
    private By emailFiled = By.id("email");
    private By passwordFiled = By.id("password");

    private By registerButton = By.cssSelector(".btnSubmit");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    public void registerUser(){
        typeIn(firstNameFiled, "John");
    }



}
