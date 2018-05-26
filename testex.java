public class testex {
    public static void main(String[] args) {

    }
    public static void testex1() {
        int a = 2, b = 3, c =4;
        System.out.println("*** ex1 ***");
        System.out.println(ex1.eq(a, b, c));
        System.out.println(ex1.eq(2, 2, 2));
    }
    public static void testex2() {
        int mass = 1235;
        System.out.println("*** ex2 ***");
        System.out.printf("miligtamm = %d, gramm = %d, t = %.3f \n",
                ex2.mili(mass), ex2.gramm(mass), ex2.tonn(mass));
    }
    public static void testex3() {
        int r1 = 13, r2 = 7;
        System.out.println("*** ex3 ***");
        System.out.printf("r1 = %d, r2 = %d, radius lolca = %.3f \n", r1, r2, ex3.radius(13, 7));
    }
    public static void testex4() {
        int a = 1234;
        System.out.println("*** ex4 ***");
        System.out.println(ex4.ubposl(a));
        System.out.println(ex4.vozrposl(a));
    }
    public static void testex5() {
        int a = 423543;
        System.out.println("*** ex5 ***");
        System.out.printf("srednee arithm = %.5f \n srednne geometr = %.5f \n",
                ex5.averArith(a), ex5.averGeometr(a));
    }
    public static void testex6() {
        int a = 1234567;
        System.out.println("*** ex6 ***");
        System.out.printf("rev %d = %d\n", a, ex6.rev(a));
    }
    public static void testex7() {
        int a = 137, b = 218;
        System.out.println("*** ex7 ***");
        System.out.println("???????");
    }
}
