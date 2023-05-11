Feature: Web login
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When The user enters valid credentials
    And hits submit
    Then the user Should be logged in successfully