package com.vk.acceptanceTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags= {"@tag2"},plugin={"pretty"},glue= {"com.vk"},features={"src/test/resources/features/"})

public class RunCuke {
	
	

}
