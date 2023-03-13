import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        int n1, n2, ch, cal;
        System.out.println("Enter number 1:-");
        Scanner r = new Scanner(System.in);
        n1 = r.nextInt();

        System.out.println("Enter number 2:-");
        n2 = r.nextInt();
        while (true) {
            System.out.println("Select operation:-");
            System.out.println("Choose the operation:-");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            ch = r.nextInt();

            if (ch == 1) {
                cal = n1 + n2;
                System.out.println("The addition of both numbers is :-" + cal);
            } else if (ch == 2) {
                cal = n1 - n2;
                System.out.println("The subtraction of both numbers is :-" + cal);
            } else if (ch == 3) {
                cal = n1 * n2;
                System.out.println("The multiplication of both numbers is :-" + cal);
            } else if (ch == 4) {
                cal = n1 % n2;
                System.out.println("The division of both numbers is :-" + cal);
            } else {
                System.out.println("The choice is invalid");
                break;
            }
            
        }

    }
}
