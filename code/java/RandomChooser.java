import java.util.Random;


public class RandomChooser {
    private int number;

    public RandomChooser(){

    }

    public int pickANumber(){
        Random r = new Random();
        return r.nextInt(10)+1;
    }
}
