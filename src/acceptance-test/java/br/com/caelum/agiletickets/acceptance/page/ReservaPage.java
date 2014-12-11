package br.com.caelum.agiletickets.acceptance.page;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservaPage {

	private static final String BASE_URL = "http://localhost:8080";
	private final WebDriver driver;

	public ReservaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrePaginaSessao() {
		driver.get(BASE_URL + "/sessao/89");
	}

	
	
	

	public void confereValorComAcrescimo(String valor) {
		WebElement mensagem = driver.findElement(By.id("message"));
		assertThat(mensagem.getText(),containsString(valor));
	
	}

	public void deveMostrarErro(String erro) {
		WebElement erros = driver.findElement(By.id("errors"));

		assertThat(erros.getText(), containsString(erro));
	}

	

}
