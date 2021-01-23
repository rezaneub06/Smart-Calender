/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wellcome;

import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;

/**
 *
 * @author Kibria
 */
public class OutputData2 extends javax.swing.JFrame {

    /**
     * Creates new form OutputData2
     */
    private Container c;

    String ss1, ss2;
    int dd, mm, yy;

    public OutputData2(int x, String st1, String st2) {
        initComponents();
        c = this.getContentPane();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(270, 110);
        this.setTitle("Smart_Calender");
        c.setBackground(Color.PINK);
        if (st1.equals("")) {
            DateOutputTextField.setText("Plz Select Date");
            DayOutputTextField.setText("NO Day");
            TextAreaInfo.setText("No Date so no information");
        } else {
            ss1 = st1;
            ss2 = st2;
            String allinfo = "";
            DateOutputTextField.setText(ss1);
            DayOutputTextField.setText(ss2);

            if (x == 1) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event1.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 2) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event2.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 3) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event3.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 4) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event4.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 5) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event5.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 6) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event6.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 7) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event7.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 8) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event8.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 9) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event9.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 10) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event10.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 11) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event11.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 12) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event12.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 13) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event13.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 14) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event14.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 15) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event15.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 16) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event16.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 17) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event17.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 18) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event18.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 19) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event19.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (x == 20) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event20.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaInfo = new javax.swing.JTextArea();
        DateOutputLebel = new javax.swing.JLabel();
        DateOutputTextField = new javax.swing.JTextField();
        dayInfoLabel = new javax.swing.JLabel();
        BackOutputButton = new javax.swing.JButton();
        DayOutputTextField = new javax.swing.JTextField();
        DayOutputLabel = new javax.swing.JLabel();
        separetorout = new javax.swing.JSeparator();
        BackButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextAreaInfo.setEditable(false);
        TextAreaInfo.setBackground(new java.awt.Color(204, 255, 204));
        TextAreaInfo.setColumns(20);
        TextAreaInfo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextAreaInfo.setRows(5);
        TextAreaInfo.setToolTipText("Date Information");
        TextAreaInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        jScrollPane2.setViewportView(TextAreaInfo);

        DateOutputLebel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        DateOutputLebel.setText("     Date :");
        DateOutputLebel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));

        DateOutputTextField.setEditable(false);
        DateOutputTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DateOutputTextField.setForeground(new java.awt.Color(255, 102, 0));
        DateOutputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DateOutputTextField.setToolTipText("Date");
        DateOutputTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));

        dayInfoLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        dayInfoLabel.setForeground(new java.awt.Color(102, 0, 102));
        dayInfoLabel.setText("       Date Information");
        dayInfoLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 4, true));

        BackOutputButton.setBackground(new java.awt.Color(51, 0, 51));
        BackOutputButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BackOutputButton.setForeground(new java.awt.Color(0, 255, 255));
        BackOutputButton.setText("Home");
        BackOutputButton.setToolTipText("Home");
        BackOutputButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        BackOutputButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackOutputButtonActionPerformed(evt);
            }
        });

        DayOutputTextField.setEditable(false);
        DayOutputTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DayOutputTextField.setForeground(new java.awt.Color(204, 102, 0));
        DayOutputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DayOutputTextField.setToolTipText("Day");
        DayOutputTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));

        DayOutputLabel.setBackground(new java.awt.Color(204, 204, 204));
        DayOutputLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        DayOutputLabel.setForeground(new java.awt.Color(51, 0, 51));
        DayOutputLabel.setText("          This Day is ");
        DayOutputLabel.setToolTipText("");
        DayOutputLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));

        separetorout.setBackground(new java.awt.Color(51, 51, 0));
        separetorout.setForeground(new java.awt.Color(51, 0, 51));
        separetorout.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separetorout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        separetorout.setEnabled(false);

        BackButton.setBackground(new java.awt.Color(51, 0, 51));
        BackButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(0, 255, 204));
        BackButton.setText("Back");
        BackButton.setToolTipText("Back");
        BackButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(51, 0, 51));
        ExitButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(0, 255, 204));
        ExitButton.setText("Exit");
        ExitButton.setToolTipText("Exit");
        ExitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(dayInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateOutputLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DateOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(DayOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DayOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separetorout))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(BackOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOutputLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DayOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DayOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separetorout, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dayInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BackOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackOutputButtonActionPerformed
        this.dispose();
        ChooseEvent f = new ChooseEvent();
    }//GEN-LAST:event_BackOutputButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
    AddEvent f= new AddEvent();
    this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //OutputData2 f= new OutputData2(String st1,String st2);//.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackOutputButton;
    private javax.swing.JLabel DateOutputLebel;
    private javax.swing.JTextField DateOutputTextField;
    private javax.swing.JLabel DayOutputLabel;
    private javax.swing.JTextField DayOutputTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextArea TextAreaInfo;
    private javax.swing.JLabel dayInfoLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator separetorout;
    // End of variables declaration//GEN-END:variables
}
