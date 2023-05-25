package com.mycompany.variablesenjava;

import java.util.Scanner;

public class VariablesEnJava {

    public static void main(String[] args) {
        System.out.println("En este programa se puede revisar todo lo referente a las variables en JAVA");
        System.out.println("Como: Variables, Inferencia");
        //Variables normales
        System.out.println("");
        
        
        System.out.println("VARIABLES NORMALES: Se hace la definicion de variables haciendo el uso de las variables");
        int $miVariableEntera = 10;
        String $miVariableString = "Feliz Cumpleaños";
        System.out.println("Variable entera: " + $miVariableEntera);
        System.out.println("Variable String: " + $miVariableString);
        //Inferencia de variables
        System.out.println("");
        
        
        System.out.println("VARIABLES INFERENCIALES: Se hace el llamado a las variables por medio de VAR para inferir");
        var $miVriableEnteraInferencial = 20;
        var $miVariableStringInferencial = "Felicidades!";
        System.out.println("Variable entera inferencial: " + $miVriableEnteraInferencial);
        System.out.println("Variable string inferencial: " + $miVariableStringInferencial);
        System.out.println("Por contexto cadena, osea que primero tiene una cadena, todo lo demas se lo toma como string:");
        var $miVariableDosEnteraInferencial = 20;
        System.out.println($miVariableStringInferencial + $miVariableEntera + " " + $miVariableDosEnteraInferencial);
        System.out.println($miVriableEnteraInferencial + $miVariableDosEnteraInferencial + " " + $miVariableStringInferencial);
        System.out.println("");
        
        
        System.out.println("CARACTERES ESPECIALES: Son reglas que usa JAVA para hacer ciertas acciones");
        System.out.println("Con n, se hace salto de linea: \n aqui es salto de linea");
        System.out.println("Con t, da tabulador:\t Esto es TAB");
        System.out.println("Con comilla simple o doble, \"" + $miVriableEnteraInferencial + "\"");
        System.out.println("");
        
        System.out.println("UTILIZANDO SCANNER: Realizar el uso de la clase SCANNER para poder hacer solicitudes al usuario");
        Scanner ent = new Scanner(System.in);
        System.out.print("Ingresa tu apellido:");
        var $apellido = ent.nextLine();
        System.out.print("Ingresa un titulo:");
        var $titulo = ent.nextLine();
        System.out.println("Bienvenido: " + $titulo + " " + $apellido);
        
        
        System.out.println("\nCONVERSIONES");
        System.out.println("Conversion de String a Int y double,etc");
        System.out.print("Ingresa tu edad:");
        Scanner entrada = new Scanner(System.in);
        var edad = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingresa tu sueldo: ");
        var sueldo = Double.parseDouble(entrada.nextLine());
        System.out.println("La edad tuya es:\t"+edad);
        System.out.println("Tu sueldo es:\t"+sueldo);
        System.out.println("\nConversion de numeros a string:");
        var edadTexto= String.valueOf(15);
        System.out.println("La edad ingresa por numero es: "+edadTexto);
    }
}
