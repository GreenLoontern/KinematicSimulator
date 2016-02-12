/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinematicssimulator;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author gabe
 */
class Window extends JPanel{
    
    
    
    public Window(JFrame f){
            
        //set up the frame
        f = new JFrame("KinematicsSimulator");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.pack();
        f.setSize(1000, 600);
        f.setVisible(true);
        
        //setup the GUI
        createGUI(f);
    }
    
    public void createGUI(JFrame f){
        //set the background color
        Color BackgroundColor = new Color(131, 222, 87);
        f.getContentPane().setBackground(BackgroundColor);
    }
}
