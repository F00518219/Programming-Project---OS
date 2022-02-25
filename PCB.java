import java.util.LinkedList;
public class PCB
{
private int parent;
private LinkedList<Integer> children;

public PCB(int p) {
parent = p;
children = new LinkedList<Integer>();
}
public int aParent() {

return parent;
}
public LinkedList<Integer> getChildren() {

return children;
}
public void newChildren() {

children = new LinkedList<Integer>();
}
public void addChild(int i) {

children.add(i);
}
}