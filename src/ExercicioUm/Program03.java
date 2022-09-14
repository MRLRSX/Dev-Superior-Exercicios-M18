package ExercicioUm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Program03 {
	public static void main(String[] args) {

		try (BufferedWriter buffered = new BufferedWriter(new FileWriter("C:\\Users\\lucas\\Documents\\desliga.bat"))) {

			String texto = JOptionPane.showInputDialog("DIGITE O TEMPO PARA DESLIGAR A MAQUINA");
			int confirma = JOptionPane.showConfirmDialog(null, "TEM CERTEZA! ");

			buffered.write("shutdown -s -t " + texto);
			buffered.close();

			if (confirma == 0)
				Runtime.getRuntime().exec("C:\\Users\\lucas\\Documents\\desliga.bat");

		} catch (IOException e) {

			System.out.println(e.getMessage());
			;
		}
	}
}
