/*
WebDriver Test
 */
package webdriver.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.quit();
    }
    
}
