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
     * @param size the initial size of the list.
     */
    LinkedList(int size_){
        this();
    }

    /**
     * Constructor for the LinkedList class
     */
    LinkedList(){
        current = head = tail = new Node<E>(null);
        sizeOfList = 0;
    }

    /**
     * Method clears list by dropping pointer at head node.
     * Creates a new blank head node and incrememnts the size of the list.
     */
    public void clear(){
        head.setNext(null);
        current = tail = head = new Node<E>(null);
        sizeOfList++;
    }

 }