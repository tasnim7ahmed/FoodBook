/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbook;

/**
 *
 * @author Tasnim Ahmed
 */
public class Give_review extends javax.swing.JPanel {

    /** Creates new form Give_review */
    public Give_review() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1210, 670));
        setPreferredSize(new java.awt.Dimension(1210, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GIVE REVIEW");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 180, 50));

        jComboBox1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAD", "MODERATE", "GOOD", "EXCELLENT" }));
        jComboBox1.setSelectedIndex(1);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, 140, -1));

        jComboBox2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAD", "MODERATE", "GOOD", "EXCELLENT" }));
        jComboBox2.setSelectedIndex(1);
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 140, -1));

        jComboBox3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAD", "MODERATE", "GOOD", "EXCELLENT" }));
        jComboBox3.setSelectedIndex(1);
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 140, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUANTITY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 130, 50));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ENVIRONMENT");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 420, 170, 50));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RESTAURANT NAME");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, 50));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TASTE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 90, 50));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FOOD NAME");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, 50));

        jTextField1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 360, 60));

        jTextField2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 360, 60));

        jButton6.setBackground(new java.awt.Color(214, 230, 59));
        jButton6.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(250, 70, 99));
        jButton6.setText("SUBMIT");
        jButton6.setBorder(null);
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 240, 60));

        jButton7.setBackground(new java.awt.Color(214, 230, 59));
        jButton7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(250, 70, 99));
        jButton7.setText("BACK");
        jButton7.setBorder(null);
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/window.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 670));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
