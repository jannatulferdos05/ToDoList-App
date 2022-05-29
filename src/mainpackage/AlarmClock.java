package mainpackage;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioPermission;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AlarmClock {
    public void checkAlarm(final int a, final int b){
        Thread t= new Thread(){
            public void run(){
                System.out.println("Alarmclock er Run start");
                int w=0;
                while(w==0){
                    Calendar calendar= new GregorianCalendar();
                    int hours= calendar.get(Calendar.HOUR);
                    int mins= calendar.get(Calendar.MINUTE);
                        if(a==hours && b==mins){
                            System.out.println("Alam Works sout");
                            JOptionPane.showMessageDialog(null,"Alarm Works alarmclock");
                            break;
                           /* InputStream in;
                            try {
                                in = new FileInputStream(new File("src\\MP3\\AlarmTone.mp3"));
                                AudioInputStream od= new AudioInputStream(in);
                          //      AudioPlayer.player.start(od);
                                AudioPermission();
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }*/
                        }

                }
            }
        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }
    public static void main(String[] args) {
    AlarmClock alarmClock= new AlarmClock();
    alarmClock.checkAlarm(1,29);
    }
}
