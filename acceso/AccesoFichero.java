package acceso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leerFichero miFichero=new leerFichero();
		miFichero.lee();
		
	}

}
class leerFichero {
	
	//Metodo para acceder al fichero
	
	public void lee() {
		
		//Usamos el metodo FileReader
		
		try {
			FileReader entrada=new FileReader("C:\\Users\\Ezequiel\\Desktop\\Programas\\Java\\ejemplo.txt");
		
			int c= 0;	
			
			//Leer dentro del archivo
			while( c != -1) {
				//Almacenamos el valor ACII en el INT c que estamos leyendo
				
				c= entrada.read();//Creo el metodo que va a leer
				char letra= (char) c;
				System.out.print(letra);
			}
		
			entrada.close();
		
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
	}
}