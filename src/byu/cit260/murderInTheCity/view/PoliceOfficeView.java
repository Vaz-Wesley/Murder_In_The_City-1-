/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

/**
 *
 * @author Wesley Vaz_2
 */
public class PoliceOfficeView extends View {
    
    public PoliceOfficeView(){
        super("\n"
            + "\n -------------------------------------------"
            + "\n  Police Office                             "
            + "\n -------------------------------------------"
            + "\n I - Interrogate Suspect                    "
            + "\n S - Solve Crime                            "
            + "\n E - Exit                                   ");
    }
    
    @Override
    public boolean doAction(String choice) {
                
        choice = choice.toUpperCase();
        
        switch (choice){
          case "I":                            // Interrogate suspect
               this.interrogateSuspect();
             break;
          case "S":                           // Solve crime
               this.solveCrime();         
            break;
          case "E":                            // Exit game
               return true;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
     private void interrogateSuspect(){            
            System.out.println("*** policeOffice function called ***");
        }
        
        private void solveCrime(){            
            System.out.println("*** laboratory function called ***");
        }
    
}
