package mainpackage;

import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;

public class CustomJPanel extends javax.swing.JPanel {
    int width,height;
    public CustomJPanel(int viewWidth,int viewHeight){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        height= viewHeight;
        width=viewWidth;
        initcomponents(); //me
    }
    //me
    private void initcomponents() {
        //jButton2 = new javax.swing.JButton("Create");
        JButton jButton1,jButton2;
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(500,500,100,70);
        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(0,0,90,90);
        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    }   //me
    //he
    public Component addBeginning(Component comp){
    comp.setPreferredSize(new Dimension(width,height)); //it will help the layout manager to decide the size of it
    comp.setMaximumSize(new Dimension(width,height));
    return super.add(comp,0);
    }//he
    //me
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Frame1 f1=new Frame1();
        f1.show();
        f1.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        ViewFrame vf= new ViewFrame();
        vf.show();
        vf.dispose();
    }
    //me
    public void removeBeginning(){
        remove(0);
    }

}
