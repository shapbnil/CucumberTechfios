package runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
				features="D:\\Biplab IT Training\\Eclipse Laptop\\CucumberTechfios\\src\\main\\java\\features", 
				glue="steps",
				monochrome = true,
				plugin = {"pretty", "html:target/cucumber", "json: target/cucumber.json", "junit:target/cukes.xml"},
				dryRun = false,
				strict = false )

public class LoginRunner {

}
