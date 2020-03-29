/**
 *@author Matthew Scaccia
 *course CIS303
 *@since 3/29/2020
 *assignment 4b
 *description: LinkedList data structure, modeled after Data Structures
 *and Algorithim Analysis by Clifford Shaffer Chapter 4.1.2
 */

 public class LinkedList<E> implements List<E>{

    private Node<E> head;
    private Node<E> tail;
    protected Node<E> current;
    private int sizeOfList;

    /**
     * Constructor - ignores size.
     */
    LinkedList(int size_){
        this();
    }

    LinkedList(){
        current = head = tail = new Node<E>(null);
        sizeOfList = 0;
    }
 }