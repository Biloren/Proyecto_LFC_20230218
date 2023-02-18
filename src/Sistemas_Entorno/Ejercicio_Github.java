package Sistemas_Entorno;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Ejercicio_Github {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 Scanner scNum = new Scanner(System.in);
		 
		 int numPeliculas = 0;
		 String titulo = "";
		 int año = 0;
		 String director = "";
		 boolean correcto = false;
		 boolean correcto1 = false;
		 boolean correcto2 = false;
		 boolean correcto3 = false;
		 
		 
		 
		 do {
	      System.out.print("Introduce el número de películas: ");
	      try {
	       numPeliculas = scNum.nextInt();
	       if(numPeliculas>0 && numPeliculas<20) {
	    	   correcto = true;
	       }else {
	    	   System.out.println("Introduzcan un número del 1 al 20");
	       }
	      }catch(InputMismatchException e) {
	    	  System.out.println("error:introduzca un numero");
	    	  scNum.next();
	      }
		 }while(!correcto);
		 
		 
		 
	      
	      

	      for (int i = 0; i < numPeliculas; i++) {
	         System.out.println("Introduce los datos de la película " + (i + 1) + ":");
	         
	        do {
	         System.out.print("Título: ");
	         titulo = sc.nextLine().toUpperCase();
	         if(!titulo.isEmpty()) {//LO QUE NOS DICE ES QUE SIEMPRE VA A CONTENER ALGO, NUNCA VACIO.
	        	 correcto1 = true;
	         }else {
	        	 System.out.println("Introduzca nueva busqueda");
	         }
	        }while(!correcto1);
	        
	        
	       do { 
	        System.out.print("Director: ");
	          director = sc.nextLine().toUpperCase();
	          if(!director.matches(".*\\d+.*") && director.length()>=2) {
	        	  correcto2 = true;
	          }else {
	        	  System.out.println("Introduzca solo nombres");
	          }
	       }while(!correcto2);
	       
	      do {  
	         System.out.print("Año: ");
	        try {
	          año = scNum.nextInt();
	          if(año>1950) {
	        	  correcto3 = true;
	          }else {
	        	  System.out.println("Introduzca una fecha más actual");
	          }
	        }catch(InputMismatchException e) {
	        	System.out.println("Solo números enteros");
	        	scNum.next();
	        }
	      }while(año<=1950);
	        
	    //RECOGE EN UNA ARRAY LOS DATOS INTRODUCIDOS
	      }  
/**
	      System.out.println("\nListado de películas:");
	      for (int i = 0; i < numPeliculas; i++) {
	         System.out.println("Película " + (i + 1) + ": " + peliculas[i].getTitulo() + " (" + peliculas[i].getDirector() + ", " + peliculas[i].getAño() + ")");
		
	      }
		*/
	     /** 
	      System.out.println("\nListado de películas:");
	      for (int i = 0; i < numPeliculas; i++) {
	         System.out.println("Película " + (i + 1) + ": " + peliculas[i].toString());
		
	      }
		*/
	     
	      // FPREACH.CREA ESTE FOR PARA IMPRIMIR LO METIDO ANTERIORMENTE.
	      
		
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
