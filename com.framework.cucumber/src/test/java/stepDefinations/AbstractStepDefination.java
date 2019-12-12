package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AbstractStepDefination {

//public static WebDriver driver;
	
	//@Given("^User is on login page$")
@Before
	public void before() {
System.out.println("before scenario");		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meenu\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");

		//driver=new ChromeDriver();
		//driver.get("http://newtours.demoaut.com/");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.name("userName")).sendKeys("batman");
		//driver.findElement(By.name("password")).sendKeys("batman");
		//driver.findElement(By.name("login")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

@After
public void aaatearDown(Scenario s)
{
System.out.println("after scenario");
	/*if(s.isFailed())
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
Date date=new Date();
		
		
		String strDateFormat = "dd-MMM-yyyy_hh_mm_ss_a "; //Date format is Specified
		  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		  
		  String datestr=objSDF.format(date);
		  

		  
		File raw=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			String path="C:\\Users\\Meenu\\Desktop\\"+datestr+".png";
			//FileHandler.copy(raw, new File("C:\\Users\\Meenu\\Desktop\\"+datestr+".png"));
			org.openqa.selenium.io.FileHandler.copy(raw, new File(path));
			Reporter.addScreenCaptureFromPath(path);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	
	
	//driver.close();
	}

	//@When("^Enter the Username and Password$")

@Given("^User is on login page$")
public void user_is_on_login_page() {
	System.out.println("in given");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("^Enter the Username and Password$")
public void enter_the_Username_and_Password() {
System.out.println("in when");


	
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
}

@Then("^Login Successful$")
public void login_Successful() {
	System.out.println("login successful");
	//driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).isDisplayed();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("^Enter the wrong Username and Password$")
public void enter_the_wrong_Username_and_Password() {
	//driver.get("http://www.google.com/");
	System.out.println("Enter the wrong Username and Password");
	//driver.findElement(By.name("userName")).sendKeys("1batman");
	//driver.findElement(By.name("password")).sendKeys("1batman");
	//driver.findElement(By.name("login")).click();
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
}

@Then("^Login Un Successful$")
public void login_Un_Successful() {
	System.out.println("Login Un Successful");
	//driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).isDisplayed();

    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
}


		
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	

	
}
