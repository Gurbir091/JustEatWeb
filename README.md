Downlaod Java and eclipse as IDE for write down test script
create new Maven project named as Test with GroupID test and artifactID automate
select quicktest template of maven project as per standards cucumber framework only support quickstart
write feature file in gherkin langauge as follows
Feature: Use the website to find restaurants
         So that I can order food
         As a hungry customer
         I want to be able to find restaurants in my area

Scenario: Positive Search for restaurants in an area
  Given I want food in "AR51 1AA"
  When I search for restaurants
  Then I should see some restaurants in "AR51 1AA"
    
  Scenario: Negative Search for restaurants in invalid postcode
  Given I want food in "L2W 1k2"
  When  submit information
  Then I should see error with invalid Postcode
  use chrome plugin-- Tidy Gherkin to convert Feature file into step definitions
  write test script for 2 scenerio  and 6 steps
  I use cucumber framework with Java langauge
  
  Technical Questions Answers
  
  1.	How long did you spend on the technical test? What would you add to your solution if you had more time? If you didn't spend much time on the technical test then use this as an opportunity to explain what you would add.
- Developed and verified frameworks and selenium regression test scripts. Intense mutation test was a mandate for every cycle or any new test development which was accomplished.

2.	What do you think is the most interesting trend in test automation?
- I would thing its the transformation from traditional project development model to Continuous Integration and Continuous Development

3.	How would you implement test automation in a legacy application? Have you ever had to do this?
I haven't had the opportunity to work on legacy applications as primarily I did Web Automation. However if given an opportunity, depending on the nature of the legacy application (ex: Mainframe CICS), I would use more compatible tools like UFT or LFT

4.	 How would you improve the customer experience of the JUST EAT website?
I observe that the response times can be improved on the site, the website currently asks for location info from the user, but I feel it should pick it up from the IP by default and suggest local choices automatically, keeping the business proactive.

5.	Please describe yourself using JSON.
{
"name": "Gurbir",
"lastname": "Singh",
"nationality": "Canadian",
"livesin": "Brampton",
"passions": [
"Programming",
"Psychology",
"Teaching others"
],
"interests": [
"Education",
"Marketing"
],

"dreams": [
"To make this world a better place!"
],

"believes": [
"That we should all have a chance in life, we should not be judged because of our color, ethnicity and educational background!"
]

