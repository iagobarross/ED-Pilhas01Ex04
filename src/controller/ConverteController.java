package controller;

import br.edu.fateczl.pilhaInt.*;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public String decToBin(int numero) {
		String binario = "";
		Pilha p = new Pilha();
		if(numero == 0) {
			return "0";
		} 
		
		while(numero > 0) {
			p.push(numero % 2);
			numero /= 2;
		}
		
		while(!p.isEmpty()) {
			try {
				binario += p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return binario;
	}
}
