package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.ValorPecaBO;

public class Principal {

	public static void main(String[] args) {
		
		ValorPecaBO cbo = new ValorPecaBO();
		
		double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1� pe�a: "));
		double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2� pe�a: "));
		double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 3� pe�a: "));
		double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 4� pe�a: "));
		double p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 5� pe�a: "));

		JOptionPane.showMessageDialog(null, "O valor total das cinco pe�as � igual a: " + "R$" + cbo.somaTotalPecas(p1, p2, p3, p4, p5));

	}

}
