import classes.Palindrom;
import classes.Rectangle;
import classes.Square;


public class Main {

    public static void main(String[] args) {


        Palindrom proba = new Palindrom();

        proba.checkWord("skjflkfern");

        // 4.f

        Square negyzet = new Square(5);


        System.out.println(negyzet.districht());

        Rectangle teglalap = new Rectangle(6, 8);

        System.out.println(teglalap.districht());


    }
}
