import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class ScreenCap {


    protected static WebDriver driver;
    protected static int i;



//    public  static void click(){
//
//        driver.findElement(By.id("")).sendKeys();
//
//    }


    public static void captureScreen(){

        String name = "/Users/tahsinsyeed/Desktop/Youtube/untitled folder/screen"+i+".png";

        File src = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{

            FileUtils.copyFile(src,new File(name));
        }
        catch (IOException e){

            e.printStackTrace();
        }


    }

    public static void runApp(String url[],String browser){


        System.setProperty("webdriver.gecko.driver","/Users/tahsinsyeed/Desktop/ALL_FOLDER/SeleniumDriver/geckodriver");

        if(browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase(("chrome"))){

            driver=new ChromeDriver();

        }
        driver.get(url[i]);
        //driver.navigate().to("");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

    }

    public static void capture() throws IOException{

        String name = "ScreenShot"+i+".png";

            try {
                Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage image = new Robot().createScreenCapture(rect);
                File file = new File(name);
                ImageIO.write(image,"png",file);

            } catch (AWTException e) {
                e.printStackTrace();
            }
    }

    public static void quit(String browser){

        if(browser.equalsIgnoreCase("firefox")) {
            driver.quit();
        }

        if (browser.equalsIgnoreCase(("chrome"))){
            driver.quit();

        }

    }

    }

