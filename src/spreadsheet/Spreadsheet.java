/**
 * 
 */
package spreadsheet;

/**
 * @author Justin
 * 
 * The master class of the spreadsheet application
 *
 */
public class Spreadsheet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create the GUI
		SSGUI gui = new SSGUI();
		
		//setup initial values
		Grid grid = new Grid();
		
		gui.displayMessage("Welcome to the Team 3 spreadsheet app!");
	}

}
