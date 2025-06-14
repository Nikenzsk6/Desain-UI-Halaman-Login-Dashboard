/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package alumni_202457201057;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PanelJurusan extends javax.swing.JPanel {

    /**
     * Creates new form PanelJurusan
     */
    public PanelJurusan() {
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

        panel_jurusan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_KodeJurusan = new javax.swing.JTextField();
        t_NamaJurusan = new javax.swing.JTextField();
        b_Tambah = new javax.swing.JButton();
        b_Ubah = new javax.swing.JButton();
        b_Hapus = new javax.swing.JButton();
        b_Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_jurusan = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(952, 735));

        panel_jurusan.setBackground(new java.awt.Color(204, 204, 204));
        panel_jurusan.setPreferredSize(new java.awt.Dimension(1100, 735));

        jPanel2.setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel1.setText("Data Jurusan");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Kode Jurusan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nama Jurusan");

        b_Tambah.setBackground(new java.awt.Color(102, 255, 102));
        b_Tambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_Tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Plus.png"))); // NOI18N
        b_Tambah.setText("Tambah");
        b_Tambah.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TambahActionPerformed(evt);
            }
        });

        b_Ubah.setBackground(new java.awt.Color(255, 153, 51));
        b_Ubah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Edit.png"))); // NOI18N
        b_Ubah.setText("Ubah");
        b_Ubah.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UbahActionPerformed(evt);
            }
        });

        b_Hapus.setBackground(new java.awt.Color(255, 51, 51));
        b_Hapus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b_Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Trash.png"))); // NOI18N
        b_Hapus.setText("Hapus");
        b_Hapus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_HapusActionPerformed(evt);
            }
        });

        b_Reset.setBackground(new java.awt.Color(51, 153, 255));
        b_Reset.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        b_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Restart.png"))); // NOI18N
        b_Reset.setText("Reset");
        b_Reset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ResetActionPerformed(evt);
            }
        });

        table_jurusan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Jurusan", "Nama Jurusan"
            }
        ));
        table_jurusan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_jurusanAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table_jurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_jurusanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_jurusan);

        javax.swing.GroupLayout panel_jurusanLayout = new javax.swing.GroupLayout(panel_jurusan);
        panel_jurusan.setLayout(panel_jurusanLayout);
        panel_jurusanLayout.setHorizontalGroup(
            panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_jurusanLayout.createSequentialGroup()
                .addGroup(panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_jurusanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_jurusanLayout.createSequentialGroup()
                                .addComponent(t_KodeJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(t_NamaJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_jurusanLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(184, 184, 184)
                                .addComponent(jLabel4))
                            .addGroup(panel_jurusanLayout.createSequentialGroup()
                                .addComponent(b_Tambah)
                                .addGap(18, 18, 18)
                                .addComponent(b_Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_Hapus)
                                .addGap(18, 18, 18)
                                .addComponent(b_Reset))))
                    .addGroup(panel_jurusanLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel_jurusanLayout.setVerticalGroup(
            panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jurusanLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_KodeJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_NamaJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_jurusanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Tambah)
                    .addComponent(b_Ubah)
                    .addComponent(b_Hapus)
                    .addComponent(b_Reset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_jurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ResetActionPerformed
        // TODO add your handling code here:
        t_KodeJurusan.setText("");
        t_NamaJurusan.setText("");
    }//GEN-LAST:event_b_ResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panel_jurusan.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TambahActionPerformed
        // TODO add your handling code here:
        String kode = t_KodeJurusan.getText().trim();
        String nama = t_NamaJurusan.getText().trim();
        
        if (!kode.isEmpty()&&!nama.isEmpty()){
           DefaultTableModel model= (DefaultTableModel) table_jurusan.getModel();
           model.addRow(new Object[]{kode,nama});
           
           //Kosongkan textField setelah tambah
           t_KodeJurusan.setText("");
           t_NamaJurusan.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Lengkapi semua data terlebih dahulu!");
        }
    }//GEN-LAST:event_b_TambahActionPerformed

    private void table_jurusanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_jurusanAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_table_jurusanAncestorAdded

    private void table_jurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_jurusanMouseClicked
        // TODO add your handling code here:
        int baris = table_jurusan.getSelectedRow();
        
        //ambil nilai dari kolom
        String kode = table_jurusan.getValueAt(baris, 0).toString();
        String nama = table_jurusan.getValueAt(baris, 1).toString();
        
        //isi ke tekxtField
        t_KodeJurusan.setText(kode);
        t_NamaJurusan.setText(nama);
        
        b_Ubah.setEnabled(true);//aktifkan button Ubah
        
    }//GEN-LAST:event_table_jurusanMouseClicked

    private void b_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UbahActionPerformed
        // TODO add your handling code here:
         int baris = table_jurusan.getSelectedRow(); // ambil baris yang sedang dipilih

        if (baris >= 0) {
        String kode = t_KodeJurusan.getText().trim();
        String nama = t_NamaJurusan.getText().trim();

        if (!kode.isEmpty() && !nama.isEmpty()) {
            // Update isi tabel
            table_jurusan.setValueAt(kode, baris, 0); // kolom Kode Jurusan
            table_jurusan.setValueAt(nama, baris, 1); // kolom Nama Jurusan

            // Kosongkan TextField
            t_KodeJurusan.setText("");
            t_NamaJurusan.setText("");

            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
        } else {
            JOptionPane.showMessageDialog(null, "Lengkapi data terlebih dahulu!");
        }
        } else {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin diubah!");
        }

    }//GEN-LAST:event_b_UbahActionPerformed

    private void b_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_HapusActionPerformed
        // TODO add your handling code here:
        int baris = table_jurusan.getSelectedRow(); // ambil baris yang dipilih

        if (baris >= 0) {
        int konfirmasi = JOptionPane.showConfirmDialog(
            null,
            "Apakah kamu yakin ingin menghapus data ini?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION
        );

        if (konfirmasi == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) table_jurusan.getModel();
            model.removeRow(baris); // hapus baris dari model

            // Kosongkan TextField setelah hapus
            t_KodeJurusan.setText("");
            t_NamaJurusan.setText("");
        }

        } else {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!");
        }
    }//GEN-LAST:event_b_HapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Hapus;
    private javax.swing.JButton b_Reset;
    private javax.swing.JButton b_Tambah;
    private javax.swing.JButton b_Ubah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_jurusan;
    private javax.swing.JTextField t_KodeJurusan;
    private javax.swing.JTextField t_NamaJurusan;
    private javax.swing.JTable table_jurusan;
    // End of variables declaration//GEN-END:variables
}
