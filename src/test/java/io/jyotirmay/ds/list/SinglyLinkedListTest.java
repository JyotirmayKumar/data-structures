package io.jyotirmay.ds.list;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList<String> singlyLinkedList;

    @BeforeEach
    void testBefore(){
        singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    public void testEmpty(){

        assertTrue(singlyLinkedList.isEmpty());
        assertEquals(0, singlyLinkedList.size());
        assertNull(singlyLinkedList.first());
        assertNull(singlyLinkedList.last());

        singlyLinkedList.addFirst("first");
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(1, singlyLinkedList.size());

    }

    @Test
    void testAddFirst(){
        singlyLinkedList.addFirst("last");
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(1, singlyLinkedList.size());
        assertEquals("last", singlyLinkedList.first());
        assertEquals("last", singlyLinkedList.last());

        singlyLinkedList.addFirst("first");
        assertEquals(2, singlyLinkedList.size());
        assertEquals("first", singlyLinkedList.first());
        assertEquals("last", singlyLinkedList.last());
    }

    @Test
    void testAddLast(){
        singlyLinkedList.addLast("first");
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(1, singlyLinkedList.size());
        assertEquals("first", singlyLinkedList.first());
        assertEquals("first", singlyLinkedList.last());

        singlyLinkedList.addLast("last");
        assertEquals(2, singlyLinkedList.size());
        assertEquals("first", singlyLinkedList.first());
        assertEquals("last", singlyLinkedList.last());
    }

    @Test
    void testRemoveFirst(){
        assertNull(singlyLinkedList.removeFirst());
        singlyLinkedList.addLast("first");
        assertEquals(1, singlyLinkedList.size());
        assertEquals("first", singlyLinkedList.removeFirst());
        assertTrue(singlyLinkedList.isEmpty());

        singlyLinkedList.addLast("last");
        singlyLinkedList.addFirst("first");
        assertEquals(2, singlyLinkedList.size());
        assertEquals("first", singlyLinkedList.removeFirst());
        assertEquals(1, singlyLinkedList.size());
        assertEquals("last", singlyLinkedList.removeFirst());
        assertTrue(singlyLinkedList.isEmpty());
    }
}
