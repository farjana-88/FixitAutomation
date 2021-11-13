package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature", 
		glue = "com.stepdefinition" ,//stepdefition package
		plugin="",
		tags ="@test1"
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests {

	
	
	
}
