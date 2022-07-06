package modulos.login;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import páginas.LoginPage;

import java.time.Duration;

@DisplayName("Testes de login na Zurich")
public class LoginTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver 103.0.5060.53\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        this.navegador.get("https://espacoclientes.zurich.com.br/");
    }

    @Test
    @DisplayName("Teste com usuário e senha invalidos")
    public void testLoginComUsuarioInvalido(){

        String caputurarMensagemApresentada = new LoginPage(navegador)
                .inserirUsuario("usuario@zurich.com.br")
                .inserirSenha("minhaSenha")
                .submeterLoginInvalido()
                .caputurarMensagemApresentada();

        Assertions.assertEquals("Usuário ou senha inválido. Por favor certifique seus dados de acesso e tente novamente.", caputurarMensagemApresentada);
    }

    @AfterEach
    public void afterEach() {
       this.navegador.quit();
    }
}
