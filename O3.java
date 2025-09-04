import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Skriv inn n for å beregne n!: ");
        int n = scanner.nextInt();
        int resultat = beregneFakultet(n);
        System.out.printf("Resultat: %d", resultat);
    }

    public static int beregneFakultet(int n){
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
