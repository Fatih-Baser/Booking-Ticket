/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
/**
 *
 * @author baser
 */
public class AdminLogin extends javax.swing.JFrame {
static Connection con=null;
     int count=0;
    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserTxt = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        PassTxt = new javax.swing.JPasswordField();
        PassLabel = new javax.swing.JLabel();
        LoginButton = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        UserTxt1 = new javax.swing.JTextField();
        UserLabel1 = new javax.swing.JLabel();
        PassTxt1 = new javax.swing.JPasswordField();
        PassLabel1 = new javax.swing.JLabel();
        LoginButton1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        UserTxt.setBackground(new java.awt.Color(187, 187, 252));
        UserTxt.setForeground(new java.awt.Color(40, 98, 136));
        UserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxtActionPerformed(evt);
            }
        });

        UserLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(204, 204, 255));
        UserLabel.setText("User Name :");

        PassTxt.setBackground(new java.awt.Color(187, 187, 252));
        PassTxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PassTxt.setForeground(new java.awt.Color(40, 98, 136));

        PassLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(204, 204, 255));
        PassLabel.setText("Password :");

        LoginButton.setActionCommand("LoginButton");
        LoginButton.setBackground(new java.awt.Color(153, 153, 255));
        LoginButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(204, 204, 255));
        LoginButton.setLabel("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(40, 98, 136));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36), new java.awt.Color(115, 147, 179))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(134, 134, 188));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserTxt1.setBackground(new java.awt.Color(187, 187, 252));
        UserTxt1.setForeground(new java.awt.Color(40, 98, 136));
        UserTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxt1ActionPerformed(evt);
            }
        });
        getContentPane().add(UserTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 224, 33));

        UserLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        UserLabel1.setForeground(new java.awt.Color(204, 204, 255));
        UserLabel1.setText("User Name :");
        getContentPane().add(UserLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 130, 20));

        PassTxt1.setBackground(new java.awt.Color(187, 187, 252));
        PassTxt1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PassTxt1.setForeground(new java.awt.Color(40, 98, 136));
        getContentPane().add(PassTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 224, -1));

        PassLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        PassLabel1.setForeground(new java.awt.Color(204, 204, 255));
        PassLabel1.setText("Password :");
        getContentPane().add(PassLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, -1));

        LoginButton1.setActionCommand("LoginButton");
        LoginButton1.setBackground(new java.awt.Color(153, 153, 255));
        LoginButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(204, 204, 255));
        LoginButton1.setLabel("Login");
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\baser\\OneDrive\\Masaüstü\\wallpaperflare.com_wallpaper.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxtActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String username= UserTxt.getText();
        String password=PassTxt.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/ucak_bileti";
            con=(Connection) DriverManager.getConnection(databaseURL,"root","");
            
            Statement stat = con.createStatement();
            
            String selectQuery="select * from admin_details where username='"+username+"' and password='"+password+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
            System.out.println(rs.next());
            if(rs.next()==true){
                dispose();
                AdminControlPanel acp= new AdminControlPanel();
                acp.setLocationRelativeTo(null);
                acp.setVisible(true);
                acp.show();
            }
            else{
                 
                System.out.println("akdhakabkdnkjfsvkslkjv");

                dispose();
             setVisible(false);
        AdminControlPanel login =new AdminControlPanel();
        login.setVisible(true);
                
            
            }
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UserTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxt1ActionPerformed

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        // TODO add your handling code here:
         String username= UserTxt1.getText();
        String password=PassTxt1.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/ucak_bileti";
            con=(Connection) DriverManager.getConnection(databaseURL,"root","");
            
            Statement stat = con.createStatement();
            
            String selectQuery="select * from admin_details where username='"+username+"' and password='"+password+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
            System.out.println(rs.next());
            if(rs.next()==true){
                dispose();
                AdminControlPanel acp= new AdminControlPanel();
                acp.setLocationRelativeTo(null);
                acp.setVisible(true);
                acp.show();
            }
            else{
                 
                System.out.println("akdhakabkdnkjfsvkslkjv");

                dispose();
             setVisible(false);
        AdminControlPanel login =new AdminControlPanel();
        login.setVisible(true);
                
            
            }
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_LoginButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button LoginButton;
    private java.awt.Button LoginButton1;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel PassLabel1;
    private javax.swing.JPasswordField PassTxt;
    private javax.swing.JPasswordField PassTxt1;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserLabel1;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JTextField UserTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
