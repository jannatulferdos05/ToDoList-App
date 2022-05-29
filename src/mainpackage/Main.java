package mainpackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setBounds(0, 0, 1000, 700);
        jFrame.setLayout(null);

        final CustomJPanel customJPanel = new CustomJPanel(2 * jFrame.getWidth(), 100);

        JButton add = new JButton("Create new");
        add.addActionListener(new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
               /*  customJPanel.addBeginning(new CompositeView(i++));
                customJPanel.revalidate(); //update the jpanel*/
               Frame1 f1=new Frame1();
               f1.show();
              // f1.dispose();
            }
        });

        add.setBounds(0, 0, 100, 60);
        jFrame.add(add);

        JScrollPane jScrollPane = new JScrollPane(customJPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setBounds(0, 100, jFrame.getWidth(), jFrame.getHeight() - 100);

        jFrame.getContentPane().add(jScrollPane);


        jFrame.setVisible(true);
    }
}
