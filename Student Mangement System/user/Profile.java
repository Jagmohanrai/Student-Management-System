
package user;
import Connection.Connect;
import java.sql.*;
import javax.swing.JOptionPane;
public class Profile extends javax.swing.JFrame {

   
    public Profile() {
        initComponents();
        
    }
    
     String temp,lcard1,lcard2;
     String uname;
     int roll;
     Connection conn;
     Statement st;
     ResultSet rs;
    void get()
    {
        try{
        Connect con = new Connect();
        conn= con.Connect();
        String query= "select * from login where uname='"+uname+"'";
        st= conn.createStatement();
        rs= st.executeQuery(query);
       try{
       while (rs.next())
       {
            
            jrollno.setText(rs.getString(5));
            jbranch.setText(rs.getString(6));
            jshift.setText(rs.getString(7));
            jname2.setText(rs.getString(1));            
       }
      
        }
        catch(Exception e)
       {
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
       }
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
     public Profile(String temp)
    {
       initComponents();
       uname=temp;
       get();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jname2 = new javax.swing.JLabel();
        jrollno = new javax.swing.JLabel();
        jbranch = new javax.swing.JLabel();
        jshift = new javax.swing.JLabel();
        jfeed = new javax.swing.JButton();
        jlibrary = new javax.swing.JButton();
        jacadmics = new javax.swing.JButton();
        jnotice = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project images/NEW BACK  .png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(703, 10, 40, 40);

        jname2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jname2.setForeground(new java.awt.Color(255, 102, 255));
        jname2.setText("name");
        jPanel1.add(jname2);
        jname2.setBounds(160, 100, 200, 38);

        jrollno.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jrollno.setForeground(new java.awt.Color(255, 102, 255));
        jrollno.setText("rollno");
        jPanel1.add(jrollno);
        jrollno.setBounds(160, 170, 210, 30);

        jbranch.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbranch.setForeground(new java.awt.Color(255, 102, 255));
        jbranch.setText("branch");
        jPanel1.add(jbranch);
        jbranch.setBounds(160, 220, 140, 42);

        jshift.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jshift.setForeground(new java.awt.Color(255, 102, 255));
        jshift.setText("shift");
        jPanel1.add(jshift);
        jshift.setBounds(160, 280, 110, 42);

        jfeed.setBackground(new java.awt.Color(255, 255, 255));
        jfeed.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jfeed.setForeground(new java.awt.Color(102, 0, 204));
        jfeed.setText("Feed");
        jfeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfeedActionPerformed(evt);
            }
        });
        jPanel1.add(jfeed);
        jfeed.setBounds(30, 100, 90, 40);

        jlibrary.setBackground(new java.awt.Color(255, 255, 255));
        jlibrary.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlibrary.setForeground(new java.awt.Color(102, 0, 204));
        jlibrary.setText("Notice");
        jlibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlibraryActionPerformed(evt);
            }
        });
        jPanel1.add(jlibrary);
        jlibrary.setBounds(30, 220, 100, 40);

        jacadmics.setBackground(new java.awt.Color(255, 255, 255));
        jacadmics.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jacadmics.setForeground(new java.awt.Color(102, 0, 204));
        jacadmics.setText("Acadmics");
        jacadmics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jacadmicsActionPerformed(evt);
            }
        });
        jPanel1.add(jacadmics);
        jacadmics.setBounds(10, 160, 130, 40);

        jnotice.setBackground(new java.awt.Color(255, 255, 255));
        jnotice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jnotice.setForeground(new java.awt.Color(102, 0, 204));
        jnotice.setText("Library");
        jnotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnoticeActionPerformed(evt);
            }
        });
        jPanel1.add(jnotice);
        jnotice.setBounds(10, 280, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\aahha\\Documents\\NetBeansProjects\\login\\src\\project images\\profile.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      //  JOptionPane.showConfirmDialog(rootPane, "ARE YOU SHURE");
        Login lg= new Login();
        lg.show();
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jfeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfeedActionPerformed
        FEED fd= new FEED(uname);
        fd.show();
        this.dispose();
        
    }//GEN-LAST:event_jfeedActionPerformed

    private void jlibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlibraryActionPerformed
        StudentNotice stdn= new StudentNotice(uname);
        stdn.show();
        this.dispose();
    }//GEN-LAST:event_jlibraryActionPerformed

    private void jacadmicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jacadmicsActionPerformed
        Acadmics acd= new Acadmics(uname);
        acd.show();
        this.dispose();
    }//GEN-LAST:event_jacadmicsActionPerformed

    private void jnoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnoticeActionPerformed
      try{
        Connect con = new Connect();
        conn= con.Connect();
        String query= "select lcard1,lcard2 from login where uname='"+uname+"'";
        st= conn.createStatement();
        rs= st.executeQuery(query);
        while (rs.next())
        {
            lcard1=rs.getString("lcard1");
            lcard2=rs.getString("lcard2");
        }
        if (lcard1.equals("") || lcard2.equals(""))
        {
            libreg lbg= new libreg(uname);
            lbg.show();
            this.dispose();
        }
        else 
        {
        Library lb= new Library(uname);
        lb.show();
        this.dispose();
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "server error");
        }
        
    }//GEN-LAST:event_jnoticeActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jacadmics;
    private javax.swing.JLabel jbranch;
    private javax.swing.JButton jfeed;
    private javax.swing.JButton jlibrary;
    private javax.swing.JLabel jname2;
    private javax.swing.JButton jnotice;
    private javax.swing.JLabel jrollno;
    private javax.swing.JLabel jshift;
    // End of variables declaration//GEN-END:variables
}
