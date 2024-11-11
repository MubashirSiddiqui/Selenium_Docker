/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumTestDocker {
    public static ChromeOptions options;
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    
    
    public static String remote_url_chrome = "http://localhost:4444/";
    
   
    @BeforeTest
    public static void Setup() throws MalformedURLException{
        options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
    }
    
    @Test
    void teststeps() throws InterruptedException{
        WebDriver driver = getDriver();

  try {
        driver.navigate().to("https://www.google.com");
        
           driver.get("https://www.google.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Wait for the page to load (use implicit wait)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Find the search box using its name attribute
            WebElement searchBox = driver.findElement(By.name("q"));

            // Enter "Pakistan" in the search box
            searchBox.sendKeys("Pakistan");

            // Submit the search form
            searchBox.submit();

            // Wait for results to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after a short delay to view the results
            try {
                Thread.sleep(5000); // Wait 5 seconds to observe the results
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
        
        
    }

    private WebDriver getDriver() {
        return driver.get();
    }
}
