/** 
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *assignment 4b
 *description: Node object, modeled after Data Structures
 *and Algorithim Analysis by Clifford Shaffer Chapter 4.1.2
 */

public class Node<E>{
    private E element;
    private Node<E> next;

    /** 
     *Node Constructor takes an element object and a node object 
     * and creates a new node.
     *@param element_ the data to be stored in this node
     *@param next_ the next node to be pointed toward
    */
    Node(E element_, Node<E> next_){
        element = element_;
        next = next_;
    }

    /**
     * Getter method to return next
     * @return next the next node in the linked list
     */
    private Node<E> getNext(){
        return next;
    }

    /**
     * Getter method to return element
     * @return element the element stored within this node
     */
    private E getElement(){
        return element;
    }

    /**
     * Setter method to set the value of next
     * @param next_ the value that will replace the current value of next
     */
    private void setNext(Node<E> next_){
        next = next_;
    }
    
    /**
     * Setter method to set the value of element
     * @param element_ the value that will replace the current element
     */
    private void setElement(E element_){
        element = element_;
    }

}