package Dos;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstPage extends BaseClass {


    public FirstPage(WebDriver driver, WebDriverWait wait) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateTo() {
        driver.navigate().to("https://clientes.nivin.app/auth/login");
    }
    public void EnterName(){findElementWithWait(By.xpath("//input[@type='email']")).sendKeys("test@tresbits.es");}
    public void EnterPass(){findElementWithWait(By.xpath("//input[@type='password']")).sendKeys("123456");}
    public void ClickEnter(){findElementWithWait(By.xpath("//button[@class='btn-primary btn-block']")).click();}
    public void ClickDem(){findElementWithWait(By.xpath("//i[@class='fas fa-building mr-3']")).click();}
    public void ClickPartesDeTrabajo(){findElementWithWait(By.xpath("//span[@class='menu-title'][contains(text(),'Partes de trabajo')]")).click();}
    public void ClickTareas(){findElementWithWait(By.xpath("//span[contains(text(),'Tareas')]")).click();}
    public void AddTarea(){findElementWithWait(By.xpath("//div[@class='dx-button-content']")).click();}
    public void CrearTarea(){findElementWithWait(By.xpath("//input[@formcontrolname='nombre']")).sendKeys("First Test");
    findElementWithWait(By.xpath("//textarea[@formcontrolname='descripcion']")).sendKeys("This is automated test");
    findElementWithWait(By.xpath("//button[@class='px-3 btn-primary']")).click();

    }




}