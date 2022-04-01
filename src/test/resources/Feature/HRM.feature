Feature: OrangeHRM

  @tag1
  Scenario: User launchs the application
    Given User launches the application
    When User enters valid login credintials
    And User clicks login
    Then User navigates to the employee list

  @tag2
  Scenario: User navigates between data pages
    Given User clicks on next page
    When User clicks on previos page
    Then User clickes on add employee button

  @tag3
  Scenario: User needs to enter the employee full name
    Given User enters employee name
    When User enter the employee id
    And User nees to clicks the create login Details radio button
    And User creates login details
    Then User clicks on save

  @tag4
  Scenario: User searches for the new added employee
    Given User navigates to the employeeLIST
    When User enters the empolyee name and clicks on search
    Then User is displayed record if any
