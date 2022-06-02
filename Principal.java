import java.util.Scanner;

public class Principal {

	public static void funcionX (int M [] [], int d) {
		    Scanner Leer = new Scanner(System.in);
		    for (int i = 1 ; i <= d ; i++) {
			        for (int j = 1 ; j <= d ; j++) {
				            System.out.print("Inserte pos[" + i + "][" + j + "]: ");
				            M [i] [j] = Leer.nextInt();
				        }
			    }
	}  

	public static void funcionY (int M [] [], int d) {
		    for (int i = 1 ; i <= d ; i++) {
			        System.out.println ();
			        for (int j = 1 ; j <= d ; j++) {
				            System.out.print("[" + M [i] [j] + "]");
				        }
			    }
	}

	public static void funcionZ (int M [] [], int d) {
		    int fin = d;
		    for (int i = 1 ; i <= d / 2 ; i++) {
			        int aux = M [i] [i];
			        M [i] [i] = M [d] [d];
			        M [d] [d] = aux;
			        fin--;
			    }
	}

	public static void main (String args []) {
		    Scanner Leer = new Scanner(System.in);
		    int M[][] = new int [20][20];
		    System.out.print("Inserte dimensión de la matriz cuadrada: ");
		    int d = Leer.nextInt();
		    funcionX (M, d);
		    System.out.println("MATRIZ ORIGINAL: ");
		    funcionY (M, d);
		    System.out.println("MATRIZ MODIFICADA: ");
		    funcionZ (M, d);
		    funcionY (M, d);
	}  
} // fin programa
