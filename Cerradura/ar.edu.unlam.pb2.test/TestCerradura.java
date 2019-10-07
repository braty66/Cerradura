import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.parcialUno.Cerradura;

public class TestCerradura {
	
	
	@Test
	public void queUnaCerraduraNuevaEsteCerrada(){
		
	Cerradura cerradura1 = new Cerradura(1234,3);
	
	  cerradura1.estaCerrada();
	 
	  
	  Assert.assertEquals(true, cerradura1.estaCerrada());
	}


	 @Test
	public void queCuandoIngresoClaveCorrectaSeAbra(){
		
		Cerradura cerradura2= new Cerradura(2020,3);
		cerradura2.abrir(2020);
		
		Assert.assertEquals(true, cerradura2.estaAbierta());
	}
	

	
	
	
	
}