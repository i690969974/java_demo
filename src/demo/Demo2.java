package demo;

public class Demo2 {
    public Demo2(){
        System.out.println("void:");
    }
    public Demo2(int a){
        System.out.printf("这是一个数字: %d", a);
    }
    public Demo2(String b){
        System.out.println("字符串:");

    }
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Demo2 zxc = new Demo2();
        double xc = zxc.add(2.5,3);
        System.out.println(xc);
        int as = Math.addExact(3,4);
        System.out.println(as);

    }







}
