import java.sql.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        System.out.println("");
        float[] second = {1.57f, 7.654f, 9.986f};

        System.out.println("");
        int[] third = new int[9];

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        for (int i = 0; i <= third.length - 1; i++) {
            third[i] = i + 1;
            System.out.print(third[i] + ", ");
            third[third.length - 1] = i + 2;
            if (i == third.length - 1) {
                System.out.println(third[third.length - 1]);
            }
        }

        System.out.println("Задача 3");
        for (int arr = first.length - 1; arr >= 0; arr--) {
            if (arr > 0) {
                System.out.print(first[arr] + ", ");
            }
            if (arr == 0) {
                System.out.println(first[0]);
            }
        }
        for (int sec = second.length - 1; sec >= 0; sec--) {
            if (sec > 0) {
                System.out.print(second[sec] + ", ");
            }
            if (sec == 0) {
                System.out.println(second[0]);
            }
        }
        for (int th = third.length - 1; th >= 0; th--) {
            if (th > 0) {
                System.out.print(third[th] + ", ");
            }
            if (th == 0) {
                System.out.println(third[0]);
            }
        }
        System.out.println("Задача 4");
        for (int ch = 0; ch <= first.length - 1; ch++) {
            if ((first[ch] % 2) != 0) {
                first[ch] = first[ch] + 1;
            }
        }
        System.out.print(Arrays.toString(first));
    }
}


