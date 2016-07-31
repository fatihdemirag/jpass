//developer fatihdemirag\fxd

package sifresakla;

import java.awt.KeyboardFocusManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class sifreSakla extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement prs;
    Statement st;
    String dbUrl="jdbc:mysql://localhost:3306/sifreSakla";
    public void connection() throws SQLException
    {
        try {
            
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(dbUrl, "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız ");
        }
    }
    public sifreSakla() {
        initComponents();
        try {
            
            connection();
            tablo();
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        ImageIcon icon=new ImageIcon("/home/fxd/Workspace/sifreSakla/src/icon.png");
        this.setIconImage(icon.getImage());
        idLabel.setVisible(false);
        tablooo.getColumnModel().getColumn(0).setMaxWidth(50);
    }
    
    public void tablo()
    {
        try {
            String sql="select id as Id , sifreBaslik as 'Baslik',email as 'E-Mail',sifre as 'Sifre' from sifreler order by sifreBaslik asc";
            prs=con.prepareStatement(sql);
            rs=prs.executeQuery();
            tablooo.setModel(DbUtils.resultSetToTableModel(rs));
            tablooo.getColumnModel().getColumn(0).setMaxWidth(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        tablooo = new javax.swing.JTable();
        idLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        email = new javax.swing.JTextPane();
        sil = new javax.swing.JButton();
        güncelle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kaydet1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sifre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sifreYeri = new javax.swing.JTextPane();
        temizle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPass");
        setIconImages(null);
        setLocation(new java.awt.Point(150, 100));
        setResizable(false);

        tablooo.setAutoCreateRowSorter(true);
        tablooo.setBackground(new java.awt.Color(204, 204, 204));
        tablooo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "Başlık", "E-mail", "Şifre"
            }
        ));
        tablooo.setRowHeight(25);
        tablooo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloooMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablooo);

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(email);

        sil.setText("Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        güncelle.setText("Güncelle");
        güncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncelleActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şifre");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Başlık");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail/Kullanıcı Adı");

        kaydet1.setText("Kaydet");
        kaydet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydet1ActionPerformed(evt);
            }
        });

        sifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sifreKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(sifre);

        sifreYeri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sifreYeriKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(sifreYeri);

        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(kaydet1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(güncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(temizle))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(güncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sil))
                    .addComponent(kaydet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(temizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idLabel)
                        .addGap(338, 338, 338))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(idLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        sifreYeri.setText("");
        sifre.setText("");
        email.setText("");
        tablooo.getColumnModel().getColumn(0).setMaxWidth(50);
    }//GEN-LAST:event_temizleActionPerformed

    private void güncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_güncelleActionPerformed
        String sifreBaslik=sifreYeri.getText();
        String sifre=this.sifre.getText();
        String email=this.email.getText();
        String id=idLabel.getText();
        tablooo.getColumnModel().getColumn(0).setMaxWidth(50);
        try {
            String sql=("update sifreler set sifreBaslik='"+sifreBaslik+"',sifre='"+sifre+"',email='"+email+"' where id='"+id+"'");
            st=(com.mysql.jdbc.Statement) con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Şifre Başarılı Bir Şekilde Güncellendi","Şifre Güncellendi",HEIGHT);
            tablo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Şifre Güncellenemedi Tekrar Deneyiniz","Şifre Güncellenemedi",HEIGHT);
            e.printStackTrace();
        }
        tablo();
    }//GEN-LAST:event_güncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        int onay=JOptionPane.showConfirmDialog(null, "Onaylarsanız "+sifreYeri.getText()+" Şifreniz Silinecektir","Onaylıyor Musunuz ?",HEIGHT);
        if(onay==JOptionPane.YES_OPTION)
        {
        try {
            String sql=("delete from sifreler where id='"+idLabel.getText()+"'");
            st=(com.mysql.jdbc.Statement) con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Şifre Başarılı Bir Şekilde Silindi","Şifre Silindi",HEIGHT);
            tablo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Şifre Silinemedi Tekrar Deneyiniz","Şifre Silinemedi",HEIGHT);
            e.printStackTrace();
        }
        tablooo.getColumnModel().getColumn(0).setMaxWidth(50);
        tablo();
        
        }
        
    }//GEN-LAST:event_silActionPerformed

    private void tabloooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloooMouseClicked
        try 
        {
            int row=tablooo.getSelectedRow();
            String tableClick=(tablooo.getModel().getValueAt(row, 0).toString());
            String sqlString="select * from sifreler where id='"+tableClick+"'  ";
            prs=con.prepareStatement(sqlString);
            rs=prs.executeQuery();
            if (rs.next())
            {
                String add1=rs.getString("sifreBaslik");
                sifreYeri.setText(add1);
                String add2=rs.getString("email");
                email.setText(add2);
                String add3=rs.getString("sifre");
                sifre.setText(add3);
                String add4=rs.getString("id");
                idLabel.setText(add4);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_tabloooMouseClicked

    private void kaydet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydet1ActionPerformed
        String sifreBaslik=sifreYeri.getText();
        String sifre=this.sifre.getText();
        String email=this.email.getText();
        try {
            String sql=("insert into sifreler(sifreBaslik,sifre,email) values('"+sifreBaslik+"','"+sifre+"','"+email+"')");
            st=(com.mysql.jdbc.Statement) con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Şifre Başarılı Bir Şekilde Eklendi","Şifre Eklendi",HEIGHT);
            tablo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Şifre Eklenemedi Tekrar Deneyiniz","Şifre Eklenemedi",HEIGHT);
            e.printStackTrace();
        }
        tablooo.getColumnModel().getColumn(0).setMaxWidth(50);
        sifreYeri.setText("");
        this.sifre.setText("");
        this.email.setText("");
        tablo();
    }//GEN-LAST:event_kaydet1ActionPerformed

    private void sifreYeriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreYeriKeyPressed
        sifreYeri.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_sifreYeriKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        email.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_emailKeyPressed

    private void sifreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sifreKeyPressed
        sifre.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_sifreKeyPressed

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
            java.util.logging.Logger.getLogger(sifreSakla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sifreSakla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sifreSakla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sifreSakla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sifreSakla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane email;
    private javax.swing.JButton güncelle;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton kaydet1;
    private javax.swing.JTextPane sifre;
    private javax.swing.JTextPane sifreYeri;
    private javax.swing.JButton sil;
    private javax.swing.JTable tablooo;
    private javax.swing.JButton temizle;
    // End of variables declaration//GEN-END:variables
}
