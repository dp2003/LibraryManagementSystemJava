
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author myself
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        issue = new javax.swing.JLabel();
        records = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Issuebtn = new javax.swing.JButton();
        display = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        insert1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/getty_496612468_2000138820009280460_336567.jpg"))); // NOI18N

        jLabel7.setText("jLabel7");

        jButton2.setText("*");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/getty_496612468_2000138820009280460_336567.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Search Books :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Ratings / Feedback :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        issue.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        issue.setText("Issue Book : ");
        getContentPane().add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        records.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        records.setText("View  Records of the Book : ");
        getContentPane().add(records, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Insert Records Into the table : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        menu.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        menu.setText("Main Menu ");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jButton4.setText("*");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 50, 31));

        Issuebtn.setText("*");
        Issuebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        Issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 50, 30));

        display.setText("*");
        display.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 50, 30));

        jButton1.setText("*");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 50, 31));

        insert1.setText("*");
        insert1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert1ActionPerformed(evt);
            }
        });
        getContentPane().add(insert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 50, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/getty_496612468_2000138820009280460_336567.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-740, 0, 1430, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SearchData sd = new SearchData();
        sd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FeedbackForm fb = new FeedbackForm();
        fb.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void IssuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuebtnActionPerformed
        // TODO add your handling code here:
        IssualForm i = new IssualForm();
        i.setVisible(true);
        setVisible(false);
       
    }//GEN-LAST:event_IssuebtnActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:

        DisplayData dis = new DisplayData();
        dis.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_displayActionPerformed

    private void insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert1ActionPerformed
        // TODO add your handling code here:
        InsertData in = new InsertData();
         in.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_insert1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               MainMenu menu = new MainMenu();
               menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Issuebtn;
    private javax.swing.JButton display;
    private javax.swing.JButton insert1;
    private javax.swing.JLabel issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel records;
    // End of variables declaration//GEN-END:variables
}
