/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import byu.cit260.murderInTheCity.model.Player;

/**
 *
 * @author W
 */
public class MurderInTheCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Albert Hancock");
        //playerOne.rankTitle("Probational Detective");
        playerOne.setProgress(0.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
