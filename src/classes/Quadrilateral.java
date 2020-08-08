package classes;

public abstract class Quadrilateral {

    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public Quadrilateral() {

    }

    public Quadrilateral(int a, int b, int c, int d)
    {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }



    public int districht(){

        int result = a + b + c + d;

        return result;
    }
}
