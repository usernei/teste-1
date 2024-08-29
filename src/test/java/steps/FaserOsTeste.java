package steps;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import executa.Executa;
import page.homePage;

public class FaserOsTeste {
	
	//tem que passa a assinatura do mento homepage

	
	homePage page= new homePage() ;
	
	@Before
	public void antesDoTeste() {
		Executa.abrirSite();
	}
	@After
	public void depoiDoTeste() {
		Executa.fecharNavegador();
		
	}
	@Test
	public void prencherosCamposEmBranco() {
		page.cadastrar("Estela","255,155,1144","estela@eu.com","oi");
		
		System.out.println("teste da hora");
	}

}
