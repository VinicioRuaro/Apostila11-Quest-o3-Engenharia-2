/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg3;

import javafx.stage.Window;
//import java.awt.Window;
import javafx.scene.layout.Border;
import javafx.scene.text.Text;
//import com.sun.glass.ui.Window;




/**
 *
 * @author vinic
 */
public class PadraoDecorator {

    /**
     * @param args the command line arguments
     */
   
        public void createWindow(){ 
            Window Decorator = new Border(new HorizontalScroll(new TextWindow()));
           
    }
    
}
