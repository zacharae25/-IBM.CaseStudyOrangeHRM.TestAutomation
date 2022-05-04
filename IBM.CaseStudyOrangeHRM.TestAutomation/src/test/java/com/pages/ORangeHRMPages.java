package com.pages;
//import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ORangeHRMPages {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement UserTxtField;
	public WebElement getUserTxtField() {
		return UserTxtField;
	}
	
	@FindBy(id="txtPassword")
	WebElement PassTxtField;
	public WebElement getPassTxtField() {
		return PassTxtField;
	}
	
	@FindBy(id="btnLogin")
	WebElement LoginBtn;
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	@FindBy(xpath=("//*[@id=\"menu_admin_viewAdminModule\"]/b"))
	WebElement AdminTab;
	public WebElement getAdminTab() {
		return AdminTab;
	}
	
	@FindBy(xpath=("//*[@id=\"menu_pim_viewPimModule\"]/b"))
	WebElement PIMTab;
	public WebElement getPIMTab() {
		return PIMTab;
	}
	
	@FindBy(id="empsearch_employee_name_empName")
	WebElement EmployeeName;
	public WebElement getEmployeeName() {
		return EmployeeName;
	}
	
	
	public ORangeHRMPages(WebDriver rDriver) {
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
}