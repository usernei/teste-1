package metodos;

import org.openqa.selenium.By;

import drivers.Drivers;
//tem que chama a class driver extends
public class Metodos  extends Drivers {
	
	//metodo para escrever
	public void escrever(By elemento,String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	//metodo para clicar
public void clicar(By elemento) {
	driver.findElement(elemento).click();
	
}

}
