package write;

import java.io.FileWriter;
import java.io.IOException;

public class writeFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		writer escribriendo=new writer();
		escribriendo.writerInFicheroNuevo();
		escribriendo.writerInFicheroExistente();
		
		
	}

}


class writer {
	
	//Metodo Write en fichero
	
	public void writerInFicheroNuevo() {
		
		String fraseIn= "Esto es una prueba para ingresar informacion dentro de un Fichero ";
		
		
		try {
			//creamos un archivo nuevo donde vamos a escribir
			FileWriter escribiendo=new FileWriter("C:\\Users\\Ezequiel\\Desktop\\Programas\\Java\\textoNuevo.txt");
			
			//Podemos ingregar caracter a caracter dentro de un FOR
			
			for (int i = 0; i < fraseIn.length(); i++) {
				//Recorremos todo el String e ingresamos caracter a caracter con el metodo WRITE
				escribiendo.write(fraseIn.charAt(i));
				
			}
			escribiendo.write(fraseIn);
		
			
			escribiendo.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}



	public void writerInFicheroExistente() {
		//Solamente se le agrega segundo parametro TRUE para adicionar sobre el fichero existente
			//Sino pongo TRUE sobreescribe el fichero Existente
			//new FileWriter("string",true);
		
			String texto="Ingresando texto y ADICIONADOLO con la clausula true en el segundo parametro";
			
		
			try {
				FileWriter escribiendo=new FileWriter("C:\\Users\\Ezequiel\\Desktop\\Programas\\Java\\ejemplo.txt",true);
			
				for (int i = 0; i < texto.length(); i++) {
					
					escribiendo.write(texto.charAt(i));
					
					
				}
				
				escribiendo.close();
			
			} catch (IOException e) {

				e.printStackTrace();
			}
					
		
		
	}
}