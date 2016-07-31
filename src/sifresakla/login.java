//developer fatihdemirag\fxd

package sifresakla;

import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement prs;
    Statement st;
    String dbUrl="jdbc:mysql://localhost:3306/sifreSakla";
    public void connection()
    {
        try {
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(dbUrl, "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız");
        }
    }
    
    public login() {
        initComponents();
        connection();
        this.getContentPane().setBackground(Color.black);
        jLabel2.setForeground(Color.white);
        jLabel3.setForeground(Color.white);
        password.setForeground(Color.white);
        ImageIcon icon=new ImageIcon("/home/fxd/Workspace/sifreSakla/src/icon.png");
        this.setIconImage(icon.getImage());
    }
    public void dbCreate() throws SQLException
    {
        File db=new File("jdbc:mysql://localhost:3306/sifreSakla");
        if(db.exists()==true)
            loading.setText("Veritabanı Oluşturuluyor Lütfen Bekleyiniz");
        {
        try {
            con=DriverManager.getConnection(dbUrl,"root","root");
            st=con.createStatement();
            String sql="create database sifreSakla;";
            st.executeUpdate(sql);
            String useDB="use sifreSakla;";
            st.executeUpdate(useDB);
            con=DriverManager.getConnection(dbUrl,"root","root");
            String tableCreate="create table sifreler(id int primary key auto_increment unique not null,sifreBaslik varchar(150) not null ,"
                    + "sifre varchar(40) not null,email varchar(100))";
            st.executeUpdate(tableCreate);
            
            String loginCreate="create table login(id int primary key auto_increment not null,username varchar(20) not null,password varchar(20) not null) "
                    + "values(admin,admin)";
            st.executeUpdate(loginCreate);
            
            loading.setText("Veritabanı Oluşturuldu Giriş Yapınız");
        } catch (SQLException ex) {
            Logger.getLogger(sifreSakla.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        username = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        password = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        setIconImages(null);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aiden_pearce_headshot___watch_dogs_by_infectiousdesigner-d7crvkm.jpg"))); // NOI18N

        jLabel2.setText("username");

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(username);

        jLabel3.setText("password");

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        password.setSelectionColor(new java.awt.Color(255, 255, 255));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(password);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(loading))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loading)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String loginSql="select * from login where username=? and password=?";
        try {
            prs=con.prepareStatement(loginSql);
            prs.setString(1, username.getText());
            prs.setString(2, password.getText());
            rs=prs.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Giriş Başarılı","Giriş Başarılı",HEIGHT);
                sifreSakla m=new sifreSakla();
                m.setVisible(true);
                this.dispose();
                
            }
            else
                JOptionPane.showMessageDialog(null, "Giriş Başarısız Bilgileri Kontrol Edin","Giriş Başarısız",HEIGHT);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        username.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        password.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
    }//GEN-LAST:event_passwordKeyPressed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loading;
    private javax.swing.JTextPane password;
    private javax.swing.JTextPane username;
    // End of variables declaration//GEN-END:variables
}
