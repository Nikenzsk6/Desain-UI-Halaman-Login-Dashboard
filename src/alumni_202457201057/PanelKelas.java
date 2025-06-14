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
public class PanelKelas extends javax.swing.JPanel {

    /**
     * Creates new form PanelKelas
     */
    public PanelKelas() {
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

        panel_Kelas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_Close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_KodeKelas = new javax.swing.JTextField();
        t_NamaKelas = new javax.swing.JTextField();
        c_Tingkatan = new javax.swing.JComboBox<>();
        c_Jurusan = new javax.swing.JComboBox<>();
        c_Wali = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_kelas = new javax.swing.JTable();
        b_Reset = new javax.swing.JButton();
        b_Hapus = new javax.swing.JButton();
        b_Ubah = new javax.swing.JButton();
        b_Tambah = new javax.swing.JButton();

        panel_Kelas.setBackground(new java.awt.Color(204, 204, 204));
        panel_Kelas.setPreferredSize(new java.awt.Dimension(1100, 735));

        jPanel2.setBackground(new java.awt.Color(204, 102, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 59));

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel1.setText("Data Kelas");

        b_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Close.png"))); // NOI18N
        b_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CloseActionPerformed(evt);
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
                .addComponent(b_Close)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_Close)
                    .addComponent(jLabel1)))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Kode Kelas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama Kelas");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tingkatan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Jurusan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Wali Kelas");

        t_KodeKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_KodeKelasActionPerformed(evt);
            }
        });

        c_Tingkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Tingkatan--", "2022", "2023", "2024", " " }));

        c_Jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jurusan--", "Sistem Informasi", "Pendidikan Teknologi Informasi", "Teknik Industri", " " }));

        c_Wali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Wali Kelas--", "Bapak", "Ibu", " " }));

        table_kelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Kelas", "Nama Kelas", "Tingkatan", "Jurusan", "Wali Kelas"
            }
        ));
        table_kelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_kelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_kelas);

        b_Reset.setBackground(new java.awt.Color(51, 153, 255));
        b_Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Restart.png"))); // NOI18N
        b_Reset.setText("Reset");
        b_Reset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ResetActionPerformed(evt);
            }
        });

        b_Hapus.setBackground(new java.awt.Color(255, 51, 51));
        b_Hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni_202457201057/Gambar/Trash.png"))); // NOI18N
        b_Hapus.setText("Hapus");
        b_Hapus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_HapusActionPerformed(evt);
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

        javax.swing.GroupLayout panel_KelasLayout = new javax.swing.GroupLayout(panel_Kelas);
        panel_Kelas.setLayout(panel_KelasLayout);
        panel_KelasLayout.setHorizontalGroup(
            panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_KelasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_KelasLayout.createSequentialGroup()
                        .addGroup(panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(c_Jurusan, 0, 243, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(c_Tingkatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_NamaKelas)
                            .addComponent(t_KodeKelas)
                            .addComponent(c_Wali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_KelasLayout.createSequentialGroup()
                        .addComponent(b_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_Ubah, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panel_KelasLayout.setVerticalGroup(
            panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_KelasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGroup(panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_KelasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_KelasLayout.createSequentialGroup()
                                .addComponent(t_KodeKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_NamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_Tingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_Wali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE))
                    .addGroup(panel_KelasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_KelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Tambah)
                            .addComponent(b_Ubah)
                            .addComponent(b_Hapus))
                        .addGap(34, 34, 34)))
                .addComponent(b_Reset)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CloseActionPerformed
        // TODO add your handling code here:
        panel_Kelas.setVisible(false);

    }//GEN-LAST:event_b_CloseActionPerformed

    private void t_KodeKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_KodeKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_KodeKelasActionPerformed

    private void b_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_HapusActionPerformed
        // TODO add your handling code here:
        int baris = table_kelas.getSelectedRow(); // ambil baris yang dipilih

        if (baris >= 0) {
        int konfirmasi = JOptionPane.showConfirmDialog(
            null,
            "Apakah kamu yakin ingin menghapus data ini?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION
        );

        if (konfirmasi == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) table_kelas.getModel();
            model.removeRow(baris); // hapus baris dari model

            // Kosongkan TextField setelah hapus
            t_KodeKelas.setText("");
            t_NamaKelas.setText("");
            c_Tingkatan.setSelectedIndex(0);
            c_Jurusan.setSelectedIndex(0);
            c_Wali.setSelectedIndex(0);
        }

        } else {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!");
        }
    }//GEN-LAST:event_b_HapusActionPerformed

    private void b_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ResetActionPerformed
        // TODO add your handling code here:
        t_KodeKelas.setText("");
        t_NamaKelas.setText("");
        c_Tingkatan.setSelectedIndex(0);
        c_Jurusan.setSelectedIndex(0);
        c_Wali.setSelectedIndex(0);
        
    }//GEN-LAST:event_b_ResetActionPerformed

    private void b_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TambahActionPerformed
        // TODO add your handling code here:
        String kode = t_KodeKelas.getText().trim();
        String nama = t_NamaKelas.getText().trim();
        String tingkatan = c_Tingkatan.getSelectedItem().toString();
        String jurusan = c_Jurusan.getSelectedItem().toString();
        String wali = c_Wali.getSelectedItem().toString();
       
        if (!kode.isEmpty()&&!nama.isEmpty() && !tingkatan.isEmpty()&& !jurusan.isEmpty() && !wali.isEmpty() ){
           DefaultTableModel model= (DefaultTableModel) table_kelas.getModel();
           model.addRow(new Object[]{kode,nama,tingkatan,jurusan,wali});
           
           //Kosongkan textField setelah tambah
           t_KodeKelas.setText("");
           t_NamaKelas.setText("");
           c_Tingkatan.setSelectedIndex(0);
           c_Jurusan.setSelectedIndex(0);
           c_Wali.setSelectedIndex(0);
         
        } else {
            JOptionPane.showMessageDialog(null, "Lengkapi semua data terlebih dahulu!");
        }
    }//GEN-LAST:event_b_TambahActionPerformed

    private void table_kelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_kelasMouseClicked
        // TODO add your handling code here:
        int baris = table_kelas.getSelectedRow(); //ambil nilai baris
        
        //ambil nilai kolom
        String kode = table_kelas.getValueAt(baris, 0).toString();
        String nama = table_kelas.getValueAt(baris, 1).toString();
        String tingkatan = table_kelas.getValueAt(baris, 2).toString();
        String jurusan = table_kelas.getValueAt(baris, 3).toString();
        String wali = table_kelas.getValueAt(baris, 4).toString();
       
        //isi ke textField
        t_KodeKelas.setText(kode);
        t_NamaKelas.setText(nama);
        c_Tingkatan.setSelectedItem(tingkatan);
        c_Jurusan.setSelectedItem(jurusan);
        c_Wali.setSelectedItem(wali);
        
    }//GEN-LAST:event_table_kelasMouseClicked

    private void b_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UbahActionPerformed
        // TODO add your handling code here:
        int baris = table_kelas.getSelectedRow();//ambil baris
        
        if (baris>=0){
            String kode = t_KodeKelas.getText().trim();
            String nama = t_NamaKelas.getText().trim();
            String tingkatan = c_Tingkatan.getSelectedItem().toString();
            String jurusan = c_Jurusan.getSelectedItem().toString();
            String wali = c_Wali.getSelectedItem().toString();
            
            if (!kode.isEmpty() && !nama.isEmpty() && !tingkatan.isEmpty() && !jurusan.isEmpty()&& !wali.isEmpty()) {
            //update isi tabel
            table_kelas.setValueAt(kode, baris, 0);
            table_kelas.setValueAt(nama, baris, 1);
            table_kelas.setValueAt(tingkatan, baris, 2);
            table_kelas.setValueAt(jurusan, baris, 3);
            table_kelas.setValueAt(wali, baris, 4);
            
            //kosongkan textField
            t_KodeKelas.setText("");
            t_NamaKelas.setText("");
            c_Tingkatan.setSelectedIndex(0);
            c_Jurusan.setSelectedIndex(0);
            c_Wali.setSelectedIndex(0);
            
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
        } else {
            JOptionPane.showMessageDialog(null, "Lengkapi data terlebih dahulu");
        }
        }else {
             JOptionPane.showMessageDialog(null, "Pilih data yang ingin diubah");
          }
    }//GEN-LAST:event_b_UbahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Close;
    private javax.swing.JButton b_Hapus;
    private javax.swing.JButton b_Reset;
    private javax.swing.JButton b_Tambah;
    private javax.swing.JButton b_Ubah;
    private javax.swing.JComboBox<String> c_Jurusan;
    private javax.swing.JComboBox<String> c_Tingkatan;
    private javax.swing.JComboBox<String> c_Wali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_Kelas;
    private javax.swing.JTextField t_KodeKelas;
    private javax.swing.JTextField t_NamaKelas;
    private javax.swing.JTable table_kelas;
    // End of variables declaration//GEN-END:variables
}
