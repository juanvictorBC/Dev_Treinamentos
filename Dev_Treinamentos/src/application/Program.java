package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		double Ncarros = Double.parseDouble(carros);
		double Npessoas = Double.parseDouble(pessoas);
		
		int div = (int) (Ncarros / Npessoas);
		
		int rest = (int) (Ncarros % Npessoas);
		
		int resp = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão? ");
		if (resp == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + div);
		}
		resp = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisao? ");
		if (resp == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é: "+rest);
		}
		JOptionPane.showMessageDialog(null,"até logo!");
		//JOptionPane.showMessageDialog(null, "Divisão para "+pessoas+" pessoas deu "+div+" carros e sobrou "+ rest+ " carros");
	}

}
