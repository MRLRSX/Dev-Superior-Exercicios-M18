package ExercicioUm;

import java.util.Properties;
import java.util.Set;

public class Program02 {
	public static void main(String[] args) {
		
		Properties properties = System.getProperties();
		System.out.println(properties.getProperty("java.version"));
		
		Set<Object> objetos = properties.keySet();
		for (Object obj : objetos) {
			System.out.println(properties.get(obj));
		}
	}
}
