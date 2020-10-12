/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.Timer;

/**
 *
 * @author javie
 */
public class Crono extends javax.swing.JFrame {

    private Tiempo miTiempo;
    private Timer time;
    private DefaultListModel miModelo;

    public Crono() {
        initComponents();
        this.miTiempo = new Tiempo();
        time = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                miTiempo.avanzarTiempo();
                horasLabel.setText(String.valueOf(miTiempo.getHoras()));
                minutosLabel.setText(String.valueOf(miTiempo.getMinutos()));
                segLabel.setText(String.valueOf(String.valueOf(miTiempo.getSegundos())));
            }
        });
        miModelo = new DefaultListModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        iniciarBoton = new javax.swing.JButton();
        pausarBoton = new javax.swing.JButton();
        marcaBoton = new javax.swing.JButton();
        segLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        atrasBoton = new javax.swing.JButton();
        tiempoLabel1 = new javax.swing.JLabel();
        minutosLabel = new javax.swing.JLabel();
        horasLabel = new javax.swing.JLabel();
        tiempoLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        marcaLista = new javax.swing.JList<>();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciarBoton.setText("Iniciar");
        iniciarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBotonActionPerformed(evt);
            }
        });

        pausarBoton.setText("Pausar");
        pausarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarBotonActionPerformed(evt);
            }
        });

        marcaBoton.setText("Marca");
        marcaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaBotonActionPerformed(evt);
            }
        });

        segLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        segLabel.setText("00");

        tituloLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tituloLabel.setText("Cronometro");

        atrasBoton.setText("Atras");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        tiempoLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        tiempoLabel1.setText(":");

        minutosLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        minutosLabel.setText("00");

        horasLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        horasLabel.setText("00");

        tiempoLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        tiempoLabel4.setText(":");

        jScrollPane2.setViewportView(marcaLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atrasBoton)
                        .addGap(102, 102, 102)
                        .addComponent(tituloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(horasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempoLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(minutosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempoLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(segLabel)
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pausarBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marcaBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciarBoton))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(iniciarBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pausarBoton))
                            .addComponent(tituloLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(segLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(horasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tiempoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tiempoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marcaBoton))
                    .addComponent(atrasBoton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBotonActionPerformed

        time.start();

    }//GEN-LAST:event_iniciarBotonActionPerformed

    private void pausarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarBotonActionPerformed
        
        time.stop();
        
    }//GEN-LAST:event_pausarBotonActionPerformed

    private void marcaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaBotonActionPerformed
        
        String nuevaMarca = String.valueOf(this.miTiempo.getHoras()) + " : " +  String.valueOf(this.miTiempo.getMinutos()) + " : " + String.valueOf(this.miTiempo.getSegundos());
        miModelo.addElement(nuevaMarca);
        this.marcaLista.setModel(miModelo);
        
    }//GEN-LAST:event_marcaBotonActionPerformed

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
        
        
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_atrasBotonActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasBoton;
    private javax.swing.JLabel horasLabel;
    private javax.swing.JButton iniciarBoton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton marcaBoton;
    private javax.swing.JList<String> marcaLista;
    private javax.swing.JLabel minutosLabel;
    private javax.swing.JButton pausarBoton;
    private javax.swing.JLabel segLabel;
    private javax.swing.JLabel tiempoLabel1;
    private javax.swing.JLabel tiempoLabel4;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
