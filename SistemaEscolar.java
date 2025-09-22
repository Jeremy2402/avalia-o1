import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        // Vetor para armazenar as 8 notas
        double[] notas = new double[8];

        // Leitura das 8 notas
        System.out.println(" Digite as 8 notas anuais do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota" + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double bimestre1 = (notas[0] + notas[1]) / 2;
        double bimestre2 = (notas[2] + notas[3]) / 2;
        double bimestre3 = (notas[4] + notas[5] / 2);
        double bimestre4 = (notas[6] + notas[7]) / 2;

        // Cálculo das médias semestrais
        double semestre1 = (bimestre1 + bimestre2) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        // Cálculo da média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibição dos resultados
        System.out.println("\nPráticas");
        System.out.printf("1°Bimestre: %.1f%n", bimestre1);
        System.out.printf("2°Bimestre: %.1f%n", bimestre2);
        System.out.printf("1°Semestre: %.1f%n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3°Bimestre: %.1f%n", bimestre3);
        System.out.printf("4°Bimestre: %.1f%n", bimestre4);
        System.out.printf("2ºSemestre: %.1f%n", semestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
