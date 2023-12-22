package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTest {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Accept the cookies")
    public void acceptTheCookies() {
        new HomePage().switchToiFrame();
        new HomePage().clickOnAcceptAllButton();
        new HomePage().backFromIFrame();
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String minsalary) {
        new HomePage().enterMinSalary(minsalary);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String maxsalary) {
        new HomePage().enterMaxSalary(maxsalary);
    }


    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);

    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String expectedResult) {
        Assert.assertTrue(new ResultPage().verifyTheResultText().contains(expectedResult), "Message not displayed");
    }


}
