package rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Sasha on 05.07.2015.
 */
public class LaptopePage  {
    private WebDriver driver;
    public LaptopePage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "//*[@id=\"head_banner_container\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/" +
            "div/div[1]/div[1]/div[2]/div[1]/div/h4/a")private WebElement netbook;
    @FindBy(xpath = "//*[@id=\"head_banner_container\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/" +
            "div/div[1]/div[1]/div[2]/div[2]/div/h4/a")private WebElement easyTasks;
    @FindBy(xpath = "//*[@id=\"head_banner_container\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/" +
            "div/div[1]/div[1]/div[2]/div[3]/div/h4/a")private WebElement forWorkAndStudy;

    public void Netbook(){

        netbook.click();

    }
    public void EasyTasks(){

        easyTasks.click();
    }
    public void ForWorkAndStudy(){

        forWorkAndStudy.click();

    }

    public WebDriver getDriver() {
        return driver;
    }
}
