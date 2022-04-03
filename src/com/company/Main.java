package com.company;

public class Main {

    public static void main(String[] args) {
        suma(20, 40, 60);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.Puertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int Puertas = 3;

    public void sumarPuertas(){
        this.Puertas++;
    }
}


