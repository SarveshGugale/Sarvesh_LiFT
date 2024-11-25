Feature: loggedIn to MentoraLiFT

  Scenario: To validate able to login successfully to MentoraLiFT
    Given "https://beta-dev.mentoralift.ai/login"
    When Fill Email ID "Sarvesh+51@mentora.institute"
    When Fill Password "Mentora@2024"
    And Enable Login button & click
    Then Home page displayed
