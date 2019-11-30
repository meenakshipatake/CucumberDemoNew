package com.framework.cucumber;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//import cucumber.api.juit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
				glue= {"stepDefinations"},
				monochrome = true,
				plugin ={/*"pretty", "html:target/htmlrepo/report.html",*/ "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter::target/cucumber/ExtentReport.html"},
				//plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
				dryRun=false
				
	
				)						
public final class testRunner {
	
	
	
	@AfterClass
	public static void test()
	{
		Reporter.loadXMLConfig(new File("C:\\Users\\Meenu\\eclipse-workspace\\com.framework.cucumber\\extent-config.xml"));
		//Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}

 
	
}
