
import sarah.Lapin;

public class Sarah {
            static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Hello world");
        Lapin lap = new Lapin("bob", 5);
        while (i<=10){
            lap.crier();
            i=i+1;
        }
        }
    }
    
