Feature: Validate ORangeHRM application for its functonality
  Background: Pre requisite to launch the browser and url
    Given the browser is invoked
    And the url the launched
  Scenario Outline: Validate username and password in ORangeHRM application
    When The user types username
    When The user types password
    When The login button is clicked
    
    When The admin tab is clicked
    
    When The PIM tab is clicked
    When The user types Linda Anderson on employee name
    Then close the browser
