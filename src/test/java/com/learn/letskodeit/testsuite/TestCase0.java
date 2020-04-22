package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestCase0 extends TestBase {

    HomePage homePage;

    @BeforeMethod(groups = {"Regression"})
        public void setUp(){
            homePage = new HomePage();
        }


    @Test (priority = 0,groups = {"Regression"})
    public void userShouldNavigateToPracticeLink(){
        homePage.clickOnPracticeLink();
    }
}
