package com.diegocayo.tema11.ejercicios.ejercicio02;

import com.diegocayo.tema11.ejercicios.ejercicio01.Punto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {

        List<Punto> punto = new ArrayList<>();
        punto.add(new Punto(0,0));
        punto.add(new Punto(2,0));
        punto.add(new Punto(2,2));
        punto.add(new Punto(0,2));

        Poligono poligono = new Poligono(punto);
        System.out.println("Información del polígono:");
        System.out.println(poligono);
        System.out.println("Perímetro del polígono: " + poligono.perimetro());

        poligono.traslada(4, -3);

        System.out.println("Información del polígono tras del traslado:");
        System.out.println(poligono);
        System.out.println("Perímetro del polígono: " + poligono.perimetro());
    }
}
