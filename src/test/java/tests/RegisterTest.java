package tests;

import org.testng.annotations.BeforeMethod;
import pages.RegisterPage;

public class RegisterTest {

    RegisterPage registerPage;

    @BeforeMethod
    public void registerSetup(){
        registerPage = new RegisterPage();
    }

}
