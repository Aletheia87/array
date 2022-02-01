package visitas;

import java.util.ArrayList;

public class Visitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(args[0]);
		ArrayList<Integer>prom = new ArrayList<Integer>();
				
		for(int i=0; i<args.length; i++) {
			prom.add(Integer.parseInt(args[i]));
			
		}
		promedio(prom);
		System.out.println("Para la entrada anterior, el resultado es "+promedio(prom));
	}
		
		public static Integer promedio(ArrayList<Integer>promedio) {
			int suma=0;
			int prom=0;
			for(int i =0; i<promedio.size(); i++) {
				suma+= promedio.get(i);
				}
			prom=suma / promedio.size();
				return prom;
			}
}