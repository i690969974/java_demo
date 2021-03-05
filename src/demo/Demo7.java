package demo;

public class Demo7{
    double a, c;
    char b;
    public Demo7(double a,char b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getanswer(){
        if (b == '+'){
            Double answer = add();
            return answer.toString();
        }
        else if (b == '-'){
            Double answer = subtraction();
            return answer.toString();
        }
        else if (b == '*'){
            Double answer = multiplication();
            return answer.toString();
        }
        else if (b == '/'){
            Double answer = division();
            return answer.toString();
        }
        else {
            return "xxxx";
        }
    }
    public double add(){
        return a + c;
    }
    public double subtraction(){
        return a - c;
    }
    public double multiplication(){
        return a * c;
    }
    public double division(){
        return a / c;
    }
}
