package Prova1;

import java.io.IOException;
import java.util.Scanner;

//  Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
// Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na
// área inferior da matriz, conforme ilustrado abaixo (área verde).

public class Prova3 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i=0; i < M.length; i++) {
            for (int j=0  ; j <  M.length ; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i=0; i < M.length ; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j<i && j>M.length-i-1 ) soma += M[i][j];
            }
        }

        if (O=='M'              ) soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}
