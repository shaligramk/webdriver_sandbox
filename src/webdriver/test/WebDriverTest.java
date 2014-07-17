/*
 WebDriver Test
 */
package webdriver.test;

import com.thoughtworks.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebDriverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/shawn/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://stage-pearson.chaucercloud.com/");
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.tagName("button"));
        username.sendKeys("shawn");
        password.sendKeys("nayana");
        button.click();

        System.out.println("Page title is: " + driver.getTitle());

        WebElement createProject = driver.findElement(By.cssSelector(".newProject"));
        createProject.click();

        WebElement reflowableCheck = driver.findElement(By.cssSelector("#bookTypeSelection8"));
        reflowableCheck.click();
        
        Select droplist = new Select(driver.findElement(By.cssSelector("#bookLayoutType8")));   
        droplist.selectByVisibleText("Import Existing Layout");
        
        System.out.println("Filling out Project Information");

        WebElement projectName = driver.findElement(By.name("jform[publication_name]"));
        WebElement pubName = driver.findElement(By.name("jform[publication_publisher]"));
        WebElement authorName = driver.findElement(By.name("jform[publication_authors]"));
        projectName.sendKeys("selenium_test");
        pubName.sendKeys("selenium_test2");
        authorName.sendKeys("selenium_test3");
        
        WebDriverWait wait = new WebDriverWait(driver,10);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#bookTabLiType8")));
        
        WebElement reflowabaleTab = driver.findElement(By.cssSelector("#bookTabAhrefID_8"));
        reflowabaleTab.click();
        
        driver.findElement(By.name("logo_8")).sendKeys("/Users/shawn/Desktop/FE_Automation/casperjs/assets/cover_pdf.png"); 
        driver.findElement(By.id("upload8_browse")).click();
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_RIGHT); 
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_RIGHT);
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_RIGHT);
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_DOWN); ;
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_DOWN); 
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_DOWN); 
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ARROW_DOWN); 
        driver.findElement(By.id("upload8_browse")).sendKeys(Keys.ENTER);
           
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        //Object c = js.executeScript("var x = document.getElementsByID('#upload8_browse');x.setAttribute('type', 'file');");
        //driver.findElement(By.id("upload8_browse")).sendKeys("/Users/shawn/Desktop/FE_Automation/casperjs/assets/gettsburg.pdf");
        
        driver.quit();
    }

}