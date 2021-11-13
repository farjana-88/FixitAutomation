package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import com.common.Base;
import com.pages.NewAccoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountSteps extends Base{
	
NewAccoutPage p;
   
	@Given("User on home page")
	public void user_on_home_page() {
		getDriver();
		p=PageFactory.initElements(driver, NewAccoutPage.class);
	}

	@When("User click on singin button")
	public void user_click_on_singin_button() {
		p.getSinginBtn();

		
	}

	@When("User click on create a new amazon account")
	public void user_click_on_create_a_new_amazon_account() {
		p.getnewAmazonAccount();
		//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	  
	}

	@When("User enter username as {string}}")
	public void user_enter_username_as(String string) {
		p.getusername(string);
	    //driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(string);
	}

	@When("User enter email address as {string}")
	public void user_enter_email_address_as(String string) {
		p.getusername(string);
	
	    
		
	}
	@When("user enter password as {string}")
	public void user_enter_password_as(String string) {
		p.getenterpassword(string);
	   
	}

	@When("User enter re-password as {string}")
	public void user_enter_re_password_as(String string) {
	    p.getreEnterpassword(string);
	   
	}

	@When("user can sing up button")
	public void user_can_sing_up_button() {
	    p.getsingUpButtond();
	 
	}

	@Then("user can singup successfuly")
	public void user_can_singup_successfuly() {
	    
	    Assert.assertEquals(driver.getTitle(), "Amazon Registration");
	}

}
