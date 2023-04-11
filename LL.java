class LL{
 
 Node head;
 private int size;
 
 LL(){
 this.size = 0 ;
 }
 
 class Node {
 int data;
 Node next;
 
 Node(int data){
 this.data = data;
 this.next = null;
 size++;
 }
 }
 
 //add first,
 
 public void addfirst(int data){
 Node newNode = new Node(data);
 if(head == null){
 head = newNode;
 return;
 }
 newNode.next = head;
 head = newNode;
 }
 
 //add last,
 
 public void addlast(int data){
 Node newNode = new Node(data);
 if(head == null){
 head = newNode;
 return;
 }
 
 Node currNode = head;
 while(currNode.next != null){
 currNode = currNode.next;
 }
 currNode.next = newNode;
 }
 
 //print
 
 public void printlist(){
 if(head == null)
 {
 System.out.print("List is Empty");
 return;
 }
 Node currNode = head;
 while(currNode != null){
 System.out.print(currNode.data + "->");
 currNode = currNode.next;
 }
 System.out.println("NULL");
 }
 
 //deletefirst
 
 public void deletefirst(){
 if(head == null){
 System.out.print("The list is empty");
 return;
 }
 size--;
 head = head.next;
 }
 
 //deletelast
 
 public void deletelast(){
 if(head == null){
 System.out.print("The list is empty");
 return;
 }
 size--;
 if(head.next == null){
 head = null;
 return;
 }
 Node secondlast = head;
 Node lastNode = head.next;
 while(lastNode.next != null){
 lastNode = lastNode.next;
 secondlast = secondlast.next;
 }
 secondlast.next = null;
 }
 public int sizecounter(){
 return size;
 }
 
 public static void main(String args[]){
 LL list = new LL();
 list.addfirst(2);
 list.printlist();
 
 list.addlast(3);
 list.printlist();
 
 list.addlast(4);
 list.printlist();
 
 list.addlast(5);
 list.printlist();
 
 list.addfirst(1);
 list.printlist();
 list.deletefirst();
 list.printlist();
 
 list.deletelast();
 list.printlist();
 System.out.println("Size is "+list.sizecounter());
 list.addfirst(1);
 list.printlist();
 System.out.println("Size is "+list.sizecounter());
 }
}