/**
 * 
 */
package spreadsheet;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Justin Dupuis
 *
 * Represents the GUI table used to render the grid
 * 
 * Included all inhereted constructors just in case...
 */
public class SSTable extends JTable {

	JTableHeader header;
	
	int minRow;
	int maxRow;
	
	//Default column headers
	private static final String[] strADefaultColumnHeaders = {
			"A",
            "B",
            "C",
            "D",
            "E"};
	
	//default row headers
	private static final int[] objAADefaultRowHeaders =  {
			1,
            2,
            3,
            4,
            5};	
	
	// default cell values to be displayed initially
	private static final Object[][] objAADefaultCellValues = {
		    {0,0,0,0,0},
		    {0,0,0,0,0},
		    {0,0,0,0,0},
		    {0,0,0,0,0},
		    {0,0,0,0,0},
			};
	
	/**
	 * 
	 */
	public SSTable() {
		this(objAADefaultCellValues,strADefaultColumnHeaders);
	}


	/**
	 * @param rowData
	 * @param columnNames
	 */
	public SSTable(Object[][] rowData, Object[] columnNames) {
		super(rowData,columnNames);
		
		this.header = this.getTableHeader();
		
		this.setDefaultRenderer(Object.class,new SSTableRenderer(this));
		header.setDefaultRenderer(new SSHeaderRenderer(this));
	}
	
	/**
	 * @param dm
	 */
	public SSTable(TableModel dm) {
		super(dm);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dm
	 * @param cm
	 */
	public SSTable(TableModel dm, TableColumnModel cm) {
		super(dm, cm);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numRows
	 * @param numColumns
	 */
	public SSTable(int numRows, int numColumns) {
		super(numRows, numColumns);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rowData
	 * @param columnNames
	 */
	public SSTable(Vector rowData, Vector columnNames) {
		super(rowData, columnNames);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dm
	 * @param cm
	 * @param sm
	 */
	public SSTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {
		super(dm, cm, sm);
		// TODO Auto-generated constructor stub
	}

}
