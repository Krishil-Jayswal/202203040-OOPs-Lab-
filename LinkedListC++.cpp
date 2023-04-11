#include<iostream>

using namespace std;

class Node
{
	public :
		int data;
		Node *next;
	//constructer
	Node(int data)
	{
		this->data = data;
		this->next = NULL;
	}
	//Destructer
	~Node(){
		int value = this->data;
		if(this->next != NULL)
		{
			delete next;
			this->next = NULL;
		}
		cout<<"Memory is free"<<endl;
	}
};

//Inserting Node at head
void InsertAtHead(Node* &head, int d)
{
	Node* temp = new Node(d);
	if(head == NULL)
	{
		head = new Node(d);
		return;
	}
	temp->next = head;
	head = temp;
}

void InsertAtTail(Node* &tail, int d)
{
	Node* temp = new Node(d);
	tail->next = temp;
	tail = tail->next;	
}

void InsertAtPosition(Node* &tail, Node* & head,int position, int d){
//Inserting Node at start
	if(position ==1)
	{
		InsertAtHead(head,d);
		return;
	}


	Node* temp = head;
	int c=1;

	while(c<position-1){
		temp = temp->next;
		c++;
	}

//end tail
	if(temp->next == NULL){
		InsertAtTail(tail,d);
		return;
	}

	Node*  nodetoinsert = new Node(d);
	nodetoinsert->next = temp->next;
	temp->next = nodetoinsert;

}

// print list
void print(Node* &head){
	Node* temp = head;
	while(temp != NULL){
		cout<<temp->data<< "->";
		temp = temp->next;
	}
	cout<<"NULL";	
	cout<<endl;
}

void deleteNode(int position, Node* &head){
	if(position == 1){
		Node* temp = head;
		head = head->next;
		temp->next = NULL;
		delete temp;
	}
	else{
		Node* curr = head;
		Node* prev = NULL;
		int c=1;
		while(c< position){
			prev = curr;
			curr = curr->next;
			c++;
		}
		prev->next = curr->next;
		curr->next = NULL; 
		delete curr; 

	}
}

int main(){
	int n;
	cout<<"Enter the value of head node : ";
	cin>>n;
	Node* node1 = new Node(n);
	// head pointedd to node1
	Node* head = node1;
	Node* tail = node1;
	InsertAtHead(head,3);
	
	print(head);
	InsertAtHead(head,1);
	print(head);


	InsertAtTail(tail,4);
	print(head);
	InsertAtTail(tail,5);
	print(head);

	InsertAtPosition(tail,head,2,2);
	print(head);

	cout<<"Head "<<head->data <<endl;
	cout<<"Tail "<<tail->data <<endl;

	deleteNode(1,head);
	print(head);

	deleteNode(3,head);
	print(head);

	cout<<"Head "<<head->data <<endl;
	cout<<"Tail "<<tail->data <<endl;

	return 0;
}
