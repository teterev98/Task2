public class ex6 {
    public static void main(String[] args) {

    }
    public static int rev(int a){
        int dig1, dig2, dig3, dig4, dig5, dig6, dig7;
        dig1 = a % 10;
        dig2 = a / 10 % 10;
        dig3 = a / 100 % 10;
        dig4 = a / 1000 % 10;
        dig5 = a / 10000 % 10;
        dig6 = a / 100000 % 10;
        dig7 = a / 1000000 % 10;
        return dig1 * 1000000 + dig2 * 100000 + dig3 * 10000
                + dig4 * 1000 + dig5 * 100 + dig6 * 10 + dig7;
    }
}
