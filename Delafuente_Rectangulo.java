package ordina;

public class Delafuente_Rectangulo {
 private int Id;
 private double ladoA;
 private double ladoB;
 private String Color;
public Delafuente_Rectangulo() {
	super();
}
public Delafuente_Rectangulo(double ladoA, double ladoB, String color) {
	super();
	this.ladoA = ladoA;
	this.ladoB = ladoB;
	Color = color;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public double getLadoA() {
	return ladoA;
}
public void setLadoA(double ladoA) {
	this.ladoA = ladoA;
}
public double getLadoB() {
	return ladoB;
}
public void setLadoB(double ladoB) {
	this.ladoB = ladoB;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
@Override
public String toString() {
	return "Delafuente_Rectangulo [Id=" + Id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", Color=" + Color + "]";
}

 
}
