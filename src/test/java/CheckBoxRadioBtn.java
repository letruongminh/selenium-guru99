import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxRadioBtn {
    String driverLink = "/Users/minhle/Desktop/driver/chromedriver";
    String linkPage = "http://demo.guru99.com/test/radio.html";
    String fbLink = "https://www.facebook.com/";

    WebDriver driver;
    @BeforeTest
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", driverLink );
        driver = new ChromeDriver();
    }


    @Test
    public void handleRadioButton(){
        driver.get(linkPage);
        WebElement rd2 = driver.findElement(By.cssSelector("#vfb-7-2"));
        rd2.click();
    }

    @Test
    public void handleCheckBox(){
        driver.get(linkPage);
        WebElement chk3 = driver.findElement(By.cssSelector("#vfb-6-2"));
        if(!chk3.isSelected()){
            chk3.click();
        }
    }
    @AfterTest
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}
