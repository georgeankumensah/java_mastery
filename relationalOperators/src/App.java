public class App {
    public static void main(String[] args) throws Exception {
       boolean result;

       result = 10 > 9;
         System.out.println("10 > 9 = " + result);

         result = 10 < 9;
            System.out.println("10 < 9 = " + result);

            result = 10 >= 9;
            System.out.println("10 >= 9 = " + result);

            result = 10 <= 9;
            System.out.println("10 <= 9 = " + result);

            result = 10 == 9;
            System.out.println("10 == 9 = " + result);

            result = 10 != 9;
            System.out.println("10 != 9 = " + result);

            result = 10 > 9 && 10 < 11;
            System.out.println("10 > 9 && 10 < 11 = " + result);

            result = 10 > 9 || 10 < 11;
            System.out.println("10 > 9 || 10 < 11 = " + result);

            result = !(10 > 9);
            System.out.println("!(10 > 9) = " + result);

            result = !(10 < 9);
            System.out.println("!(10 < 9) = " + result);

            result = !(10 > 9 && 10 < 11);
            System.out.println("!(10 > 9 && 10 < 11) = " + result);

            result = !(10 > 9 || 10 < 11);
            System.out.println("!(10 > 9 || 10 < 11) = " + result);

            result = !(10 > 9) && !(10 < 11);
            System.out.println("!(10 > 9) && !(10 < 11) = " + result);

            result = !(10 > 9) || !(10 < 11);
            System.out.println("!(10 > 9) || !(10 < 11) = " + result);

            result = !(10 > 9) && 10 < 11;
            System.out.println("!(10 > 9) && 10 < 11 = " + result);

            result = !(10 > 9) || 10 < 11;
            System.out.println("!(10 > 9) || 10 < 11 = " + result);
    }
}
