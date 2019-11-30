Feature: Title

#scenario outline is used to pass parameters in the methods
Scenario: Radio Selection
Given User is on login page
When Enter the Username and Password
Then Login Successful
When Enter the wrong Username and Password
Then Login Un Successful


