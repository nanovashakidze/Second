// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public double geometricMean(int[] arr) {
        int oddCount = 0;
        double product = 1.0;

        for (int j : arr) {
            if (j % 2 != 0) {
                product *= j;
                oddCount++;
            }
        }

        if (oddCount == 0) {
            return 0;
        }

        return Math.pow(product, 1.0 / oddCount);
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+8.
            System.out.println("i = " + i);
        }
    }
}