package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement findRegisterLink = driver.findElement(By.linkText("Register"));
        findRegisterLink.click();
        String expectedText = "Register";
        String actualText = driver.findElement(By.linkText("Register")).getText();
        Assert.assertEquals("Redirect page on register", actualText, expectedText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        //click on the ‘Register’link
        WebElement findRegisterLink= driver.findElement(By.linkText("Register"));
        findRegisterLink.click();

        //Select gender radio button
         driver.findElement(By.id("gender-female")).click();


        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Rupal");

        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("24");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1990");
        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("prime123456");
        // Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("prime123456");
        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        // Verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.xpath("//div[text() = 'Your registration completed']")).getText();
        Assert.assertEquals("Your registration completed", expectedMessage,actualMessage);

    }
    @After
    public void ternDown() {
        closeBrowser();
    }
}

