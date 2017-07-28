package Steps;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/", plugin =
{ "progress", "junit:build/cucumber-junit-report/allcukes.xml", "html:build/cucumber",
        "json:build/cucumber-report/Report.json" }, tags =
{  }, snippets = SnippetType.CAMELCASE)
public class RunnerIT
{
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() throws Exception
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() throws Exception
    {
        driver.quit();
    }
}

