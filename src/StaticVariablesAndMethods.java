public class StaticVariablesAndMethods {
    static int a = 12;
    static int b = 11;
    static void m1(){
        System.out.println("m1 is static method");
    }

    static {
        if( a < b ){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
        m1();

    }
}
