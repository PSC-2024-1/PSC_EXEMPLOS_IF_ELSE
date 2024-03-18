/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um algoritmo que resolva uma equação de segundo grau, realizando a
        verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do
        discriminante (delta).
        a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de
        zero, apresentar a mensagem "Coeficientes informados incorretamente.".
        b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero,
        deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá
        ser informado o valor da raiz real da equação.
        c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta
        equação não possui raízes reais".
        d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas
        raízes reais iguais. " e informar o valor das raízes da equação.
        e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação
        possui duas raízes reais diferentes. " e informar o valor das raízes da equação.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os coeficientes a, b e c da equação de segundo grau:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Coeficientes informados incorretamente.");
            } else {
                System.out.println("Essa é uma equação de primeiro grau.");
                System.out.println("Raiz: " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + (-b / (2 * a)));
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("Raiz 2: " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }

    }

}
