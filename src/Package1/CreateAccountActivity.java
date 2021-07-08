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


public class CreateAccountActivity extends javax.swing.JFrame {

    public CreateAccountActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mobText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aadharText = new javax.swing.JTextField();
        dobText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        licenseText2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel1.setText("CREATE NEW ACCOUNT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 36, 401, 75));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Aadhar No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 260, 124, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("E-mail ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 177, 124, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 260, 124, 50));
        getContentPane().add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 264, 141, 47));
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 365, 141, 47));
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 178, 141, 47));

        createBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        createBtn.setText("Create Account");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        getContentPane().add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 499, 182, 42));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Full Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 361, 124, 50));
        getContentPane().add(mobText, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 178, 141, 47));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 430, 124, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Mob No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 174, 124, 50));
        getContentPane().add(aadharText, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 264, 141, 47));
        getContentPane().add(dobText, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 434, 141, 47));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Date of Birth");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 430, 124, 50));
        getContentPane().add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 430, 141, 47));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("License No");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 371, 124, 50));

        licenseText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseText2ActionPerformed(evt);
            }
        });
        getContentPane().add(licenseText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 365, 141, 47));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\MYPC\\Downloads\\confitm.png")); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close()
    {
        WindowEvent closeWindow= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        
        System.out.println("BUTTON CLICKED");
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); //Load the driver class
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr"); // Creating a connection object
            Statement stmt=con.createStatement();
            Statement stmt1=con.createStatement();
            Statement stmt2=con.createStatement();
            System.out.println("IN TRY");
            
            String email=emailText.getText();
            String username=userText.getText();
            String fullname=nameText.getText();
            String mobNo=mobText.getText();
            String aadharNo=aadharText.getText();
            String licenseNo=passwordText.getText();
            String dob=dobText.getText();
            String pass=passwordText.getText();
            
            System.out.println("Email: "+email+" Username: "+username+" FullName: "+fullname+" Mob: "+mobNo+" Aadhar: "+aadharNo+" license: "+licenseNo+" DOB: "+dob);
            
            ResultSet rs=stmt.executeQuery("select * from users");
            int flag=0;
            while (rs.next()) {                
                
                String checkuser=rs.getString("user_name");
                if(checkuser.equals(username))
                {
                    flag=1;
                    JOptionPane.showMessageDialog(this, "Account Exist!!");
                    break;
                }
            }
            if(flag==0)
            {
                stmt1.executeUpdate("insert into users values('"+username+"','"+fullname+"','"+email+"','"+pass+"','"+mobNo+"','"+aadharNo+"','"+licenseNo+"','"+dob+"')");
                stmt2.executeUpdate("insert into login values('Customer','"+username+"','"+pass+"')");
                JOptionPane.showMessageDialog(this, "Account Created Successfully!!");
                this.dispose();
                Login_Activity s= new Login_Activity();
                s.setVisible(true);
            }
        } catch (Exception e) {
            e.toString();
        }
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void licenseText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseText2ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccountActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadharText;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dobText;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField licenseText2;
    private javax.swing.JTextField mobText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
