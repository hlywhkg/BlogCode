/**
 * @ClassName $申先生
 * @Description days
 * @date 2022/1/18 21:37
 * @Version 1.0
 */
package demo1;

public class A<T> {

    private T key;

    public static <E> void get(E e){
        System.out.println(e.getClass().getName());
    }

    public T getKey(){//这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
        return key;
    }

    /*public E setKey(E key){
        this.key = key;
    }*/

    /*public <T> T showKey(A<E> key){

    }*/

    public static <E> void set(E e){
        System.out.println(e.getClass().getName());
    }

    public static void main(String[] args) {
        A<String>a = new A<>();

        //get方法
        get(123);
        a.get("123");

        //set方法
        set(123);
        a.set("123");

    }

}
