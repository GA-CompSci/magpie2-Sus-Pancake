public class App {
    public static void main(String[] args) throws Exception {
        print("Hello World!");
        print("The sum of 5 and 3 is " + add(5, 3));
    }
    public static void print(String str){
        System.out.println(str);
    }
    public static int add(int a, int b){
        return a + b;
    }
}
