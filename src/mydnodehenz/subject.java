/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydnodehenz;

/**
 *
 * @author Henz Montera
 */
public class subject {
    
    private int subcodes;
    private String subnames;
    
    public subject(int subcodes, String subnames){
        this.subcodes = subcodes;
        this.subnames = subnames;
    }
    
    public int getsubcodes(){
        return subcodes;
    }
    
    public String getsubnames(){
        return subnames;
    }
    
    public String displaysubs(){
        return "["+subcodes+" "+subnames+"]";
    }
    
}
