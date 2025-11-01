/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hutangpiutang.view;

/**
 *
 * @author ASUS
 */
import hutangpiutang.dao.PihakDao;
import hutangpiutang.model.Pihak;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class PihakFrame extends JFrame {
    private JTextField tfNama = new JTextField();
    private JTextField tfNoHp = new JTextField();
    private JTextArea taAlamat = new JTextArea();
    private JButton btnSimpan = new JButton("Simpan");

    public PihakFrame() {
        setTitle("Data Pihak");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2, 5, 5));
        setLocationRelativeTo(null);

        add(new JLabel("Nama:"));
        add(tfNama);
        add(new JLabel("No. HP:"));
        add(tfNoHp);
        add(new JLabel("Alamat:"));
        add(new JScrollPane(taAlamat));
        add(new JLabel(""));
        add(btnSimpan);

        btnSimpan.addActionListener(e -> simpan());
    }

    private void simpan() {
        try {
            Pihak p = new Pihak(0, tfNama.getText(), tfNoHp.getText(), taAlamat.getText());
            PihakDao.insert(p);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            tfNama.setText(""); tfNoHp.setText(""); taAlamat.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data!");
        }
    }
}
