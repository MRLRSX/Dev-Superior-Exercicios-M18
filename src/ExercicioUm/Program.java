package ExercicioUm;

import java.io.Console;

public class Program {
	public static void main(String[] args) {

		
		Console console = System.console();
		System.out.println("DIGITE SEU NOME");
		String name = console.readLine();
		System.out.println("DIGITE SUA SENHA");
		char[] texto = console.readPassword();
		String senha = texto.toString();
		for(char ch : texto) {
			senha += ch;
		}
		System.out.printf("%s %s", name, senha);
	}
}
