package visitas;

import java.util.ArrayList;

public class SmartWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pasos = new ArrayList<Integer>();
		for (int i = 0; i < args.length; i++) {
			pasos.add(Integer.parseInt(args[i]));

		}
		promedio(clearSteps(pasos));
		clearSteps(pasos);
		System.out.println("El promedio diario de pasos es: "+promedio(clearSteps(pasos)));// resultado de filtro, pero filtro es una variable del metodo
														// clearsteps
	}

	public static ArrayList<Integer> clearSteps(ArrayList<Integer> steps) {
		ArrayList<Integer> filtro = new ArrayList<Integer>();
		for (int i = 0; i < steps.size(); i++) {
			if (steps.get(i) > 200 && steps.get(i) < 100000) {
				filtro.add(steps.get(i));
			}
		}
		return filtro;
	}

	public static Integer promedio(ArrayList<Integer> promedio) {
		int suma = 0;
		int prom = 0;
		for (int i = 0; i < promedio.size(); i++) {
			suma += promedio.get(i);
		}
		prom = suma / promedio.size();
		return prom;
	}
}