/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author wedad
 */
public class Tabela extends javax.swing.JFrame {

    /**
     * Creates new form Tabela
     */
    public Tabela() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pretraga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        im = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        i = new javax.swing.JRadioButton();
        g = new javax.swing.JRadioButton();
        a = new javax.swing.JRadioButton();
        d = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        doho = new javax.swing.JTextField();
        go = new javax.swing.JTextField();
        struc = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        struc1 = new javax.swing.JTextField();

        setBounds(new java.awt.Rectangle(600, 200, 0, 0));

        pretraga.setToolTipText("");
        pretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretragaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Pretraga uposlenih po kriterijima");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Unesi ime :");

        im.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Pretraga");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(i);
        i.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        i.setText("Ime");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        buttonGroup1.add(g);
        g.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        g.setText("Godine");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        buttonGroup1.add(a);
        a.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a.setText("Adresa");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        buttonGroup1.add(d);
        d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        d.setText("Dohodak");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Unesi adresu :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unesi godine :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Unesi dohodak :");

        ad.setColumns(6);

        doho.setColumns(6);

        go.setColumns(6);

        struc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        struc.setText("Strucno zvanje");
        struc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strucActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Unesi struco zvanje :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel2)))
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(go)
                                    .addComponent(im, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(struc1))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doho, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(i)
                        .addGap(18, 18, 18)
                        .addComponent(g)
                        .addGap(32, 32, 32)
                        .addComponent(a)
                        .addGap(18, 18, 18)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(struc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i)
                    .addComponent(g)
                    .addComponent(a)
                    .addComponent(d)
                    .addComponent(struc))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(struc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(pretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         StringBuilder rezultat = new StringBuilder();
         
         
         
          
          
          if(i.isSelected()){
              
              String name = im.getText();
              
          try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "Wedaddracic1984"))
                    {
                        Statement st = conn.createStatement();  
                        st.executeQuery("select * from person where name='" + name + "'");
                 
                        ResultSet rs = st.getResultSet();
                       while(rs.next()) {  
                           rezultat.append(rs.getString("idperson"));  
                           rezultat.append(" . ");  
                           rezultat.append(rs.getString("name"));  
                           rezultat.append(" | ");  
                           
                           rezultat.append(rs.getInt("age"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("adress"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("salary"));   
                           rezultat.append("\n");  
                        }  
                 

                      pretraga.setText(rezultat.toString());
            
                    } catch(SQLException ex) {
            
                      JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
          }
          
         
         
         
          
          
          if(g.isSelected()){
              
              String age = go.getText();
              
          try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "Wedaddracic1984"))
                    {
                        Statement st = conn.createStatement();  
                        st.executeQuery("select * from person where age='" + age + "'");
                 
                        ResultSet rs = st.getResultSet();
                       while(rs.next()) {  
                           rezultat.append(rs.getString("idperson"));  
                           rezultat.append(" . ");  
                           rezultat.append(rs.getString("name"));  
                           rezultat.append(" | ");  
                           
                           rezultat.append(rs.getInt("age"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("adress"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("salary"));   
                           rezultat.append("\n");  
                        }  
                 

                      pretraga.setText(rezultat.toString());
            
                    } catch(SQLException ex) {
            
                      JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
          }
          if(a.isSelected()){
              
              String adress = ad.getText();
              
          try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "Wedaddracic1984"))
                    {
                        Statement st = conn.createStatement();  
                        st.executeQuery("select * from person where adress='" + adress + "'");
                 
                        ResultSet rs = st.getResultSet();
                       while(rs.next()) {  
                           rezultat.append(rs.getString("idperson"));  
                           rezultat.append(" . ");  
                           rezultat.append(rs.getString("name"));  
                           rezultat.append(" | ");  
                           
                           rezultat.append(rs.getInt("age"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("adress"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("salary"));   
                           rezultat.append("\n");  
                        }  
                 

                      pretraga.setText(rezultat.toString());
            
                    } catch(SQLException ex) {
            
                      JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
          }
           if(d.isSelected()){
              
              String dohodak = doho.getText();
              
          try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "Wedaddracic1984"))
                    {
                        Statement st = conn.createStatement();  
                        st.executeQuery("select * from person where salary='" + dohodak + "'");
                 
                        ResultSet rs = st.getResultSet();
                       while(rs.next()) {  
                           rezultat.append(rs.getString("idperson"));  
                           rezultat.append(" . ");  
                           rezultat.append(rs.getString("name"));  
                           rezultat.append(" | ");  
                           
                           rezultat.append(rs.getInt("age"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("adress"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("salary"));   
                           rezultat.append("\n");  
                        }  
                 

                      pretraga.setText(rezultat.toString());
            
                    } catch(SQLException ex) {
            
                      JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
          }
           if(struc.isSelected()){
               
               String tt = struc1.getText();
               try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "Wedaddracic1984")) {
                   Statement st = conn.createStatement();
                   st.executeQuery("Select * from person where strucnoz ='" + tt + "'");
                   ResultSet rs = st.getResultSet();
                   while (rs.next()) {                       
                       rezultat.append(rs.getString("idperson"));  
                           rezultat.append(" . ");  
                           rezultat.append(rs.getString("name"));  
                           rezultat.append(" | ");  
                           
                           rezultat.append(rs.getInt("age"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("adress"));  
                           rezultat.append(" | ");  
                           rezultat.append(rs.getString("salary"));
                           rezultat.append(" | "); 
                           rezultat.append(rs.getString("Strucnoz"));
                            rezultat.append(" | "); 
                           rezultat.append("\n"); 
                           pretraga.setText(rezultat.toString());
                   }
               } catch (SQLException ex) {
                   
                   JOptionPane.showMessageDialog(null, ex.getMessage());
               }
           
           
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        g.setEnabled(false);
        a.setEnabled(false);
        d.setEnabled(false);
        doho.setEnabled(false);
        ad.setEnabled(false);
        go.setEnabled(false);
    }//GEN-LAST:event_iActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        i.setEnabled(false);
        a.setEnabled(false);
        d.setEnabled(false);
        im.setEnabled(false);
        ad.setEnabled(false);
        doho.setEnabled(false);
              
        
    }//GEN-LAST:event_gActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        i.setEnabled(false);
        g.setEnabled(false);
        d.setEnabled(false);
        im.setEnabled(false);
        go.setEnabled(false);
        doho.setEnabled(false);
    }//GEN-LAST:event_aActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
       i.setEnabled(false);
       g.setEnabled(false);
       a.setEnabled(false);
       im.setEnabled(false);
       ad.setEnabled(false);
      go.setEnabled(false);
    }//GEN-LAST:event_dActionPerformed

    private void imActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imActionPerformed

    private void pretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pretragaActionPerformed

    private void strucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strucActionPerformed
       i.setEnabled(false);
       g.setEnabled(false);
       a.setEnabled(false);
       d.setEnabled(false);
       im.setEnabled(false);
       ad.setEnabled(false);
       go.setEnabled(false);
       doho.setEnabled(false);
    }//GEN-LAST:event_strucActionPerformed

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
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JTextField ad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton d;
    private javax.swing.JTextField doho;
    private javax.swing.JRadioButton g;
    private javax.swing.JTextField go;
    private javax.swing.JRadioButton i;
    private javax.swing.JTextField im;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pretraga;
    private javax.swing.JRadioButton struc;
    private javax.swing.JTextField struc1;
    // End of variables declaration//GEN-END:variables
}