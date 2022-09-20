package com.tt.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@automated", 
            features = {"/StockWatchBDD/src/test/resources/features/Login.feature"},
            glue = {"com.tt.definations"},
            plugin = { "pretty","html:target/cucumber-reports.htlm"})

public class cucumberRunnerTests extends AbstractTestNGCucumberTests{
	

}
