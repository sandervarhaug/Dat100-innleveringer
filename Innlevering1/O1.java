import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        boolean videre = false;
        double bruttoInntekt;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Skriv inn brutto lønn: ");
            bruttoInntekt = scanner.nextDouble();
            if(bruttoInntekt <= 217400) {
                System.out.println("Du betaler ikke noe trinnskatt");
            }
            else if (bruttoInntekt > 217400) {
                videre = true;
            }
        }  while (!videre);

        double trinnskattTotal = beregnTrinnskatt(bruttoInntekt);
        System.out.printf("Beløpet du betaler i trinnskatt er %.2f",  trinnskattTotal);
    }

    public static double beregnTrinnskatt(double bruttoInntekt) {
        if(bruttoInntekt > 217400 &&  bruttoInntekt <= 306050) {
            return bruttoInntekt * 0.017;
        } else if(bruttoInntekt > 306050 &&  bruttoInntekt <= 697150) {
            return bruttoInntekt * 0.04;
        } else if(bruttoInntekt > 697150 &&  bruttoInntekt <= 942400) {
            return bruttoInntekt * 0.137;
        } else if(bruttoInntekt > 942400 &&  bruttoInntekt <= 1410750) {
            return bruttoInntekt * 0.167;
        } else if(bruttoInntekt > 1410751) {
            return bruttoInntekt * 0.177;
        }
        else {
            return bruttoInntekt * 0;
        }
    }
}
