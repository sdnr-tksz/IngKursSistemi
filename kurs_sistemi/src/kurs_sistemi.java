
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class kurs_sistemi extends javax.swing.JFrame {

    /**
     * Creates new form kurs_sistemi
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int ucret = 0, a1 = 800, a2 = 900, b1 = 1000, b2 = 1100, c1 = 1200, c2 = 1300;
    int columnNumber = 0;
    double kalan = 0, odenen = 0, toplam;

    public kurs_sistemi() {
        initComponents();
        lbl_date.setText(String.valueOf(LocalDate.now()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_bos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_dolu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_kayıttc = new javax.swing.JTextField();
        txt_adsoyad = new javax.swing.JTextField();
        btn_kaydet = new javax.swing.JButton();
        cm_seviye = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_taksit = new javax.swing.JTextField();
        lbl_kursucret = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_paratc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_oyapildi = new javax.swing.JButton();
        lbl_toplamt = new javax.swing.JLabel();
        lbl_odenent = new javax.swing.JLabel();
        lbl_kalant = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarea_dekont = new javax.swing.JTextArea();
        btn_ara = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        lbl_taksit = new javax.swing.JLabel();
        btn_kayit_sil = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LANGUAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 310, -1));

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFocusable(false);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BOŞ KONTENJAN        :");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOPLAM KONTENJAN :");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, -1, -1));

        lbl_bos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_bos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_bos, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 88, 63, 24));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("100");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 53, 63, 29));

        lbl_dolu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_dolu.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_dolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 122, 63, 24));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOLU KONTENJAN     :");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TC KİMLİK NUMARASI :");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, 39));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAİL                            :");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, 34));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AD SOYAD                    :");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, 44));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEFON NUMARASI :");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, 36));

        txt_tel.setText(" ");
        txt_tel.setBorder(null);
        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });
        jPanel7.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 250, 30));

        txt_email.setText(" ");
        txt_email.setBorder(null);
        jPanel7.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 128, 250, 30));

        txt_kayıttc.setText(" ");
        txt_kayıttc.setBorder(null);
        txt_kayıttc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kayıttcActionPerformed(evt);
            }
        });
        jPanel7.add(txt_kayıttc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 250, 30));

        txt_adsoyad.setText(" ");
        txt_adsoyad.setBorder(null);
        txt_adsoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adsoyadActionPerformed(evt);
            }
        });
        jPanel7.add(txt_adsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 250, 30));

        btn_kaydet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_kaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A (1).jpeg"))); // NOI18N
        btn_kaydet.setText("    KAYDET    ");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });
        jPanel7.add(btn_kaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 200, 50));

        cm_seviye.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cm_seviye.setForeground(new java.awt.Color(255, 255, 255));
        cm_seviye.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEÇİNİZ", "A1", "A2", "B1", "B2", "C1", "C2" }));
        cm_seviye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm_seviyeActionPerformed(evt);
            }
        });
        jPanel7.add(cm_seviye, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 224, 250, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DİL SEVİYESİ               :");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 220, 160, 34));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TARİH                            :");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));

        lbl_date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 20, 130, 19));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ÜCRET                         :");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TAKSİT                          :");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 162, -1));

        txt_taksit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel7.add(txt_taksit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 250, 30));

        lbl_kursucret.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_kursucret.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(lbl_kursucret, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 158, 79, 26));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayuz.jpeg"))); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -240, -1, -1));

        jTabbedPane1.addTab("ÖĞRENCİ KAYIT", jPanel7);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" TC KİMLİK NO           :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 158, -1));

        txt_paratc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_paratc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paratcActionPerformed(evt);
            }
        });
        jPanel1.add(txt_paratc, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 61, 190, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TOPLAM FİYAT          :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 158, 25));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("KALAN FİYAT             :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" ÖDENEN FİYAT         :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, -1, -1));

        btn_oyapildi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_oyapildi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A (2).jpeg"))); // NOI18N
        btn_oyapildi.setText("ÖDEME YAPILDI");
        btn_oyapildi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oyapildiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oyapildi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 50));

        lbl_toplamt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_toplamt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_toplamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 107, 142, 25));

        lbl_odenent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_odenent.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_odenent, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 138, 142, 25));

        lbl_kalant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_kalant.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_kalant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 142, 25));

        tarea_dekont.setColumns(20);
        tarea_dekont.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tarea_dekont.setRows(5);
        jScrollPane2.setViewportView(tarea_dekont);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 340, 260));

        btn_ara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ara.jpeg"))); // NOI18N
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ara, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 30, 30));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TAKSİT SAYISI           :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 218, -1, -1));

        lbl_taksit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_taksit.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_taksit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 142, 20));

        btn_kayit_sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_kayit_sil.setText("KAYIT SİL");
        btn_kayit_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayit_silActionPerformed(evt);
            }
        });
        jPanel1.add(btn_kayit_sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 200, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("YAZDIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 330, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayuz.jpeg"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -240, -1, -1));

        jTabbedPane1.addTab("PARA İŞLEMLERİ", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 880, 420));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("SCHOOL");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayuz.jpeg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_adsoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adsoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adsoyadActionPerformed

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        try {

            Connection conn = null;
            int sayac = 0;      //taksit sayısı
            int kontenjan = 100;    // toplam taksit
            try {
                conn = db.connect_db();
                String sql2 = "SELECT * FROM OGRENCI_KAYIT  ";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql2);
                while (rs.next()) {
                    sayac++;
                }
            } catch (Exception ex) {
                //JOptionPane.showMessageDialog(null,ex);

            } finally {
                try {
                    conn.close();
                } catch (Exception ex) {

                }
            }
            int bos_kont = kontenjan - sayac;
            // KONTENJAN VE ÖĞRENCİ BİLGİLERİ VERİ TABANINA INSEERT EDİLİR.
            lbl_bos.setText(String.valueOf(bos_kont - 1));
            lbl_dolu.setText(String.valueOf(sayac + 1));
            conn = db.connect_db();
            String sql2 = "INSERT INTO KONTENJAN (TOPLAMK,BOSK,DOLUK)" + "VALUES ('" + 100 + "','" + lbl_bos.getText() + "','" + lbl_dolu.getText() + "')";
            pst = conn.prepareStatement(sql2);
            pst.execute();
            if (sayac < 100) {
                conn = db.connect_db();
                String sql = "INSERT INTO OGRENCI_KAYIT (AD_SOYAD,TCKIMLIKNO,TEL_NO,EMAIL,KAYIT_TARIH,DILSEVIYE,UCRET,TAKSITSAYISI,KALANTAKSIT)"
                        + "VALUES ('" + txt_adsoyad.getText() + "','" + txt_kayıttc.getText() + "','" + txt_tel.getText() + "','" + txt_email.getText() + "','"
                        + LocalDate.now() + "','" + cm_seviye.getSelectedIndex() + "','" + lbl_kursucret.getText() + "','" + txt_taksit.getText() + "','" + lbl_kursucret.getText() + "')";

                pst = conn.prepareStatement(sql);
                pst.execute();
                txt_adsoyad.setText("");
                txt_kayıttc.setText("");
                txt_tel.setText("");
                txt_email.setText("");
                txt_taksit.setText("");
                lbl_kursucret.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "kontenjan dolu");
            }
            cm_seviye.setSelectedIndex(0);

        } catch (Exception ex) {
            

        } finally {
            try {
                conn.close();
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void cm_seviyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm_seviyeActionPerformed
        // SEÇİLEN CHECKBOX INDEXİNE GÖRE FİYAT BELİRLENİR
        
        if (cm_seviye.getSelectedIndex() == 1) {
            ucret = a1;
        } else if (cm_seviye.getSelectedIndex() == 2) {
            ucret = a2;
        } else if (cm_seviye.getSelectedIndex() == 3) {
            ucret = b1;
        } else if (cm_seviye.getSelectedIndex() == 4) {
            ucret = b2;
        } else if (cm_seviye.getSelectedIndex() == 5) {
            ucret = c1;
        } else if (cm_seviye.getSelectedIndex() == 6) {
            ucret = c2;
        }
        lbl_kursucret.setText(String.valueOf(ucret));


    }//GEN-LAST:event_cm_seviyeActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void btn_oyapildiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oyapildiActionPerformed
        // TEXT AREA KISMINA DEĞERLER AKTARILIR.
        
        tarea_dekont.append("\nİNGİLİZCE KURS SİSTEMİ TAKSİT DEKONTU\n\n"
                + "DEKONT TARİHİ  : " + LocalDate.now() + "\n"
                + "\nTC KİMLİK NO :" + txt_paratc.getText()
                + "\nTOPLAM FİYAT :" + lbl_toplamt.getText()
                + "\nÖDENEN TAKSİT:" + lbl_odenent.getText()
                + "\nKALAN TAKSİT :" + lbl_kalant.getText()
                + "\nTAKSİT SAYISI:" + lbl_taksit.getText());

        Connection conn = null;
        // VERİ TABANINDA ÖDEME TABLOSUNA DEĞERLER KAYDEDİLİR.
        try {
            conn = db.connect_db();
            String sql = "INSERT INTO ODEME (TCKIMLIKNO,TOPLAMTAKSIT,ODENENTAKSIT,KALANTAKSIT,TAKSITSAYISI,DEKONTTARIHI)"
                    + "VALUES ('" + txt_paratc.getText() + "','" + lbl_toplamt.getText() + "','" + lbl_odenent.getText() + "','" + lbl_kalant.getText() + "','" + lbl_taksit.getText() + "','" + LocalDate.now() + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();

        } catch (Exception ex) {

        } finally {
            try {
                conn.close();
            } catch (Exception ex) {

            }
        }
        
        txt_paratc.setText("");
        lbl_toplamt.setText("");
        lbl_odenent.setText("");
        lbl_kalant.setText("");
        lbl_taksit.setText("");
    }//GEN-LAST:event_btn_oyapildiActionPerformed

    private void txt_paratcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paratcActionPerformed

    }//GEN-LAST:event_txt_paratcActionPerformed

    private void txt_kayıttcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kayıttcActionPerformed

    }//GEN-LAST:event_txt_kayıttcActionPerformed


    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed
        // YAPILAN TC KİMLİK SORGUSUNA GÖRE TAKSİT VE ÖDEME BİLGİLERİ EKRANA GETİRİLİR.
        
        String tc = txt_paratc.getText();
        try {
            conn = db.connect_db();
            String sql2 = "SELECT * FROM OGRENCI_KAYIT WHERE TCKIMLIKNO='" + tc + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            lbl_toplamt.setText(rs.getString("UCRET"));
            lbl_kalant.setText(rs.getString("UCRET"));
            lbl_taksit.setText(rs.getString("TAKSITSAYISI"));
            int kalan = Integer.parseInt(lbl_kalant.getText());
            int toplam = Integer.parseInt(lbl_toplamt.getText());
            int taksit = Integer.parseInt(lbl_taksit.getText());             
            // int sayac = Integer.parseInt(lbl_taksit.getText());             
            if(kalan==toplam){
                int odenen = kalan / taksit;
                lbl_odenent.setText(String.valueOf(odenen));
                lbl_kalant.setText(String.valueOf(kalan - odenen));
            }
            else{                
                String sql3="SELECT * FROM ODEME WHERE TCKIMLIKNO='"+tc+"'";
                Statement st1 = conn.createStatement();
                ResultSet rs1 = st1.executeQuery(sql3);
                lbl_kalant.setText(rs1.getString("KALANTAKSIT"));
                int kalan1=Integer.parseInt(lbl_kalant.getText());
                int odenen = kalan / taksit;                
                lbl_kalant.setText(String.valueOf(kalan1 - odenen));
                lbl_odenent.setText(String.valueOf(toplam-kalan1));
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                conn.close();
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_btn_araActionPerformed

    private void btn_kayit_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayit_silActionPerformed
        // ÖĞRENCİ KAYDI SİLİNMEK İSTENİRSE YAPILAN GÜNCELLEME VERİ TABANINA KAYDEDİLİR.
        
        String tc = txt_paratc.getText();
        try {
            conn = db.connect_db();
            String sql2 = "DELETE FROM OGRENCI_KAYIT WHERE TCKIMLIKNO='" + tc + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Öğrenci kaydı silinmiştir.");
        }finally {
            try {
                conn.close();
            } catch (Exception ex) {

            }
        }
        // DEĞERLER ARAYÜZDE NULL OLARAK TANIMLANIR. SET EDİLİR.
        txt_paratc.setText("");
        lbl_toplamt.setText("");
        lbl_kalant.setText("");
        lbl_taksit.setText("");
        lbl_odenent.setText("");
        tarea_dekont.setText("");
    }//GEN-LAST:event_btn_kayit_silActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TEXT AREA İÇERİSİNDEKİ METİN DEKONT YAZDIRMA İŞLEMİNİ GERÇEKLEŞTİRMEK İÇİN TXT DOSYASINA KAYDEDİLİR.
        
        String dekont = tarea_dekont.getText();
        String path ="C:\\Users\\sedan\\OneDrive\\Masaüstü\\Dekontlar/dekont.txt";
        File file=new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(kurs_sistemi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            FileWriter fWriter = new FileWriter(file,false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(dekont);
            bWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(kurs_sistemi.class.getName()).log(Level.SEVERE, null, ex);
        }
        tarea_dekont.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(kurs_sistemi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kurs_sistemi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kurs_sistemi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kurs_sistemi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kurs_sistemi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_kayit_sil;
    private javax.swing.JButton btn_oyapildi;
    private javax.swing.JComboBox<String> cm_seviye;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_bos;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_dolu;
    private javax.swing.JLabel lbl_kalant;
    private javax.swing.JLabel lbl_kursucret;
    private javax.swing.JLabel lbl_odenent;
    private javax.swing.JLabel lbl_taksit;
    private javax.swing.JLabel lbl_toplamt;
    private javax.swing.JTextArea tarea_dekont;
    private javax.swing.JTextField txt_adsoyad;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_kayıttc;
    private javax.swing.JTextField txt_paratc;
    private javax.swing.JTextField txt_taksit;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
