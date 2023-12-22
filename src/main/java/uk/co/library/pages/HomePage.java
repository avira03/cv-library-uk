package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMinLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMaxLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='action-wrapper']//span[contains(text(),'Accept All')]")
    WebElement acceptCookes;


    public void switchToiFrame() {
        switchToFrame("gdpr-consent-notice");
    }

    public void clickOnAcceptAllButton() {
        clickOnElement(acceptCookes);
    }

    public void backFromIFrame() {
        backfromIframe();
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Entering jobTitle : " + jobTitleField.toString());
    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
        log.info("Entering location : " + locationField.toString());
    }

    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Clicking on :" + distanceDropDown.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
        log.info("Click on : " + moreSearchOptionsLink.toString());
    }

    public void enterMinSalary(String minsalary) {
        sendTextToElement(salaryMinLink, minsalary);
        log.info("Entering salary : " + salaryMinLink.toString());
    }

    public void enterMaxSalary(String maxsalary) {
        sendTextToElement(salaryMaxLink, maxsalary);
        log.info("Entering salary : " + salaryMaxLink.toString());
    }

    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeLink, salaryType);
        log.info("Entering salary type : " + salaryTypeLink.toString());
    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeLink, jobType);
        log.info("Entering job type : " + jobTypeLink.toString());
    }

    public void clickOnFindJobButton() {
        clickOnElement(findJobButton);
        log.info("Click on : " + findJobButton.toString());
    }


}
