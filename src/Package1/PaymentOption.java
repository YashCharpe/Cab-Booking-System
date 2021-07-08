/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;
import javax.swing.JOptionPane;
/**
 *
 * @author MYPC
 */
public class PaymentOption extends javax.swing.JFrame {

    /**
     * Creates new form PaymentOption
     */
    public PaymentOption() {
        initComponents();
    }
    String username="";
    int bookingID=0;
    public PaymentOption(String usname,int bID) {
        initComponents();
        username=usname;
        bookingID=bID;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cashRadioBtn = new javax.swing.JRadioButton();
        cardRadioBtn = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 139, 47));

        cashRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cashRadioBtn.setText("Cash");
        cashRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cashRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRadioBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cashRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 115, 139, 41));

        cardRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardRadioBtn.setText("Card Payment");
        cardRadioBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cardRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardRadioBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cardRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 174, -1, 41));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 247, 133, 52));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MYPC\\Downloads\\cash.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cardRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardRadioBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cardRadioBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(cashRadioBtn.isSelected())
        {
            this.dispose();
            CashPayment s = new CashPayment(username,bookingID);
            s.setVisible(true);
        }
        else if(cardRadioBtn.isSelected())
        {
            this.dispose();
            CardPayment s = new CardPayment(username,bookingID);
            s.setVisible(true);
        }
        else if(!cashRadioBtn.isSelected()&&!cardRadioBtn.isSelected())
        {
            JOptionPane.showMessageDialog(this, "Please Select Payment Option!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cashRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashRadioBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cardRadioBtn;
    private javax.swing.JRadioButton cashRadioBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}