package games;

public class Player {

    int score;
    String name;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void rageQuit() {
        System.exit(0);}

        @Override
        public String toString () {
            return "Name " + this.name + ", score: " + this.score;

    }
}
