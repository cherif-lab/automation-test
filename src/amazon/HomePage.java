package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {


    public static void main(String[] args) throws InterruptedException {
        // FireFoxBrowser
        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.amazon.com/");
        // Edge
        String edgeDriverPath = "BrowserDriver/windows/msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", edgeDriverPath);
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.amazon.com/");

        // ChromeBrowser
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        driver.close();





    }


}
