package ar.edu.unlam.pb2.parcialUno;

public class Cerradura {
	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estado= false;
	private int intentosExitosos;
	private int intentosFallidos;
    private boolean bloqueoActivado = false;
	
	public Cerradura (Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		
	}
	
	
		
		public void abrir(Integer clave) {
			if(claveDeApertura.equals(clave) && bloqueoActivado==false) {
				
				this.estado=true;
			}
			else {
				intentosFallidos++;
				
			}
		}
		
		
		
		

	
	
	public void cerrar () {
		if (estado == true) {
			estado = false;
		}
	}

	public boolean estaAbierta () {
	            
		if (estado == true) {
	            	  return   true;
	              }
	              return  false;
	}
	public boolean estaCerrada() {
		if(estado == false) {
			return true;
		}
		return false;
	}
	
	public boolean fueBloqueada() {
		if (intentosFallidos >= this.cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		}
		return false;
	}
	
	public Integer contarAperturasExitosas() {
		
		intentosExitosos++;
		return intentosExitosos;
	}
	
	public Integer contarAperturasFallidas(){
		return this.intentosFallidos;
	}
}


