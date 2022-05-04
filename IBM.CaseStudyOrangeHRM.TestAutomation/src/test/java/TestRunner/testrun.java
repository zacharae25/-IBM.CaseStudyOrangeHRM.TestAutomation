package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\P102GDPH1\\eclipse-workspace\\IBM.CaseStudyOrangeHRM.TestAutomation\\src\\test\\java\\com\\features\\ORangeHRM_Feature_001.feature",
		glue="com.stepDef",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","json:target/MyReports/report.json",
				"json:target/cucumber.json",
		"junit:target/MyReports/report.xml"},
		publish=true


		)


public class testrun extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
