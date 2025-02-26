
package UI;
import UI.CustomerDetails;
import UI.OrderDashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DB.Database;

import javax.swing.JOptionPane;

/**
 *
 * @author jessa
 */
public class OrderDashboard2 extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;

int customerID;
String productName;
double totalPrice;
int quantity;
int cumulativeTotal = 0;
    /**
     * Creates new form OrderDashboard2
     */
    public OrderDashboard2() {
        
        initComponents();
         Database mycon = new Database();
        conn = Database.getCon();
    }
    
  
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        OvalTableBuy = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        RoundTableBuy = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        OvalTableUN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        RoundTableUN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtOvalTableQ = new javax.swing.JTextField();
        txtRoundTableQ = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CornerSofaBuy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        StraightSofaBuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        StraightSofaUN = new javax.swing.JTextField();
        CornerSofaUN = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCornerSofaQ = new javax.swing.JTextField();
        txtStraightSofaQ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Quantity");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 80, -1));

        OvalTableBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OvalTableBuy.setText("Proceed to Checkout");
        OvalTableBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvalTableBuyActionPerformed(evt);
            }
        });
        jPanel3.add(OvalTableBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 180, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Quantity");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 80, -1));

        RoundTableBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RoundTableBuy.setText("Proceed to Checkout");
        RoundTableBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundTableBuyActionPerformed(evt);
            }
        });
        jPanel3.add(RoundTableBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 180, -1));

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setText("Oval Table");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 140, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\TablesChairs\\Dining Tables (2).jpg")); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 168, 230, 210));

        jLabel18.setBackground(new java.awt.Color(255, 153, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel18.setText("Round Table");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 140, -1));

        jLabel20.setBackground(new java.awt.Color(255, 153, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel20.setText("Tables");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\TablesChairs\\Dining Tables.jpg")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 210));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel3.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        OvalTableUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvalTableUNActionPerformed(evt);
            }
        });
        jPanel3.add(OvalTableUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 140, -1));

        jLabel15.setText("User Name:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        RoundTableUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundTableUNActionPerformed(evt);
            }
        });
        jPanel3.add(RoundTableUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 140, -1));

        jLabel22.setText("User Name:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        txtOvalTableQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOvalTableQActionPerformed(evt);
            }
        });
        jPanel3.add(txtOvalTableQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 100, -1));

        txtRoundTableQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoundTableQActionPerformed(evt);
            }
        });
        jPanel3.add(txtRoundTableQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 530, 540));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 80, -1));

        CornerSofaBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CornerSofaBuy.setText("Proceed to Checkout");
        CornerSofaBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CornerSofaBuyActionPerformed(evt);
            }
        });
        jPanel2.add(CornerSofaBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 80, -1));

        StraightSofaBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StraightSofaBuy.setText("Proceed to Checkout");
        StraightSofaBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StraightSofaBuyActionPerformed(evt);
            }
        });
        jPanel2.add(StraightSofaBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 200, -1));

        jLabel6.setBackground(new java.awt.Color(255, 153, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Corner Sofa");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 140, -1));

        jLabel9.setBackground(new java.awt.Color(255, 153, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setText("Straight Sofa");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 170, -1));

        jLabel17.setBackground(new java.awt.Color(255, 153, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel17.setText("Sofas");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 70, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\UpholsteredFurniture\\476569135_1304277114252508_213393179754349842_n.jpg")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 161, 220, 220));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\UpholsteredFurniture\\475883994_1736921900500350_850297494677894551_n.jpg")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 200, 200));

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        StraightSofaUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StraightSofaUNActionPerformed(evt);
            }
        });
        jPanel2.add(StraightSofaUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 140, -1));

        CornerSofaUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CornerSofaUNActionPerformed(evt);
            }
        });
        jPanel2.add(CornerSofaUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 130, -1));

        jLabel19.setText("User Name:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel21.setText("User Name:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));
        jPanel2.add(txtCornerSofaQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 110, -1));
        jPanel2.add(txtStraightSofaQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 530, 540));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -60, 230, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OvalTableBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvalTableBuyActionPerformed
        
        String ProductName = "Oval Table";
         int price = 450;
         int Quantity;
        Quantity = Integer.parseInt(txtOvalTableQ.getText());
        double TotalPrice = Quantity * price;
        String userName = OvalTableUN.getText();

        try{    
        pst = conn.prepareStatement("INSERT INTO `orders`(UserName, ProductName, TotalPrice, Quantity) VALUES (?, ?, ?, ?)");
         pst.setString(1, userName);
        pst.setString(2, ProductName);
        pst.setDouble(3, TotalPrice);
        pst.setInt(4, Quantity);  
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // Print the error to the console for debugging
    }

    }//GEN-LAST:event_OvalTableBuyActionPerformed

    private void RoundTableBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundTableBuyActionPerformed
       
        String ProductName = "Round Table";
         int price = 500;
          int Quantity;
        Quantity = Integer.parseInt(txtRoundTableQ.getText());
        double TotalPrice = Quantity * price;
        String userName = RoundTableUN.getText();

        try{    
        pst = conn.prepareStatement("INSERT INTO `orders`(UserName, ProductName, TotalPrice, Quantity) VALUES (?, ?, ?, ?)");
         pst.setString(1, userName);
        pst.setString(2, ProductName);// Set the username
        pst.setDouble(3, TotalPrice);
        pst.setInt(4, Quantity);  
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // Print the error to the console for debugging
    }
    }//GEN-LAST:event_RoundTableBuyActionPerformed

    private void CornerSofaBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CornerSofaBuyActionPerformed
       
        String ProductName = "Corner Sofa";
         int price = 1200;
         int Quantity;
        Quantity = Integer.parseInt(txtCornerSofaQ.getText());
        double TotalPrice = Quantity * price; 
       String userName = CornerSofaUN.getText();

        try{    
        pst = conn.prepareStatement("INSERT INTO `orders`(UserName, ProductName, TotalPrice, Quantity) VALUES (?, ?, ?, ?)");
         pst.setString(1, userName);
        pst.setString(2, ProductName);// Set the username
        pst.setDouble(3, TotalPrice);
        pst.setInt(4, Quantity);  
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // Print the error to the console for debugging
    }
    }//GEN-LAST:event_CornerSofaBuyActionPerformed

    private void StraightSofaBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StraightSofaBuyActionPerformed
       
        String ProductName = "Straight Sofa";
         int price = 1000;
        int Quantity;
        Quantity = Integer.parseInt(txtCornerSofaQ.getText());
        double TotalPrice = Quantity * price; 
        String userName = StraightSofaUN.getText();

        try{    
        pst = conn.prepareStatement("INSERT INTO `orders`(UserName, ProductName, TotalPrice, Quantity) VALUES (?, ?, ?, ?)");
         pst.setString(1, userName);
        pst.setString(2, ProductName);// Set the username
        pst.setDouble(3, TotalPrice);
        pst.setInt(4, Quantity);  
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // Print the error to the console for debugging
    }
    }//GEN-LAST:event_StraightSofaBuyActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       Front obj = new Front();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       OrderDashboard obj = new OrderDashboard();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void OvalTableUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvalTableUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OvalTableUNActionPerformed

    private void StraightSofaUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StraightSofaUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StraightSofaUNActionPerformed

    private void CornerSofaUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CornerSofaUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CornerSofaUNActionPerformed

    private void RoundTableUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundTableUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoundTableUNActionPerformed

    private void txtOvalTableQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOvalTableQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOvalTableQActionPerformed

    private void txtRoundTableQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoundTableQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoundTableQActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDashboard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDashboard2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CornerSofaBuy;
    private javax.swing.JTextField CornerSofaUN;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton OvalTableBuy;
    private javax.swing.JTextField OvalTableUN;
    private javax.swing.JButton RoundTableBuy;
    private javax.swing.JTextField RoundTableUN;
    private javax.swing.JButton StraightSofaBuy;
    private javax.swing.JTextField StraightSofaUN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCornerSofaQ;
    private javax.swing.JTextField txtOvalTableQ;
    private javax.swing.JTextField txtRoundTableQ;
    private javax.swing.JTextField txtStraightSofaQ;
    // End of variables declaration//GEN-END:variables
}
