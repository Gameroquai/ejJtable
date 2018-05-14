/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gamero
 */
public class Jtable extends JFrame{

    String[]    columnNames;
    Object[][]  data;
    JTable      miTabla;
    JScrollPane panelTabla;
    DefaultTableModel   dtm;
            
    public Jtable(String title) throws HeadlessException {
        super(title);
        columnNames = new String[]{"Nombre", "Apellido", "Pasatiempo", "Anios Practica", "Soltero(a)"};
        data = new Object[][]{
                {"Mary", "Campione", "Esquiar", new Integer(5), new Boolean(false)},
                {"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)},
                {"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)},
                {"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)},
                {"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)}
        };
        
        dtm = new DefaultTableModel(data, columnNames);
        miTabla = new JTable(dtm);
        
        String[] newColumn = new String[]{"Flan",
                            "Pastel",
                            "Helado",
                            "Barquillo",
                            "Manzana"};
        dtm.addColumn("Postre",newColumn);
        
        panelTabla = new JScrollPane(miTabla);
        this.setContentPane(panelTabla);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Jtable tabla = new Jtable ("Porbando JTable");
    }
    
}
