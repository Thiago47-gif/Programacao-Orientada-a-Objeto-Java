package TesteFile;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
			File myObj = new File("Ativ_File.txt");
			
			if (myObj.createNewFile()) {
				System.out.println("Arquivo criado: "+ myObj.getName());
			}
			else {
				System.out.println("Arquivo j� existe.");
			}
		
			
			
		}catch(IOException e) {
			System.out.println("Um erro ocorreu.");
			e.printStackTrace();
		}

	}

}
