package mydnodehenz;

import java.util.Scanner;
/**
 *
 * @author Henz Montera
 */
public class Mydnodehenz {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);        
       dlist<String> dlist = new dlist<>();     
      String[] names = new String[5];
     String h="";     
       for(int i = 0;i < 5; i++){
        names[i] = scan.next();
        dlist.addfirst(names[i]);
      }              
      dlist.display();  
  
//        dlist<subject> sdlist = new dlist<>();
//        
//        subject cc104 = new subject(580, "Data Structures and Algorithms");
//        subject ipt101 = new subject(556, "Integrative Programming and Tehnologies");
//        subject adv101 = new subject(747, "Elective 1");
//        
//        sdlist.addfirst(cc104);
//        System.out.print(sdlist.first().displaysubs()+"\n");
//        sdlist.addfirst(ipt101);
//        System.out.print(sdlist.first().displaysubs()+"\n");
//        sdlist.addfirst(adv101);
//        System.out.print(sdlist.first().displaysubs()+"\n");
        
        
        
//        sdlist.display();     
    }   
}
