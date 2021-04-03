#Autor: Miguel
@stories
Feature: Academy Choucair

  @scenario1
  Scenario: Search for a automation course
    Given than Miguel wants to learn automation at academy Choucair
    |strUser  |  | strPassword |
    |<strUser>|  |<strPassword>|
    When he search for the course Recursos Automatización Bancolombia on the choucair academy platform
    |strCourse    |
    |<strCourse>  |
    Then he finds the course called resources Recursos Automatización Bancolombia
    |strCourse |
    |<strCourse> |