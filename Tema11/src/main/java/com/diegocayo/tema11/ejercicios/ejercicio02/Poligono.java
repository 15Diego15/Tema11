package com.diegocayo.tema11.ejercicios.ejercicio02;

import com.diegocayo.tema11.ejercicios.ejercicio01.Punto;

import java.util.List;

public class Poligono {
    private List<Punto> punto;

    public Poligono(List<Punto> punto) {
        this.punto = punto;
    }

    public void  traslada(double dx, double dy) {
        for (Punto punto : punto) {
            punto.setX(punto.getX() + dx);
            punto.setY(punto.getY() + dy);
        }
    }

    public int numVertices() {
        return punto.size();
    }


    public double perimetro() {
        double perimetro = 0;
        int numVertices = punto.size();
        for (int i = 0; i < numVertices; i++) {
            Punto puntoActual = punto.get(i);
            Punto puntoSiguiente = punto.get((i + 1) % numVertices);
            perimetro += puntoActual.distancia(puntoSiguiente);
        }
        return perimetro;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "puntosPoligono=" + punto +
                '}';
    }

}
