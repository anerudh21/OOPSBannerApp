/**
 * OOPSBannerApp UC4 – Banner Display Application with Modular Design
 *
 * This class extends the functionality of UC3 by introducing modularity 
 * and better code organization. Instead of hardcoding banner lines directly 
 * in the main method, UC4 separates the banner construction logic into 
 * reusable methods. This enhances maintainability, readability, and scalability 
 * of the application.
 *
 * <p>Key improvements in UC4 include:</p>
 * - Encapsulation of banner creation logic into dedicated methods.
 * - Clear separation between data (banner patterns) and display logic.
 * - Improved flexibility for future enhancements, such as supporting 
 *   different words or dynamic banner generation.
 *
 * <p>The banner continues to be generated using String.join() for efficient 
 * concatenation, but now the design emphasizes clean structure and reusability 
 * over a monolithic approach.</p>
 *
 * @author Developer
 * @version 4.0
 */


public class OOPSBannerApp {

    public static void main(String[] args) {
        // Main method to run banner display
        // String.join will combine them with spaces in between
		// Each line will correspond to a row in the banner for the letters O, O, P, S.

        String str[] = new String[7];
		str[0] = String.join("  ", "  ***  ", "  ***  ", "****  ", "******");
        str[1] = String.join("  ", "**   **", "**   **", "**  **", "**    ");
        str[2] = String.join("  ", "**   **", "**   **", "**  **", "**    ");
        str[3] = String.join("  ", "**   **", "**   **", "**  **", "******");
        str[4] = String.join("  ", "**   **", "**   **", "****  ", "    **");
        str[5] = String.join("  ", "**   **", "**   **", "**    ", "    **");
        str[6] = String.join("  ", "  ***  ", "  ***  ", "**    ", "******");
		
		for (String s : str) {
			System.out.println(s);
		}
		
    }
}

