package com.diegocayo.tema11.ejercicios.ejercicio03;

import java.util.Arrays;

public class Coche {
    private final String matricula;
    private float velocidadActual;
    private int marcha;
    private int[] marchaActual;

    public Coche(String matricula) {
        this.marchaActual = marchaActual;
        this.matricula = matricula;
        this.marcha = 0;
        this.velocidadActual = 0f;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getVelocidadActual() {
        return velocidadActual;
    }

    public int getMarcha() {
        return marcha;
    }

    public int[] getMarchaActual() {
        return marchaActual;
    }

    public void acelerar(float aceleracion) {
        velocidadActual += aceleracion;
    }

    public void frenar(float aceleracion) {
        velocidadActual -= aceleracion;
    }

    protected void cambiarMarcha(int marchaActual) {
        marcha = marchaActual;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", marcha=" + marcha +
                ", marchaActual=" + Arrays.toString(marchaActual) +
                '}';
    }
}
