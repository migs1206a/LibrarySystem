
package javaapplication1;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ManageAccountFrame extends javax.swing.JFrame {

     private String loggedInUsername;
    public ManageAccountFrame() {
        initComponents();
       this.loggedInUsername = Act2_OOP.loggedInUsername;
        jTextField1.setText(loggedInUsername);
        jTextField1.setEditable(false);
        jPasswordField1.setEditable(false);
        jPasswordField2.setEditable(false);
        SaveChangesbtn1.setEnabled(false);
        cancelbtn.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        EditAccountbtn = new javax.swing.JButton();
        DeleteAccountBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        SaveChangesbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Accounts");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        cancelbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        cancelbtn.setEnabled(false);
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 170, 50));

        EditAccountbtn.setBackground(new java.awt.Color(0, 51, 153));
        EditAccountbtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EditAccountbtn.setForeground(new java.awt.Color(255, 255, 255));
        EditAccountbtn.setText("Edit Account");
        EditAccountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAccountbtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditAccountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 170, 50));

        DeleteAccountBtn.setBackground(new java.awt.Color(204, 0, 0));
        DeleteAccountBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DeleteAccountBtn.setText(" Delete Account");
        DeleteAccountBtn.setToolTipText("");
        DeleteAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 168, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/NU LOGO.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 165));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("NATIONAL UNIVERSITY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 300, 31));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 370, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter New Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm New Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 320, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 300, -1));

        jPasswordField1.setEditable(false);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 370, 32));

        jPasswordField2.setEditable(false);
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 370, 33));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 119, 40));

        SaveChangesbtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SaveChangesbtn1.setForeground(new java.awt.Color(255, 255, 255));
        SaveChangesbtn1.setText("Save Changes");
        SaveChangesbtn1.setEnabled(false);
        SaveChangesbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChangesbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(SaveChangesbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditAccountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAccountbtnActionPerformed
      jPasswordField1.setEditable(true);
        jPasswordField2.setEditable(true);
        SaveChangesbtn1.setEnabled(true);
        cancelbtn.setEnabled(true);
        EditAccountbtn.setEnabled(false);
        DeleteAccountBtn.setEnabled(false);
    }//GEN-LAST:event_EditAccountbtnActionPerformed

    private void DeleteAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountBtnActionPerformed
      int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete your account?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = DBConnection.getConnection()) {
                String sql = "DELETE FROM account WHERE username = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, loggedInUsername);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    JOptionPane.showMessageDialog(this, "Account deleted successfully.");
                    new Act2_OOP().setVisible(true); 
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
        
    }//GEN-LAST:event_DeleteAccountBtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
       
    jPasswordField1.setEditable(false);
    jPasswordField2.setEditable(false);
    SaveChangesbtn1.setEnabled(false);
    cancelbtn.setEnabled(false);
    EditAccountbtn.setEnabled(true);
    DeleteAccountBtn.setEnabled(true);
 
    jPasswordField1.setText("");
    jPasswordField2.setText("");
     
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void SaveChangesbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChangesbtn1ActionPerformed
       String newPassword = new String(jPasswordField1.getPassword());
    String confirmPassword = new String(jPasswordField2.getPassword());

    if (!newPassword.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match.");
        return;
    }

    try (Connection conn = DBConnection.getConnection()) {
        String hashedPassword = hashPassword(newPassword);

        String query = "UPDATE account SET password = ? WHERE username = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, hashedPassword);
        pstmt.setString(2, loggedInUsername);

        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Password updated successfully.");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jPasswordField1.setEditable(false);
            jPasswordField2.setEditable(false);
            SaveChangesbtn1.setEnabled(false);
            cancelbtn.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update password. Username not found.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_SaveChangesbtn1ActionPerformed
private String hashPassword(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

        // Convert byte array into hexadecimal string
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException("Error hashing password: " + e.getMessage(), e);
    }
}
   
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
            java.util.logging.Logger.getLogger(ManageAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAccountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccountFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteAccountBtn;
    private javax.swing.JButton EditAccountbtn;
    private javax.swing.JButton SaveChangesbtn1;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
