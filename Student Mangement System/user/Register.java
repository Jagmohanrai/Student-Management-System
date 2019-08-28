
package user;

import Connection.Connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author aahha
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    public Register() {
        initComponents();
    }

    Connection conn;
    Statement st;
    ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jphone = new javax.swing.JTextField();
        juname = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jmale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jbranch = new javax.swing.JComboBox<>();
        jback = new javax.swing.JButton();
        jfemale = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jothers = new javax.swing.JRadioButton();
        jmorning = new javax.swing.JRadioButton();
        jevening = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jname = new javax.swing.JTextField();
        jlname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrollno = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(420, 190, 246, 10);

        jphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jphoneActionPerformed(evt);
            }
        });
        jPanel1.add(jphone);
        jphone.setBounds(500, 150, 154, 31);
        jPanel1.add(juname);
        juname.setBounds(540, 343, 182, 40);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(27, 468, 699, 9);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 480, 207, 36);

        buttonGroup1.add(jmale);
        jmale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jmale.setText("Male");
        jmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmaleActionPerformed(evt);
            }
        });
        jPanel1.add(jmale);
        jmale.setBounds(17, 242, 100, 36);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("GENDER");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(17, 199, 75, 41);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("SHIFT");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 200, 83, 28);
        jPanel1.add(jpass);
        jpass.setBounds(560, 390, 160, 39);

        jbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT BRANCH", "CSE", "EE", "ME", "PE", "ECE", "CE" }));
        jbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbranchActionPerformed(evt);
            }
        });
        jPanel1.add(jbranch);
        jbranch.setBounds(410, 100, 246, 41);

        jback.setBackground(new java.awt.Color(255, 255, 255));
        jback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jback.setText("Back to user...");
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });
        jPanel1.add(jback);
        jback.setBounds(480, 480, 170, 36);

        buttonGroup1.add(jfemale);
        jfemale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jfemale.setText("Female");
        jfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfemaleActionPerformed(evt);
            }
        });
        jPanel1.add(jfemale);
        jfemale.setBounds(17, 281, 100, 36);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(110, 380, 163, 33);

        buttonGroup1.add(jothers);
        jothers.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jothers.setText("Others");
        jothers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jothersActionPerformed(evt);
            }
        });
        jPanel1.add(jothers);
        jothers.setBounds(17, 320, 111, 36);

        buttonGroup2.add(jmorning);
        jmorning.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jmorning.setText("Morning Shift");
        jmorning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmorningActionPerformed(evt);
            }
        });
        jPanel1.add(jmorning);
        jmorning.setBounds(420, 250, 159, 27);

        buttonGroup2.add(jevening);
        jevening.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jevening.setText("Evening Shift");
        jevening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeveningActionPerformed(evt);
            }
        });
        jPanel1.add(jevening);
        jevening.setBounds(420, 280, 113, 34);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Create new Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 390, 157, 39);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(17, 371, 266, 2);

        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel1.add(jname);
        jname.setBounds(110, 100, 159, 39);
        jPanel1.add(jlname);
        jlname.setBounds(110, 160, 161, 33);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 100, 84, 39);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 160, 82, 39);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("DOB");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 380, 60, 33);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Roll no.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 430, 60, 33);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Contact No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 150, 88, 39);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(420, 350, 110, 30);

        jrollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrollnoActionPerformed(evt);
            }
        });
        jPanel1.add(jrollno);
        jrollno.setBounds(110, 430, 163, 33);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(410, 320, 307, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(0, 3, 736, 2);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/NEW BACK  .png"))); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 30, 40, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/CREATE ACCOUNT.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 730, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jphoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connect con = new Connect();
        conn= con.Connect();
        String name,lname,gender="",date,branch,shift="",uname,pass;
        String roll,phone;
        name= jname.getText();
        lname=jlname.getText();
        uname=juname.getText();
        pass=jpass.getText();
        roll=jrollno.getText();
        phone=jphone.getText();
        date=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        branch=jbranch.getSelectedItem().toString();
        if (jmale.isSelected())
        {
            gender="male";
        }
        else if (jfemale.isSelected())
        {
            gender="female";
        }
        else if(jothers.isSelected())
        {
            gender="others";
        }
        if (jmorning.isSelected())
        {
            shift="MOR";
        }
        else if (jevening.isSelected())
        {
            shift="EVE";
        }

        if (name.isEmpty() || lname.isEmpty() || uname.isEmpty() ||roll.isEmpty() || phone.isEmpty() || pass.isEmpty() || date.isEmpty() || branch.isEmpty() || gender.isEmpty() || shift.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "PLEASE FILL ALL FIELDS BEFORE PRESSING REGISTER BUTTON");
        }
        else
        try
        {
            String query1= "select * from login where uname='"+juname.getText()+"'";
            st =conn.createStatement();
            rs= st.executeQuery(query1);
            if (rs.isBeforeFirst())
            {
                JOptionPane.showMessageDialog(rootPane, "user exist please change the username" );
            }
            else
            {       String r = null,n=null,b=null,s=null;
                   String query2="select * from clgdata where rollno='"+roll+"'";
                   st =conn.createStatement();
                   rs= st.executeQuery(query2); 
                   if (rs.isBeforeFirst())
                   {
                       
                       while(rs.next())
                       {
                          r=rs.getString("rollno");
                          n=rs.getString("name");
                          b=rs.getString("branch");
                          s=rs.getString("shift");
                          
                       }
                       if (branch.equalsIgnoreCase(b) && roll.equalsIgnoreCase(r) && name.equalsIgnoreCase(n) && shift.equalsIgnoreCase(s))
                       {
                        String query="insert into login values('"+name+"','"+lname+"','"+gender+"','"+date+"',"+roll+",'"+branch+"','"+shift+"','"+phone+"','"+uname+"','"+pass+"','','','','')";
                        st= conn.createStatement();
                        int i= st.executeUpdate(query);
                        if (i>0)
                            {
                                JOptionPane.showMessageDialog(rootPane, "REGISTRATION IS SUCESFULL");
                                Login lg= new Login();
                                lg.show();
                                this.dispose();
                            }
                        else
                            JOptionPane.showMessageDialog(rootPane, "ERRROR OCCURRED");
                        }
                       else
                       {
                           JOptionPane.showMessageDialog(rootPane, "please enter correct data associated to your roll no");
                       }
                            
                   }
                   else 
                   {
                       JOptionPane.showMessageDialog(rootPane, "(NO RECORD FOUND)");
                   }
            }
             
                
        }
           catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmaleActionPerformed

    private void jbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbranchActionPerformed

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
        Login lg= new Login();
        lg.show();
        this.dispose();
    }//GEN-LAST:event_jbackActionPerformed

    private void jfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfemaleActionPerformed

    private void jothersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jothersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jothersActionPerformed

    private void jmorningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmorningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmorningActionPerformed

    private void jeveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeveningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeveningActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jrollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrollnoActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jback;
    private javax.swing.JComboBox<String> jbranch;
    private javax.swing.JRadioButton jevening;
    private javax.swing.JRadioButton jfemale;
    private javax.swing.JTextField jlname;
    private javax.swing.JRadioButton jmale;
    private javax.swing.JRadioButton jmorning;
    private javax.swing.JTextField jname;
    private javax.swing.JRadioButton jothers;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField jrollno;
    private javax.swing.JTextField juname;
    // End of variables declaration//GEN-END:variables
}
