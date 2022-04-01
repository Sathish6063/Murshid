package stepdef;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Base {
	
	@Given("User launches the application")
	public void user_launches_the_application() {
	    getBrowser("chrome");
	    getUrl("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("User enters valid login credintials")
	public void user_enters_valid_login_credintials() {
	    sendkey(driver.findElement(By.id("txtUsername")), "Admin");
	    sendkey(driver.findElement(By.id("txtPassword")), "admin123");
	}

	@When("User clicks login")
	public void user_clicks_login() {
	   click(driver.findElement(By.id("btnLogin")));
	}

	@Then("User navigates to the employee list")
	
	public void user_navigates_to_the_employee_list() {
	    Actions navi= new Actions(driver);
	    navi.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).perform();
	    navi.moveToElement(driver.findElement(By.id("menu_pim_viewEmployeeList"))).perform();
	    click(driver.findElement(By.id("menu_pim_viewEmployeeList")));
	}

	@Given("User clicks on next page")
	public void user_clicks_on_next_page() {
	    click(driver.findElement(By.linkText("Next")));
	}

	@When("User clicks on previos page")
	public void user_clicks_on_previos_page() {
		  click(driver.findElement(By.linkText("Previous")));
	}

	@Then("User clickes on add employee button")
	public void user_clickes_on_add_employee_button() {
	    click(driver.findElement(By.id("btnAdd")));
	}

	@Given("User enters employee name")
	public void user_enters_employee_name() {
	    sendkey(driver.findElement(By.id("firstName")), "radhakrishnan");
	    sendkey(driver.findElement(By.id("middleName")), "gopal");
	    sendkey(driver.findElement(By.id("lastName")), "venu");
	    
	}

	@When("User enter the employee id")
	public void user_enter_the_employee_id() {
		sendkey(driver.findElement(By.id("employeeId")), "12345");
	}

	@When("User nees to clicks the create login Details radio button")
	public void user_nees_to_clicks_the_create_login_details_radio_button() {
	    click(driver.findElement(By.id("chkLogin")));
	}

	@When("User creates login details")
	public void user_creates_login_details() {
		sendkey(driver.findElement(By.id("user_name")), "ramamoorty675374");
		sendkey(driver.findElement(By.id("user_password")), "radhakrishnan675374");
		sendkey(driver.findElement(By.id("re_password")), "radhakrishnan675374");
	}

	@Then("User clicks on save")
	public void user_clicks_on_save() {
	    click(driver.findElement(By.id("btnSave")));

	}

	@Given("User navigates to the employeeLIST")
	public void user_navigates_to_the_employee_list1() throws Throwable {
//		Actions navi= new Actions(driver);
//	    navi.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).perform();
//	    navi.moveToElement(driver.findElement(By.id("menu_pim_viewEmployeeList"))).perform();
		Thread.sleep(2000);
	    click(driver.findElement(By.linkText("Employee List")));
//	    getUrl("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");
	}

	@When("User enters the empolyee name and clicks on search")
	public void user_enters_the_empolyee_name_and_clicks_on_search() throws Throwable {
		Thread.sleep(2000);
		clear(driver.findElement(By.xpath("//input[@name='empsearch[employee_name][empName]']")));
		Thread.sleep(2000);

		sendkey(driver.findElement(By.xpath("//input[@name='empsearch[employee_name][empName]']")), "radhakrish");
		Actions enter= new Actions(driver);
		enter.sendKeys(Keys.ENTER).perform();
		
	}

	@Then("User is displayed record if any")
	public void user_is_displayed_record_if_any() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File navscr=ts.getScreenshotAs(OutputType.FILE);
		File desFile= new File("C:\\Users\\saskl\\eclipse-workspace\\ORANGETWT\\snaps\\employee.png");
		try {
			FileHandler.copy(navscr, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}

