package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
	private Node<T> root;
	private int height;
	private int size;

	protected class Node<T> {
        int key;
        int width;
        T value;
        Node<T> parent;
        List<Node> children;

        public Node(int key, T value) {
        	this.key = key;
        	this.value = value;
        	width = 0;
        	children = new ArrayList<Node>();
        }
        
        public Node<T> add(Node<T> node) {
        	children.add(node);
        	width++;
        	return node;
        }
	}

	public Tree() {
		root = new Node<T>(0, null);
		height = 0;
		size = 0;
	}
	
	public boolean insert(Node<T> node, T value) {
		if(node == null)				return false;
		Node<T> child = new Node<T>(node.width + 1, value);
		if(node.add(child) == null)		return false;
		return true;
	}



}
