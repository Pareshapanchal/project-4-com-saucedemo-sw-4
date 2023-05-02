package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    //1. userSholdLoginSuccessfullyWithValidCredentials
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        // * Enter “standard_user” username
        loginPage.enterUserName("standard_user");
        // * Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        // * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // * Verify the text “PRODUCTS”
        String expectedProductsTitle ="Products";
        String actualProductsTitle = loginPage.getProductsTitle();
        Assert.assertEquals(actualProductsTitle,expectedProductsTitle,"Not Match");
    }
    @Test
    // 2. verifyThatSixProductsAreDisplayedOnPage
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // * Enter “standard_user” username
        loginPage.enterUserName("standard_user");
        // * Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");
        // * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // * Verify that six products are displayed on page
        int expectedNumberOfProductsDisplayed = 6;
        int actualNumberOfProductsDisplayed = loginPage.getNumberOfProductsDisplayed();
        Assert.assertEquals(actualNumberOfProductsDisplayed,expectedNumberOfProductsDisplayed,"Not Match");
    }
}
