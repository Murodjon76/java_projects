public class Factorial {
    public static int main(Integer a) {
        if (a < 0) {
            return -1;
        } else if (a == 0 | (a==1)){
            return 1;
        } else {
            int b = 1;
            for (int i = 2; i <=a ; i++) {
                b *= i;

            }
            return b;
        }
    }
}
