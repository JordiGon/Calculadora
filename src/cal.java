/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class cal extends javax.swing.JFrame {

    private boolean punto=true;//para boton punto
    String valor1,valor2, signo, contenido;
    Double resultado;
    /**
     * Creates new form cal
     */
    public cal() {
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

        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        punto0 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });
        getContentPane().add(numero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 73, 47));

        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });
        getContentPane().add(numero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 73, 47));

        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });
        getContentPane().add(numero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 73, 47));

        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });
        getContentPane().add(numero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 73, 47));

        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });
        getContentPane().add(numero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 73, 47));

        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });
        getContentPane().add(numero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 73, 47));

        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        getContentPane().add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 73, 47));

        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        getContentPane().add(numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 73, 44));

        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });
        getContentPane().add(numero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 73, 47));

        numero0.setText("0");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });
        getContentPane().add(numero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 73, 47));

        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 73, 31));

        jButton12.setText("÷");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 79, 47));

        jButton13.setText("x");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 79, 47));

        jButton14.setText("-");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 79, 47));

        jButton15.setText("+");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 79, 47));

        jButton16.setText("=");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 80, 47));

        punto0.setText(".");
        punto0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punto0ActionPerformed(evt);
            }
        });
        getContentPane().add(punto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 72, 47));

        jButton18.setText("<---");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, 31));

        jButton19.setText("√");
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 47));

        jButton20.setText("x^2");
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 47));

        jButton21.setText("x^3");
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 47));

        jButton22.setText("1/x");
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 47));

        jButton23.setText("%");
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 47));

        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 387, 63));

        jButton1.setText("+/-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, 50));

        jButton2.setText("x^y");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
    pantalla.setText(pantalla.getText()+"5");
// TODO add your handling code here:
    }//GEN-LAST:event_numero5ActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pantallaActionPerformed

    private void punto0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punto0ActionPerformed
        // TODO add your handling code here:
       contenido=pantalla.getText();
       if(contenido.length()<=0)
       {
       pantalla.setText("0.");
       }else
        if(pantalla.getText().contains("."))
        {
        }else{
            pantalla.setText(pantalla.getText()+".");
            punto=false;
        }
       
    }//GEN-LAST:event_punto0ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
       pantalla.setText(pantalla.getText()+"0");
        // TODO add your handling code here:
    }//GEN-LAST:event_numero0ActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
    pantalla.setText(pantalla.getText()+"1");
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
    pantalla.setText(pantalla.getText()+"2");    
// TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
    pantalla.setText(pantalla.getText()+"3");
// TODO add your handling code here:
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
     pantalla.setText(pantalla.getText()+"4");
        // TODO add your handling code here:
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        pantalla.setText(pantalla.getText()+"6");
// TODO add your handling code here:
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
       pantalla.setText(pantalla.getText()+"7");
        // TODO add your handling code here:
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
       pantalla.setText(pantalla.getText()+"8");
        // TODO add your handling code here:
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        pantalla.setText(pantalla.getText()+"9");
// TODO add your handling code here:
    }//GEN-LAST:event_numero9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    pantalla.setText("");    
// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        contenido=pantalla.getText();
        if(contenido.length()>0)
        {
        resultado=(-1)*Double.parseDouble(contenido);
        pantalla.setText(resultado.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
   public static String operaciones(String valor1, String valor2, String signo)
   {
     Double resultadoc=0.0;
     String respuesta;
     
     if(signo.equals("+")){
     resultadoc=Double.parseDouble(valor1)+Double.parseDouble(valor2);    
     }else
     if(signo.equals("-")){
     resultadoc=Double.parseDouble(valor1)-Double.parseDouble(valor2);     
     }else
     if(signo.equals("*")){
     resultadoc=Double.parseDouble(valor1)*Double.parseDouble(valor2);        
     }else
     if(signo.equals("/")){
     resultadoc=Double.parseDouble(valor1)/Double.parseDouble(valor2);        
     }else
     if(signo.equals("x^y"))
     {
     resultadoc=Math.pow(Double.parseDouble(valor1), Double.parseDouble(valor2));        
     }
     respuesta=resultadoc.toString();
     return respuesta;
   }
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
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton punto0;
    // End of variables declaration//GEN-END:variables
}
