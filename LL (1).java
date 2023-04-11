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
 
 public void Indexfinder(int p){
 if(head == null)
 {
 System.out.print("List is Empty");
 }
 int i = 1;
 Node currNode = head;
 while(currNode != null){
 if(currNode.data == p){
     System.out.print("Index of "+p+"is : "+i);
     return;
 }
 currNode = currNode.next;
 i++;
 }
 i = 0;
 if(i==0)
 {
     System.out.print("Element Does Not Exist in the List.");
 }
 }
 
 public static void main(String args[]){
 LL list = new LL();
 list.addfirst(1);
 list.addlast(5);
 list.addlast(7);
 list.addlast(3);
 list.addlast(8);
 list.addlast(2);
 list.addlast(3);
 list.printlist();
 list.Indexfinder(7);
 }
}