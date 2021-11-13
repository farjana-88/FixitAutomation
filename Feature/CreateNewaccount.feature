@test1
Feature: Create a new account

Scenario Outline: creating account for amazon

Given User on home page
When User click on singin button
And User click on create a new amazon account
And User enter username as "<username>"
And User enter email address as "<email>"
And user enter password as "<password>"
And User enter re-password as "<Re-enter password>"
And user can sing up button
Then user can singup successfuly

Examples:
|username|email|password|Re-enter password|
|Farjana|farjana_tani88@yahoo.com|pass123|pass123|
|Bashar|Farjana.shamim0827@gmail.com|pass2345|pass2345|


#Feature: Sing-in 
#
#Scenario Outline: creating Sing-in
#
#Given User on home page
#When User click on singin button
#And User enter on "<Email or moblie phone number>"
#And User click on "<Continue>"
#Then user can sing












