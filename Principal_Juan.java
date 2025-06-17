package ordina;

/**
 * @author juan.de10
 * @version 1.333
 * esta clase se usa para llevar aacabo la accion de crear dos objetos y calcular tanto sus areas como la diferencia entre ellas
 */
public class Principal_Juan {
	
	public static void main(String[] args) {
		
		//crear permitero de circulo y rectangulo
		double perimetroCirculo = perimetroCirculo();
        double perimetroRectangulo = perimetroRectangulo();
        
		//instanciamos un cuadrado y un circulo
		Delafuente_Circulo circulo1 = new Delafuente_Circulo(3,"Verde");
		Delafuente_Rectangulo rectangulo1 = new Delafuente_Rectangulo(3,3, "Rojo");
		
		double area = areaRectangulo(rectangulo1);
		
		double area1 = areaCirculo(circulo1);
		
		//
		
		double diferencia = diferenciaAreas(area, area1);
		
		imprimirDatos(perimetroCirculo, perimetroRectangulo, circulo1, rectangulo1, diferencia);
	      


	    }

	private static double perimetroRectangulo() {
		double perimetroRectangulo = calcularPerimetroRectangulo(3, 3);
		return perimetroRectangulo;
	}

	private static double perimetroCirculo() {
		double perimetroCirculo = calcularPerimetroCirculo(3);
		return perimetroCirculo;
	}

	private static void imprimirDatos(double perimetroCirculo, double perimetroRectangulo, Delafuente_Circulo circulo1,
			Delafuente_Rectangulo rectangulo1, double diferencia) {
		//imprimir datos 
		System.out.println("cuadrado: "+rectangulo1);
		System.out.println("circulo: "+circulo1);
		System.out.println("diferencia: "+diferencia);
		System.out.println("Perímetro del círculo: " + perimetroCirculo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
		////////
	}

	private static double areaRectangulo(Delafuente_Rectangulo rectangulo1) {
		//Calcula area rectangluo base * altura
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area = ladoA * ladoB;
		System.out.println("Area Rectangulo: "+area);
		return area;
	}

	private static double areaCirculo(Delafuente_Circulo circulo1) {
		//Calcula area circulo
		double radio = circulo1.getRadio();
		double area1 = radio*3.14;
		System.out.println("Area circulo: "+area1);
		return area1;
	}

	private static double diferenciaAreas(double area, double area1) {
		//diferencia entre area de circulo y rectangulo
		double diferencia = area-area1;
		System.out.println("Diferencia areas "+diferencia);
		return diferencia;
	}

	    private static double calcularPerimetroCirculo(double radio) {
	        return 2 * Math.PI * radio;
	    }

	    private static double calcularPerimetroRectangulo(double ladoA, double ladoB) {
	        return (2 * ladoA) + (2 * ladoB);
	    }
	}


