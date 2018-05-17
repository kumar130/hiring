import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Sample{

               

                @Test

                public void GoogleSearchTest(){

                               

                                // For windows

                                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/" + "chromedriver.exe");

       

                                //For Linux

                                //System.setProperty("webdriver.chrome.driver", "/home/sousr/Downloads/chromedriver");

                                //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/" + "chromedriver");

                               

                                WebDriver driver = new ChromeDriver();

        try{

                                                driver.manage().window().maximize();

                                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                                                String baseUrl = "http://google.com/";

                                                driver.get(baseUrl);

                                                driver.findElement(By.name("q")).sendKeys("Selenium");

                                                driver.findElement(By.xpath("//li//input[@value='Google Search']"))

                                                                                .click();

        }

        catch(Exception e){

                e.printStackTrace();

        }

        finally{

                driver.close();

                                driver.quit();

        }

                               

 

                }

 

}

 