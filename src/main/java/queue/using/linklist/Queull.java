package queue.using.linklist;

public class Queull <t>{
    class Node{
        t value;
        Node left;
        Node(t value)
        {
            this.value=value;
        }
    }
    private Node front=null;
    private Node rear=null;
    public void get()
    {
    Node current=front;
    while(current != null){
            System.out.println(current.value +" -> ");
            current = current.left;
        }

    }
    public void add(t value)
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
    public t delete()
    {
        if (front==null && rear==null)
        {
            System.out.println("queue is empty");
        }
        Node current=front;
        front=front.left;
        current.left=null;
        if (front.left==null)
        {
            rear=null;
        }
        return current.value;

    }
    public int size()
    {
        int count = 0;
        Node current=front;

        while(current != null){
            count += 1;
            current=current.left;
        }
        return count;
    }
}

