package runner;

import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase1 extends Base {

    @Test(priority = 1)
    public void Register() throws IOException {
        driver.get(prop.getProperty("url") + "/");
        
    }


@BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        openBrowser(); // Implement this method to set up your WebDriver
        
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit(); // Implement this method to close the WebDriver
    }
}
