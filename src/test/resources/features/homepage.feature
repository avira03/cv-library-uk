Feature: Job search feature

  As a user I want to verify the job search using different data set

  Scenario Outline: Verify job search results using different data set
    Given I am on homepage
    When Accept the cookies
    And I enter job title "<JobTitle>"
    And I enter Location "<Location>"
    And I select distance "<Distance>"
    And I click on moreSearchOptionsLink
    And  I enter salaryMin "<SalaryMin>"
    And  I enter salaryMax "<SalaryMax>"
    And  I select salaryType "<SalaryType>"
    And  I select jobType "<JobType>"
    And  I click on Find Jobs button
    Then I verify the result "<result>"

    Examples:

      | JobTitle      | Location | Distance | SalaryMin | SalaryMax | SalaryType | JobType        | result                                  |
      | Tester        | Harrow   | 5 miles  | 30000     | 50000     | Per annum  | Permanent      | Permanent Tester jobs in Harrow         |
      | Admin         | Hays     | 7 miles  | 1500      | 1700      | Per month  | Contract       | Contract Admin jobs in Hays             |
      | Electrician   | Ruislip  | 1 mile   | 400       | 500       | Per day    | Part Time      | Part Time Electrician jobs in Ruislip   |
      | Qa Engineer   | Ealing   | 2 miles  | 1000      | 1200      | Per week   | Temporary      | Temporary Qa Engineer jobs in Ealing    |
      | Manual Tester | Watford  | 10 miles | 25000     | 40000     | Per annum  | Permanent      | Permanent Manual Tester jobs in Watford |
      | Developer     | Slough   | 25 miles | 50        | 200       | Per hour   | Apprenticeship | Apprenticeship Developer jobs in Slough |
