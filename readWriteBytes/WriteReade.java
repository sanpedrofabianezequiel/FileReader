package readWriteBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteReade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 -Obtenemos el total de Bytes de  la foto
		//2 -Los almacenamos en un archivo para copiarlos
		//3 -Almacenamos toda la informacion en un array
		//4 -El array lo volcamos en un archivo nuevo para poder recrear esa Imagen
		
		
		int contador=0; 	//Para contar cuantos Byte tiene la foto
		
		int[] copia = new int [4142072];	    //Almacenamos el tamaño total de la Informacion/foto en el Array
		
		
		
		
		try {
			FileInputStream miFile=new FileInputStream("C:\\Users\\Ezequiel\\Desktop\\Programas\\Java\\kraken.jpg");
		
			boolean finalArchivo=false;//Para salir del archivo
			
			while(!finalArchivo) {//Implicitamente le estamos diciendo que es FALSE
				
				int byteEntrada=miFile.read();	//Leer byte a Byte
				
			   //Antes de aumentar el contador para poder empezar con el array en la posicion 0
				if(byteEntrada != -1) {
					copia[contador]=byteEntrada;
					
					System.out.println(byteEntrada);//Leer cada byte obtenido
				}else {
					finalArchivo =true;	//Cuando llego al final
				}
				
				
				
				//Mostramos el valor de cada posicion
				System.out.println(copia[contador]);
				
				contador++;			
			}
		
			
			
			miFile.close();
		
		} catch (IOException e) {
		
			e.printStackTrace();
			System.out.print("Error al lerr el Archivo");
		}
		
		
		
		System.out.println("Cantidad de bytes: " + contador);		
		System.out.println("Tamaño del Array: " + contador);	
		
		
		//Usamos el metodo CrearFichero pasandole el ARRAY creado
		
		crearFichero(copia);
	}
	
	
	
	//Nuevo metodo------------------------------------------------
	
	public static void crearFichero(int [] dataR) {
		
		
		try {
			FileOutputStream miData=new FileOutputStream("C:\\Users\\Ezequiel\\Desktop\\Programas\\Java\\krakenCopiaJava.jpg");
		
			//Leemos todas las posiciones con un FOR
			for (int i = 0; i < dataR.length; i++) {
				
				//Escribimeos un fichero nuevo de bytes
					//En la posicion I del array Recibido
				miData.write(dataR[i]);
				
			}
			
			miData.close();
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.print("Error al crear el Archivo");
		}
		
		
		
	}
	
	
	
	
	
	

}


