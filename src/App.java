import java.util.Random;
import java.util.Scanner;

/**
 * App
 */
public class App {


    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random ale = new Random();

        for (int index = 0; index < vetor.length; index++) {
            vetor[index] = ale.nextInt(75);
            System.out.print(vetor[index] + ("  "));
        }
        System.out.println();
        for (int index = 0; index < vetor.length; index++) {
for (int i = index; i >= 0; i--) {
    if (vetor[index] < vetor[i]) {
    int auxi = vetor[i];
    vetor[i] = vetor[index];
    vetor[index] = auxi;
    index = i;
    }
}
        }
        for (int index = 0; index < vetor.length; index++) {
        System.out.print(vetor[index] + ("  "));
        }
        System.out.println();
    }
}