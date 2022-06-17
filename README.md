# Automação Login Zurich

Esse é um repositório criado para um teste entrevista na @Avanade. Escolhi um de seus clientes e com base em meus conhecimentos, realizei a automação de um teste de Login Invalido seguido da verificação da mensagem e erro que deve ser apresetada.

### Informações 

Foram encontradas algumas possiveis inconsistencias ao inspecionar o código fonte do site para compor a automação, embora ela tenha sido completada com sucesso. O site esta gerando com a mesma mensagem de erro, uma denominada error e a outra denominada password. 
A janela denominada error deveria estar uma camada a frente, sendo exibida ao usuário, mas aparentemente esta sendo sobreposta pela password.

## Tecnologias Utilizadas

Chrome Driver
https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.61/

Junit Jupiter 5.9.1
https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine

Selenium Java 4.2.2
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java