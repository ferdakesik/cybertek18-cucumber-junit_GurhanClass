@etsyWip
Feature:  Etsy search feature
  Agile story: User should be able to enter search terms and see
               relevant results in the page in the title

  Background: User is on the Etsy home page
    Given User is on the Etsy home page page


  Scenario: Title verification
    Then User should be able to see title is as expected

    #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Title verification after search term
    When User searches "apple" in the search box
    And User clicks to search button
    Then User should see "Apple" in the Etsy title
