package Dos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestScripts extends BaseTestClass {

    @Test
    public void Test1() {
        FirstPage page = new FirstPage(driver, wait);
        page.NavigateTo();
        page.EnterName();
        page.EnterPass();
        page.ClickEnter();
        page.ClickDem();
        page.ClickPartesDeTrabajo();
        page.ClickTareas();
        page.AddTarea();
        page.CrearTarea();


    }
}
