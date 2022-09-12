package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class NavigationTests {

    public static void test1(String browser){
        WebDriver driver=BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title1= driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3= driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        StringUtility.verifyEquals(title2,title4);
        System.out.println("title1 = " + title1);
        System.out.println("title2 = " + title2);
        System.out.println("title3 = " + title3);
        System.out.println("title4 = " + title4);

        BrowserFactory.closeDriver();

    }

    public static void test2(String browser){
        WebDriver driver=BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title1= driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3= driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        StringUtility.verifyEquals(title2,title4);
        System.out.println("title1 = " + title1);
        System.out.println("title2 = " + title2);
        System.out.println("title3 = " + title3);
        System.out.println("title4 = " + title4);

        BrowserFactory.closeDriver();

    }

    public static void test3(String browser){
        WebDriver driver=BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title1= driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2= driver.getTitle();
        driver.navigate().back();
        String title3= driver.getTitle();
        StringUtility.verifyEquals(title1,title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        StringUtility.verifyEquals(title2,title4);
        System.out.println("title1 = " + title1);
        System.out.println("title2 = " + title2);
        System.out.println("title3 = " + title3);
        System.out.println("title4 = " + title4);

        BrowserFactory.closeDriver();

    }

    public static void main(String[] args) {
        test1("chrome");
        test2("firefox");
        test3("edge");
    }


}
