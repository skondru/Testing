package Steps;

import static Steps.RunnerIT.driver;

import java.util.List;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactUsSteps {

	private String contactusURL = "http://qaworks.com/contact.aspx";

	@Given("^I am on the QAWorks Site$")
	public void i_am_on_the_QAWorks_Site() {
		driver.get(contactusURL);

	}

	@Then("^I should be able to contact QAWorks with the following information$")
	public void i_should_be_able_to_contact_QAWorks_with_the_following_information(DataTable userdetails) {
		List<List<String>> data = userdetails.raw();

		driver.findElement(By.id("ctl00_MainContent_NameBox")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("ctl00_MainContent_EmailBox")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("ctl00_MainContent_MessageBox")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("ctl00_MainContent_SendButton")).submit();

	}

}
