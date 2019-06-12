package Hash;

import java.util.Scanner;

public class MinhaApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int key;
		Registro r1 = new Registro(789, "Registro 1");
		Registro r2 = new Registro(889, "Registro 2");

		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		// Registro r1, r2, r3, r4;
		MapaHash mapa = new MapaHash();

		mapa.put(new Registro(7865, "Isidro"));
		mapa.put(new Registro(123, "Josineidson"));
		mapa.put(new Registro(987, "Nilsoncleicio"));
		mapa.put(new Registro(9832, "Deosdedite"));

		do {
			System.out.println("Digite um codigo de registro");
			key = teclado.nextInt();
			if (key != -1) {

				Registro r = mapa.get(key);
				if (r != null) {
					System.out.println("Registro Recuperado = " + r.getKey() + " - " + r.getValue());
				} else {
					System.out.println("Registro nao existente");
				}

			}
		} while (key != -1);
//		r1 = new Registro(7865, "Isidro");
//		r2 = new Registro(123, "Josineidson");
//		r3 = new Registro(987, "Nilsoncleicio");
//		r4 = new Registro(9832, "Deosdedite");
//		
//		System.out.println("Registro "+r1.getKey()+" - "+r1.getValue()+ " ("+r1.hashCode()+")");
//		System.out.println("Registro "+r2.getKey()+" - "+r2.getValue()+ " ("+r2.hashCode()+")");
//		System.out.println("Registro "+r3.getKey()+" - "+r3.getValue()+ " ("+r3.hashCode()+")");
//		System.out.println("Registro "+r4.getKey()+" - "+r4.getValue()+ " ("+r4.hashCode()+")");

	}
}
