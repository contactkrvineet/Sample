package com.vk.stepdefs;

import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;
//import com.vk.pages.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class LoginPageStepDefs {

	private final WebDriver driver;
	//private final HomePage homepage;

	@Inject
	public LoginPageStepDefs() {
	//	this.homepage=homepage;
		driver = Hooks.driver;
	}

	@Given("^I choose to check google Login Page$")
	public void i_choose_to_check_Google_LoginPage() throws Throwable {
		driver.getCurrentUrl();
		System.out.println("Current Url is "+driver.getCurrentUrl());

	}

}
