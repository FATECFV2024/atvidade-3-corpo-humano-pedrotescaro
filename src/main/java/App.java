package main.java;

public class App {
    public static void main(String[] args) {
     // Instanciação do objeto CorpoHumano
     CorpoHumano c1 = new CorpoHumano(70, 0.07, 1000, 1.75);

     // Exibe os valores iniciais
     System.out.println("Massa: " + c1.getMassa() + " kg");
     System.out.println("Volume: " + c1.getVolume() + " m³");
     System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
     System.out.println("Altura: " + c1.getAltura() + " m");

     // Calcula e exibe o IMC
     System.out.println("IMC: " + c1.calcularIMC());
    }
}