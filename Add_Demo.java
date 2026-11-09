class Add {
    int a;

    void add() {
        System.out.println("Add method called");
    }

    int divide(int w, int z) {
        int x = w / z;
        System.out.println("x = " + x);
        return x;
    }

    // Overloaded multiply method for 2 parameters
    void multiply(int a, int b) {
        int p = a * b;
        System.out.println("p = " + p);
    }

    // Overloaded multiply method for 3 parameters
    void multiply(int a, int b, int d) {
        int p = a * b * d;
        System.out.println("p = " + p);
    }
}

public class Add_Demo {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.a = 5;
        System.out.println(obj.a);
        obj.add();

        obj.multiply(10, 12);
        obj.multiply(10, 12, 15);
        obj.divide(24, 6);
    }
}