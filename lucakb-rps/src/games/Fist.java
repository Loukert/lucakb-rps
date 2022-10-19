package games;

public class Fist {

    //@TODO: where can these fields come to use?
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    public int play(){
        return (int)(Math.random()*3);
    }
}
