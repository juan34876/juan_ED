package ordina;

public class Delafuente_Circulo {

	private int id;
	private String nombre;
	private String color ;
	private double radio;
	public Delafuente_Circulo() {
		super();
	}
	public Delafuente_Circulo(int id, String nombre, String color, double radio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.radio = radio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Delafuente_Circulo [id=" + id + ", nombre=" + nombre + ", color=" + color + ", radio=" + radio + "]";
	}
	

}