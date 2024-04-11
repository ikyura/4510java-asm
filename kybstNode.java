public class kybstNode {
private String data;
private kybstNode left;
private kybstNode right;
public kybstNode(String data) {
this.data = data;
this.left = null;
this.right = null;
}
public String getData() { return data; }
public kybstNode getLeft() { return left; }
public kybstNode getRight() { return right; }
public void setLeft(kybstNode p) { left = p; }
public void setRight(kybstNode p) { right = p; }
}