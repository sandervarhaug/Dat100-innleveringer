import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poengSum;
        for (int i = 1; i < 11; i++) {
            System.out.println("Skriv poeng på elev " + i + ": ");
            boolean kanVidere = false;
            do {
                poengSum = scanner.nextInt();
                if (poengSum > 0 && poengSum <= 100) {
                    char karakter = karakterBeregning(poengSum);
                    System.out.printf("Karakteren er %c ", karakter);
                    System.out.println("");
                    kanVidere = true;
                }
                else {
                    System.out.println("Ikke en gyldig verdi");
                }
            } while(!kanVidere);

        }
    }
    public static char karakterBeregning (int poengSum) {
        if  (poengSum > 0 && poengSum <= 39) {
            return 'F';
        } else if (poengSum > 39 && poengSum <= 49) {
            return 'E';
        } else if (poengSum > 49 && poengSum <= 59) {
            return 'D';
        }  else if (poengSum > 59 && poengSum <= 79) {
            return 'C';
        }  else if (poengSum > 79 && poengSum <= 89) {
            return 'B';
        }   else if (poengSum > 89 && poengSum <= 100) {
            return 'A';
        }
        else {
            return '0';
        }
    }
}
