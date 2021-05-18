package inicio;

import java.util.Scanner;

public class Demo001 {

	public static void main(String[] args) {
		/*   comentario multilinea  */
		Scanner lector = new Scanner(System.in);
		System.out.println("A continuacion ingrese 3 numeros para ordenarlos");
		System.out.println("Ingrese el primer numero");
		int a = lector.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = lector.nextInt();
		System.out.println("Ingrese el tercer numero");
		int c = lector.nextInt();
		int mayor,menor,medio;
		if(a>b && a>c) {
			mayor = a;
		}else if(b>a && b>c) {
			mayor = b;
		}else {
			mayor = c;
		}
		
		if(a<b && a<c) {
			menor = a;
		}else if(b<a && b<c) {
			menor = b;
		}else {
			menor =c;
		}
		medio = (a+b+c)-mayor-menor;
		System.out.println("Orden ascendente");
		System.out.println(menor+","+medio+","+mayor);
		System.out.println("Orden descendente");
		System.out.println(mayor+","+medio+","+menor);
		lector.close();
		
	}//llave de cierre del main   
}//llave de cierre de la clase 

