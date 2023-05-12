/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions.matematiques;

/**
 *
 * @author alumne
 */
public class FuncionsMatematiques {

    /**
     * @param args the command line arguments
     */
    public static double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
    public class Main {
    public static void main(String[] args) {
        double[] numeros = {1.5, 2.7, 3.1, 4.8, 5.2};
        double media = FuncionsMatematiques.calcularMedia(numeros);
        System.out.println("La media de los números es: " + media);
    }
    }
   public class CalcularMitjana {
    public static void main(String[] args) {
        // Lista de números
        double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Calcular la media utilizando la función de la biblioteca matemática
        double media = FuncionsMatematiques.calcularMedia(numeros);

        // Imprimir el resultado
        System.out.println("La media de la lista es: " + media);
    }
}

}
    
    

