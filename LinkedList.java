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

    /**
     * Method inserts a new node into the LinkedList.
     * @param new_ element to be added to the LinkedList
     */
    public void insert(E element){
        current.setNext(new Node<E>(element, current.getNext()));
        if(tail == current)
            tail = current.getNext();
        sizeOfList++;
    }

    /**
     * Method takes an element and adds it to the back of the LinkedList
     * @param element the element to be appended to the LinkedList
     */
    public void append(E element){
        tail.setNext(new Node<E>(element, null));
        tail = tail.getNext();
        sizeOfList++;
    }

    /**
     * Method removes an element from the list.
     * @return the current element
     */
    public E remove(){
        if(current.getNext() == null)
            return null;
        E element = current.getNext().getElement();
        if(tail == current.getNext())
            tail = current;
        current.setNext(current.getNext().getNext());
        sizeOfList--;
        return element;
    }

    /**
     * Sets the current node to the head of the LinkedList.
     */
    public void moveToStart(){
        current = head;
    }

    /**
     * Sets the current node to the tail of the LinkedList.
     */
    public void moveToEnd(){
        current = tail;
    }
    
    /**
     * Method sets the current node that of one node to the left.
     */
    public void prev(){
        if(current == head) 
            return;
        Node<E> temp = head;
        while(temp.getNext() != current)
            temp = temp.getNext();
        current = temp;
    }

    /**
     * Method sets the current node to that of one node to the right.
     */
    public void next(){
        if(current != tail)
        current = current.getNext();
    }
    
    /**
     * Method returns the current length of the list.
     * @return the length of the list
     */
    public int length(){
        return sizeOfList;
    }

 }