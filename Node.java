public class Node
{
   private Customer data;
   private Node next;
   
   public Node (Customer c) 
   {
      data = c;
      next = null;
   }
   
   public Customer getData()
   {
      return this.data;
   }
   
   public void setNext(Node n)
   {
      this.next = n;
   }
   
   public Node getNext()
   {
      return this.next;
   }
   
}   
