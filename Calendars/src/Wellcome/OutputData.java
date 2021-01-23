/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wellcome;

import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Kibria
 */
public class OutputData extends javax.swing.JFrame {

    /**
     * Creates new form OutputData
     */
    private Container c;

    String ss1, ss2;
    int dd, mm, yy;

    public OutputData(String st1, String st2) {
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

            String[] Datecut = ss1.split("/");

            dd = Integer.parseInt(Datecut[0]);
            mm = Integer.parseInt(Datecut[1]);
            yy = Integer.parseInt(Datecut[2]);

            if (dd == 1 && mm == 1 && yy >= 1000) {
                String path = "E:/java/class practiac/Calendars/Info/January/New year .txt";
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
            } else if (dd == 11 && mm == 1 && yy >= 2017) {
                String path = "E:/java/class practiac/Calendars/Info/January/Parity at Work Day.txt";
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

            } else if (dd == 18 && mm == 1 && yy >= 1950) {
                String path = "E:/java/class practiac/Calendars/Info/January/World Religion Day.txt";
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

            } else if (dd == 23 && mm == 1 && yy >= 1954) {
                String path = "E:/java/class practiac/Calendars/Info/January/Freedom Day.txt";
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

            } else if (dd == 26 && mm == 1 && yy >= 1953) {

                String path = "E:/java/class practiac/Calendars/Info/January/Customs Day.txt";
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

            } else if (dd == 27 && mm == 1 && yy >= 1945) {
                String path = "E:/java/class practiac/Calendars/Info/January/Holocaust Remembrance Day.txt";
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

            } else if (dd == 28 && mm == 1 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/January/Reducing CO2 Emissions Day.txt";
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
            } else if (dd == 30 && mm == 1 && yy >= 1982) {
                String path = "E:/java/class practiac/Calendars/Info/January/Day of Non-Violence .txt";
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

            } else if (dd == 31 && mm == 1 && yy >= 2009) {
                String path = "E:/java/class practiac/Calendars/Info/January/Street children's day.txt";
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

            } else if (dd == 2 && mm == 2 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Wetlands Day 2.2.1971.txt";
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

            } else if (dd == 4 && mm == 2 && yy >= 2008) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Cancer Day 4.2.2008.txt";
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

            } else if (dd == 6 && mm == 2 && yy >= 2015) {
                String path = "E:/java/class practiac/Calendars/Info/February/International Day of Zero Tolerance for Female Genital Mutilation is a United Nations 6.2.2015.txt";
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
            } else if (dd == 11 && mm == 2 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Day of the Sick 11.2.1992.txt";
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
            } else if (dd == 13 && mm == 2 && yy >= 2012) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Radio Day  13.2.2012.txt";
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

            } else if (dd == 14 && mm == 2 && yy >= 1020) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Valentine Day 14.2.1020.txt";
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

            } else if (dd == 15 && mm == 2 && yy >= 1965) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Cholangiocarcinoma Day  15.2.1965.txt";
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

            } else if (dd == 20 && mm == 2 && yy >= 2009) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Day of Social Justice 20.2.2009.txt";
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

            } else if (dd == 21 && mm == 2 && yy >= 1952) {
                String path = "E:/java/class practiac/Calendars/Info/February/International Mother Language Day 21.2.1952.txt";
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

            } else if (dd == 24 && mm == 2 && yy >= 1996) {
                String path = "E:/java/class practiac/Calendars/Info/February/Defend the Donut Day 24.2.1996.txt";
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

            } else if (dd == 27 && mm == 2 && yy >= 1980) {
                String path = "E:/java/class practiac/Calendars/Info/February/World NGO Day 27.2.1980.txt";
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

            } else if (dd == 8 && mm == 3 && yy >= 1900) {
                String path = "E:/java/class practiac/Calendars/Info/March/International Women’s Day 8.3.1900.txt";
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
            } else if (dd == 20 && mm == 3 && yy >= 2012) {
                String path = "E:/java/class practiac/Calendars/Info/March/International Day of Happiness 20.3.2012 .txt";
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
            } else if (dd == 21 && mm == 3 && yy >= 2007) {
                String path = "E:/java/class practiac/Calendars/Info/March/International Day of Forests 21.3.2007.txt";
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
            } else if (dd == 22 && mm == 3 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/March/World Water Day  22.3.1992.txt";
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
            } else if (dd == 26 && mm == 3 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/March/Bangladesh Independence Day 26.3.1971.txt";
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
            } else if (dd == 1 && mm == 4 && yy >= 1668) {
                String path = "E:/java/class practiac/Calendars/Info/April/World April Fools’ Day 1.4.1668.txt";
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
            } else if (dd == 2 && mm == 4 && yy >= 1967) {
                String path = "E:/java/class practiac/Calendars/Info/April/International Children’s Book Day  2.4.1967.txt";
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
            } else if (dd == 7 && mm == 4 && yy >= 1948) {
                String path = "E:/java/class practiac/Calendars/Info/April/World Health Day  7.4.1948.txt";
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
            } else if (dd == 22 && mm == 4 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/April/International Mother Earth Day 22.4.1992.txt";
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
            } else if (dd == 23 && mm == 4 && yy >= 2010) {
                String path = "E:/java/class practiac/Calendars/Info/April/English Language Day 23.4.2010.txt";
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
            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            } else if (dd == 1 && mm == 1 && yy >= 1000) {

            }else
            {
                String path = "E:/java/class practiac/Calendars/Info/NoEventMessage.txt";
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(DayOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DayOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separetorout))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(BackOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(dayInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackOutputButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackOutputButtonActionPerformed
        this.dispose();
        ChooseEvent f = new ChooseEvent();
    }//GEN-LAST:event_BackOutputButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //OutputData f = new OutputData();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
