package ar.edu.unlam.pb2.parcialUno;

public class Cerradura {

	private Integer claveDeApertura;
	private Integer cantidadDeFallosConcecutivosQueLaBloquean;
	private Boolean estado = false;
	private Integer aperturasFallidas = 0;
	private Integer aperturasExitosas = 0;
	public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConcecutivos) {
		this.cantidadDeFallosConcecutivosQueLaBloquean = cantidadDeFallosConcecutivos;
		this.claveDeApertura = claveDeApertura;
		
	}
	public void abrir (Integer clave ) {
		if (claveDeApertura.equals(clave) && aperturasFallidas < cantidadDeFallosConcecutivosQueLaBloquean ) {
			estado =true;
			aperturasExitosas++;
		}else {
			aperturasFallidas++;
		}
		
	}
	public void cerrar() {
		if (estado.equals(true)) {
			estado = false;
			
			
		}
	}
	public Boolean estaAbierta() {
		if (estado.equals(true)) {
			return true;
		}
		return false;
		
	}
	public Boolean estaCerrada() {
		if (estado.equals(false)) {
			return true;
		}
		return false;
	}
	public Boolean fueBloqueada() {
		if (aperturasFallidas >= cantidadDeFallosConcecutivosQueLaBloquean) {
			return true;
		}
		return false;
		
	}
	public Integer contarAperturasExitosas() {
		return aperturasExitosas;
	}
	public Integer contarAperturasFallidas(){
		return aperturasFallidas;
	}
	public Integer getClaveDeApertura() {
		return claveDeApertura;
	}
	public Integer getCantidadDeFallosConcecutivosQueLaBloquean() {
		return cantidadDeFallosConcecutivosQueLaBloquean;
	}
	public Boolean getEstado() {
		return estado;
	}
	
	
	
}


