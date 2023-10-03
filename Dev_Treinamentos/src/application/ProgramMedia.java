package application;

import javax.swing.JOptionPane;

public class ProgramMedia {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bem vindo ao programa de execução de média");

		String n1 = JOptionPane.showInputDialog("Digitea Nota 1: ");
		String n2 = JOptionPane.showInputDialog("Digitea Nota 2: ");
		String n3 = JOptionPane.showInputDialog("Digitea Nota 3: ");
		String n4 = JOptionPane.showInputDialog("Digitea Nota 4: ");

		double nota1 = Double.parseDouble(n1);
		double nota2 = Double.parseDouble(n2);
		double nota3 = Double.parseDouble(n3);
		double nota4 = Double.parseDouble(n4);

		double avg = (nota1 + nota2 + nota3 + nota4) / 4;

		double mNota;

		// testar a maior nota
		if (nota1 > nota2 && nota1 > nota3 && nota1 > nota4) {
			mNota = nota1;
		}
		if (nota2 > nota1 && nota2 > nota3 && nota2 > nota4) {
			mNota = nota2;
		}
		if (nota3 > nota1 && nota3 > nota2 && nota3 > nota4) {
			mNota = nota3;
		} else {
			mNota = nota4;
		}

		double menorNota;
		// testar a menor nota
		if (nota1 < nota2 && nota1 < nota3 && nota1 < nota4) {
			menorNota = nota1;
		}
		if (nota2 < nota1 && nota2 < nota3 && nota2 < nota4) {
			menorNota = nota2;
		}
		if (nota3 < nota1 && nota3 < nota2 && nota3 < nota4) {
			menorNota = nota3;
		} else {
			menorNota = nota4;
		}

		JOptionPane.showMessageDialog(null, "Resultado da média é:" + avg);

		if (avg < 6.0) {
			JOptionPane.showMessageDialog(null, "Aluno REPROVADO!");
			int resp = JOptionPane.showConfirmDialog(null, "Deseja saber a menor nota?");
			if (resp == 0) {
				JOptionPane.showMessageDialog(null, "A menor nota foi:" + menorNota);
			}
		} else {
			JOptionPane.showMessageDialog(null, " PARABÉNS ,Aluno APROVADO!");
			int resp = JOptionPane.showConfirmDialog(null, "Deseja saber o a maior nota?");
			if (resp == 0) {
				JOptionPane.showMessageDialog(null, "A maior nota foi:" + mNota);
			}
		}

		JOptionPane.showMessageDialog(null, "Até Logo!");
		
	}

}
