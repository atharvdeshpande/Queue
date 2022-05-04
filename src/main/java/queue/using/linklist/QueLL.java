package queue.using.linklist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class QueLL<V>{
    class Node{
        V value;
        Node left;
        Node(V value)
        {
            this.value=value;
        }
    }
    private static final Logger log = LogManager.getLogger(QueLL.class);
    private Node front=null;
    private Node rear=null;
    public void get()
    {
    Node current=front;
    while(current != null){
        log.info(current.value);
        current = current.left;
        }

    }
    public V getat(int pos)
    {
        Node current=front;
        int c=1;
        while(current != null){


            if(c==pos)
            {
                break;
            }
            c++;
            current = current.left;
        }
        if(current == null)
        {
            return null;
        }
        else {
            return current.value;
        }

    }
    public void add(V value)
    {
    if (front==null && rear==null)
    {
        Node n=new Node(value);
        front=n;
        rear=n;
        return;
    }
        Node n=new Node(value);
        rear.left=n;
        rear=n;
    }
    public V delete()
    {

            if (front == null && rear == null) {
                log.info("queue is empty");



            }
            Node current = front;
            front = Objects.requireNonNull(front).left;
            current.left = null;
            return current.value;



    }

}

