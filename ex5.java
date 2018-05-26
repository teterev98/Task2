public class ex5 {
    public static void main(String[] args) {

    }
    public static double averArith(int a){
        int dig1, dig2, dig3, dig4, dig5, dig6;
        double ans;
        dig1 = a % 10;
        dig2 = a / 10 % 10;
        dig3 = a / 100 % 10;
        dig4 = a / 1000 % 10;
        dig5 = a / 10000 % 10;
        dig6 = a / 100000 % 10;
        ans = (dig1 + dig2 + dig3 + dig4 + dig5 + dig6 ) / 6.;
        return ans ;
    }
    public static double averGeometr(int a){
        int dig1, dig2, dig3, dig4, dig5, dig6;
        double ans;
        dig1 = a % 10;
        dig2 = a / 10 % 10;
        dig3 = a / 100 % 10;
        dig4 = a / 1000 % 10;
        dig5 = a / 10000 % 10;
        dig6 = a / 100000 % 10;
        ans = Math.pow((dig1 * dig2 * dig3 * dig4 * dig5 * dig6 ), 1/6.);
        return ans ;
    }
}
