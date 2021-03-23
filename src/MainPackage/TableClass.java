package MainPackage;

import javax.swing.*;
import java.awt.*;

public class TableClass {
     JFrame frame;
    TableClass(){
        frame =new JFrame();
        String fonts[] = getFonts();
        // setting data
        String tableData[][] = new String[fonts.length][2];
        for (int i = 0; i < fonts.length; i++) {
            tableData[i][0] = i+"";
            tableData[i][1] = fonts[i];
        }

        String column[]={"S.No","Font Name"};
        JTable jt=new JTable(tableData,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        frame.add(sp);
        frame.setSize(300,400);
        frame.setVisible(true);
    }
    public String[] getFonts() {
        String fonts[] =
                GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < fonts.length; i++) {
            // System.out.println(fonts[i]);
        }
        return fonts;
    }
    public static void main(String[] args) {
        new TableClass();
    }
}