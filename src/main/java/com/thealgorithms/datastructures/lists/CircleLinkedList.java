package main.java.com.thealgorithms.datastructures.lists;

public class CircleLinkedList {

	private static class Node<E> {

		Node<E> next;
		E value;

		private Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}
	}

	// For better 0.0 design this should be private allows for better black box design
	private int size;
	// this will point to dummy node;
	private Node<E> head = null;
	private Node<E> tail = null; // keeping a tail pointer to keep track of the end of list

	// constructor for class.. here we will make a dummy node for circly linked list implementation
	// with reduced error catching as our list will never be empty;
	public CircleLinkedList() {
		// creation of the dummy node
		head = new Node<E>(null, head);
		tail = head;
		size = 0;
	}

	// getter for the size... needed because size its private.
	public int getSize() {
		return size;
	}

	// for the sake of simplicity this class will only contain the append function or addList other
	// add functions can be implemented however this is the basses of them all really.
	public void append(E value) {
		if (value == null) {
			// we do not want to add null elements to the list.
			throw new NullPointerException("Cannot add null element to the list");
		}
		// head.next points to the last element;
		if (tail == null) {
			tail = new Node<E>(value, head);
			head.next = tail;
		} else {
			tail.next = new Node<E>(value, head);
			tail = tail.next;
		}
		size++;
	}

	// utility function for teraversing the list
	public String toString() {
		Node p = head.next;
		String s = "[ ";
		while (p != head) {
			s += p.value;
			s += " , ";
			p = p.next;
		}
		return s + " ]";
	}

	public static void main(String args[]) {
		CircleLinkedList cl = new CircleLinkedList<Integer>();
		cl.append(12);

	}
}
