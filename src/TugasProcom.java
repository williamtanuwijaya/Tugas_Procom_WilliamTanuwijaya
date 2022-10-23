import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasProcom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Input n = ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            if (i == n) {
                System.out.println();
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}