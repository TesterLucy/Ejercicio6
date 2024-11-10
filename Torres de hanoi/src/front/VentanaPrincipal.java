package front;
import back.Nodo;
import back.Pila;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {
    int ContNumMov = 0;
    Pila PilaTorreA;
    Pila PilaTorreB;
    Pila PilaTorreC;
    
    DefaultTableModel MToA, MToB,MToC;
    
    int Objetivo = 0;
    double NumMinMov = 0;
    boolean Stop = false;
    public VentanaPrincipal() {
        initComponents();
        
        MToA = (DefaultTableModel) TorreA.getModel();
        MToA.setRowCount(10);
        
        MToB = (DefaultTableModel) TorreB.getModel();
        MToB.setRowCount(10);
        
        MToC = (DefaultTableModel) TorreC.getModel();
        MToC.setRowCount(10);
        
        DefaultTableCellRenderer renderA = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        TorreA.getColumnModel().getColumn(0).setCellRenderer(renderA);
        
        DefaultTableCellRenderer renderB = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        TorreB.getColumnModel().getColumn(0).setCellRenderer(renderA);
        
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        renderA.setHorizontalAlignment(SwingConstants.CENTER);
        TorreC.getColumnModel().getColumn(0).setCellRenderer(renderA);
    }
    private void Limpiar() {
        ContNumMov = 0;
        NumMinMov = 0;
        NumDis.setSelectedItem(String.valueOf(Objetivo));
        
    }
    private void PresentarCantMov(){
        ContNumMov ++;
        NumMov.setText(String.valueOf(ContNumMov));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TorreA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TorreB = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TorreC = new javax.swing.JTable();
        A_B = new javax.swing.JButton();
        A_C = new javax.swing.JButton();
        B_C = new javax.swing.JButton();
        B_A = new javax.swing.JButton();
        C_B = new javax.swing.JButton();
        C_A = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        NumMin = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        NumMov = new javax.swing.JTextPane();
        NumDis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();

        jButton7.setText("B");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("C");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("A");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TorreA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre A"
            }
        ));
        jScrollPane1.setViewportView(TorreA);

        TorreB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre B"
            }
        ));
        jScrollPane2.setViewportView(TorreB);

        TorreC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre C"
            }
        ));
        jScrollPane3.setViewportView(TorreC);

        A_B.setText("B");
        A_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_BActionPerformed(evt);
            }
        });

        A_C.setText("C");
        A_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_CActionPerformed(evt);
            }
        });

        B_C.setText("C");
        B_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CActionPerformed(evt);
            }
        });

        B_A.setText("A");
        B_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AActionPerformed(evt);
            }
        });

        C_B.setText("B");
        C_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_BActionPerformed(evt);
            }
        });

        C_A.setText("A");
        C_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_AActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(NumMin);

        jScrollPane5.setViewportView(NumMov);

        NumDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel1.setText("Número de discos:");

        jLabel2.setText("Número minimo de mov:");

        jLabel3.setText("Número de movimientos:");

        reiniciar.setText("REINICIAR");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        iniciar.setText("INICIAR");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A_B, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A_C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(B_A, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C_A, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C_B, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iniciar)
                                .addGap(141, 141, 141)
                                .addComponent(reiniciar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane4)
                                    .addComponent(NumDis, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(72, 72, 72)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_B, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_C, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_A, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_C, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_A, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_B, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void MoverDeA_B(){
        try{
            if (PilaTorreA.getContNodo()>0){
                Nodo Plataforma = new Nodo();
                Plataforma.setDato(PilaTorreA.Peek());
                if(PilaTorreB.getContNodo()>0){
                    if(Plataforma.getDato().compareTo(PilaTorreB.Peek())>0){
                        return;
                    }
                }
            PilaTorreA.Pop();
            PilaTorreB.Push(Plataforma);
            PresentarTorreA();
            PresentarTorreB();
            PresentarCantMov();
            }
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
    }
    private void A_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_BActionPerformed
        MoverDeA_B();
    }//GEN-LAST:event_A_BActionPerformed
    private void MoverDeA_C(){
         try{
            if (PilaTorreA.getContNodo()>0){
                Nodo Plataforma = new Nodo();
                Plataforma.setDato(PilaTorreA.Peek());
                if(PilaTorreC.getContNodo()>0){
                    if(Plataforma.getDato().compareTo(PilaTorreC.Peek())>0){
                        return;
                    }
                }
            PilaTorreA.Pop();
            PilaTorreC.Push(Plataforma);
            PresentarTorreA();
            PresentarTorreC();
            PresentarCantMov();
            if(PilaTorreC.getContNodo()== Objetivo && ContNumMov == NumMinMov){
                JOptionPane.showMessageDialog(null, "Felicitaciones hiciste el minimo de movimientos intenta otro nivel más dificil", "Felicitaciones", JOptionPane.WARNING_MESSAGE);
            }else if(PilaTorreC.getContNodo()==Objetivo && ContNumMov!=NumMinMov){
                JOptionPane.showMessageDialog(null, "Felicitaciones lo has resuelto, intenta superar el objetivo minimo de movimientos", "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
    }
    private void A_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_CActionPerformed
        MoverDeA_C();
    }//GEN-LAST:event_A_CActionPerformed
    private void MoverDeB_C(){
        try{
            if (PilaTorreB.getContNodo()>0){
                Nodo Plataforma = new Nodo();
                Plataforma.setDato(PilaTorreB.Peek());
                if(PilaTorreC.getContNodo()>0){
                    if(Plataforma.getDato().compareTo(PilaTorreC.Peek())>0){
                        return;
                    }
                }
            PilaTorreB.Pop();
            PilaTorreC.Push(Plataforma);
            PresentarTorreB();
            PresentarTorreC();
            PresentarCantMov();
            if(PilaTorreC.getContNodo()== Objetivo && ContNumMov == NumMinMov){
                JOptionPane.showMessageDialog(null, "Felicitaciones hiciste el minimo de movimientos intenta otro nivel más dificil", "Felicitaciones", JOptionPane.WARNING_MESSAGE);
            }else if(PilaTorreC.getContNodo()==Objetivo && ContNumMov!=NumMinMov){
                JOptionPane.showMessageDialog(null, "Felicitaciones lo has resuelto, intenta superar el objetivo minimo de movimientos", "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
    }
    private void B_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CActionPerformed
        MoverDeB_C();
    }//GEN-LAST:event_B_CActionPerformed
    private void MoverDeB_A(){
        try{
            if (PilaTorreB.getContNodo()>0){
                Nodo Plataforma = new Nodo();
                Plataforma.setDato(PilaTorreB.Peek());
                if(PilaTorreA.getContNodo()>0){
                    if(Plataforma.getDato().compareTo(PilaTorreA.Peek())>0){
                        return;
                    }
                }
            PilaTorreB.Pop();
            PilaTorreA.Push(Plataforma);
            PresentarTorreB();
            PresentarTorreA();
            PresentarCantMov();
            }
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
    }
    private void B_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AActionPerformed
       MoverDeB_A();
    }//GEN-LAST:event_B_AActionPerformed
    private void MoverDeC_B(){
        try{
            if (PilaTorreC.getContNodo()>0){
                Nodo Plataforma = new Nodo();
                Plataforma.setDato(PilaTorreC.Peek());
                if(PilaTorreB.getContNodo()>0){
                    if(Plataforma.getDato().compareTo(PilaTorreB.Peek())>0){
                        return;
                    }
                }
            PilaTorreC.Pop();
            PilaTorreB.Push(Plataforma);
            PresentarTorreC();
            PresentarTorreB();
            PresentarCantMov();
            }
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
    }
    private void C_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_BActionPerformed
        MoverDeC_B();
    }//GEN-LAST:event_C_BActionPerformed
    private void MoverDeC_A(){
        try{
            if (PilaTorreC.getContNodo()>0){
                Nodo Plataforma = new Nodo();
                Plataforma.setDato(PilaTorreC.Peek());
                if(PilaTorreA.getContNodo()>0){
                    if(Plataforma.getDato().compareTo(PilaTorreA.Peek())>0){
                        return;
                    }
                }
            PilaTorreC.Pop();
            PilaTorreA.Push(Plataforma);
            PresentarTorreC();
            PresentarTorreA();
            PresentarCantMov();
            }
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
    }
    private void C_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_AActionPerformed
        MoverDeC_A();
    }//GEN-LAST:event_C_AActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
    
    private void  PresentarTorreA(){
        ((DefaultTableModel)TorreA.getModel()).setRowCount(0);
        MToA.setRowCount(10);
        Nodo K;
        int RowDisco = (10 - PilaTorreA.getContNodo());
        if(PilaTorreA.getContNodo()>0){
            for(K = PilaTorreA.getCabeza();K.getAbajo()!=null; K = K.getAbajo()){
                String [] VectorNormal = {K.getDato()};
                MToA.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            if(K.getAbajo()==null){
                String[] VectorNormal = {K.getDato()};
                MToA.insertRow(RowDisco, VectorNormal);
            }
        }
        TorreA.setModel(MToA);
        MToA.setRowCount(10);
    }
    private void  PresentarTorreB(){
        ((DefaultTableModel)TorreB.getModel()).setRowCount(0);
        MToB.setRowCount(10);
        Nodo K;
        int RowDisco = (10 - PilaTorreB.getContNodo());
        if(PilaTorreB.getContNodo()>0){
            for(K = PilaTorreB.getCabeza();K.getAbajo()!=null; K = K.getAbajo()){
                String [] VectorNormal = {K.getDato()};
                MToB.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            if(K.getAbajo()==null){
                String[] VectorNormal = {K.getDato()};
                MToB.insertRow(RowDisco, VectorNormal);
            }
        }
        TorreB.setModel(MToB);
        MToB.setRowCount(10);
    }
    private void  PresentarTorreC(){
        ((DefaultTableModel)TorreC.getModel()).setRowCount(0);
        MToC.setRowCount(10);
        Nodo K;
        int RowDisco = (10 - PilaTorreC.getContNodo());
        if(PilaTorreC.getContNodo()>0){
            for(K = PilaTorreC.getCabeza();K.getAbajo()!=null; K = K.getAbajo()){
                String [] VectorNormal = {K.getDato()};
                MToC.insertRow(RowDisco, VectorNormal);
                RowDisco++;
            }
            if(K.getAbajo()==null){
                String[] VectorNormal = {K.getDato()};
                MToC.insertRow(RowDisco, VectorNormal);
            }
        }
        TorreC.setModel(MToC);
        MToC.setRowCount(10);
    }
    private void Iniciar(){
        try{
            PilaTorreA = new Pila();
            PilaTorreB = new Pila();
            PilaTorreC = new Pila();
            Objetivo = Integer.parseInt(NumDis.getSelectedItem().toString());
            NumMinMov = Math.pow(2, Objetivo)-1;
            NumMov.setText(String.valueOf(ContNumMov));
            NumMin.setText(String.valueOf(String.format("%.0f", NumMinMov)));
            for(int x =Objetivo; x>=1; x--){
                Nodo Plataforma = new Nodo();
                String Disco = "";
                for(int y = x; y>0; y--){
                    Disco+= "#";
                }
                Plataforma.setDato(Disco);
                PilaTorreA.Push(Plataforma);
            
        }
        
        PresentarTorreA();
        /*
        PresentarTorreB();
        PresentarTorreC();
        */
        }catch (Exception E){
            System.out.println("Error"+E.getMessage());
        }
        
    }
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        ContNumMov=0;
        Iniciar();
    }//GEN-LAST:event_iniciarActionPerformed

    
    private void Reiniciar (){
       dispose();
        new VentanaPrincipal().setVisible(true);
    }
    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        Reiniciar();
    }//GEN-LAST:event_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_B;
    private javax.swing.JButton A_C;
    private javax.swing.JButton B_A;
    private javax.swing.JButton B_C;
    private javax.swing.JButton C_A;
    private javax.swing.JButton C_B;
    private javax.swing.JComboBox<String> NumDis;
    private javax.swing.JTextPane NumMin;
    private javax.swing.JTextPane NumMov;
    private javax.swing.JTable TorreA;
    private javax.swing.JTable TorreB;
    private javax.swing.JTable TorreC;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}