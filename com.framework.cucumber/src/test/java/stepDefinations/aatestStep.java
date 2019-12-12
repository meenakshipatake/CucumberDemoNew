package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class aatestStep {

	@Before
	public void before()
	{
		System.out.println("before-last");
	}
	
	@After
	public void after()
	{
		System.out.println("after-last");
	}
	
	@Given("^Step_One$")
	public void step_one() {
	    System.out.println("Step One");
	}

	@When("^Step_Two$")
	public void step_two() {
		 System.out.println("Step Two");  
	}

	@Then("^Step_Three$")
	public void step_three() {
		 System.out.println("Step Three");
	}

	@Given("^This is given$")
	public void this_is_given() {
		//Assert.assertEquals(true, false);
	}

	@When("^This is when$")
	public void this_is_when() {
		 System.out.println("when");
	}

	@Then("^This is then$")
	public void this_is_then() {
		 System.out.println("then");
	}

	
	@Given("^This is testThree$")
	public void this_is_testThree() {
	    System.out.println("threegiven");
	}

	@When("^This is testThreewhen$")
	public void this_is_testThreewhen() {
	   System.out.println("thenwhen");
	}

	@Then("^This is testThreethen$")
	public void this_is_testThreethen() {
		System.out.println("thenthen");
	}



	
}
