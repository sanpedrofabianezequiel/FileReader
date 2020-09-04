package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bufferClas miBufferClass=new bufferClas();
		
		miBufferClass.leer();
	}

}

class bufferClas {
	
	//Metodo
	public void leer() {
		
		try {
			FileReader entrada=new FileReader("C:/Users/Ezequiel/Desktop/Programas/Java/ejemplo.txt");
		
			
			
			//---------------------BufferedReader ("FileReader/era de READER")
			
			BufferedReader miBuffere=new BufferedReader(entrada);
			//BufferedWriter
			
			String linea ="";	//Donde almacenaremos el texto leido del archivo externo
			
			while(linea != null) {//A diferencia de entrada.read() del tipo FileReader, que termina en -1 , este termina en NULL
				
				// \n  \r saltos o enters cuando termina una linea
				linea= miBuffere.readLine();
				
				if(linea != null) {
					System.out.println(linea);
				}
			
				
			}
			
			entrada.close();
			
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	
	
	
}