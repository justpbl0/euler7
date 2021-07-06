import java.math.BigInteger;
import java.util.ArrayList;

public class euler7 {

    public static void main(String[] args) {

        int n = 110001;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int k=1;

        for (int i = 2; i<n; i++) {

            Boolean czyLiczbaJestPierwsza = true;

            for (int prime : primes) {
                if (i%prime == 0) {
                    czyLiczbaJestPierwsza = false;
                    break;
                }

                }
            if (czyLiczbaJestPierwsza) {
                primes.add(i);
                System.out.println("liczba nr " + k +  " :" + i);
                k++;
            }

        }

    }
}