import java.util.Scanner;

class UserInpt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int a = sc.nextInt();

        System.out.println("Enter a Number: ");
        int b = sc.nextInt();

        System.out.println("Result Is = " + (a+b));

    }    
}
