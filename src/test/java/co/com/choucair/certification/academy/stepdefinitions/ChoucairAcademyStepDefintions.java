package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.model.AcademyChoucarData;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage () {OnStage.setTheStage(new OnlineCast());}

    @Given("^than brandon wants to learn automation at academy Choucair$")
    public void thanMiguelWantsToLearnAutomationAtAcademyChoucair(List<AcademyChoucarData> academyChoucarData) throws Exception {

        OnStage.theActorCalled( "Miguel").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucarData.get(0).getStrUser(),academyChoucarData.get(0).getStrPassword()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucarData> academyChoucarData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucarData.get(0).getStrCouser()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucarData> academyChoucarData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucarData.get(0).getStrCouser())));
    }

}
