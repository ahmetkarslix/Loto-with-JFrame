
package com.sdu.birinci;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;


public class MainFrame extends javax.swing.JFrame {

    JButton[] buttons;
    public MainFrame() {
        initComponents();
        buttons = new JButton[49];
        for(int i=0; i < buttons.length; i++){
            buttons[i] = new JButton(""+ (i+1));
            buttons[i].setEnabled(false);
            pnl_buttons.add(buttons[i]);
        }
        setLocationRelativeTo(null);
    }
    
    public List<Integer> getRandomNumbers(){
        Random rnd = new Random();
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            while (true) {                
                int number = rnd.nextInt(49) + 1;
                if(!resultList.contains(number)){
                    resultList.add(number);
                    break;
                }
            }
        }
        
        
        return resultList;
        
    }
    
    public void allButtonDisable(){
        for(JButton jb: buttons)
        jb.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_play = new javax.swing.JButton();
        pnl_buttons = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_play.setText("Play");
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        pnl_buttons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_buttons.setLayout(new java.awt.GridLayout(7, 7));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_play))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnl_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(btn_play)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
        List<Integer> randomNumbers = getRandomNumbers();
        allButtonDisable();
        for(Integer number : randomNumbers)
            buttons[number - 1].setEnabled(true);
    }//GEN-LAST:event_btn_playActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_play;
    private javax.swing.JPanel pnl_buttons;
    // End of variables declaration//GEN-END:variables
}
