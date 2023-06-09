/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.senac.projetointegrador;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import javax.swing.JDialog;

/**
 *
 * @author Aluno TDS
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jButton3 = new javax.swing.JButton();
        JBDireitos = new javax.swing.JButton();
        JB16yrs = new javax.swing.JButton();
        JB1Impostos = new javax.swing.JButton();
        JTPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(238, 388));
        setResizable(false);

        JBDireitos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        JBDireitos.setText("Direitos");
        JBDireitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDireitosActionPerformed(evt);
            }
        });

        JB16yrs.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        JB16yrs.setText("Fiz 16... e agora?");
        JB16yrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB16yrsActionPerformed(evt);
            }
        });

        JB1Impostos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        JB1Impostos.setText("Impostos");
        JB1Impostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1ImpostosActionPerformed(evt);
            }
        });

        JTPesquisa.setToolTipText("");
        JTPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setText("AWARE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBDireitos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB1Impostos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB16yrs, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBDireitos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB1Impostos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JB16yrs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB1ImpostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB1ImpostosActionPerformed
          JDialog Idialog = new JDImpostos (this, true);
          Idialog.setVisible(true);
    }//GEN-LAST:event_JB1ImpostosActionPerformed

    private void JBDireitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDireitosActionPerformed
        JDialog Ddialog = new JDialogDireitos(this,true);
        Ddialog.setVisible(true);
    }//GEN-LAST:event_JBDireitosActionPerformed

    private void JB16yrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB16yrsActionPerformed
        JDialog Ydialog = new JD16yr(this, true);
        Ydialog.setVisible(true);
    }//GEN-LAST:event_JB16yrsActionPerformed

    private void JTPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTPesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
                FlatDarkPurpleIJTheme.setup(); // Dark Purple

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB16yrs;
    private javax.swing.JButton JB1Impostos;
    private javax.swing.JButton JBDireitos;
    private javax.swing.JTextField JTPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
