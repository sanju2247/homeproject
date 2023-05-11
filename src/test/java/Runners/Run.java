package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/tes/resources/FirstTest.feature",
        glue = {"Step_cucumberTest"}
)
public class Run extends AbstractTestNGCucumberTests {
}
