/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunggaji;

/**
 *
 * @author user
 */
public class HitungGaj extends javax.swing.JFrame {
    
     int gajipokok;

    int gajikotor;

    int pajak;

    int gajibersih;

    int t_istri;

    int t_anak;

    int j_anak;

    String t_istri_1; 

    String t_anak_1;

    String gajikotor_1;

    String pajak_1;

    String gajibersih_1;




    /**
     * Creates new form HitungGaj
     */
    public HitungGaj() {
        initComponents();  
        
        setTitle("Aplikasi Perhitungan Gaji");
    }
    
    
    private void gaji(){

        int pilihan=cmbjabatan.getSelectedIndex();

        switch(pilihan){

            case 0:

                txtgajipokok.setText("7500000");

            break;    

            case 1:

                txtgajipokok.setText("5000000");

            break;

            case 2:

                txtgajipokok.setText("3000000");

            break;

            case 3:

                txtgajipokok.setText("2000000");

            break;

            case 4:

                txtgajipokok.setText("1200000");

            break;

            case 5:

                txtgajipokok.setText("750000");

            break;        

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtgajibersih = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        cmbjabatan = new javax.swing.JTextField();
        txtjumlahanak = new javax.swing.JTextField();
        txtgajipokok = new javax.swing.JTextField();
        txttunjanganistri = new javax.swing.JTextField();
        txttunjangananak = new javax.swing.JTextField();
        txtgajikotor = new javax.swing.JTextField();
        txtpajak = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabel1.setText("Perhitungan Gaji");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 140, 50);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel2.setText("Jumlah Anak");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 250, 110, 50);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel3.setText("NIP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 40, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 40, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel5.setText("Jabatan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 60, 40);

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel6.setText("Gaji Bersih");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 540, 130, 60);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel7.setText("Status");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 210, 60, 40);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel8.setText("Gaji Pokok ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 300, 90, 50);

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel9.setText("Tunjangan Istri ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 130, 60);

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel10.setText("Tunjangan Anak");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 390, 130, 60);

        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel11.setText("Gaji Kotor");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 440, 130, 60);

        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel12.setText("Pajak");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 490, 130, 60);
        getContentPane().add(txtgajibersih);
        txtgajibersih.setBounds(170, 560, 110, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 70, 110, 30);
        getContentPane().add(cmbjabatan);
        cmbjabatan.setBounds(160, 170, 110, 30);
        getContentPane().add(txtjumlahanak);
        txtjumlahanak.setBounds(170, 260, 110, 30);
        getContentPane().add(txtgajipokok);
        txtgajipokok.setBounds(170, 310, 110, 30);
        getContentPane().add(txttunjanganistri);
        txttunjanganistri.setBounds(170, 360, 110, 30);

        txttunjangananak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttunjangananakActionPerformed(evt);
            }
        });
        getContentPane().add(txttunjangananak);
        txttunjangananak.setBounds(170, 410, 110, 30);
        getContentPane().add(txtgajikotor);
        txtgajikotor.setBounds(170, 460, 110, 30);
        getContentPane().add(txtpajak);
        txtpajak.setBounds(170, 510, 110, 30);

        jButton1.setText("B E R S I H");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 420, 100, 40);

        jRadioButton1.setText("Menikah");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(160, 220, 80, 30);

        jRadioButton2.setText("Belum Menikah");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(260, 220, 110, 30);

        jButton2.setText("H I T U N G");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 480, 100, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 120, 110, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 500, 560);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, -40, 530, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
     

        txttunjanganistri.setEnabled(true);

        txttunjangananak.setEnabled(true);

        txtjumlahanak.setEnabled(true);

        gajipokok=Integer.valueOf(txtgajipokok.getText());

        t_istri=(20*gajipokok)/100;

        t_istri_1=String.valueOf(t_istri);

        txttunjanganistri.setText(t_istri_1);

        if(txtjumlahanak.getText()!=""||txtjumlahanak.getText()!="0"){

            j_anak=Integer.valueOf(txtjumlahanak.getText());

            if(j_anak<=2&&j_anak>=1){

                t_anak=((15*gajipokok)/100)*j_anak;

            }else if(j_anak>2){

                t_anak=((15*gajipokok)/100)*2;

            }else{

                t_anak=0;

            }

            t_anak_1=String.valueOf(t_anak);

            txttunjangananak.setText(t_anak_1);

        }       

    

        
        
        
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void txttunjangananakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttunjangananakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttunjangananakActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
        
        t_istri=0;

         t_anak=0;

         j_anak=0;

        txttunjanganistri.setText("0");

        txttunjangananak.setText("0");

        txtjumlahanak.setText("0");

        txttunjanganistri.setEnabled(false);

        txttunjangananak.setEnabled(false);

        txtjumlahanak.setEnabled(false);

    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          gajipokok=0;

         gajikotor=0;

         pajak=0;

         gajibersih=0;

         t_istri=0;

         t_anak=0;

         j_anak=0;

        txtgajipokok.setText("0");

        txttunjanganistri.setText("0");

        txtjumlahanak.setText("0");

        txttunjangananak.setText("0");

        txtgajikotor.setText("0");

        txtpajak.setText("0");

        txtgajibersih.setText("0");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
       jRadioButton2MouseClicked();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         gajipokok=Integer.valueOf(txtgajipokok.getText());

        if(opsi1.isSelected()==true){

         gajikotor=gajipokok+t_anak+t_istri;   

        }else{

            gajikotor=gajipokok;

        }

        pajak=(gajikotor*10)/100;

        gajibersih=gajikotor-pajak;

        gajikotor_1=String.valueOf(gajikotor);

        pajak_1=String.valueOf(pajak);

        gajibersih_1=String.valueOf(gajibersih);

        txtgajikotor.setText(gajikotor_1);

        txtpajak.setText(pajak_1);

        txtgajibersih.setText(gajibersih_1);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HitungGaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungGaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungGaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungGaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungGaj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cmbjabatan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtgajibersih;
    private javax.swing.JTextField txtgajikotor;
    private javax.swing.JTextField txtgajipokok;
    private javax.swing.JTextField txtjumlahanak;
    private javax.swing.JTextField txtpajak;
    private javax.swing.JTextField txttunjangananak;
    private javax.swing.JTextField txttunjanganistri;
    // End of variables declaration//GEN-END:variables
}
