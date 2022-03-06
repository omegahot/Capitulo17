package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//File file = new File("c:\\Temporarios\\arquivos\\in.txt");
		Scanner sc = null;

		try {
			//sc = new Scanner(file);
			sc = new Scanner(new File("c:\\Temporarios\\arquivos\\in.txt"));
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		
		} finally {
			
			if (sc != null) {
				sc.close();
			}
			System.out.println("Fim do programa...");
		}
	}

}
