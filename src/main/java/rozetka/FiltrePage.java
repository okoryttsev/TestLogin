package rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sasha on 05.07.2015.
 */
public class FiltrePage {
    private WebDriver driver;
    public FiltrePage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "//*[@id=\"sort_36514\"]/li[1]/label/a/span/i[1]")private WebElement notebookHddFiltre;
    @FindBy(xpath = "//*[@id=\"sort_20882\"]/li[1]/label/a/span/i[1]")private WebElement notebookFilterValue;
    public void NBFiltreHDD(){
        notebookHddFiltre.click();
    }
    public void NBFiltreValue(){
        notebookFilterValue.click();
    }
}
