/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinematicssimulator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author gabe
 */
class Window extends JPanel{
    public Window(){
            

        JFrame f = new JFrame("KinematicsSimulator");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.pack();
        f.setSize(1000, 600);
        f.setVisible(true);
            
        
    }
}
