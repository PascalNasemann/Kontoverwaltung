/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pascalnasemann
 */
import javax.swing.*;

public class Kontoerstellen_Form extends javax.swing.JFrame {

    /**
     * Creates new form Kontoerstellen_Form
     */
    
    private KontoForm Kontoform = new KontoForm();
    
    public Kontoerstellen_Form(KontoForm kontoform1) {
        Kontoform = kontoform1;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFeld_Name = new javax.swing.JTextField();
        TextFeld_Kontonummer = new javax.swing.JTextField();
        TextFeld_Kontostand = new javax.swing.JTextField();
        Button_AddKonto = new javax.swing.JButton();
        Button_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setResizable(false);

        jLabel1.setText("Name:");

        jLabel2.setText("Kontonummer:");

        jLabel3.setText("Kontostand");

        Button_AddKonto.setText("Konto hinzufügen");
        Button_AddKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AddKontoActionPerformed(evt);
            }
        });

        Button_Close.setText("Fenster schliesen");
        Button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFeld_Kontostand, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(TextFeld_Kontonummer)
                            .addComponent(TextFeld_Name)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_AddKonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_Close)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFeld_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFeld_Kontonummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFeld_Kontostand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_AddKonto)
                    .addComponent(Button_Close))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private String Komma_zum_Punkt_machen(String string){
        char [] chararray = string.toCharArray();
        
        for(int i = 0; i < chararray.length; i++){
            if(chararray[i] == ','){
                chararray[i] = '.';
            }
        }
        String str = new String(chararray);
        
        return str;
    }
    
    private void Button_AddKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AddKontoActionPerformed
        String name ="";
        int kontonummer=0;
        double kontostand=0;
        
        try{
            name = TextFeld_Name.getText();
            kontonummer=Integer.parseInt(TextFeld_Kontonummer.getText());
            kontostand = Double.parseDouble(Komma_zum_Punkt_machen(TextFeld_Kontostand.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gib richtige Werte ein");
            return;
        }
        
        Kontoform.Add_KontotoForm(name, Integer.toString(kontonummer), Double.toString(kontostand));
        
        TextFeld_Name.setText("");
        TextFeld_Kontonummer.setText("");
        TextFeld_Kontostand.setText("");
    }//GEN-LAST:event_Button_AddKontoActionPerformed

    private void Button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_Button_CloseActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Kontoerstellen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kontoerstellen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kontoerstellen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kontoerstellen_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Kontoerstellen_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_AddKonto;
    private javax.swing.JButton Button_Close;
    private javax.swing.JTextField TextFeld_Kontonummer;
    private javax.swing.JTextField TextFeld_Kontostand;
    private javax.swing.JTextField TextFeld_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
