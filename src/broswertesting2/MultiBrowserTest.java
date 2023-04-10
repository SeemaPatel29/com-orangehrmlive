package broswertesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class MultiBrowserTest {
    static String browser = "FireFox";
    static  String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser name :");
        }
        //open the Url into Browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // printing Title
        System.out.println(driver.getTitle());
        // get Username field
        WebElement usernameField = driver.findElement(By.name("username"));
        //find the username field and element and type username
        usernameField.sendKeys("Admi123@gmail.com");
        // Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("adi123");


        // Close the browser
        driver.close();

    }

}
