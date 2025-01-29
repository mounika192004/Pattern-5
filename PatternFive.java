public class PatternFive {
    public static void main(String[] args) {
        int n=3;
        printDiamond(n);
    }

    public static void printDiamond(int n) {
        // Print upper half of the diamond
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




