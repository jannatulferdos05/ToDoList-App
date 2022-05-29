package mainpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CompositeView extends JPanel {
    JLabel title;
    JLabel date;
    JLabel image;
    int num=0;
    Color primaryColor=null;
    public CompositeView(int i /*just need to create gray white bg color*/) {
        setLayout(null); //important to independently position element
        num=i;
        if(i%2==0){
            primaryColor=Color.gray;
        }else{
            primaryColor=Color.white;
        }
        setBackground(primaryColor);
        init(); //will draw necessary items to the jpanel that holds a view
        initListeners(); // after this we will add necessary event listener to them
    }
    private void init(){
        /*
        Adding items to jpanel
         */
        title=new JLabel("This is an example of composite view: "+num);
        title.setBounds(75,0,500,20);
        date=new JLabel("09/08/22");
        date.setBounds(75,30,250,20);
        image=new JLabel(new ImageIcon("/home/iishanto/Downloads/190105.jpg"));
        image.setBounds(0,0,75,100);
        add(title);
        add(date);
        add(image);
    }

    public void setDate(String date) {
        this.date = new JLabel(date);
    }

    private void initListeners(){
        addMouseListener(new MouseListener() { //it will add to the jpanel itself
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(primaryColor);
            }
        });
        image.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(CompositeView.this, "You just clicked on Jui's image+ "+title.getText());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}