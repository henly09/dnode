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
public class dnode<E> {
    
    
    
    private dnode<E> prev;
    private E element;
    private dnode<E> next;
    
    public dnode(dnode<E> prev,E element,dnode<E> next){
        this.next = next;
        this.element = element;
        this.prev = prev;  
    }
    public dnode<E> getPrev() { /// used for setting the next node for the element
        return prev;
    }
    public void setPrev(dnode<E> prev) { /// used for setting the next node for the element
        this.prev = prev;
    }
    public E getElement() { /// used for selecting the element
        return element;
    }
    public void setElement(E element) { 
        this.element = element;
    }
    public dnode<E> getNext() {  /// used for setting the next node for the element
        return next;
    }
    public void setNext(dnode<E> next) { /// used for setting the next node for the element
        this.next = next;
    }
    
    
}
