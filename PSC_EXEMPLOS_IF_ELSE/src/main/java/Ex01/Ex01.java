/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /*Escreva um algoritmo que leia 3 números a
        partir do teclado. O algoritmo deve apresentar:
        a. O maior número.
        b. O menor número.
        c. A média aritmética dos três números*/
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite três números:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double maior = num1; 
        
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        double menor = num1; 
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Calculando a média aritmética
        double media = (num1 + num2 + num3) / 3;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);
    }
}
