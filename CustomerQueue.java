public class CustomerQueue
{
   private Node head;
   private int length;
   private Node tail;
   
   public CustomerQueue()
   {
      head = tail = null;
      length = 0;
   }
   
   public void add(Customer c)
   {
      if (length == 0)
      {
         head = new Node(c);
         tail = head;
      }
      
      else 
      {
         tail.setNext(new Node(c));
         tail = tail.getNext();
      }
      
    }
    public int size()
    {
      return length;
    }
      
    public void remove ()
    {
      head = head.getNext();
    }
    
    public Customer get()
    {
       return head.getData();
    }    
}   