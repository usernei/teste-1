package page;

import org.openqa.selenium.By;

import metodos.Metodos;



public class homePage {
//	By agencia = By.xpath("//p[@id='comp-jwt7t01e5label']");
	
	                   
	By nome = By.xpath("//input[@id='input_comp-ln8vsb5q']");
	By telefone = By.xpath("//input[@id='input_comp-ln8vwdf3']");
	By email = By.xpath("//input[@id='input_comp-ln8vsb5z']");
	By escrever = By.xpath("//input[@id='input_comp-ln8vtqqy']");
	By enviar = By.xpath("//div[@id='comp-ln8vsb61']");
// tem que passa a assinatura do metodo
	Metodos metodo = new Metodos();

	public void cadastrar(String nome,String telefone,String email,String escrever) {
		
		//preencher nome 
		metodo.escrever(this.nome, nome);
		
		//preencher telefone
		metodo.escrever(this.telefone,telefone);
		
		//preencher email
		metodo.escrever(this.email, email);
		
		metodo.escrever(this.escrever, escrever);
		
		//clicar buton
		metodo.clicar(enviar);
		
	}
	

}