package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccoutPage {
	
public WebDriver driver;

	public NewAccoutPage(WebDriver driver) {
		
		this.driver=driver;	
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement  singinBtn; //button=Btn
	
	public void getSinginBtn() {
		singinBtn.click();
	}
	
	@FindBy(xpath="//a[@id='createAccountSubmit']") 
	WebElement newAmazonAccount;
	
	public void getnewAmazonAccount() {
		newAmazonAccount.click();
	}
	
	
	@FindBy(xpath="//input[@id='ap_customer_name']") 
	WebElement username;
	
	public void getusername(String string) {
		username.sendKeys(string);
	}
	

	@FindBy(xpath="//input[@id='ap_email']") 
	WebElement emailAddress;
	
	public void getemailAddress(String string) {
		username.sendKeys(string);
	}
	
	@FindBy(xpath="//input[@id='ap_password']") 
	WebElement enterPassword;
	
	public void getenterpassword(String string) {
		enterPassword.sendKeys(string);
	}
	
	
	@FindBy(xpath="//input[@id='ap_password_check']") 
	WebElement reEnterPassword;
	
	public void getreEnterpassword(String string) {
		reEnterPassword.sendKeys(string);
	}
	
	@FindBy(xpath="//input[@id='continue']") 
	WebElement singUpButtond;
	
	public void getsingUpButtond() {
		singUpButtond.click();
	}
	
	
	
	
}
