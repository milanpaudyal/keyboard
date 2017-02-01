/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

//import static keyboard.KeyBoardType.url;
//import static keyboard.KeyBoardType.url;
/**
 *
 * @author Meelon
 */
public class UserInputFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserInputFrame
     */
    Toolkit toolkit = (Toolkit) Toolkit.getDefaultToolkit().getDesktopProperty(String.valueOf(getWidth()));
    int count = 0;
    int i = 0;
    Connection c = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    UserInputFrame() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayed = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        counterr = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        retrieve = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        english = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Input");
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setResizable(false);

        displayed.setEditable(false);
        displayed.setBackground(new java.awt.Color(179, 255, 102));
        displayed.setColumns(20);
        displayed.setLineWrap(true);
        displayed.setRows(5);
        displayed.setAutoscrolls(false);
        jScrollPane1.setViewportView(displayed);

        input.setBackground(new java.awt.Color(206, 255, 153));
        input.setColumns(20);
        input.setLineWrap(true);
        input.setRows(5);
        input.setWrapStyleWord(true);
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(input);

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Errors");

        counterr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        counterr.setText("error");

        insert.setBackground(new java.awt.Color(204, 204, 255));
        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        retrieve.setBackground(new java.awt.Color(204, 204, 255));
        retrieve.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        retrieve.setText("Retrieve");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(counterr)
                .addGap(250, 250, 250)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(retrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(counterr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retrieve, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenu1.setMnemonic('h');
        jMenu1.setText("Home");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Back");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Exit");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('l');
        jMenu2.setText("Language");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        english.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        english.setSelected(true);
        english.setText("English");
        english.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishActionPerformed(evt);
            }
        });
        jMenu2.add(english);

        jCheckBoxMenuItem4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Nepali");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        new KeyBoardType().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed
    Font f = new Font("PREETI", Font.BOLD, 30);
    Font f1 = new Font("Arial", Font.TYPE1_FONT, 27);

    static String username = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/keyboard";

    DefaultHighlighter.DefaultHighlightPainter dhp = new DefaultHighlighter.DefaultHighlightPainter(Color.ORANGE);


    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        Connection c = null;
        String query = "insert into nepali(data) values(?)";
        String datainfo = input.getText().trim();

        try {
            c = DriverManager.getConnection(url, username, password);
            ps = c.prepareStatement(query);
            ps.setString(1, datainfo);
            ps.executeUpdate();
            input.setText("");
            //display.setText("");
            c.close();
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_insertActionPerformed
    String data;
    String displays;
    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
        i = 0;
        String query1 = "Select data from nepali";
        try (
                Connection c = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = c.prepareStatement(query1);) {
            ResultSet rs = ps.executeQuery();
            // rs.last();
            while (rs.next()) {
                data = rs.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        displayed.setText(data);
        displays = displayed.getText();
        input.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override

            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

                System.out.println("Key Released");
                if (i < displays.length()) {
                    if (e.getKeyCode() != KeyEvent.VK_BACK_SPACE
                            && e.getKeyCode() != KeyEvent.VK_ALL_CANDIDATES
                            && e.getKeyCode() != KeyEvent.VK_ALT
                            && e.getKeyCode() != KeyEvent.VK_CAPS_LOCK
                            && e.getKeyCode() != KeyEvent.VK_WINDOWS
                            && e.getKeyCode() != KeyEvent.VK_SHIFT
                            && e.getKeyCode() != KeyEvent.VK_CONTROL) {
                        //System.out.println(KeyEvent.VK_ALPHANUMERIC);

                        //System.out.println(e.getKeyCode());
                        if (e.getKeyChar() != displays.charAt(i)) {
                          //  System.out.println("checking");
                            //System.out.println(e.getKeyCode() + "!=");
                            try {
                                displayed.getHighlighter().addHighlight(i, i + 1,
                                        dhp);
                            } catch (BadLocationException ex) {
                            }
                            count = count + 1;
                            i = i + 1;
                            counterr.setText(Integer.toString(count));
                        } else {
                            try {
                                displayed.getHighlighter().addHighlight(i, i + 1,
                                        dhp);
                            } catch (BadLocationException ex) {
                            }
                            i = i + 1;

                        }

                    } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

                        System.out.println("Back Space");
                        if (count > 0) {
                            count = count - 1;
                        }
                        if (i > 0) {
                            i = i - 1;
                        }
                        Highlighter highlights = displayed.getHighlighter();
                        Highlighter.Highlight[] hs = highlights.getHighlights();
                        highlights.removeHighlight(hs[i]);
                    }

                    //counterr.setText(Integer.toString(count));
                    System.out.println(count);
                }
            }
        }
        );

    }//GEN-LAST:event_retrieveActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        new KeyBoardType().setVisible(true);
        dispose();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void englishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishActionPerformed

        i = 0;
        displayed.setFont(f1);
        input.setFont(f1);
        displayed.setText("");
        input.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_englishActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed

        i = 0;
        displayed.setFont(f);
        input.setFont(f);
        displayed.setText("");
        input.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKeyPressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UserInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UserInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UserInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UserInputFrame.class.getName()).log(java.util.logging.Level.SEVERE, "", ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserInputFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel counterr;
    private javax.swing.JTextArea displayed;
    private javax.swing.JCheckBoxMenuItem english;
    private javax.swing.JTextArea input;
    private javax.swing.JButton insert;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton retrieve;
    // End of variables declaration//GEN-END:variables
}
