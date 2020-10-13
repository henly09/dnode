/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydnodehenz;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public class dlist<E> {  
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    private dnode<E> header, trailer;
    private int size;
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public dlist(){
        trailer = new dnode<>(null, null, null);        // this here is for the initialization of the trailer and the header.
        header = new dnode<>(null, null, trailer);      // header <------------ trailer
        trailer.setPrev(header);
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    private void addmid(dnode<E> prev, E element, dnode<E> next){ // method in order to add a element to the trailer or to the header
        dnode<E> newnode =  new dnode<>(prev,element,next);        // prev node <---- New node -------> next node
        prev.setNext(newnode);                                      // then size++ for the expansion of the node size.
        next.setPrev(newnode);
        size++;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public void addfirst(E element){                   //if you want to add first// header + your element + header sa sunod nga element
        addmid(header,element,header.getNext());        // header <--------- element -----------> next header or header.getNext();
    }                                                   // this will be in the header part. fucker   adding first
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public void addlast(E element){                    /// if you want to add last  /// ang nag una sa trailer + your element + trailer
        addmid(trailer.getPrev(),element,trailer);     /// previous node of the trailer <------ element --------> the trailer itself
    }                                                  /// this will be in the trailer part fucker. adding last part
    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    private E remove(dnode<E> node){                    /// a method for removing a node
        E temp = node.getElement();                     /// the header will be connected on the next node of the removed node
        node.getNext().setPrev(node.getPrev());         ///       V-------------------------------------------|  
        node.getPrev().setNext(node.getNext());         /// EX. header ====== removed node =========== next node to the remmoved header
        node.setNext(null);                             ///        |------------------------------------------^
        node.setPrev(null);                             ///  null means setting the pointer into nothing
        size--;                                         // removing the node by decreasing it's size
        return temp;                                    // return temp.
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public E removefirst(){                             // a constructor in removing the header node (the current one)
        return remove(header.getNext());                // header -----> (NODE THAT WILL BE REMOVED) <--------- next to the removed node
    }                                                   // this is for the header part fucker.
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public E removelast(){                              // a constructor in removing the trailer node (the current one)
        return remove (trailer.getPrev());              // previous of the removed node -----> (NODE THAT WILL BE REMOVED) <--------- trailer
    }                                                   // this is for the trailer part fucker.
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public int size(){                  /// checker for the size of the node
        return size;                    
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public boolean isEmpty(){           /// checking if the node is empty
        return size == 0;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public E first(){
        return header.getNext().getElement();   // checker for the current first
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public E last(){
        return trailer.getPrev().getElement();  // checker for the current last in the node
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------
    public void display(){          
        dnode<E> temp = header.getNext();
    for (int i = 0; i < size(); i++){
            System.out.print("["+temp.getElement()+"]");
           temp = temp.getNext();
      }       
         System.out.print("\n"+"Current Header:"+first());
         System.out.print("\n"+"Current Tail:"+last()+"\n");      
     
        System.out.print("size: "+size()+"\n");
     
        }
    }
    

