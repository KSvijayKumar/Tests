package com.dummytest.Tests;

import com.dummytest.Base;
import com.dummytest.PageActions.BasePageAction;
import com.dummytest.TestData.TocData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static sun.plugin.javascript.navig.JSType.URL;

public class SmokeTest extends Base {

    @Test(dataProvider = "SetTestData",dataProviderClass = TocData.class)
    public void FirstTest(String origin,String destination,String email,String password,String cvv) {
        BasePageAction xyz = new BasePageAction(getDriver());
        xyz.enterSearchCriteria(origin,destination,email,password,cvv);
    }
}
