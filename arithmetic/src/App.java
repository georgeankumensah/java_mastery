// import java.util.Scanner;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        int a,b,results;
        
        // Scanner scanner = new Scanner(System.in);


        // System.out.println("input values for  a and b");

        // a = scanner.nextInt();
        // b = scanner.nextInt();

        String inputa =JOptionPane.showInputDialog( "Input a value");
        String inputb = JOptionPane.showInputDialog( "input b value");

        a = Integer.parseInt(inputa);
        b= Integer.parseInt(inputb);

        results = a + b;
        System.out.println("result after addition " + results);

        results = a - b;
        System.out.println("result after subtraction " + results);

        results = a * b;
        System.out.println("result after multiplication " + results);

        results = a / b;
        System.out.println("result after divisioon " + results);

        results = a % b;
        System.out.println("remainder " + results);


    }
}
