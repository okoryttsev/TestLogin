package rozetka;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sasha on 05.07.2015.
 */
public class TestMetricks {
    WebDriver driver =new ChromeDriver();
    @Test
    public void Test1(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LaptopePage lp=new PageFactory().initElements(driver,LaptopePage.class);
        FiltrePage fp=new PageFactory().initElements(driver,FiltrePage.class);
        MainPage mp =new PageFactory().initElements(driver,MainPage.class);
        mp.MainPage();
        mp.LaptopePage();
        lp.EasyTasks();
        fp.NBFiltreHDD();
        System.out.println("done");
        driver.close();


    }

}
