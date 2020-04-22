package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import javax.rmi.CORBA.Util;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class HomePage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());




    @FindBy(xpath = "//a[@class='fedora-navbar-link navbar-link']")
    WebElement _practiceLink;
    //
    @FindBy(linkText = "Enroll now")
    WebElement _enrollNowLink;

    public void clickOnPracticeLink() {
        Reporter.log("click on practice link"+_practiceLink.toString()+"<br>");
        clickOnElement(_practiceLink);
        log.info("click on practice link"+_practiceLink.toString());
    }

    public void clickOnEnrolNowLink() {
        Reporter.log("click on enroll link"+_enrollNowLink.toString()+"<br>");
        clickOnElement(_enrollNowLink);
        log.info("click on enroll link"+_enrollNowLink.toString());

    }
}
