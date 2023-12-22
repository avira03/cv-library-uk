package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

//    @CacheLookup
//    @FindBy(xpath = "//h2[@class='text--medium mb0' and text()='0 jobs found.']")
//    WebElement zeroJobsFound;


    public String verifyTheResultText() {
        log.info("Getting result Text :" + resultText.toString());
        return getTextFromElement(resultText);
    }

//    public String verifyTheZeroJobsText() {
//        log.info("Getting result Text :" + zeroJobsFound.toString());
//        return getTextFromElement(zeroJobsFound);
//    }
}
