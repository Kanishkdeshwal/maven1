package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc001_verify_loginfunctionality {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        loginpage lg =new loginpage(driver);
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        lg.Enterusername("kanishk");
        lg.Enterpassword("Dhoni");
        lg.loginbutton();
    }

}
