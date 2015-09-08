public class StackLinkedListbalance<E> {
	public Node headNode;
	@SuppressWarnings("unchecked")

	StackLinkedListbalance() {
		this.headNode = new Node(null);
	}

	public boolean isEmpty() {
		if(headNode == null) {
			return true;
		} else {
			return false;
		}
	}
	@SuppressWarnings("unchecked")
	public void push(E data) {
		Node temp = new Node(data);
		if(headNode == null) {
			headNode = temp;
		} else {
			temp.setNext(headNode);
	        headNode = temp;
    	}
	}

	public void pop() {
		if(isEmpty()) {
			System.out.println("stack is isEmpty");
		} else {
			headNode = headNode.getNext();
		}
	}
	@SuppressWarnings("unchecked")
	public E top () {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return (E)headNode.getData();
		}
	}

	public String toString() {
        String output = "";
        if(headNode == null) {
            output = "List is Empty";
        } else {
            Node current = headNode;
            while (current.getNext() != null) {
                output += current.getData() + "   " ;
                current = current.getNext();
            }
        }
        return output;
    }

}

class Node<E> {
    
    Node next;
    E data;
    @SuppressWarnings("unchecked")
    public Node() {
        next = null;
        data = null;
    }
    public Node(E dataValue) {
        next = null;
        data = dataValue;
    }

 
    public Node(E dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    public E getData() {
        return data;
    }

    public void setData(E dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

}
