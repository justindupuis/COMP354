/**
 * 
 */
package spreadsheet;

import java.awt.Component;
import javax.swing.table.*;
import javax.swing.*;

/**
 * @author Justin Dupuis
 *
 * Used for formatting the cell text
 */
class SSTableRenderer implements TableCellRenderer {
	DefaultTableCellRenderer renderer;

	/*
	 * Constructor
	 */
	public SSTableRenderer(JTable table) {
	    renderer = (DefaultTableCellRenderer)
	    table.getTableHeader().getDefaultRenderer();
	    renderer.setHorizontalAlignment(JLabel.CENTER);
	}
	
  @Override
    public Component getTableCellRendererComponent(
	    JTable table, Object value, boolean isSelected,
	    boolean hasFocus, int row, int column) {
	    return renderer.getTableCellRendererComponent(
	        table, value, isSelected, hasFocus, row, column);
	    }
}
