package by.mercom;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

/**
 * Created by dm13y on 11/27/14.
 */
public class WeatherTableModel extends AbstractTableModel {
    public final String[] COLUMN_NAMES = new String[]{"Дата","Мин.Темп", "Макс.Темп", "Ср.Темп"};

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }


}
