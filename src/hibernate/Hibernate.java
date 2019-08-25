
package hibernate;


import javax.swing.JOptionPane;


public class Hibernate {


    public static void main(String[] args) {
        
        int ySide = JOptionPane.showOptionDialog(null, "Izaberite jednu opciju", "Information", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE, null, new String[] { "InfoApp","Cancel"}, null);
        
        
        switch(ySide) 
        {
            
            case JOptionPane.YES_OPTION :
                JFrame z = new JFrame();
                z.setVisible(true);
                break;
            
            case JOptionPane.NO_OPTION :
                System.exit(0);
                break;
        } 
       
    }
    
   
}
    

