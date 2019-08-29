import java.util.Scanner;
// SSN validation
public class SSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = input.next();

        for (int i = 0; i < ssn.length(); i++) {
            char ssnDigit = ssn.charAt(i);

                if (i == 3 || i == 6 || ssn.length()!= 11) {
                    if (ssnDigit != '-') {
                        System.out.printf("%s is a not valid social security number%n", ssn);
                        System.exit(1);
                    }
                }
                else {
                    if (!Character.isDigit(ssnDigit)) {
                        System.out.printf("%s is a not valid social security number%n", ssn);
                        System.exit(1);
                    }
                }
            System.out.printf("%s is a valid social security number%n", ssn);
            System.exit(1);
        }
    }
}
