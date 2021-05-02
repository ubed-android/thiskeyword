public class Main {
    int x;

    public Main(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        Main myobj=new Main(5);
        System.out.println("value of x="+myobj.x);
    }
}
