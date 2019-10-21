import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.parcialUno.Cerradura;

public class TestCerradura {
	
	
	@Test
	public void queUnaCerraduraNuevaEsteCerrada(){
		
	Cerradura cerradura1 = new Cerradura(1234,3);
	
	  cerradura1.abrir(1234);
	  
	 Integer valorEsperado = 1;
	  
	  Assert.assertEquals( valorEsperado, cerradura1.contarAperturasExitosas());
	}


	 @Test
	public void queCuandoIngresoClaveCorrectaSeAbra(){
		
		Cerradura cerradura2= new Cerradura(2020,3);
		cerradura2.abrir(2020);
		
		Assert.assertEquals(true, cerradura2.estaAbierta());
	}
	 
	 @Test 
	 public void queCuandoIgreseoClaveIncorrectaNoSeAbra() {
			
			Cerradura cerradura2= new Cerradura(2020,3);
			cerradura2.abrir(2021);
			
			Assert.assertEquals(true, cerradura2.estaCerrada());
		}
	 
	 @Test
	 public void cerrarUnaCerraduraAbierta() {
			
			Cerradura cerradura2= new Cerradura(2020,3);
			cerradura2.abrir(2020);
			cerradura2.cerrar();
			
			Assert.assertEquals(true,cerradura2.estaCerrada());
		}
	 
	 public void laCerraduraEstaBloqueada() {
		 Cerradura cerradura2= new Cerradura(2020,3);
			cerradura2.abrir(2021);
			cerradura2.abrir(2021);
			cerradura2.abrir(2021);
			cerradura2.abrir(2021);
			
			Assert.assertEquals(true,cerradura2.fueBloqueada());	
		 
	 }
	 public void pruebaSiElMetodoMeDevuleveLasAperturasExitosas() {
		 Cerradura cerradura2= new Cerradura(2020,3);
			cerradura2.abrir(2020);
			cerradura2.abrir(2020);
			cerradura2.abrir(2020);
			cerradura2.abrir(2020);
			Integer valorEsperado=4;
			Assert.assertEquals(valorEsperado,cerradura2.fueBloqueada());	
	 }
	 public void pruebaSiElMetodoMeDevuleveLasAperturasFallidas() {
		 Cerradura cerradura2= new Cerradura(2020,3);
			cerradura2.abrir(2020);
			cerradura2.abrir(2021);
			cerradura2.abrir(2020);
			cerradura2.abrir(2020);
			Integer valorEsperado=1;
			Assert.assertEquals(valorEsperado,cerradura2.contarAperturasFallidas());	

	
	 }
	
	
}