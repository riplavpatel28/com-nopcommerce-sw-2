package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String BaseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(BaseURL);

    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement findComputerTab = driver.findElement(By.linkText("Computers"));
        findComputerTab.click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Redirect to computerPage", actualText, expectedText);
    }
        @Test
        public void userShouldNavigateToElectronicsPageSuccessfully() {
            WebElement findElectronicsTab = driver.findElement(By.linkText("Electronics"));
            findElectronicsTab.click();
            String expectedText = "Electronics";
            String actualText = driver.findElement(By.linkText("Electronics")).getText();
            Assert.assertEquals("Redirect to electronics page", expectedText, actualText);
        }

        @Test
        public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement findApparelTab = driver.findElement(By.linkText("Apparel"));
        findApparelTab.click();
        String expectedText ="Apparel";
        String actualText =driver.findElement(By.linkText("Apparel")).getText();
        Assert.assertEquals("redirect to Apparel page",expectedText,actualText);


        }
        @Test
        public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement findDigitalDownloadTab = driver.findElement(By.linkText("Digital downloads"));
        findDigitalDownloadTab.click();
        String expectedText = "Digital downloads";
        String actualText =driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Redirect to download page",expectedText,actualText);

        }
        @Test
        public void userShouldNavigateToBooksPageSuccessfully(){
            WebElement findToBookPageTab = driver.findElement(By.linkText("Books"));
            findToBookPageTab.click();
            String expectedText = "Books";
            String actualText =driver.findElement(By.tagName("h1")).getText();
            Assert.assertEquals("Redirect to To Book page",expectedText,actualText);

        }
        @Test
        public void userShouldNavigateToJewelryPageSuccessfully(){
            WebElement findToJewelryPageTab = driver.findElement(By.linkText("Jewelry"));
            findToJewelryPageTab.click();
            String expectedText = "Jewelry";
            String actualText =driver.findElement(By.tagName("h1")).getText();
            Assert.assertEquals("Redirect to To Jewelery Page",expectedText,actualText);

        }
        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully(){
            WebElement findToGiftCardsPageTab = driver.findElement(By.linkText("Gift Cards"));
            findToGiftCardsPageTab.click();
            String expectedText = "Gift Cards";
            String actualText =driver.findElement(By.tagName("h1")).getText();
            Assert.assertEquals("Redirect to To Jewelery Page",expectedText,actualText);

        }
        @After
        public void teardown(){
        //close browser
        }




        }



