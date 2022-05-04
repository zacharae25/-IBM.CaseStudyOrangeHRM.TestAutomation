package com.stepDef;
import org.testng.AssertJUnit;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.pages.ORangeHRMPages;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ORangeHRMstepDef {
	
	
	WebDriver driver;
	ORangeHRMPages ORangeHRMOR;
	FileInputStream fileLoc;
	Properties prop;

	@Before
	public void setUp() throws IOException {
		fileLoc = new FileInputStream("C:\\Users\\P102GDPH1\\eclipse-workspace\\IBM.CaseStudyOrangeHRM.TestAutomation\\src\\test\\java\\testdata\\config.properties");
		prop = new Properties();
		prop.load(fileLoc);
		
	}

	@Given("the browser is invoked")
	public void the_browser_is_invoked() {
		String Browser = prop.getProperty("Browser");
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("Ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else if(Browser.equalsIgnoreCase("Firefo")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		ORangeHRMOR = new ORangeHRMPages(driver);
	
	}
	@Given("the url the launched")
	public void the_url_the_launched() {
		 String Url = prop.getProperty("Url");
			
		driver.get(Url);
	}
	
	@Given("The user is on ORangeHRM home page")
		public void the_user_is_on_ORangeHRM_home_page() {
			boolean contains = driver.getTitle().contains("ORangeHRM");
			AssertJUnit.assertTrue(contains);
			System.out.println("Page title is : " + driver.getTitle());
		   
	}
	

	@When("The user types username")
	public void the_user_types_user_item() throws InterruptedException {
		ORangeHRMOR.getUserTxtField().sendKeys("Admin");
		Thread.sleep(1000);	
	    }
	
	@When("The user types password")
	public void the_user_types_pass_item() throws InterruptedException {
		ORangeHRMOR.getPassTxtField().sendKeys("admin123");
		Thread.sleep(1000);	
	    }
	
	@When("The login button is clicked")
	public void the_login_button_is_clicked() throws InterruptedException {
	ORangeHRMOR.getLoginBtn().click();
	Thread.sleep(1000);	
	}
	
	@When("The admin tab is clicked")
	public void the_admin_tab_is_clicked() throws InterruptedException {
	ORangeHRMOR.getAdminTab().click();
	Thread.sleep(1000);	
	}
	
	@When("The PIM tab is clicked")
	public void the_PIM_tab_is_clicked() throws InterruptedException {
	ORangeHRMOR.getPIMTab().click();
	Thread.sleep(1000);	
	}
	
	@When("The user types Linda Anderson on employee name")
	public void the_user_types_Linda_Anderson_on_employee_name() throws InterruptedException {
	ORangeHRMOR.getEmployeeName().sendKeys("Linda Anderson");
	Thread.sleep(1000);	
	}

	
	@Then("close the browser")
	public void close_the_browser() {
		
		driver.close();
		
	}

}