package imprimir;

public class Print{
    public static void main(String[] args) {
        print("uno");
        print("dos");
        print(3);
        print(4);
        print(6 - 1);
        print(7 - 1 + " si");
        int num = 7;
        print(num);
        String num2 = "8";
        print(num2);
    }

    public static void print(Object arg){
        System.out.println(arg);
    }
} 