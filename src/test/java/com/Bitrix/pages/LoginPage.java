package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    /*@FindAll({
        @FindBy(id = "prependedInput"),
            @FindBy(name = "_username"),

    })
    //public List<WebElement> usernameInput;

    @FindBys({
            @FindBy(id = "prependedInput"),
            @FindBy(name = "_username"),

    })

    //public List<WebElement> usernameInput;

     */

    @FindBy(name = "_username")

    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String usernameStr, String passwordStr){
        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }
}
