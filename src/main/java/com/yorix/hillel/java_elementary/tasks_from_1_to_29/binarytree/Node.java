package com.yorix.hillel.java_elementary.tasks_from_1_to_29.binarytree;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "data = {" + data + "}" ;
    }
}
