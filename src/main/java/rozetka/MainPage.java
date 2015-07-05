package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sasha on 05.07.2015.
 */
public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(name="m-main-i")private WebElement  laptopList;

    public void MainPage(){
        driver.get("http://rozetka.com.ua/");

    }
    public void LaptopePage(){
        laptopList.click();
        driver.findElement(By.xpath("//*[@id=\"head_banner_container\"]/div/div[2]/div/div/div[1]" +
                "/div/ul[2]/li[1]/ul/li[1]/a")).click();

    }

}
