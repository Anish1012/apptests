import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anish.kumar on 26/06/17.
 */
public class Day1 {
    public static void main (String [] args) {
       System.setProperty("webdriver.chrome.driver","//Users//anish.kumar//Desktop//Anish//software//chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
