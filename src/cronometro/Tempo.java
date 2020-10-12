/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author javie
 */
public class Tempo extends javax.swing.JFrame {


  private Timer time;
  private Tiempo miTiempo;
    
   
    public Tempo() {
        initComponents();
        time = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                miTiempo.retrocederTiempo();
                horasLabel.setText(String.valueOf(miTiempo.getHoras()));
                minutosLabel.setText(String.valueOf(miTiempo.getMinutos()));
                segLabel.setText(String.valueOf(String.valueOf(miTiempo.getSegundos())));
                if(miTiempo.getMinutos() == 0 && miTiempo.getSegundos() == 0 && miTiempo.getHoras() == 0){
                    time.restart();
                    time.stop();
                    //sonido
                    Clip sonido;
                    try {
                        sonido = AudioSystem.getClip();
                       
                        sonido.open(AudioSystem.getAudioInputStream(this.getClass().getResource("../sonidos/alerta.wav")));
                        sonido.start();
                        while (sonido.isRunning())
                            Thread.sleep(3000);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HoraLBL = new javax.swing.JLabel();
        SHBoton = new javax.swing.JButton();
        BHBoton = new javax.swing.JButton();
        MinutoLBL = new javax.swing.JLabel();
        SMBoton = new javax.swing.JButton();
        BmBoton = new javax.swing.JButton();
        SegundoLBL = new javax.swing.JLabel();
        SSBoton = new javax.swing.JButton();
        BSBoton = new javax.swing.JButton();
        ttituloLabel = new javax.swing.JLabel();
        iniciarBoton = new javax.swing.JButton();
        tiempoLabel1 = new javax.swing.JLabel();
        minutosLabel = new javax.swing.JLabel();
        horasLabel = new javax.swing.JLabel();
        tiempoLabel4 = new javax.swing.JLabel();
        segLabel = new javax.swing.JLabel();
        pausarBoton = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        atrasBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HoraLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        HoraLBL.setText("0");

        SHBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHBotonActionPerformed(evt);
            }
        });

        BHBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBotonActionPerformed(evt);
            }
        });

        MinutoLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MinutoLBL.setText("0");

        SMBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMBotonActionPerformed(evt);
            }
        });

        BmBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmBotonActionPerformed(evt);
            }
        });

        SegundoLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SegundoLBL.setText("0");

        SSBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSBotonActionPerformed(evt);
            }
        });

        BSBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSBotonActionPerformed(evt);
            }
        });

        ttituloLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ttituloLabel.setText("Temporizador");

        iniciarBoton.setText("iniciar");
        iniciarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBotonActionPerformed(evt);
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

        segLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        segLabel.setText("00");

        pausarBoton.setText("Pausar");
        pausarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarBotonActionPerformed(evt);
            }
        });

        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        atrasBoton.setText("Atras");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasBoton)
                        .addGap(63, 63, 63)
                        .addComponent(ttituloLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BHBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SHBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoraLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BmBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SMBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinutoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BSBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SSBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SegundoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(iniciarBoton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(horasLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(minutosLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(pausarBoton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarBoton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tiempoLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(segLabel)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttituloLabel)
                    .addComponent(atrasBoton))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SMBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MinutoLBL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BmBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SHBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(HoraLBL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BHBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SSBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SegundoLBL)
                            .addComponent(iniciarBoton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BSBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pausarBoton)
                    .addComponent(cancelarBoton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SHBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHBotonActionPerformed
        
        
       int hora = Integer.parseInt(this.HoraLBL.getText());
       hora++;
       this.HoraLBL.setText(String.valueOf(hora));
       
    }//GEN-LAST:event_SHBotonActionPerformed

    private void BHBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBotonActionPerformed
        
       int hora = Integer.parseInt(this.HoraLBL.getText());
       hora--;
       if(hora>=0){
           this.HoraLBL.setText(String.valueOf(hora));
       }else{
           JOptionPane.showMessageDialog(this, "No se puede disminuir mas la hora");
        }
                 
    }//GEN-LAST:event_BHBotonActionPerformed

    private void SMBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMBotonActionPerformed
        
        
       int min = Integer.parseInt(this.MinutoLBL.getText());
       min++;
       if(min<=59){
           this.MinutoLBL.setText(String.valueOf(min));
       }else{
           JOptionPane.showMessageDialog(this, "No se puede aumentar mas los minutos");
        }
        
        
    }//GEN-LAST:event_SMBotonActionPerformed

    private void BmBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmBotonActionPerformed
        
        int min = Integer.parseInt(this.MinutoLBL.getText());
       min--;
       if(min>=0){
           this.MinutoLBL.setText(String.valueOf(min));
       }else{
           JOptionPane.showMessageDialog(this, "No se puede disminuir mas los minutos");
        }
        
        
    }//GEN-LAST:event_BmBotonActionPerformed

    private void SSBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSBotonActionPerformed
        
        int seg = Integer.parseInt(this.SegundoLBL.getText());
       seg++;
       if(seg<=59){
           this.SegundoLBL.setText(String.valueOf(seg));
       }else{
           JOptionPane.showMessageDialog(this, "No se puede aumentar mas los segundos");
        }
        
        
    }//GEN-LAST:event_SSBotonActionPerformed

    private void BSBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSBotonActionPerformed
       
       int seg = Integer.parseInt(this.SegundoLBL.getText());
       seg--;
       if(seg>=0){
           this.SegundoLBL.setText(String.valueOf(seg));
       }else{
           JOptionPane.showMessageDialog(this, "No se puede disminuir mas los segundos");
        }
        
    }//GEN-LAST:event_BSBotonActionPerformed

    private void iniciarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBotonActionPerformed
        
        miTiempo = new Tiempo(Integer.parseInt(SegundoLBL.getText()), Integer.parseInt(MinutoLBL.getText()), Integer.parseInt(HoraLBL.getText()));
        time.start();
        
    }//GEN-LAST:event_iniciarBotonActionPerformed

    private void pausarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarBotonActionPerformed
       
       if(time.isRunning()){
           time.stop();
           pausarBoton.setText("Reanudar");
       }else{
           time.start();
           pausarBoton.setText("Pausar");
       }

        
    }//GEN-LAST:event_pausarBotonActionPerformed

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        
        horasLabel.setText("0");
        minutosLabel.setText("0");
        segLabel.setText("0");
        time.restart();
        time.stop();
    }//GEN-LAST:event_cancelarBotonActionPerformed

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
       
         Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_atrasBotonActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHBoton;
    private javax.swing.JButton BSBoton;
    private javax.swing.JButton BmBoton;
    private javax.swing.JLabel HoraLBL;
    private javax.swing.JLabel MinutoLBL;
    private javax.swing.JButton SHBoton;
    private javax.swing.JButton SMBoton;
    private javax.swing.JButton SSBoton;
    private javax.swing.JLabel SegundoLBL;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel horasLabel;
    private javax.swing.JButton iniciarBoton;
    private javax.swing.JLabel minutosLabel;
    private javax.swing.JButton pausarBoton;
    private javax.swing.JLabel segLabel;
    private javax.swing.JLabel tiempoLabel1;
    private javax.swing.JLabel tiempoLabel4;
    private javax.swing.JLabel ttituloLabel;
    // End of variables declaration//GEN-END:variables
}
