package Colevati;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		int num, fat = 1;
		num = Integer.parseInt(JOptionPane.showInputDialog ("Digite um n?mero"));
		
		for (int i = num; i > 1; i --) {
			fat = fat * i;
		}
		System.out.println("Fatorial ?: "+fat);
	}

	public int fatorial(int i) {
		if (i == 0) 
			return 1;
		else {
		return (i * fatorial (i-1));
		}
	}

}
