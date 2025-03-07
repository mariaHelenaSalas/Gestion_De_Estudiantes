package com.gestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<String> estudiantes = new ArrayList<>();

        System.out.println("Ingresar la cantidad de estudiante que desea registrar: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();
        // paso ahora aregistrar los nombres utilizo for

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del estudiante # " + (i + 1));
            String nombre = teclado.nextLine();
            estudiantes.add(nombre);
            System.out.println("==========================================");

        }

        System.out.println("\n *****    Lista complta de estudiantes  *****");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        Collections.sort(estudiantes);
        System.out.println("\n *****    Lista de estudiantes ordenada   *****");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

       System.out.println("\n *****   ingrese el estudiante a buscar   *****");
         String buscar = teclado.nextLine();
         
            if (estudiantes.contains(buscar)) {
                System.out.println("El estudiante si se encuentra en la lista");
            } else {
                System.out.println("El estudiante no se encuentra en la lista");
            }

            teclado.close();


    }
}