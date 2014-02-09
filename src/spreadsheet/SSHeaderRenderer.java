/**
 * 
 */
package spreadsheet;

import java.awt.*;

import javax.swing.JTable;

/**
 * @author Justin Dupuis
 *
 * Used for formatting the column header text
 */
public class SSHeaderRenderer extends SSTableRenderer {
	
	Font fntHeader;

	/**
	 * @param table
	 */
	public SSHeaderRenderer(JTable table) {
		super(table);
		fntHeader = table.getFont();
		fntHeader = fntHeader.deriveFont(Font.BOLD);
		fntHeader = fntHeader.deriveFont(Font.ITALIC);
		
		this.renderer.setFont(fntHeader);
		// TODO Auto-generated constructor stub
	}

}
