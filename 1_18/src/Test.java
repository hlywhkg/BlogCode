import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $申先生
 * @Description days
 * @date 2022/1/18 10:59
 * @Version 1.0
 */
/*//定义一个泛型接口
interface A<T> {
    public T next();
}

class B<T>  implements A<T> {
    public T next(){
        return null;
    }
}


class Fruit {
    public String whatIs() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String whatIs() {
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public String whatIs() {
        return "Orange";
    }
}

class redApple extends Apple {
    @Override
    public String whatIs() {
        return "redApple";
    }
}*/

/*class test{
    *//*public void method(List<String> list){
        System.out.println("this is method (List<String> list)");
    }
    public void method(List<Integer> list){
        System.out.println("this is method (List<Integer> list)");
    }*//*



}*/
public class Test {
    /*public static int method(List<String> list){
        System.out.println("this is method (List<String> list)");
        return 1;
    }
    public static String method(List<Integer> list){
        System.out.println("this is method (List<Integer> list)");
        return "";
    }*/
    public static void main(String[] args) {
       /* method(new ArrayList<String>());
        method(new ArrayList<Integer>());*/

        /*List<Apple>apples = new ArrayList<>();
        Apple apple = new Apple();
        apples.add(apple);

        List<? extends Fruit> fruits = apples;
        //fruits.add(new Apple());
        //fruits.add(new Orange());

        Fruit fruit = fruits.get(0);
        System.out.println(fruit);
        System.out.println(fruits.contains(apple));
        System.out.println(fruits.indexOf(new Orange()));*/


        /*List<Fruit> fruits = new ArrayList<Fruit>();
        List<? super Apple> appleSupers=fruits;
        System.out.println(appleSupers.add(new redApple()));
        Object object = appleSupers.get(0);
        System.out.println(object);*/




        /*List<Fruit> fruits = new ArrayList<Fruit>();
        List<?> appleSupers=fruits;
        appleSupers.add(new redApple());
        Object object = appleSupers.get(0);
*/

        //ArrayList<String>arrayList = new ArrayList<>();

        /*Apple[] arrayApples = new Apple[10];
        Fruit[] arrayFruits = arrayApples;
        arrayFruits[0] = new Orange();*/

        //List<Fruit>fruits = apples;

        /*List<Apple>apples = new ArrayList<>();
        List<Fruit>fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(apples);*/

        /*Apple[] arrayApples = new Apple[10];
        Fruit[] arrayFruits = arrayApples;
        arrayFruits[0] = new Orange();*/
        //arrayFruits[0] = new Apple();
    }
}
