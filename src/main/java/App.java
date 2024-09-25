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

     // Experimentos solicitados:
        // 1. c1.massa = "2"; 
        // Ocorrência: erro de compilação, pois o atributo 'massa' é privado e não pode ser acessado diretamente.

        // 2. Alteração de 'private int massa' para 'public int massa':
        // Não é permitido atribuir uma string para int.
        // Ocorrência: o atributo 'massa' passa a ser acessível diretamente na classe main. Caso for c1.massa = 2 funcionaria. Entretanto, não seria uma boa prática de programação!

        // 3. Alteração de 'public void setVolume(double volume)' para 'private void setVolume(double volume)':
        // Ocorrência: não é mais possível chamar o método setVolume na classe Main, pois ele agora é privado.
    }
}