
@wikiSteve
Feature: Wiki title search verification

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

    Scenario: Search functionality search verification
      When User searches "Steve Jobs" in the wiki search page
      Then User should see "Steve Jobs" in the wiki title

      Scenario: Search functionality header verification
        When User searches "Steve Jobs" in the wiki search page
        Then User should see "Steve Jobs" in the main header