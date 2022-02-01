package visitas;

import java.util.ArrayList;

public class MultiplosDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tres = new ArrayList<Integer>();
		for (int i = 0; i < args.length; i++) {
			tres.add(Integer.parseInt(args[i]));
		}
		System.out.println("La suma de los múltiplos es: " + suma(multiplosTres(tres)));
		System.out.println("El promedio de los múltiplos es: " + promedio(multiplosTres(tres)));
	}

	public static ArrayList<Integer> multiplosTres(ArrayList<Integer> tres) {
		ArrayList<Integer> filtro = new ArrayList<Integer>();
		for (int i = 0; i < tres.size(); i++) {
			if (tres.get(i) % 3 == 0) {
				filtro.add(tres.get(i));
			}
		}
		return filtro;
	}

	public static Integer suma(ArrayList<Integer> sum) {
		int suma = 0;
		for (int i = 0; i < sum.size(); i++) {
			suma += sum.get(i);
		}
		return suma;
	}

	public static Integer promedio(ArrayList<Integer> promedio) {
		return suma(promedio) / promedio.size();
		/*
		 * int prom = 0; for (int i = 0; i < promedio.size(); i++) { suma +=
		 * promedio.get(i); } prom = suma / promedio.size(); return prom;
		 */
	}
}
