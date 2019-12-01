
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author pascalnasemann
 */
public class KontoForm extends javax.swing.JFrame {

    private List<String> _Kontoname = new ArrayList<String>();
    private List<String> _Kontonummer = new ArrayList<String>();
    private List<String> _Kontostand = new ArrayList<String>();
    private List<String> _ID_Konto = new ArrayList<String>();
    
    private int id_zähler;
    
    //Database data = new Database();
    
    public KontoForm() {
        /*
        Add_KontotoForm("APascal Nasemann","12345","1");
        Add_KontotoForm("BDieter Nasemann","123456","5");
        Add_KontotoForm("CFrederik Thomas","54321","3.20");
        Add_KontotoForm("DJürgen Herbert","6789","3.23");
        Add_KontotoForm("EFischer Martin","7323","4");*/
        
        id_zähler = 0;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_zeigKonten = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_Main = new javax.swing.JTextArea();
        Button_Kontoerstellen = new javax.swing.JButton();
        Button_Close = new javax.swing.JButton();
        Button_Name_aufsteigend = new javax.swing.JButton();
        Button_Name_absteigend = new javax.swing.JButton();
        Button_Kontostand_aufsteigend = new javax.swing.JButton();
        Button_Kontostand_absteigend = new javax.swing.JButton();
        TextFeld_Suchen = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Button_Konto_löschen = new javax.swing.JButton();
        Button_Einzahlen = new javax.swing.JButton();
        Button_Auszahlen = new javax.swing.JButton();
        Button_Ueberweisen = new javax.swing.JButton();
        Button_Suchen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setResizable(false);

        Button_zeigKonten.setText("Zeige Konten");
        Button_zeigKonten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_zeigKontenActionPerformed(evt);
            }
        });

        TextArea_Main.setEditable(false);
        TextArea_Main.setColumns(20);
        TextArea_Main.setRows(5);
        TextArea_Main.setToolTipText("");
        jScrollPane1.setViewportView(TextArea_Main);

        Button_Kontoerstellen.setText("Kontos erstellen");
        Button_Kontoerstellen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_KontoerstellenActionPerformed(evt);
            }
        });

        Button_Close.setText("Programm beenden");
        Button_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CloseActionPerformed(evt);
            }
        });

        Button_Name_aufsteigend.setText("Name aufsteigend");
        Button_Name_aufsteigend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Name_aufsteigendActionPerformed(evt);
            }
        });

        Button_Name_absteigend.setText("Name absteigend");
        Button_Name_absteigend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Name_absteigendActionPerformed(evt);
            }
        });

        Button_Kontostand_aufsteigend.setText("Kontostand aufsteigend");
        Button_Kontostand_aufsteigend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Kontostand_aufsteigendActionPerformed(evt);
            }
        });

        Button_Kontostand_absteigend.setText("Kontostand absteigend ");
        Button_Kontostand_absteigend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Kontostand_absteigendActionPerformed(evt);
            }
        });

        TextFeld_Suchen.setEditable(false);

        Button_Konto_löschen.setText("Konto löschen");
        Button_Konto_löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Konto_löschenActionPerformed(evt);
            }
        });

        Button_Einzahlen.setText("Einzahlen");
        Button_Einzahlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EinzahlenActionPerformed(evt);
            }
        });

        Button_Auszahlen.setText("Auszahlen");
        Button_Auszahlen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AuszahlenActionPerformed(evt);
            }
        });

        Button_Ueberweisen.setText("Überweisen");
        Button_Ueberweisen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UeberweisenActionPerformed(evt);
            }
        });

        Button_Suchen.setText("Suchen");
        Button_Suchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SuchenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Button_Ueberweisen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Kontostand_aufsteigend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Kontostand_absteigend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Name_absteigend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Name_aufsteigend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_zeigKonten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Kontoerstellen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Konto_löschen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Einzahlen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Auszahlen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Button_Suchen, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFeld_Suchen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Button_Kontoerstellen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_zeigKonten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Button_Name_aufsteigend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Name_absteigend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Kontostand_aufsteigend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Kontostand_absteigend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Einzahlen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Auszahlen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Ueberweisen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Konto_löschen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFeld_Suchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Suchen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Close)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //////////////////////// selber geschreibene Funktionen////////////////////////////////
    public  String Komma_zum_Punkt_machen(String string){
        char [] chararray = string.toCharArray();
        
        for(int i = 0; i < chararray.length; i++){
            if(chararray[i] == ','){
                chararray[i] = '.';
            }
        }
        String str = new String(chararray);
        
        return str;
    }
    
    private void Zeichne_komplette_Liste(){
        TextArea_Main.setText(null);
        
        for(int i =0; i < _Kontoname.size(); i++){
            Zum_Textfeld_Hinzufügen(i);
        }
    }
    
    private void Zum_Textfeld_Hinzufügen(int position){
        
        TextArea_Main.append("ID \t:  " + _ID_Konto.get(position) +"\n");
        TextArea_Main.append("Kontoname \t:  " + _Kontoname.get(position) +"\n");
        TextArea_Main.append("Kontonummer\t:  " + _Kontonummer.get(position) +"\n");
        TextArea_Main.append("Kontonstand \t:  " + _Kontostand.get(position) +"\n");
        TextArea_Main.append("--------------------------------\n");
    }
    
    public void Add_KontotoForm(String name, String nummer, String stand){
        /// Die Daten werden hinzugefügt
        id_zähler = id_zähler+1;
        
        this._Kontoname.add(name);
        this._Kontonummer.add(nummer);
        this._Kontostand.add(stand);
        this._ID_Konto.add(Integer.toString(id_zähler));
        
        Zeichne_komplette_Liste();
        
        // die Daten werden als kontrolle ausgegeben
        /*System.out.println("ID:: " + ID_Konto);
        System.out.println("Kontoname:: " + Kontoname);
        System.out.println("Kontonummer:: " + Kontonummer);
        System.out.println("Kontostand:: " + Kontostand);*/
    }
    
    public void Lösche_Kontos(String id){
        int pointer = -1;
        
        for(int i =0; i < _ID_Konto.size(); i++){
            if (id.equals(_ID_Konto.get(i))){
                pointer = i;
                break;
            }
        }
        if(pointer == -1){
            JOptionPane.showMessageDialog(rootPane, "Die ID gibt es nicht");
            return;
        }
        
        _Kontoname.remove(pointer);
        _Kontostand.remove(pointer);
        _Kontonummer.remove(pointer);
        _ID_Konto.remove(pointer);
        
        Zeichne_komplette_Liste();
    }
    
    public void Einzahlen_Auszahlen(double betrag, String id){
        int pointer = -1;
        int kontostand_int;
        
        for(int i =0; i < _ID_Konto.size(); i++){
            if (id.equals(_ID_Konto.get(i))){
                pointer = i;
                break;
            }
        }
        if(pointer == -1){
            JOptionPane.showMessageDialog(rootPane, "Die ID gibt es nicht");
            return;
        }
        
        _Kontostand.set(pointer, Double.toString(Double.parseDouble(_Kontostand.get(pointer)) + betrag));
        
        Zeichne_komplette_Liste();
    }
    
    public void Ueberweisen(double betrag, String id){
        int pointer = -1;
        int kontostand_int;
        
        for(int i =0; i < _Kontonummer.size(); i++){
            if (id.equals(_Kontonummer.get(i))){
                pointer = i;
                break;
            }
        }
        if(pointer == -1){
            JOptionPane.showMessageDialog(rootPane, "Die ID gibt es nicht");
            return;
        }
        
        _Kontostand.set(pointer, Double.toString(Double.parseDouble(_Kontostand.get(pointer)) + betrag));
        Zeichne_komplette_Liste();
    }
    
    private void Swap_Value(int i, List<String> Listname){
        //tauscht die Variabeln
        String buffer = "";
        buffer = Listname.get(i);
        Listname.set(i, Listname.get(i+1));
        Listname.set(i+1, buffer);
    }
    
    
    
    
    
    
        
    private void Button_zeigKontenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_zeigKontenActionPerformed
        Zeichne_komplette_Liste();
    }//GEN-LAST:event_Button_zeigKontenActionPerformed
    
    //Button für Kontoerstellung
    private void Button_KontoerstellenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_KontoerstellenActionPerformed
       // es wird ein neues Fenster geöffnet, darin werden die Kontos erstellt
        Kontoerstellen_Form form = new Kontoerstellen_Form(this);
        form.setVisible(true);
    }//GEN-LAST:event_Button_KontoerstellenActionPerformed

    //Ende vom Programm
    private void Button_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CloseActionPerformed
       // Programm wird beendet 
        System.exit(0);
    }//GEN-LAST:event_Button_CloseActionPerformed

    
    //region Sortierung
    private void Button_Name_aufsteigendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Name_aufsteigendActionPerformed
        for(int j = 0; j < _ID_Konto.size()-1; j++){
            for(int i=0; i < _ID_Konto.size()-1; i++){
                if(_Kontoname.get(i).compareTo(_Kontoname.get(i+1)) > 0){
                    Swap_Value(i , _Kontoname);
                    Swap_Value(i , _Kontonummer);
                    Swap_Value(i , _Kontostand);
                    Swap_Value(i , _ID_Konto);
                }
            }
        }
        Zeichne_komplette_Liste();  
    }//GEN-LAST:event_Button_Name_aufsteigendActionPerformed

    private void Button_Name_absteigendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Name_absteigendActionPerformed
        for(int j = 0; j < _ID_Konto.size()-1; j++){
            for(int i=0; i < _ID_Konto.size()-1; i++){
                if(_Kontoname.get(i).compareTo(_Kontoname.get(i+1)) < 0){
                    Swap_Value(i , _Kontoname);
                    Swap_Value(i , _Kontonummer);
                    Swap_Value(i , _Kontostand);
                    Swap_Value(i , _ID_Konto);
                }
            }
        }
        Zeichne_komplette_Liste();  
    }//GEN-LAST:event_Button_Name_absteigendActionPerformed
    
    private void Button_Kontostand_aufsteigendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Kontostand_aufsteigendActionPerformed
        double kontostand_i;
        double kontostand_pluseins;
        
        for(int j = 0; j < _ID_Konto.size()-1; j++){
            for(int i=0; i < _ID_Konto.size()-1; i++){
                kontostand_i = Double.parseDouble(_Kontostand.get(i));
                kontostand_pluseins = Double.parseDouble(_Kontostand.get(i+1));
                if(kontostand_i > kontostand_pluseins){
                    Swap_Value(i , _Kontoname);
                    Swap_Value(i , _Kontonummer);
                    Swap_Value(i , _Kontostand);
                    Swap_Value(i , _ID_Konto);
                }
            }
        }
        Zeichne_komplette_Liste();  
    }//GEN-LAST:event_Button_Kontostand_aufsteigendActionPerformed

    private void Button_Kontostand_absteigendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Kontostand_absteigendActionPerformed
        double kontostand_i;
        double kontostand_pluseins;
        
        for(int j = 0; j < _ID_Konto.size()-1; j++){
            for(int i=0; i < _ID_Konto.size()-1; i++){
                kontostand_i = Double.parseDouble(_Kontostand.get(i));
                kontostand_pluseins = Double.parseDouble(_Kontostand.get(i+1));
                if(kontostand_i < kontostand_pluseins){
                    Swap_Value(i , _Kontoname);
                    Swap_Value(i , _Kontonummer);
                    Swap_Value(i , _Kontostand);
                    Swap_Value(i , _ID_Konto);
                }
            }
        }
        Zeichne_komplette_Liste();  
    }//GEN-LAST:event_Button_Kontostand_absteigendActionPerformed
    //endregion Sortierung
    
    
    //region Konto verändern
    //löschen von Kontos
    private void Button_Konto_löschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Konto_löschenActionPerformed
        KontoLoeschen_Form form = new KontoLoeschen_Form(this);
        form.setVisible(true);
    }//GEN-LAST:event_Button_Konto_löschenActionPerformed

    //Konto Einzahlen
    private void Button_EinzahlenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EinzahlenActionPerformed
        KontoEinzahlen_Form form = new KontoEinzahlen_Form(this);
        form.setVisible(true);
    }//GEN-LAST:event_Button_EinzahlenActionPerformed
    
    //Konto Auszahlen
    private void Button_AuszahlenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AuszahlenActionPerformed
        KontoAuszahlen_Form form = new KontoAuszahlen_Form(this);
        form.setVisible(true);
    }//GEN-LAST:event_Button_AuszahlenActionPerformed

    //Überweisen
    private void Button_UeberweisenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UeberweisenActionPerformed
        KontoUeberweisung_Form form = new KontoUeberweisung_Form(this);
        form.setVisible(true);
    }//GEN-LAST:event_Button_UeberweisenActionPerformed

    private void Button_SuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SuchenActionPerformed
        String suche_String;
        List<Integer> konto_anzeigen_Liste = new ArrayList<Integer>();
        
        try{
            suche_String = TextFeld_Suchen.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gib richtige Werte ein");
            return;
        }
        TextArea_Main.setText(null);
        
        for(int i =0; i < _Kontoname.size(); i++){
            if (_Kontoname.get(i).contains(suche_String)){
                konto_anzeigen_Liste.add(i);
                break;
            }
        }
        
        for(int i =0; i < _Kontonummer.size(); i++){
            if (_Kontonummer.get(i).contains(suche_String)){
                konto_anzeigen_Liste.add(i);
                break;
            }
        }
        
        for(int i =0; i < _Kontostand.size(); i++){
            if (_Kontostand.get(i).contains(suche_String)){
                konto_anzeigen_Liste.add(i);
                break;
            }
        }
        
        for(int i =0; i < _ID_Konto.size(); i++){
            if (_ID_Konto.get(i).contains(suche_String)){
                konto_anzeigen_Liste.add(i);
                break;
            }
        }
        
        for(int i=0; i < konto_anzeigen_Liste.size() ; i++){
            Zum_Textfeld_Hinzufügen(konto_anzeigen_Liste.get(i));
        }
        
    }//GEN-LAST:event_Button_SuchenActionPerformed

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////// selber geschreibene Funktionen////////////////////////////////
    /**
     * @param args the command line arguments
     */
    //die main Funktion
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
            java.util.logging.Logger.getLogger(KontoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KontoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KontoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KontoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KontoForm().setVisible(true);
            }
        });

       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Auszahlen;
    private javax.swing.JButton Button_Close;
    private javax.swing.JButton Button_Einzahlen;
    private javax.swing.JButton Button_Konto_löschen;
    private javax.swing.JButton Button_Kontoerstellen;
    private javax.swing.JButton Button_Kontostand_absteigend;
    private javax.swing.JButton Button_Kontostand_aufsteigend;
    private javax.swing.JButton Button_Name_absteigend;
    private javax.swing.JButton Button_Name_aufsteigend;
    private javax.swing.JButton Button_Suchen;
    private javax.swing.JButton Button_Ueberweisen;
    private javax.swing.JButton Button_zeigKonten;
    private javax.swing.JTextArea TextArea_Main;
    private javax.swing.JTextField TextFeld_Suchen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
