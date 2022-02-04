package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    public WebDriver driver;
    By username =By.name("email");
    By password =By.name("password");
    By loginbutton =By.xpath("//input[@value='login']"
    public loginpage(WebDriver driver) {
    }

    public void setDriver(WebDriver driver)
    {
        this.driver = driver;
        WebDriverManager.chromedriver().setup();

    }
    public void Enterusername(String unnamevalue)
    {
        driver.findElement(username).sendKeys(unnamevalue);
    }
    public void Enterpassword(String pwdvalue)
    {
       driver.findElement(password).sendKeys(pwdvalue);
    }
    public void Loginbutton()
    {
        driver.findElement(loginbutton).click();
    }
}
