/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dteccionrenal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tony
 */
public class PRINCIPAL extends javax.swing.JFrame {

    /**
     * Creates new form PRINCIPAL
     */
    public PRINCIPAL() {
        initComponents();
    }
    //MOSTRAR CKD.
     void mostrarCKD (String valor) {
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("age");
        modelo.addColumn("blood pressure"); 
        modelo.addColumn("Specific Gravity"); 
        modelo.addColumn("Albumin");
        modelo.addColumn("sugar");
        modelo.addColumn("red blood cells");
        modelo.addColumn("puss cell");
        modelo.addColumn("pus cell clumps");
        modelo.addColumn("bacteria");
        modelo.addColumn("blood glucose random");
        modelo.addColumn("blood urea");
        modelo.addColumn("serum creatine");
        modelo.addColumn("sodium");
        modelo.addColumn("potassium");
        modelo.addColumn("hemoglobin");
        modelo.addColumn("packed cell volume");
        modelo.addColumn("white blood cell");
        modelo.addColumn("hypertension");
        modelo.addColumn("diabetes mellitus");
        modelo.addColumn("coronary artery disease");
        modelo.addColumn("appetite");
        modelo.addColumn("pedal edema");
        modelo.addColumn("anemia");
        modelo.addColumn("class");
        modelo.addColumn("class1");
        
        Tabla.setModel(modelo); 
        String sql =""; 
        if(valor.equals("")){
            sql = "call simon";
        }
        else {
            sql = "call simon"; 
        }
        String []datos = new String[25]; 
        try {
            Statement st = cn.createStatement(); 
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()){
                datos[0] = rs.getString(1); 
                datos[1] = rs.getString(2); 
                datos[2] = rs.getString(3);
                ////
                datos[3] = rs.getString(4); 
                datos[4] = rs.getString(5); 
                datos[5] = rs.getString(6); 
                datos[6] = rs.getString(7); 
                datos[7] = rs.getString(8); 
                datos[8] = rs.getString(9); 
                datos[9] = rs.getString(10); 
                datos[10] = rs.getString(11); 
                datos[11] = rs.getString(12); 
                datos[12] = rs.getString(13); 
                datos[13] = rs.getString(14); 
                datos[14] = rs.getString(15);
                
               datos[15] = rs.getString(16);
               datos[16] = rs.getString(17);
               datos[17] = rs.getString(18);
               datos[18] = rs.getString(19);
               datos[19] = rs.getString(20);
               datos[20] = rs.getString(21);
               datos[21] = rs.getString(22);
               datos[22] = rs.getString(23);
               datos[23] = rs.getString(24);
               datos[24] = rs.getString(25);
               
              
                //datos[30] = rs.getString(31);
                
                modelo.addRow(datos);
            }
            Tabla.setModel(modelo);
        } catch (SQLException ex){
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
     //SEGUNDA TABLA PARA ORDENAR POR EDADES. 
     void ordenar (String valor) {
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("age");
        modelo.addColumn("blood pressure"); 
        modelo.addColumn("Specific Gravity"); 
        modelo.addColumn("Albumin");
        modelo.addColumn("sugar");
        modelo.addColumn("red blood cells");
        modelo.addColumn("puss cell");
        modelo.addColumn("pus cell clumps");
        modelo.addColumn("bacteria");
        modelo.addColumn("blood glucose random");
        modelo.addColumn("blood urea");
        modelo.addColumn("serum creatine");
        modelo.addColumn("sodium");
        modelo.addColumn("potassium");
        modelo.addColumn("hemoglobin");
        modelo.addColumn("packed cell volume");
        modelo.addColumn("white blood cell");
        modelo.addColumn("hypertension");
        modelo.addColumn("diabetes mellitus");
        modelo.addColumn("coronary artery disease");
        modelo.addColumn("appetite");
        modelo.addColumn("pedal edema");
        modelo.addColumn("anemia");
        modelo.addColumn("class");
        modelo.addColumn("class1");
        
        Tabla.setModel(modelo); 
        String sql =""; 
        if(valor.equals("")){
            sql = "call orden";
        }
        else {
            sql = "call orden"; 
        }
        String []datos = new String[25]; 
        try {
            Statement st = cn.createStatement(); 
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()){
                datos[0] = rs.getString(1); 
                datos[1] = rs.getString(2); 
                datos[2] = rs.getString(3);
                ////
                datos[3] = rs.getString(4); 
                datos[4] = rs.getString(5); 
                datos[5] = rs.getString(6); 
                datos[6] = rs.getString(7); 
                datos[7] = rs.getString(8); 
                datos[8] = rs.getString(9); 
                datos[9] = rs.getString(10); 
                datos[10] = rs.getString(11); 
                datos[11] = rs.getString(12); 
                datos[12] = rs.getString(13); 
                datos[13] = rs.getString(14); 
                datos[14] = rs.getString(15);
                
               datos[15] = rs.getString(16);
               datos[16] = rs.getString(17);
               datos[17] = rs.getString(18);
               datos[18] = rs.getString(19);
               datos[19] = rs.getString(20);
               datos[20] = rs.getString(21);
               datos[21] = rs.getString(22);
               datos[22] = rs.getString(23);
               datos[23] = rs.getString(24);
               datos[24] = rs.getString(25);
               
              
                //datos[30] = rs.getString(31);
                
                modelo.addRow(datos);
            }
            Tabla.setModel(modelo);
        } catch (SQLException ex){
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex); 
        }
       }
    //MOSTRAR LOS NOTCKD
     void mostrarNOTCKD (String valor) {
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("age");
        modelo.addColumn("blood pressure"); 
        modelo.addColumn("Specific Gravity"); 
        modelo.addColumn("Albumin");
        modelo.addColumn("sugar");
        modelo.addColumn("red blood cells");
        modelo.addColumn("puss cell");
        modelo.addColumn("pus cell clumps");
        modelo.addColumn("bacteria");
        modelo.addColumn("blood glucose random");
        modelo.addColumn("blood urea");
        modelo.addColumn("serum creatine");
        modelo.addColumn("sodium");
        modelo.addColumn("potassium");
        modelo.addColumn("hemoglobin");
        modelo.addColumn("packed cell volume");
        modelo.addColumn("white blood cell");
        modelo.addColumn("hypertension");
        modelo.addColumn("diabetes mellitus");
        modelo.addColumn("coronary artery disease");
        modelo.addColumn("appetite");
        modelo.addColumn("pedal edema");
        modelo.addColumn("anemia");
        modelo.addColumn("class");
        modelo.addColumn("class1");
        
        Tabla.setModel(modelo); 
        String sql =""; 
        if(valor.equals("")){
            sql = "call nel";
        }
        else {
            sql = "call nel"; 
        }
        String []datos = new String[25]; 
        try {
            Statement st = cn.createStatement(); 
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()){
                datos[0] = rs.getString(1); 
                datos[1] = rs.getString(2); 
                datos[2] = rs.getString(3);
                ////
                datos[3] = rs.getString(4); 
                datos[4] = rs.getString(5); 
                datos[5] = rs.getString(6); 
                datos[6] = rs.getString(7); 
                datos[7] = rs.getString(8); 
                datos[8] = rs.getString(9); 
                datos[9] = rs.getString(10); 
                datos[10] = rs.getString(11); 
                datos[11] = rs.getString(12); 
                datos[12] = rs.getString(13); 
                datos[13] = rs.getString(14); 
                datos[14] = rs.getString(15);
                
               datos[15] = rs.getString(16);
               datos[16] = rs.getString(17);
               datos[17] = rs.getString(18);
               datos[18] = rs.getString(19);
               datos[19] = rs.getString(20);
               datos[20] = rs.getString(21);
               datos[21] = rs.getString(22);
               datos[22] = rs.getString(23);
               datos[23] = rs.getString(24);
               datos[24] = rs.getString(25);
               
              
                //datos[30] = rs.getString(31);
                
                modelo.addRow(datos);
            }
            Tabla.setModel(modelo);
        } catch (SQLException ex){
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
     //Ordenartodo
     void ordenartodo (String valor) {
        DefaultTableModel modelo = new DefaultTableModel(); 
        modelo.addColumn("age");
        modelo.addColumn("blood pressure"); 
        modelo.addColumn("Specific Gravity"); 
        modelo.addColumn("Albumin");
        modelo.addColumn("sugar");
        modelo.addColumn("red blood cells");
        modelo.addColumn("puss cell");
        modelo.addColumn("pus cell clumps");
        modelo.addColumn("bacteria");
        modelo.addColumn("blood glucose random");
        modelo.addColumn("blood urea");
        modelo.addColumn("serum creatine");
        modelo.addColumn("sodium");
        modelo.addColumn("potassium");
        modelo.addColumn("hemoglobin");
        modelo.addColumn("packed cell volume");
        modelo.addColumn("white blood cell");
        modelo.addColumn("hypertension");
        modelo.addColumn("diabetes mellitus");
        modelo.addColumn("coronary artery disease");
        modelo.addColumn("appetite");
        modelo.addColumn("pedal edema");
        modelo.addColumn("anemia");
        modelo.addColumn("class");
        modelo.addColumn("class1");
        
        Tabla.setModel(modelo); 
        String sql =""; 
        if(valor.equals("")){
            sql = "SELECT * FROM tbl_name";
        }
        else {
            sql = "SELECT * FROM tbl_name WHERE tbl_name = '"+valor+"'"; 
        }
        String []datos = new String[25]; 
        try {
            Statement st = cn.createStatement(); 
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()){
                datos[0] = rs.getString(1); 
                datos[1] = rs.getString(2); 
                datos[2] = rs.getString(3);
                ////
                datos[3] = rs.getString(4); 
                datos[4] = rs.getString(5); 
                datos[5] = rs.getString(6); 
                datos[6] = rs.getString(7); 
                datos[7] = rs.getString(8); 
                datos[8] = rs.getString(9); 
                datos[9] = rs.getString(10); 
                datos[10] = rs.getString(11); 
                datos[11] = rs.getString(12); 
                datos[12] = rs.getString(13); 
                datos[13] = rs.getString(14); 
                datos[14] = rs.getString(15);
                
               datos[15] = rs.getString(16);
               datos[16] = rs.getString(17);
               datos[17] = rs.getString(18);
               datos[18] = rs.getString(19);
               datos[19] = rs.getString(20);
               datos[20] = rs.getString(21);
               datos[21] = rs.getString(22);
               datos[22] = rs.getString(23);
               datos[23] = rs.getString(24);
               datos[24] = rs.getString(25);
               
              
                //datos[30] = rs.getString(31);
                
                modelo.addRow(datos);
            }
            Tabla.setModel(modelo);
        } catch (SQLException ex){
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("PROBAR CONEXION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jButton2.setText("TIENEN ENFERMEDAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("ORDENAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("NO TIENEN ENFERMEDAD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("MOSTRAR TABLA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("IR A ENCUESTA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(93, 93, 93)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
conectar cc = new conectar();
 Connection cn = cc.conexion(); 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conectar cc = new conectar();
    Connection cn = cc.conexion();
    if(cn==null)
    {   
        JOptionPane.showMessageDialog(null, "No conectado");
    }
    else
    {
        JOptionPane.showMessageDialog(null, "conectado");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrarCKD("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ordenar(""); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mostrarNOTCKD("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ordenartodo("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       ENCUESTA primera = new ENCUESTA(); 
    primera.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
