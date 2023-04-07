/**
 *
 * @author Fabricio
 */
public class GerenciamentoAmbientes extends javax.swing.JFrame {
    Arduino conn = new Arduino();

    /**
     * Creates new form TelaCasa
     */
    public GerenciamentoAmbientes() {
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

        jButtonVoltar = new javax.swing.JButton();
        jBVarandaOn = new javax.swing.JButton();
        jBVarandaOff = new javax.swing.JButton();
        jBQuartoOff = new javax.swing.JButton();
        jBQuartoOn = new javax.swing.JButton();
        jBCozinhaOn = new javax.swing.JButton();
        jBCozinhaOff = new javax.swing.JButton();
        jBSalaOff = new javax.swing.JButton();
        jBSalaJantarOn = new javax.swing.JButton();
        jBSalaJantarOff = new javax.swing.JButton();
        jBSalaOn = new javax.swing.JButton();
        jBVaranda2Off = new javax.swing.JButton();
        jBVaranda2On = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Casa = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento De Ambientes");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(600, 10, 90, 40);

        jBVarandaOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBVarandaOn.setText("Ligar");
        jBVarandaOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVarandaOnMouseClicked(evt);
            }
        });
        getContentPane().add(jBVarandaOn);
        jBVarandaOn.setBounds(120, 110, 90, 50);

        jBVarandaOff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBVarandaOff.setText("Desligar");
        jBVarandaOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVarandaOffMouseClicked(evt);
            }
        });
        getContentPane().add(jBVarandaOff);
        jBVarandaOff.setBounds(220, 110, 90, 50);

        jBQuartoOff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBQuartoOff.setText("Desligar");
        jBQuartoOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBQuartoOffMouseClicked(evt);
            }
        });
        getContentPane().add(jBQuartoOff);
        jBQuartoOff.setBounds(220, 190, 90, 50);

        jBQuartoOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBQuartoOn.setText("Ligar");
        jBQuartoOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBQuartoOnMouseClicked(evt);
            }
        });
        getContentPane().add(jBQuartoOn);
        jBQuartoOn.setBounds(120, 190, 90, 50);

        jBCozinhaOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBCozinhaOn.setText("Ligar");
        jBCozinhaOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCozinhaOnMouseClicked(evt);
            }
        });
        getContentPane().add(jBCozinhaOn);
        jBCozinhaOn.setBounds(470, 270, 90, 50);

        jBCozinhaOff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBCozinhaOff.setText("Desligar");
        jBCozinhaOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCozinhaOffMouseClicked(evt);
            }
        });
        getContentPane().add(jBCozinhaOff);
        jBCozinhaOff.setBounds(570, 270, 90, 50);

        jBSalaOff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSalaOff.setText("Desligar");
        jBSalaOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalaOffMouseClicked(evt);
            }
        });
        getContentPane().add(jBSalaOff);
        jBSalaOff.setBounds(220, 270, 90, 50);

        jBSalaJantarOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSalaJantarOn.setText("Ligar");
        jBSalaJantarOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalaJantarOnMouseClicked(evt);
            }
        });
        getContentPane().add(jBSalaJantarOn);
        jBSalaJantarOn.setBounds(470, 190, 90, 50);

        jBSalaJantarOff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSalaJantarOff.setText("Desligar");
        jBSalaJantarOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalaJantarOffMouseClicked(evt);
            }
        });
        getContentPane().add(jBSalaJantarOff);
        jBSalaJantarOff.setBounds(570, 190, 90, 50);

        jBSalaOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSalaOn.setText("Ligar");
        jBSalaOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalaOnMouseClicked(evt);
            }
        });
        getContentPane().add(jBSalaOn);
        jBSalaOn.setBounds(120, 270, 90, 50);

        jBVaranda2Off.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBVaranda2Off.setText("Desligar");
        jBVaranda2Off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVaranda2OffMouseClicked(evt);
            }
        });
        getContentPane().add(jBVaranda2Off);
        jBVaranda2Off.setBounds(570, 110, 90, 50);

        jBVaranda2On.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBVaranda2On.setText("Ligar");
        jBVaranda2On.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVaranda2OnMouseClicked(evt);
            }
        });
        jBVaranda2On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVaranda2OnActionPerformed(evt);
            }
        });
        getContentPane().add(jBVaranda2On);
        jBVaranda2On.setBounds(470, 110, 90, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iluminação Dos Ambientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 250, 22);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quarto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 200, 100, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sala");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 280, 100, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sala Jantar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 200, 100, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cozinha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 280, 90, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Varanda");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 120, 80, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Varanda 2");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 120, 100, 30);

        Casa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Casa2.png"))); // NOI18N
        getContentPane().add(Casa);
        Casa.setBounds(-70, 60, 1000, 580);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EUiYD-lWoAAF9mO.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 720, 420);

        setSize(new java.awt.Dimension(718, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
                    new TelaPrincipal().show();   
                    dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jBVarandaOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVarandaOnMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoVaranda(jBVarandaOn);
    }//GEN-LAST:event_jBVarandaOnMouseClicked

    private void jBVarandaOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVarandaOffMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoVaranda(jBVarandaOff);
    }//GEN-LAST:event_jBVarandaOffMouseClicked

    private void jBQuartoOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBQuartoOffMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoQuarto(jBQuartoOff);
    }//GEN-LAST:event_jBQuartoOffMouseClicked

    private void jBQuartoOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBQuartoOnMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoQuarto(jBQuartoOn);
    }//GEN-LAST:event_jBQuartoOnMouseClicked

    private void jBCozinhaOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCozinhaOnMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoCozinha(jBCozinhaOn);
    }//GEN-LAST:event_jBCozinhaOnMouseClicked

    private void jBCozinhaOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCozinhaOffMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoCozinha(jBCozinhaOff);
    }//GEN-LAST:event_jBCozinhaOffMouseClicked

    private void jBSalaOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalaOffMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoSala(jBSalaOff);
    }//GEN-LAST:event_jBSalaOffMouseClicked

    private void jBSalaJantarOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalaJantarOnMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoSalaJantar(jBSalaJantarOn);
    }//GEN-LAST:event_jBSalaJantarOnMouseClicked

    private void jBSalaJantarOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalaJantarOffMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoSalaJantar(jBSalaJantarOff);
    }//GEN-LAST:event_jBSalaJantarOffMouseClicked

    private void jBSalaOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalaOnMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoSala(jBSalaOn);
    }//GEN-LAST:event_jBSalaOnMouseClicked

    private void jBVaranda2OffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVaranda2OffMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoVaranda2(jBVaranda2Off);
    }//GEN-LAST:event_jBVaranda2OffMouseClicked

    private void jBVaranda2OnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVaranda2OnMouseClicked
        // TODO add your handling code here:
        conn.comunicacaoArduinoVaranda2(jBVaranda2On);
    }//GEN-LAST:event_jBVaranda2OnMouseClicked

    private void jBVaranda2OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVaranda2OnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVaranda2OnActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciamentoAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoAmbientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Casa;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jBCozinhaOff;
    private javax.swing.JButton jBCozinhaOn;
    private javax.swing.JButton jBQuartoOff;
    private javax.swing.JButton jBQuartoOn;
    private javax.swing.JButton jBSalaJantarOff;
    private javax.swing.JButton jBSalaJantarOn;
    private javax.swing.JButton jBSalaOff;
    private javax.swing.JButton jBSalaOn;
    private javax.swing.JButton jBVaranda2Off;
    private javax.swing.JButton jBVaranda2On;
    private javax.swing.JButton jBVarandaOff;
    private javax.swing.JButton jBVarandaOn;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
