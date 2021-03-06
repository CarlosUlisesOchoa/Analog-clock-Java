/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reloj;

import java.awt.Color;
import java.io.File;
import java.util.Calendar;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import shane.Utils;
import shane.Dialogs;

/**
 *
 * @author alexi
 */
public class Principal extends javax.swing.JFrame {

    public static String version = "Reloj & Alarma v 1.11";
    
    public static int hora, minutos, segundos, ampm;
    
    public static int hora_Alarma, minuto_Alarma, ampm_Alarma;
    
    public static int diametro;
    
    public static boolean alarm = false, alarm_RingStatus = false;
    
    public static Alarm my_Alarm;
    
    public static Thread thread_Alarm;
    
    public static Calendar Calendario;
    
    public static AudioInputStream audioInputStream;
    
    public static Clip clip;
    
    public Principal() {
        initComponents();
        lbl_Alarm.setVisible(false);
        
        this.setTitle(version);
        
        Calendario = Calendar.getInstance();
        
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File("src\\reloj\\Alarm.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (Exception e) {
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Clock = new reloj.Code();
        jLabel2 = new javax.swing.JLabel();
        panel_SetTime = new javax.swing.JPanel();
        txtbox_Hour_SetTime = new javax.swing.JTextField();
        txtbox_Minutes_SetTime = new javax.swing.JTextField();
        lbl_Dots_SetTime = new javax.swing.JLabel();
        comboBox_AMPM = new javax.swing.JComboBox();
        btn_ChangeTime = new javax.swing.JButton();
        checkBox_ManualHour = new javax.swing.JCheckBox();
        panel_SetAlarm = new javax.swing.JPanel();
        txtbox_Hour_Alarm = new javax.swing.JTextField();
        txtb_Minutes_Alarm = new javax.swing.JTextField();
        lbl_Dots_SetAlarm = new javax.swing.JLabel();
        btn_SetAlarm = new javax.swing.JButton();
        comboBox_AMPM_Alarm = new javax.swing.JComboBox();
        lbl_AlarmStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_DigitalHour = new javax.swing.JLabel();
        lbl_DigitalAMPM = new javax.swing.JLabel();
        lbl_Alarm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_AcercaDe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reloj & Alarma v ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_Clock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clock_structure.png"))); // NOI18N

        javax.swing.GroupLayout panel_ClockLayout = new javax.swing.GroupLayout(panel_Clock);
        panel_Clock.setLayout(panel_ClockLayout);
        panel_ClockLayout.setHorizontalGroup(
            panel_ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ClockLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );
        panel_ClockLayout.setVerticalGroup(
            panel_ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClockLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_SetTime.setBackground(java.awt.SystemColor.controlHighlight);
        panel_SetTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtbox_Hour_SetTime.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtbox_Hour_SetTime.setEnabled(false);

        txtbox_Minutes_SetTime.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtbox_Minutes_SetTime.setEnabled(false);

        lbl_Dots_SetTime.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Dots_SetTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Dots_SetTime.setText(":");

        comboBox_AMPM.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBox_AMPM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PM", "AM" }));
        comboBox_AMPM.setEnabled(false);

        btn_ChangeTime.setText("Cambiar hora");
        btn_ChangeTime.setEnabled(false);
        btn_ChangeTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeTimeActionPerformed(evt);
            }
        });

        checkBox_ManualHour.setText("Fijar hora manualmente");
        checkBox_ManualHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_ManualHourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_SetTimeLayout = new javax.swing.GroupLayout(panel_SetTime);
        panel_SetTime.setLayout(panel_SetTimeLayout);
        panel_SetTimeLayout.setHorizontalGroup(
            panel_SetTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SetTimeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtbox_Hour_SetTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Dots_SetTime, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbox_Minutes_SetTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBox_AMPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(panel_SetTimeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel_SetTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SetTimeLayout.createSequentialGroup()
                        .addComponent(checkBox_ManualHour)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_ChangeTime, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_SetTimeLayout.setVerticalGroup(
            panel_SetTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SetTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBox_ManualHour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panel_SetTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbox_Hour_SetTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbox_Minutes_SetTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dots_SetTime)
                    .addComponent(comboBox_AMPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_ChangeTime)
                .addContainerGap())
        );

        panel_SetAlarm.setBackground(java.awt.SystemColor.controlHighlight);
        panel_SetAlarm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtbox_Hour_Alarm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        txtb_Minutes_Alarm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        lbl_Dots_SetAlarm.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Dots_SetAlarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Dots_SetAlarm.setText(":");

        btn_SetAlarm.setText("Establecer una alarma");
        btn_SetAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SetAlarmActionPerformed(evt);
            }
        });

        comboBox_AMPM_Alarm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        comboBox_AMPM_Alarm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PM", "AM" }));

        lbl_AlarmStatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_AlarmStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AlarmStatus.setText("Aun no se ha fijado una alarma");

        javax.swing.GroupLayout panel_SetAlarmLayout = new javax.swing.GroupLayout(panel_SetAlarm);
        panel_SetAlarm.setLayout(panel_SetAlarmLayout);
        panel_SetAlarmLayout.setHorizontalGroup(
            panel_SetAlarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SetAlarmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtbox_Hour_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Dots_SetAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtb_Minutes_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBox_AMPM_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(panel_SetAlarmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_SetAlarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SetAlarm, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(lbl_AlarmStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_SetAlarmLayout.setVerticalGroup(
            panel_SetAlarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SetAlarmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_AlarmStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panel_SetAlarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_AMPM_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Dots_SetAlarm)
                    .addComponent(txtbox_Hour_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb_Minutes_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btn_SetAlarm)
                .addGap(8, 8, 8))
        );

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(java.awt.SystemColor.controlShadow);

        lbl_DigitalHour.setBackground(java.awt.SystemColor.controlHighlight);
        lbl_DigitalHour.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_DigitalHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DigitalHour.setText("12:59:59");

        lbl_DigitalAMPM.setBackground(java.awt.SystemColor.controlHighlight);
        lbl_DigitalAMPM.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_DigitalAMPM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DigitalAMPM.setText("PM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_DigitalHour, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbl_DigitalAMPM)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DigitalHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_DigitalAMPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbl_Alarm.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_Alarm.setForeground(new java.awt.Color(255, 51, 51));
        lbl_Alarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Alarm.setText("¡¡ ALARMA !!");
        lbl_Alarm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Alarm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AlarmMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_shane.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Todos los derechos reservados ® copyright 2018 - www.carlosulises.ml");

        lbl_AcercaDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lbl_AcercaDe.setForeground(new java.awt.Color(0, 153, 255));
        lbl_AcercaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AcercaDe.setText("Acerca de");
        lbl_AcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_AcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AcercaDeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_Clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Alarm)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel_SetTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel_SetAlarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_AcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_Clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_AcercaDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_SetTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_SetAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_Alarm, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SetAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SetAlarmActionPerformed
        
        Integer hour, minutes, ampm;

        hour = Utils.Integer_tryParse(txtbox_Hour_Alarm.getText());
        minutes = Utils.Integer_tryParse(txtb_Minutes_Alarm.getText());
        ampm = null;

        switch (comboBox_AMPM.getSelectedIndex()) {
            case 0: {
                ampm = Calendario.PM;
                break;
            }
            case 1:
                ampm = Calendario.AM;
                break;
        }

        if (hour != null && minutes != null) {
            if ((hour >= 1 && hour <= 12) && (minutes >= 0 && minutes <= 60)) {
                
                // Aqui se establece la alarma
                
                hora_Alarma = hour;
                minuto_Alarma = minutes;
                ampm_Alarma = ampm;
                
                alarm = true;
                
                lbl_AlarmStatus.setText("La alarma sonará a las: " + hora_Alarma + ":" + minuto_Alarma + " " + (ampm == Calendar.PM ? "PM" : "AM") );
                lbl_AlarmStatus.setForeground(new Color(232,142,0));
                
            } else {
                Dialogs.ErrorMsg("El horario que intentas poner no es válido");
            }
        } else {
            Dialogs.ErrorMsg("Únicamente se pueden ingresar números en los campos.");
        }
        
    }//GEN-LAST:event_btn_SetAlarmActionPerformed

    private void checkBox_ManualHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_ManualHourActionPerformed
        // TODO add your handling code here:
        boolean checked = checkBox_ManualHour.isSelected();
        txtbox_Hour_SetTime.setEnabled(checked);
        txtbox_Minutes_SetTime.setEnabled(checked);
        comboBox_AMPM.setEnabled(checked);
        
        btn_ChangeTime.setEnabled(checked);
        
        if(!checked)
        {
            Calendario = Calendar.getInstance();
            hora = Calendario.get(Calendar.HOUR);
            minutos = Calendario.get(Calendar.MINUTE);
            segundos = Calendario.get(Calendar.SECOND);
           
        }

    }//GEN-LAST:event_checkBox_ManualHourActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        RefreshTime rt = new RefreshTime();
        Thread hilo_Time = new Thread(rt);
        hilo_Time.start();
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_ChangeTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChangeTimeActionPerformed
        // TODO add your handling code here:
        
        Integer hour, minutes, ampm;
        
        hour = Utils.Integer_tryParse(txtbox_Hour_SetTime.getText());
        minutes = Utils.Integer_tryParse(txtbox_Minutes_SetTime.getText());
        ampm = null;
        
        switch (comboBox_AMPM.getSelectedIndex()) {
            case 0: {
                ampm = Calendario.PM;
                break;
            }
            case 1:
                ampm = Calendario.AM;
                break;
        }
        
        if(hour != null && minutes != null) {
            if( (hour >= 1 && hour <= 12) && (minutes >= 0 && minutes <= 60) ) {
                Calendario.set(Calendar.HOUR, hour);
                Calendario.set(Calendar.MINUTE, minutes);
                Calendario.set(Calendar.SECOND, 0);
                Calendario.set(Calendar.AM_PM, ampm);
            } else {
                Dialogs.ErrorMsg("El horario que intentas poner no es válido");
            }
        } else {
            Dialogs.ErrorMsg("Únicamente se pueden ingresar números en los campos.");
        }
    }//GEN-LAST:event_btn_ChangeTimeActionPerformed

    private void lbl_AlarmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AlarmMouseClicked
        // TODO add your handling code here:
        StopAlarm();
    }//GEN-LAST:event_lbl_AlarmMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        AcercaDe vAcerca = new AcercaDe();
        vAcerca.setVisible(true);
        vAcerca.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lbl_AcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AcercaDeMouseClicked
        // TODO add your handling code here:
        AcercaDe vAcerca = new AcercaDe();
        vAcerca.setVisible(true);
        vAcerca.setLocationRelativeTo(null);
    }//GEN-LAST:event_lbl_AcercaDeMouseClicked

    public static void StartAlarm()
    {
        my_Alarm = new Alarm();
        thread_Alarm = new Thread(my_Alarm);
        thread_Alarm.start();
        
        alarmSound(true);
        alarm_RingStatus = true;
    }
    
    public static void StopAlarm()
    {
        my_Alarm.selfStop();
        thread_Alarm.interrupt();
        lbl_AlarmStatus.setText("Aun no se ha fijado una alarma");
        lbl_AlarmStatus.setForeground(Color.black);
        alarm = false;
        alarm_RingStatus = false;
        alarmSound(false);
    }
    
    public static void alarmSound(boolean status) {
    try {
        if(status == true) {
            audioInputStream = AudioSystem.getAudioInputStream(new File("src\\reloj\\Alarm.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } else {
            clip.stop();
        }
        
    } catch(Exception ex) {
        Dialogs.ExceptionMsg(ex);
    }
}
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChangeTime;
    private javax.swing.JButton btn_SetAlarm;
    public static javax.swing.JCheckBox checkBox_ManualHour;
    private javax.swing.JComboBox comboBox_AMPM;
    private javax.swing.JComboBox comboBox_AMPM_Alarm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_AcercaDe;
    public static javax.swing.JLabel lbl_Alarm;
    public static javax.swing.JLabel lbl_AlarmStatus;
    public static javax.swing.JLabel lbl_DigitalAMPM;
    public static javax.swing.JLabel lbl_DigitalHour;
    private javax.swing.JLabel lbl_Dots_SetAlarm;
    private javax.swing.JLabel lbl_Dots_SetTime;
    private javax.swing.JPanel panel_Clock;
    private javax.swing.JPanel panel_SetAlarm;
    private javax.swing.JPanel panel_SetTime;
    public static javax.swing.JTextField txtb_Minutes_Alarm;
    public static javax.swing.JTextField txtbox_Hour_Alarm;
    public static javax.swing.JTextField txtbox_Hour_SetTime;
    public static javax.swing.JTextField txtbox_Minutes_SetTime;
    // End of variables declaration//GEN-END:variables

}
