/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package figuras.geometricas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class figuritas extends javax.swing.JFrame {
    
    /**
     * Creates new form figuritas
     */
    public figuritas() {
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

        lblfigura = new javax.swing.JLabel();
        rectangulo = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblfigura.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        rectangulo.setText("rectangulo");
        rectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectanguloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rectanguloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rectanguloMouseExited(evt);
            }
        });
        rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloActionPerformed(evt);
            }
        });

        lblmensaje.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfigura, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rectangulo)
                                .addGap(83, 83, 83)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblfigura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rectanguloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectanguloMouseEntered
         
    }//GEN-LAST:event_rectanguloMouseEntered

    private void rectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rectanguloActionPerformed

    private void rectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectanguloMouseClicked
       double b,h,a,p;
       String baseMensaje, alturaMensaje;
       
        lblfigura.setText("Figura= Rectangulo"); 
       baseMensaje= JOptionPane.showInputDialog( "Ingresa el valor de la base: ");
       b= Double.parseDouble(baseMensaje);
       alturaMensaje=JOptionPane.showInputDialog("Ingresa el valor de la altura: ");
       h= Double.parseDouble(alturaMensaje);
       p=(2*b)+(2*h);
       a=b*h;
    }//GEN-LAST:event_rectanguloMouseClicked

    private void rectanguloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectanguloMouseExited
       
    }//GEN-LAST:event_rectanguloMouseExited

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
            java.util.logging.Logger.getLogger(figuritas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(figuritas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(figuritas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(figuritas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new figuritas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblfigura;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JButton rectangulo;
    // End of variables declaration//GEN-END:variables
}
