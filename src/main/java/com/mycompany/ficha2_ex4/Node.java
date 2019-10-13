/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha2_ex4;

/**
 *
 * @author vitor
 */
public class Node<T> {
    private Node<T> next;
    private Node<T> previous;

    private T element;

    public Node( T element) {
        this.next = null;
        this.previous = null;
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getElement() {
        return element;
    }
    
    
    
    
}
