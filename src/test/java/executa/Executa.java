package executa;


import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Executa extends Drivers {
	
	
	public static void abrirSite() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.madebynina.com.br/fale-conosco-doceria");
		
	}
	public static void fecharNavegador() {
		//driver.quit();
	}

}
