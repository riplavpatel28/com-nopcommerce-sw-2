package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(" redirected to Login page", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("anu@gmail.com");
        //  Enter valid password
        driver.findElement(By.id("Password")).sendKeys("anu123456");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        // Verify the ‘Log out’ text is display
        String expectedDisplayLogOut = "Log out";
        String actualDisplayLogOut = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("Log Out Not display", expectedDisplayLogOut, actualDisplayLogOut);
    }

    @Test
    public void verifyTheErrorMessage() {
        // user should NOT login with invalid Credential
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("anu123@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("anu123");
        //Click on Login Button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("login was unsuccessful", expectedMessage, actualMessage);
    }


    @After
    public void ternDown() {
        //closeBrowser();
    }
}
































