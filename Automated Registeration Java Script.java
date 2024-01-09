// This Code Shows a simple Automated Registration Test Process 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
    private WebDriver driver;

    @BeforeMethod
	
    public void setUp() {
	// Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	// Initialize ChromeDriver
        driver = new ChromeDriver();
	// Maximize browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testRegistration() {
	// Open Rrquired URL & Identity needed elements & Send orders to them 
        driver.get("https://example.com/register");
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("John");
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Doe");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("johndoe@example.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password123");
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
        confirmPasswordField.sendKeys("password123");
        WebElement registerButton = driver.findElement(By.id("registerButton"));
        registerButton.click();
        WebElement successMessage = driver.findElement(By.id("successMessage"));
	// Verify that Registration successful
        Assert.assertEquals(successMessage.getText(), "Registration successful!");
    }

    @AfterMethod
    public void tearDown() {
	// Quit from created driver
        driver.quit();
    }
}
 