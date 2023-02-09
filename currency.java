
package currencyConvert;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class currency extends javax.swing.JFrame {
    
    double dollar;
    double rand;

    public currency() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jtxtSubmit1 = new javax.swing.JButton();
        jtxtSubmit2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtDollar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtRand = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtAmountRand = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtAmountDollar = new javax.swing.JTextField();
        jtxtBtnClear = new javax.swing.JButton();
        jtxtbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jtxtSubmit1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtSubmit1.setForeground(new java.awt.Color(255, 51, 102));
        jtxtSubmit1.setText("Submit");
        jtxtSubmit1.setBorder(null);
        jtxtSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubmit1ActionPerformed(evt);
            }
        });

        jtxtSubmit2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtSubmit2.setForeground(new java.awt.Color(255, 0, 0));
        jtxtSubmit2.setText("Submit");
        jtxtSubmit2.setBorder(null);
        jtxtSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubmit2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Currency Convertion App");

        jtxtDollar.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtDollar.setForeground(new java.awt.Color(255, 0, 51));
        jtxtDollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDollarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setText("Enter amount in Dollar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Amount in Rands");

        jtxtRand.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtRand.setForeground(new java.awt.Color(51, 204, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Enter amount in Rands");

        jtxtAmountRand.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtAmountRand.setForeground(new java.awt.Color(255, 0, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 0));
        jLabel7.setText("Amount in Dollars");

        jtxtAmountDollar.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtAmountDollar.setForeground(new java.awt.Color(51, 204, 0));

        jtxtBtnClear.setFont(new java.awt.Font("Tahoma", 1, 14));
        jtxtBtnClear.setForeground(new java.awt.Color(153, 0, 153));
        jtxtBtnClear.setText("Clear");
        jtxtBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBtnClearActionPerformed(evt);
            }
        });

        jtxtbtnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jtxtbtnExit.setForeground(new java.awt.Color(153, 0, 153));
        jtxtbtnExit.setText("Exit");
        jtxtbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtBtnClear)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtDollar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtxtRand)
                                .addComponent(jtxtAmountRand)
                                .addComponent(jtxtAmountDollar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtSubmit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtSubmit2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addComponent(jtxtbtnExit))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtRand, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtAmountRand, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jtxtSubmit2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtAmountDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }

    private void jtxtbtnExitActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame frame = new JFrame("Exit"); 
        if(JOptionPane.showConfirmDialog(frame, "confirm if you want to eixt", "currency ",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION );                                     
         System.exit(0);
    }

    private void jtxtBtnClearActionPerformed(java.awt.event.ActionEvent evt) {
        jtxtDollar.setText(null);
        jtxtRand.setText(null);  
        jtxtAmountRand.setText(null);        
        jtxtAmountDollar.setText(null); 
    }

    private void jtxtDollarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jtxtSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {
         double EnterDollar = Double.parseDouble(jtxtDollar.getText()); 
         
         rand = EnterDollar * 19.04;
         
         String getRand = String.format("R%.2f", rand);
         jtxtRand.setText(getRand);
        
    }
    private void jtxtSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {
        double EnterRand = Double.parseDouble(jtxtAmountRand.getText());
        
        dollar = EnterRand / 19.04;
        
        String getDollar = String.format("$%.2f", dollar);
        jtxtAmountDollar.setText(getDollar);
    }
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currency().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtxtAmountDollar;
    private javax.swing.JTextField jtxtAmountRand;
    private javax.swing.JButton jtxtBtnClear;
    private javax.swing.JTextField jtxtDollar;
    private javax.swing.JTextField jtxtRand;
    private javax.swing.JButton jtxtSubmit1;
    private javax.swing.JButton jtxtSubmit2;
    private javax.swing.JButton jtxtbtnExit;

}
