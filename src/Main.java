import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = "Paulina ";
        String surname = "Wierdak ";
        System.out.println("" +name +surname);

        System.out.println("This website is only for users above 18");
        int x = scanner.nextInt();
        if (x>18){
            System.out.println("Hello," +name +surname);
        }if (x<18){
            System.out.println("This website is blocked " +name + surname);
        }




    }
}