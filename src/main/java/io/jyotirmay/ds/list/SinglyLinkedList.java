package io.jyotirmay.ds.list;

import java.io.Serializable;

public class SinglyLinkedList<E> implements Serializable {

    private static class Node<E>{

        private E data;

        private Node<E> next;

        private Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;

    private Node<E> tail;

    private int size;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public E first(){
        if(isEmpty())
            return null;
        return head.data;
    }

    public E last(){
        if(isEmpty())
            return null;
        return tail.data;
    }

    public void addFirst(E data){
        head = new Node<>(data, head);
        if(isEmpty()){
            tail = head;
        }
        size++;
    }

    public void addLast(E data){
        Node<E> newestNode = new Node<>(data, null);

        if(isEmpty()){
            head = newestNode;
        }else{
            tail.next = newestNode;
        }
        tail = newestNode;
        size++;
    }

    public E removeFirst(){
        if(isEmpty())
            return null;

        E data = head.data;
        head = head.next;
        size--;

        if(isEmpty()){
            tail = null;
        }
        return data;
    }
}
