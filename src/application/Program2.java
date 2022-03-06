package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {

		String caminho = "c:\\temporarios\\arquivos\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();
			
			while (linha != null) {	
				System.out.println(linha);
				linha = br.readLine();
			}
			
		}

		catch (IOException e) {
			System.out.println("Error:: " + e.getMessage());
		}
	}

}
