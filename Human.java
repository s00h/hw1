public class Human {
    String name;
    boolean isWin;
    int maxDistance;


    public Human(String name, int maxDistance) {
        this.name = name;
        isWin = false;
        this.maxDistance = maxDistance;
    }
    @Override
    public String toString() {
        return name + " - " + isWin + " - " + maxDistance;
    }
}
