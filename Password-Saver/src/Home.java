
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chathura
 */
public class Home extends javax.swing.JFrame {
Connection conn=null;
	 ResultSet rs=null;
	 PreparedStatement pst=null;
         
    
   
    int id=-1;
    public Home() {
        initComponents();
        conn=DBConnection.connectDb();
    }
     public Home(int gid) {
        initComponents();
        
        Date today = new Date();
        giris_saati_label.setText(today.toString());
        id=gid;
        
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_UserEdit = new javax.swing.JButton();
        jButton_AddPassword = new javax.swing.JButton();
        jButton_Database = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        software_update_button = new javax.swing.JButton();
        jButton_AboutUs = new javax.swing.JButton();
        jButton_ContactMe = new javax.swing.JButton();
        jLabel_User_Control_Panel_Page_usercontrolpanel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        giris_saati_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_UserEdit.setBackground(new java.awt.Color(0, 0, 0));
        jButton_UserEdit.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_UserEdit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UserEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/user_edit_ico.png"))); // NOI18N
        jButton_UserEdit.setText("User Edit");
        jButton_UserEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_UserEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_UserEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UserEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_UserEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 140, 80));

        jButton_AddPassword.setBackground(new java.awt.Color(0, 0, 0));
        jButton_AddPassword.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_AddPassword.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/password_management_ico.png"))); // NOI18N
        jButton_AddPassword.setText("Manage passwords");
        jButton_AddPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AddPassword.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_AddPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AddPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 90));

        jButton_Database.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Database.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_Database.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Database.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/database_ico.png"))); // NOI18N
        jButton_Database.setText("Database");
        jButton_Database.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Database.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_Database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DatabaseActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Database, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 203, 130, 80));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Panel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        software_update_button.setBackground(new java.awt.Color(0, 0, 0));
        software_update_button.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        software_update_button.setForeground(new java.awt.Color(255, 255, 255));
        software_update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/software-update.png"))); // NOI18N
        software_update_button.setText("Software Update");
        software_update_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        software_update_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        software_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                software_update_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(software_update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 90));

        jButton_AboutUs.setBackground(new java.awt.Color(0, 0, 0));
        jButton_AboutUs.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/about_me_ico.png"))); // NOI18N
        jButton_AboutUs.setText("About Us");
        jButton_AboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AboutUsActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, 90));

        jButton_ContactMe.setBackground(new java.awt.Color(0, 0, 0));
        jButton_ContactMe.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_ContactMe.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ContactMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/contact_me_ico.png"))); // NOI18N
        jButton_ContactMe.setText("Contact Me");
        jButton_ContactMe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ContactMe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_ContactMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ContactMeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_ContactMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 130, 90));

        jLabel_User_Control_Panel_Page_usercontrolpanel.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        jLabel_User_Control_Panel_Page_usercontrolpanel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_User_Control_Panel_Page_usercontrolpanel.setText("User Control ");
        jPanel1.add(jLabel_User_Control_Panel_Page_usercontrolpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel1.setText(".........");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, -1, -1));

        giris_saati_label.setText("            ");
        jPanel1.add(giris_saati_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Teko SemiBold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Logout");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("x");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 20, 30));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/1607591829931.jpg"))); // NOI18N
        jPanel1.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 510));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/1607591593769.png"))); // NOI18N
        jPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 550));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UserEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UserEditActionPerformed
        // TODO add your handling code here:
        user_edit frame = new user_edit(id);
        frame.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton_UserEditActionPerformed

    private void jButton_AddPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddPasswordActionPerformed
        // TODO add your handling code here:
        manage_pass frame = new manage_pass();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_AddPasswordActionPerformed

    private void jButton_DatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DatabaseActionPerformed
        // TODO add your handling code here:
        database_show frame = new database_show();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_DatabaseActionPerformed

    private void software_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_software_update_buttonActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_software_update_buttonActionPerformed

    private void jButton_AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AboutUsActionPerformed
        // TODO add your handling code here:
        About_us frame = new About_us();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_AboutUsActionPerformed

    private void jButton_ContactMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ContactMeActionPerformed
        contact_me frame = new contact_me();
        frame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton_ContactMeActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked
private JFrame frame1;
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Home",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();//to close the current jframe
        new Login_Page().setVisible(true);
        };
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel giris_saati_label;
    private javax.swing.JButton jButton_AboutUs;
    private javax.swing.JButton jButton_AddPassword;
    private javax.swing.JButton jButton_ContactMe;
    private javax.swing.JButton jButton_Database;
    private javax.swing.JButton jButton_UserEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_User_Control_Panel_Page_usercontrolpanel;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage3;
    private javax.swing.JButton software_update_button;
    // End of variables declaration//GEN-END:variables
}
