package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources",
        dryRun = false,
        strict = true,
       // tags = "@activities",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json"
        }

)
public class CucumberRunner {


}