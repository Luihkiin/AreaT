package area_t;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area_T {
    
    public static void main(String[] args) {
        // Instanciar os objetos
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        
        // Declaração das variáveis
        double ladoA;
        double ladoB;
        double areaT;
        
        // Finalidade do programa
        System.out.println("Programa que calcula a área de um triângulo.");
        
        // Entrada de dados
        System.out.print("Entre com a base do triângulo: ");
        ladoA = entrada.nextDouble();
        System.out.print("Entre com a altura do triângulo: ");
        ladoB = entrada.nextDouble();
        
        // Processamento
        areaT = (ladoA * ladoB) / 2.00;
        
        // Saída
        System.out.println("A área do triângulo de lado " 
                +df.format(ladoA) +" e " +df.format(ladoB) +" é " +df.format(areaT));
    } 
}
