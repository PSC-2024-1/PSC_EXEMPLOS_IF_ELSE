/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces,
sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve
ser dado de troco para um pagamento efetuado.
O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que
o valor da compra, a máquina deve apresentar uma mensagem, informando que a
quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de
R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.
Exemplo:
Valor pago: R$ 100,00
Valor da compra: R$ 23,00
Troco: R$ 77,00
Notas de R$ 50,00: 1
Notas de R$ 20,00: 1
Notas de R$ 10,00: 0
Notas de R$ 5,00: 1
Notas de R$ 2,00: 1
Notas de R$ 1,00: 0*/
        Scanner input = new Scanner(System.in);

        System.out.println("Valor da compra:");
        double valorCompra = input.nextDouble();

        System.out.println("Valor pago:");
        double valorPago = input.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Quantia é insuficiente para realizar a compra.");
        } else {
            int troco = (int) (valorPago - valorCompra);
            System.out.println("Troco: R$ " + troco);

            // Calcula a quantidade de cada nota no troco
            int notas50 = troco / 50;
            troco -= notas50 * 50;

            int notas20 = troco / 20;
            troco -= notas20 * 20;

            int notas10 = troco / 10;
            troco -= notas10 * 10;

            int notas5 = troco / 5;
            troco -= notas5 * 5;

            int notas2 = troco / 2;
            troco -= notas2 * 2;

            int notas1 = troco; // O restante corresponde às notas de R$1

            // Exibe a quantidade de cada nota, se houver
            if (notas50 > 0) {
                System.out.println("Notas de R$ 50,00: " + notas50);
            }
            if (notas20 > 0) {
                System.out.println("Notas de R$ 20,00: " + notas20);
            }
            if (notas10 > 0) {
                System.out.println("Notas de R$ 10,00: " + notas10);
            }
            if (notas5 > 0) {
                System.out.println("Notas de R$ 5,00: " + notas5);
            }
            if (notas2 > 0) {
                System.out.println("Notas de R$ 2,00: " + notas2);
            }
            if (notas1 > 0) {
                System.out.println("Notas de R$ 1,00: " + notas1);
            }
        }

    }

}
