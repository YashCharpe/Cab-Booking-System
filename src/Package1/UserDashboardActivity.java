/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class UserDashboardActivity extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboardActivity
     */
    String username="";
    public UserDashboardActivity() {
        initComponents();
    }

    public UserDashboardActivity(String usrname) {
        initComponents();
        username = usrname;
        usnameText.setText(username);
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
        jLabel2 = new javax.swing.JLabel();
        droppingptText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boardingptText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        microRadioBtn = new javax.swing.JRadioButton();
        sedanRadioBtn = new javax.swing.JRadioButton();
        suvRadioBtn = new javax.swing.JRadioButton();
        miniRadioBtn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        distText1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usnameText = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 21, 179, 96));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Dropping Point:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 146, -1, 86));
        getContentPane().add(droppingptText, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 159, 221, 67));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Boarding Point:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 146, 167, 86));

        boardingptText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardingptTextActionPerformed(evt);
            }
        });
        getContentPane().add(boardingptText, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 159, 221, 67));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Vehicle Type:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 280, -1, 53));

        microRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        microRadioBtn.setText("Micro Car");
        getContentPane().add(microRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 288, -1, 41));

        sedanRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sedanRadioBtn.setText("Sedan Car");
        getContentPane().add(sedanRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 288, -1, 41));

        suvRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        suvRadioBtn.setText("SUV Car");
        getContentPane().add(suvRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 288, -1, 41));

        miniRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        miniRadioBtn.setText("Mini Car");
        miniRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniRadioBtnActionPerformed(evt);
            }
        });
        getContentPane().add(miniRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 288, -1, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Approx Distance:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 190, 67));

        jButton1.setBackground(new java.awt.Color(153, 51, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 481, 195, 50));

        distText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distText1ActionPerformed(evt);
            }
        });
        getContentPane().add(distText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 171, 67));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Welcome,");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 55, 100, 46));

        usnameText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(usnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 55, 106, 46));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 46, 173, 44));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\MYPC\\Downloads\\clock.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boardingptTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardingptTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardingptTextActionPerformed

    private void miniRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miniRadioBtnActionPerformed

    public void close()
    {
        WindowEvent closeWindow= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver"); //Load the driver class
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr"); // Creating a connection object
            Statement stmt=con.createStatement();
            Statement stmt0=con.createStatement();
            
            //String bookingID=bookIDText.getText();
            String boardPt=boardingptText.getText();
            String dropPt=droppingptText.getText();
            String distStr=distText1.getText();
            String vehType="";
            
            if(!microRadioBtn.isSelected()&&!miniRadioBtn.isSelected()&&!sedanRadioBtn.isSelected()&&!suvRadioBtn.isSelected())
            {
                JOptionPane.showMessageDialog(this, "Please Select Vehicle Type!!");
            }
            else
            {
                if(boardPt.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Please Enter Boarding Destination!!");
                }
                else if(dropPt.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Please Enter Dropping Destination!!");
                }
                else if(distStr.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Please Enter Approx Distance!!!");
                }
                else
                {
                    int dist=Integer.parseInt(distStr);
                    int amount=0;
                    
                    if(miniRadioBtn.isSelected())
                    {
                        amount=dist*8;
                        vehType="Mini Car";
                    }
                    else if(microRadioBtn.isSelected())
                    {
                        amount=dist*9;
                        vehType="Micro Car";
                    }
                    else if(sedanRadioBtn.isSelected())
                    {
                        amount=dist*11;
                        vehType="Sedan Car";
                    }
                    else{
                        amount=dist*13;
                        vehType="SUV Car";
                    }
                    
                    ResultSet rs0=stmt0.executeQuery("select * from USERDASHBOARD order by BOOKING_ID");
                    int bokid=0;
                    while(rs0.next())
                    {
                        bokid=Integer.parseInt(rs0.getString("BOOKING_ID"));
                    }
                    int bookingID=bokid+1;
                    System.out.println("mc bookingid:"+bookingID);
                    ResultSet rs=stmt.executeQuery("select * from USERDASHBOARD");
                    stmt.executeUpdate("insert into USERDASHBOARD values('"+bookingID+"','"+username+"','"+boardPt+"','"+dropPt+"','"+vehType+"','"+distStr+"','"+amount+"')");
                    JOptionPane.showMessageDialog(this, "Looking For Driver!!");
                    //close();
                    this.dispose();
                    UserConfirmationActivity s0= new UserConfirmationActivity(boardPt,vehType,dropPt,username,bookingID);
                    s0.setVisible(true);
                }
            }
        } catch (Exception e) {
            e.toString();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void distText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distText1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        UserHistoryActivity s =new UserHistoryActivity(username);
        s.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboardActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boardingptText;
    private javax.swing.JTextField distText1;
    private javax.swing.JTextField droppingptText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton microRadioBtn;
    private javax.swing.JRadioButton miniRadioBtn;
    private javax.swing.JRadioButton sedanRadioBtn;
    private javax.swing.JRadioButton suvRadioBtn;
    private javax.swing.JLabel usnameText;
    // End of variables declaration//GEN-END:variables
}
