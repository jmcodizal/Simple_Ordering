
package UI;
import DB.Database;
import UI.OrderDashboard2;
import UI.CustomerDetails;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;



public class OrderDashboard extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;


String productName;
double totalPrice;
int quantity;
int cumulativeTotal = 0;
int customerID;
    private int CustomerID;
 
    public OrderDashboard(){
        initComponents();
        Database mycon = new Database();
        conn = Database.getCon();
        

    }
    


     
   
   

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SteelChairPC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        WoodenChairPC = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        NextButton = new javax.swing.JButton();
        txtSteelChairQ = new javax.swing.JTextField();
        txtWoodenChairQ = new javax.swing.JTextField();
        SteelChairUN = new javax.swing.JTextField();
        WoodenChairUN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DoubleBedPC = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        SingleBedPC = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        txtDoubleBedQ = new javax.swing.JTextField();
        txtSingleBedQ = new javax.swing.JTextField();
        SingleBedUN = new javax.swing.JTextField();
        DoubleBedUN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 80, -1));

        SteelChairPC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SteelChairPC.setText("Proceed to Checkout");
        SteelChairPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SteelChairPCActionPerformed(evt);
            }
        });
        jPanel2.add(SteelChairPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 80, -1));

        WoodenChairPC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WoodenChairPC.setText("Proceed to Checkout");
        WoodenChairPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WoodenChairPCActionPerformed(evt);
            }
        });
        jPanel2.add(WoodenChairPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 180, -1));

        jLabel6.setBackground(new java.awt.Color(255, 153, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Steel Chair");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\TablesChairs\\Chairs.jpg")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 210, 220));

        jLabel9.setBackground(new java.awt.Color(255, 153, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setText("Wooden Chair");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, -1));

        jLabel17.setBackground(new java.awt.Color(255, 153, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel17.setText("Chairs");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\TablesChairs\\Chairs (2).jpg")); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, 230));

        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        jPanel2.add(NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        txtSteelChairQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSteelChairQActionPerformed(evt);
            }
        });
        jPanel2.add(txtSteelChairQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 80, -1));

        txtWoodenChairQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWoodenChairQActionPerformed(evt);
            }
        });
        jPanel2.add(txtWoodenChairQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 80, -1));

        SteelChairUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SteelChairUNActionPerformed(evt);
            }
        });
        jPanel2.add(SteelChairUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 140, -1));

        WoodenChairUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WoodenChairUNActionPerformed(evt);
            }
        });
        jPanel2.add(WoodenChairUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 140, -1));

        jLabel1.setText("User Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel23.setText("User Name:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 560, 540));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Quantity");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 80, -1));

        DoubleBedPC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DoubleBedPC.setText("Proceed to Checkout");
        DoubleBedPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleBedPCActionPerformed(evt);
            }
        });
        jPanel3.add(DoubleBedPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 180, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Quantity");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 80, -1));

        SingleBedPC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SingleBedPC.setText("Proceed to Checkout");
        SingleBedPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleBedPCActionPerformed(evt);
            }
        });
        jPanel3.add(SingleBedPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 210, -1));

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setText("Double Bed");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 140, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\Beds\\476575355_1177508397274728_3896940104184177795_n.jpg")); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 230, 220));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\jessa\\OneDrive\\Desktop\\FurnitureOrderingSystem\\FurnitureOrderingSystem\\src\\Images\\Beds\\476865833_1678248423109395_8734369612456179799_n.jpg")); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, -1));

        jLabel16.setText("jLabel3");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 153, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel18.setText("Single Bed");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -30, 230, 190));

        jLabel19.setBackground(new java.awt.Color(255, 153, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel19.setText("Single Bed");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, -1));

        jLabel20.setBackground(new java.awt.Color(255, 153, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel20.setText("Beds");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 60, -1));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel3.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        txtDoubleBedQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoubleBedQActionPerformed(evt);
            }
        });
        jPanel3.add(txtDoubleBedQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 80, -1));

        txtSingleBedQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSingleBedQActionPerformed(evt);
            }
        });
        jPanel3.add(txtSingleBedQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 80, -1));

        SingleBedUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleBedUNActionPerformed(evt);
            }
        });
        jPanel3.add(SingleBedUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 140, -1));

        DoubleBedUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleBedUNActionPerformed(evt);
            }
        });
        jPanel3.add(DoubleBedUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 140, -1));

        jLabel7.setText("User Name:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel22.setText("User Name:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 530, 540));

        jLabel24.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SteelChairPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SteelChairPCActionPerformed

        String ProductName = "Steel Chair";
        int price = 450;
        int Quantity;
        Quantity = Integer.parseInt(txtSteelChairQ.getText());
        double TotalPrice = Quantity * price;
         String userName = SteelChairUN.getText();

        
        try{
        pst = conn.prepareStatement("INSERT INTO `orders`(UserName, ProductName, TotalPrice, Quantity) VALUES (?, ?, ?, ?)");
         pst.setString(1, userName);
        pst.setString(2, ProductName);// Set the username
        pst.setDouble(3, TotalPrice);
        pst.setInt(4, Quantity);  
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Purchase Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Purchase failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             // Print the error to the console for debugging
    }

    }//GEN-LAST:event_SteelChairPCActionPerformed

    private void WoodenChairPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WoodenChairPCActionPerformed
         
        String ProductName = "Wooden Chair";
         int price = 350;
         int Quantity;
        Quantity = Integer.parseInt(txtWoodenChairQ.getText());
        int TotalPrice = Quantity * price; 
         String userName = WoodenChairUN.getText();

        try{    
        pst = conn.prepareStatement("INSERT INTO `orders`(UserName, ProductName, TotalPrice, Quantity) VALUES (?, ?, ?, ?)");
         pst.setString(1, userName);
        pst.setString(2, ProductName);
        pst.setDouble(3, TotalPrice);
        pst.setInt(4, Quantity);  
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Purchase successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Purchase failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             // Print the error to the console for debugging
    }
    }//GEN-LAST:event_WoodenChairPCActionPerformed

    private void DoubleBedPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoubleBedPCActionPerformed
        
        String ProductName = "Double Bed";
         int price = 1500;
         int Quantity;
        Quantity = Integer.parseInt(txtDoubleBedQ.getText());
        int TotalPrice = Quantity * price; 
         String userName = DoubleBedUN.getText();
        
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
    }//GEN-LAST:event_DoubleBedPCActionPerformed

    private void SingleBedPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleBedPCActionPerformed

        String ProductName = "Single Bed";
         int price = 650;
         int Quantity;
        Quantity = Integer.parseInt(txtSingleBedQ.getText());
        String userName = SingleBedUN.getText();
        int TotalPrice = Quantity * price; 

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
    }//GEN-LAST:event_SingleBedPCActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        OrderDashboard2 obj = new OrderDashboard2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_NextButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        CustomerDetails obj = new CustomerDetails();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void txtWoodenChairQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWoodenChairQActionPerformed
       
    }//GEN-LAST:event_txtWoodenChairQActionPerformed

    private void txtSteelChairQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSteelChairQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSteelChairQActionPerformed

    private void txtDoubleBedQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoubleBedQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoubleBedQActionPerformed

    private void txtSingleBedQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSingleBedQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSingleBedQActionPerformed

    private void SingleBedUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleBedUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SingleBedUNActionPerformed

    private void DoubleBedUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoubleBedUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoubleBedUNActionPerformed

    private void SteelChairUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SteelChairUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SteelChairUNActionPerformed

    private void WoodenChairUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WoodenChairUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WoodenChairUNActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DoubleBedPC;
    private javax.swing.JTextField DoubleBedUN;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton SingleBedPC;
    private javax.swing.JTextField SingleBedUN;
    private javax.swing.JButton SteelChairPC;
    private javax.swing.JTextField SteelChairUN;
    private javax.swing.JButton WoodenChairPC;
    private javax.swing.JTextField WoodenChairUN;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDoubleBedQ;
    private javax.swing.JTextField txtSingleBedQ;
    private javax.swing.JTextField txtSteelChairQ;
    private javax.swing.JTextField txtWoodenChairQ;
    // End of variables declaration//GEN-END:variables
}
