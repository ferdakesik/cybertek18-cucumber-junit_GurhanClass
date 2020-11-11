package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin="html:target/cucumber-report.html",
        features = "src\\test\\resources\\features", //from content root
        glue = "com\\cybertek\\step_definitions", //from source root
        dryRun = false,
        tags ="@ScenarioOutline"

)

public class CucumberRunner {
}