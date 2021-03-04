package demo;

public class Demo4{
    public static int a = 4;
    public void asd(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Demo4 ac = new Demo4();
        Demo4 acc = new Demo4();
        acc.asd();
        ac.asd();
        ac.a = 5;
        acc.asd();
        ac.asd();

    }

}
