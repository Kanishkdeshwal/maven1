package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonlinktest {
    public static void main(String args[]) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");
       // driver.manage().window().maximize();
        driver.findElement(By.linkText("inputs")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12345678");


    }
}