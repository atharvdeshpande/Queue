package queue.using.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueLLTest {
    @Test
    void addTest()
    {
        QueLL<Integer> q1= new QueLL<>();
        q1.add(20);
        q1.add(25);
        q1.add(30);
        q1.add(35);
        q1.add(45);
        q1.add(60);
        assertEquals(20,q1.getat(1));
        assertEquals(25,q1.getat(2));
        assertEquals(30,q1.getat(3));
        assertEquals(35,q1.getat(4));
        assertEquals(45,q1.getat(5));
        assertEquals(60,q1.getat(6));
    }
    @Test
    void deleteTest()
    {
        QueLL<Integer> q1= new QueLL<>();
        q1.add(20);
        q1.add(25);
        q1.add(30);
        q1.add(35);
        q1.add(45);
        q1.add(60);
        assertEquals(20,q1.delete());
        assertEquals(25,q1.delete());
        assertEquals(30,q1.delete());
        assertEquals(35,q1.delete());
        assertEquals(45,q1.delete());
        assertEquals(60,q1.delete());
    }
}
