/**
 * OOPSBannerApp UC4 – Banner Display Application with Modular Design
 *
 * This class builds upon UC4 by further improving code organization and readability. 
 * Instead of constructing each banner line with multiple String.join() calls inside 
 * the main method, UC4 simplifies the design by storing the complete banner lines 
 * directly in an array. This approach reduces redundancy and makes the banner 
 * definition more concise.
 *
 * <p>Key improvements in UC4 include:</p>
 * - Cleaner representation of banner patterns using a single array of strings.
 * - Separation of banner data from display logic, enhancing maintainability.
 * - Easier scalability for future enhancements, such as supporting different 
 *   words or dynamically generated banners.
 *
 * <p>The banner continues to be displayed line by line, forming the letters 
 * O, O, P, and S in a stylized format. The design emphasizes simplicity and 
 * clarity while retaining efficiency.</p>
 *
 * @author Developer
 * @version 5.0
 */



public class OOPSBannerApp {

    public static void main(String[] args) {
        // Main method to run banner display
        // String.join will combine them with spaces in between
		// Each line will correspond to a row in the banner for the letters O, O, P, S.

        String str[] = {"  ***     ***   ****   ******",
						"**   ** **   ** **  ** **    ",
						"**   ** **   ** **  ** **    ",
						"**   ** **   ** **  ** ******",
						"**   ** **   ** ****       **",
						"**   ** **   ** **         **",
						"  ***     ***   **     ******"};
						
		
		for (String s : str) {
			System.out.println(s);
		}
		
    }
}

