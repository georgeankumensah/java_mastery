public class App {
    public static void main(String[] args) throws Exception {
        int var1,var2;

        var1 = 10;
        var2 = var1++; // var2 = var1; var1 = var1 + 1;
        System.out.println("var1: " + var1 + " var2: " + var2);


        var1 = 10;
        var2 = ++var1; // var1 = var1 + 1; var2 = var1;
        System.out.println("var1: " + var1 + " var2: " + var2);

        var1 = 10;
        var2 = var1--; // var2 = var1; var1 = var1 - 1;
        System.out.println("var1: " + var1 + " var2: " + var2);

        var1 = 10;
        var2 = --var1; // var1 = var1 - 1; var2 = var1;
        System.out.println("var1: " + var1 + " var2: " + var2);

        var1 = 10;
        var2 = var1++ + ++var1; // var2 = var1 + 1 + var1 + 1; var1 = var1 + 1;
        System.out.println("var1: " + var1 + " var2: " + var2);



        boolean  bool1,res;
        bool1 = true;

        res = !bool1; // res = false;
        System.out.println("res: " + res);
    }
}
