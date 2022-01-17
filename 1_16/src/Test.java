import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName $申先生
 * @Description days
 * @date 2022/1/16 20:57
 * @Version 1.0
 */
/*class A{
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

class B{
    public String bTalk(){
        return "this is B";
    }
}

class C{
    public String cTalk(){
        return "this is C";
    }
}*/
class A<T>{
    private T object;

    public A(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

class B{
    public String bTalk(){
        return "this is B";
    }
}

class C{
    public String cTalk(){
        return "this is C";
    }
}

/*class Solution {
    void preOrder(TreeNode root){
        if(root == null)return;
        preOrder();
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();

    }
}*/
/*class myStake<E>{
    public myStake();
    public void push(E e);
    public E pop();
    public boolean isEmpty();

    public void pushAll(Iterable<E> src){
        for (E e:src) {
            push(e);
        }
    }
}*/
public class Test {
    /*public static void main(String[] args) {
        *//*myStake<Number> stake = new myStake<>();
        Iterable<Integer>integers = new Iterable<Integer>();
        stake.pushAll(integers);
        Stack<String>stack1 = new Stack<>();*//*
        myStake<Number> stake = new myStake<>();
        Collection<Object>objects = new Collection<Object>();
        stake.pushAll(objects);

    }*/
    public static void main(String[] args) {
        /*A a = new A();

        a.setObject(new B());
        B b = (B)a.getObject();

        a.setObject(new C());
        C c = (C)a.getObject();*/
        /*A<B> a = new A();

        a.setObject(new B());
        B b = a.getObject();

        a.setObject(new C());
        C c = a.getObject();*/
        /*A a1 = new A(123);
        a1.setObject("heat");
        A a2 = a1.getObject();*/
    }
}
