package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username =By.xpath("//input[@id='user-name']");
    By password =By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id ='login-button']");
    By productsTitle =By.xpath("//span[@class='title']");
    By numberOfProducts = By.xpath("//div[@class='inventory_item']");
    public void enterUserName(String text){
        sendTextToElement(username,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getProductsTitle(){
        return getTextFromElement(productsTitle);
    }
    public int getNumberOfProductsDisplayed(){
        return getTheNumberOfElementOnTheList(numberOfProducts);
    }

}
