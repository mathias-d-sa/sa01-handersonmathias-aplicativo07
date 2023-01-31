package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.ValorPecaBO;

public class Principal {

	public static void main(String[] args) {
		
		ValorPecaBO cbo = new ValorPecaBO();
		
		double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1ª peça: "));
		double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2ª peça: "));
		double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 3ª peça: "));
		double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 4ª peça: "));
		double p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 5ª peça: "));

		JOptionPane.showMessageDialog(null, "O valor total das cinco peças é igual a: " + "R$" + cbo.somaTotalPecas(p1, p2, p3, p4, p5));

	}

}
