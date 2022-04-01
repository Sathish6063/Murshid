package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\saskl\\eclipse-workspace\\ORANGETWT\\src\\test\\resources\\Feature", glue= {"stepdef"}, dryRun=false,monochrome=false,plugin="pretty")

public class runner {
	
	public static WebDriver driver;
	
	
}
