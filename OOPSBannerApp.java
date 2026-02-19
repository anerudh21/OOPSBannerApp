/**
 * OOPSBannerApp UC7-OOPS Banner Display Application
 * This class demonstrates a simple Java program that prints "OOPS"
 * using inner classes and modular methods for each letter.
 * Each letter is defined separately, and the banner is assembled line by line.
 *
 * @author Developer
 * @version 7.0
 */

class OOPSBannerApp {
	
    public static class PrintOOPS {

        // Pattern for letter O
        private static String[] print_O() {
            return new String[]{
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
            };
        }

        // Pattern for letter P 
        private static String[] print_P() {
            return new String[]{
                "*****  ",
                "**   **",
                "**   **",
                "*****  ",
                "**     ",
                "**     ",
                "**     "
            };
        }

        // Pattern for letter S
        private static String[] print_S() {
            return new String[]{
                "******",
                "**    ",
                "**    ",
                "******",
                "    **",
                "    **",
                "******"
            };
        }

        // Method to print the OOPS banner
        public static void print_out_OOPS() {
            String[] letter_O = print_O();
            String[] letter_P = print_P();
            String[] letter_S = print_S();

            // Loop through each line and print letters side by side
            for (int i = 0; i < letter_O.length; i++) {
                System.out.print(letter_O[i] + " ");
                System.out.print(letter_O[i] + " ");
                System.out.print(letter_P[i] + " ");
                System.out.println(letter_S[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Create object and call print method
        OOPSBannerApp.PrintOOPS the_print = new OOPSBannerApp.PrintOOPS();
        the_print.print_out_OOPS();
    }
}
