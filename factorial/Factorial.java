package factorial;

public class Factorial {

    public static void main(String[] args) {

        int j;
        int factorizar;

        j = 8;

        int i;
        if (j == 0) {
            factorizar = 1;
        } else {
            factorizar = 1;
            for (i = j; i >= 1; i--) {
                factorizar = factorizar * i;
            }
        }

        System.out.println(factorizar);

    }

}
