package páginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public LoginPage inserirUsuario(String usuario) {
        this.navegador.findElement(By.name("txtUsuario")).sendKeys(usuario);
        return this;
    }

    public LoginPage inserirSenha(String senha) {
        this.navegador.findElement(By.name("txtPassword")).sendKeys("senha");
        return this;
    }

    public LoginPage submeterLoginInvalido() {
        this.navegador.findElement(By.id("divContentLogin")).findElement(By.cssSelector("button[class]")).click();
        return this;
    }

    public String caputurarMensagemApresentada() {
        return this.navegador.findElement(By.cssSelector("div[class*='password'] div[class='modal-content'] p")).getText();
    }
}
