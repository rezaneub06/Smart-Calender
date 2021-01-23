package Wellcome;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Kibria
 */
public class ChooseEvent extends javax.swing.JFrame {

    /**
     * Creates new form ChooseEvent
     */
    private Container c;
    
    public ChooseEvent() {
        initComponents();
        
        
        c = this.getContentPane();
        this.setVisible(true);
        this.setLocation(280, 120);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Home_Page");
        this.setResizable(false); 
        c.setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddEvent = new javax.swing.JButton();
        ChooseDate = new javax.swing.JButton();
        ChooseEvent = new javax.swing.JButton();
        ChossePicPanel = new javax.swing.JPanel();
        PicLebel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddEvent.setBackground(new java.awt.Color(51, 0, 51));
        AddEvent.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        AddEvent.setForeground(new java.awt.Color(204, 204, 0));
        AddEvent.setText("AddEvent");
        AddEvent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 2, true));
        AddEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEventActionPerformed(evt);
            }
        });

        ChooseDate.setBackground(new java.awt.Color(51, 0, 51));
        ChooseDate.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ChooseDate.setForeground(new java.awt.Color(204, 204, 0));
        ChooseDate.setText("ChooseDate");
        ChooseDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 2));
        ChooseDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChooseDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseDateActionPerformed(evt);
            }
        });

        ChooseEvent.setBackground(new java.awt.Color(51, 0, 51));
        ChooseEvent.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ChooseEvent.setForeground(new java.awt.Color(204, 204, 0));
        ChooseEvent.setText("ChooseEvent");
        ChooseEvent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 51, 0), 2, true));
        ChooseEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChooseEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseEventActionPerformed(evt);
            }
        });

        ChossePicPanel.setBackground(new java.awt.Color(204, 255, 255));

        PicLebel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kibria\\Downloads\\ss.png")); // NOI18N
        PicLebel.setToolTipText("");
        PicLebel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PicLebel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ChossePicPanelLayout = new javax.swing.GroupLayout(ChossePicPanel);
        ChossePicPanel.setLayout(ChossePicPanelLayout);
        ChossePicPanelLayout.setHorizontalGroup(
            ChossePicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ChossePicPanelLayout.setVerticalGroup(
            ChossePicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicLebel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(AddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ChooseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ChooseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChossePicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChossePicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChooseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseDateActionPerformed
        this.dispose();
        DataEntry f = new DataEntry();
    }//GEN-LAST:event_ChooseDateActionPerformed

    private void ChooseEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseEventActionPerformed
         this.dispose();
        ChooseEventFrame f= new ChooseEventFrame();
    }//GEN-LAST:event_ChooseEventActionPerformed

    private void AddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEventActionPerformed
        this.dispose();
        AddEvent f= new AddEvent();
    }//GEN-LAST:event_AddEventActionPerformed

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
            java.util.logging.Logger.getLogger(ChooseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChooseEvent f=new ChooseEvent();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEvent;
    private javax.swing.JButton ChooseDate;
    private javax.swing.JButton ChooseEvent;
    private javax.swing.JPanel ChossePicPanel;
    private javax.swing.JLabel PicLebel;
    // End of variables declaration//GEN-END:variables
}