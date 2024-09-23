package main.java;

public class CorpoHumano {
    private int massa;
    private double volume;
    private int densidade;
    private double altura;

    public CorpoHumano(int massa, double volume, int densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDensidade() {
        return densidade;
    }

    public void setDensidade(int densidade) {
        this.densidade = densidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        if (altura > 0) {
            return massa / (altura * altura);
        } else {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
    }
}
