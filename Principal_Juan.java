package ordina;

public class Principal_Juan {
	
	public static void main(String[] args) {
		
		//crear permitero de circulo y rectangulo
		double perimetroCirculo = calcularPerimetroCirculo(3);
        double perimetroRectangulo = calcularPerimetroRectangulo(3, 3);
        
		//instanciamos un cuadrado y un circulo
		Delafuente_Circulo circulo1 = new Delafuente_Circulo(3,"Verde");
		Delafuente_Rectangulo rectangulo1 = new Delafuente_Rectangulo(3,3, "Rojo");
		
		//Calcula area rectangluo base * altura
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area = ladoA * ladoB;
		System.out.println("Area Rectangulo: "+area);
		
		//Calcula area circulo
		double radio = circulo1.getRadio();
		double area1 = radio*3.14;
		System.out.println("Area circulo: "+area1);
		
		//
		
		//diferencia entre area de circulo y rectangulo
		double diferencia = area-area1;
		System.out.println("Diferencia areas "+diferencia);
		
		//imprimir datos 
		System.out.println("cuadrado: "+rectangulo1);
		System.out.println("circulo: "+circulo1);
		System.out.println("diferencia: "+diferencia);
		System.out.println("Perímetro del círculo: " + perimetroCirculo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
		////////
	      


	    }

	    private static double calcularPerimetroCirculo(double radio) {
	        return 2 * Math.PI * radio;
	    }

	    private static double calcularPerimetroRectangulo(double ladoA, double ladoB) {
	        return (2 * ladoA) + (2 * ladoB);
	    }
	}


