package Automacao.Pages.Usuario;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import Automacao.Setup.SetUp;
import Automacao.Setup.Utils;

public class UsuarioActions {

    private static WebDriver driver;
    private static UsuarioElementsMap usuarioElementsMap;
    private Utils utils;

    public UsuarioActions(WebDriver _driver) {
        driver = _driver;
       usuarioElementsMap = new UsuarioElementsMap(_driver);
        utils = new Utils(_driver);
    }
    
    public boolean SelecionoFiltroUsuario() {
        try {
            this.utils.Sleep(1000);
            this.utils.ClickOnElement(usuarioElementsMap.MenuIconCollapse);
            
            this.utils.ClickOnElement(usuarioElementsMap.BtnUsuario);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean SelecionoOpcaoUsuario(String Opcao) {
        try {
            this.utils.Sleep(1000);
            // this.utils.ClickOnElement(By.xpath(
            //     String.format("(//span[@class='MuiTouchRipple-root'])[34]", Opcao)
            // ));
            driver.findElement(By.xpath("(//ul[@role='menu']/li/li/div/span[text()='Trocar Loja'])[1]")).click();
            driver.findElement(By.xpath("(//ul[@role='menu']/li/li/div/span[text()='Trocar Loja'])[2]")).click();
            
            this.utils.Sleep(8000);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
