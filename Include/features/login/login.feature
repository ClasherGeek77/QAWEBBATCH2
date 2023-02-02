#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@featureLogin
Feature: I want to login using alot of account

  @scenarioLogin
  Scenario Outline: I want to login with many invalid account
    Given I want to open linkedin login page
    When I type email <email> and <password>
    And I click login
    Then I verify the <status> message in step

    Examples: 
      | email  | password | status |
      | name1@gmail.coms | pass123 | We don't recognize that email |
      | name1@gmail.com | pass143 | not the right password |