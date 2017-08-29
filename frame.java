/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveTest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author info
 */
public class MoveTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.setVisible(true);
        f.setResizable(true);   //Ich wollte, dass man das Fenster auch größer machen kann
        
        
        while(true){
            if(f.getUp())f.player_posy-=5;
            if(f.getDown())f.player_posy+=5;
            if(f.getRight())f.player_posx+=5;
            if(f.getLeft())f.player_posx-=5;
            
            
            
            f.repaintScreen();
            
            
            
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoveTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}
