package javaflix.com.pojos;

import javaflix.com.enums.Tipo;

public final class Platillo {
	private String nombre;
	private double precio;
	private boolean fresco;
	private int calorias;
	private short estrellas; //Calificacion
	private Tipo tipo;
	
	public Platillo() {}

	public Platillo(String nombre, double precio, boolean fresco, int calorias, short estrellas, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.fresco = fresco;
		this.calorias = calorias;
		this.estrellas = estrellas;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isFresco() {
		return fresco;
	}

	public void setFresco(boolean fresco) {
		this.fresco = fresco;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public short getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(short estrellas) {
		this.estrellas = estrellas;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Platillo [nombre=" + nombre + ", precio=" + precio + ", fresco=" + fresco + ", calorias=" + calorias
				+ ", estrellas=" + estrellas + ", tipo=" + tipo + "]";
	};
				
}
