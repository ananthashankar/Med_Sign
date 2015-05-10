/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.DB4OUtil;
import Business.Patient;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class PatientWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkArea
     */private JPanel upc;
       private Patient p;
       private Business b;
       private DB4OUtil dbo4;
    public PatientWorkArea(JPanel upc, Business b, DB4OUtil dbo4) {
        initComponents();
        this.upc=upc;
        this.b = b;
        this.dbo4 = dbo4;
        p = new Patient();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availableAppointmentJBtn = new javax.swing.JButton();
        cancelAptJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        availableAppointmentJBtn.setText("View Available Appointments");
        availableAppointmentJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableAppointmentJBtnActionPerformed(evt);
            }
        });

        cancelAptJBtn.setText("Cancel Appointment");
        cancelAptJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAptJBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(availableAppointmentJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelAptJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(availableAppointmentJBtn)
                .addGap(49, 49, 49)
                .addComponent(cancelAptJBtn)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void availableAppointmentJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableAppointmentJBtnActionPerformed
        // TODO add your handling code here:
        ViewAvailableAppointmentJPanel vaa = new ViewAvailableAppointmentJPanel(upc, p, b, dbo4);
        upc.add("Available Appointments",vaa);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_availableAppointmentJBtnActionPerformed

    private void cancelAptJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAptJBtnActionPerformed
        // TODO add your handling code here:
        CancelAppointmentJPanel cap = new CancelAppointmentJPanel(upc, b, dbo4);
        upc.add("Cancel Appointment", cap);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_cancelAptJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton availableAppointmentJBtn;
    private javax.swing.JButton cancelAptJBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
