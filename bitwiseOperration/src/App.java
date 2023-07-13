public class App {
    public static void main(String[] args) throws Exception {
        Byte var1 = 10;
        Byte var2 = 12;
        Byte res;


        res = (byte) (var1 & var2);
        System.out.println("var1 & var2 = " + res);

        res = (byte) (var1 | var2);
        System.out.println("var1 | var2 = " + res);

        res = (byte) (var1 ^ var2);
        System.out.println("var1 ^ var2 = " + res);

        res = (byte) ~var1;
        System.out.println("~var1 = " + res);

        res = (byte) (var1 << 2); //shift 2 bits to the left
        System.out.println("var1 << 2 = " + res);

        res = (byte) (var1 >> 2); //shift 2 bits to the right
        System.out.println("var1 >> 2 = " + res);
    }
}
