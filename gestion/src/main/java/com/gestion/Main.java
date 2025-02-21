package com.gestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        List<String>estudiantes = new ArrayList<>();


        System.out.println("Ingresar la cantidad de estudiante que desea registrar: ");
        int cantidad = teclado.nextInt();
        teclado.nextInt();

        //paso ahora aregistrar los nombres utilizo for

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre dl estudiante: " + (i + 1)  );
            String nombre = teclado.nextLine();
            estudiantes.add(nombre);
            
        }

       System.out.println( "\n Lista complta de estudiante");
       for (String estudiante : estudiantes){
        System.out.println(estudiante);
       }

        










    }
}