Feature: Is it Saturday yet?
  Everybody wants to know when it's Saturday

  Scenario Outline: Today is or is not Saturday
    Given today is "<day>"
    When I ask whether it's Saturday yet
    Then I should be told "<answer>"
    Examples:
      | day            | answer |
      | Friday         | Nope   |
      | Saturday       | Nice!  |
      | Sunday         | Nope   |
      | Monday         | Nope   |