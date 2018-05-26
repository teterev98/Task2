public class ex4 {
    public static void main(String[] args) {

    }
    public static boolean ubposl (int a) {
        int dig1, dig2, dig3, dig4;
        boolean ans;
        dig1 = a % 10;
        dig2 = a / 10 % 10;
        dig3 = a / 100 % 10;
        dig4 = a / 1000 % 10;
        ans = dig1 < dig2 & dig2 < dig3 & dig3 < dig4;
        return ans;
    }
    public static boolean vozrposl (int a ) {
        int dig1, dig2, dig3, dig4;
        boolean ans;
        dig1 = a % 10;
        dig2 = a / 10 % 10;
        dig3 = a / 100 % 10;
        dig4 = a / 1000 % 10;
        ans = dig1 > dig2 & dig2 > dig3 & dig3 > dig4;
        return ans;
    }
}

