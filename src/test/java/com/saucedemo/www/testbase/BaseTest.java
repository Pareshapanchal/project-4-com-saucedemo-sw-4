package com.saucedemo.www.testbase;

import com.saucedemo.www.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.saucedemo.www.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod// Before every method this method will be invoked and will open the particular browser
    public void setUp(){selectBrowser(browser);}
    @AfterMethod// After every method this method will be invoked, and it will close all the browsers.
    public void tearDown(){

        closeBrowser();
    }
}
