package com.vk.stepdefs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Hooks {

    void test() {
	System.out.println("hii");
    }

    public static WebDriver driver;
    public static String Browser = "Firefox";

    @Before
    public void setup() throws MalformedURLException {

	if (Browser.equalsIgnoreCase("Firefox")) {

	    System.out.println("Browser is Firefox");

	    FirefoxDriverManager.getInstance().setup();
	    driver = new FirefoxDriver();
	    driver.get("http://www.seleniumwebdriver.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	} else if (Browser.equalsIgnoreCase("Chrome")) {

	    ChromeDriverManager.getInstance().setup();
	    driver = new ChromeDriver();
	    driver.get("http://www.seleniumwebdriver.in/");

	} else if (Browser.equalsIgnoreCase("GridChrome")) {

	    DesiredCapabilities capability = DesiredCapabilities.chrome();

	    driver = new RemoteWebDriver(new URL("http://www.seleniumwebdriver.in/"), capability);

	}
    }

    @After
    public void QuitAndScreenshot() {

	driver.close();
    }

}
