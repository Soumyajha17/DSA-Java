package conditionals;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
        System.out.println("Enter the operator:");
        char op = in.next().trim().charAt(0);
        int result = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the numbers:");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                if (op == '+') {
                    result = n1 + n2;
                } else if (op == '-'){
                    result = n1 - n2;
                }else if (op == '*'){
                    result = n1 * n2;
                }else if (op == '/'){
                    result = n1 / n2;
                }else if (op == '%'){
                    result = n1 % n2;
                }else {
                    System.out.println("Invalid answer");
                }

            }
            System.out.println("Result:" + result);
        }

    }
}
