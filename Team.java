public class Team {
    String teamName;
    Human[] member = new Human[4];

    public Team(String teamName, Human member1, Human member2, Human member3, Human member4) {
        member[0] = member1;
        member[1] = member2;
        member[2] = member3;
        member[3] = member4;

        this.teamName = teamName;
    }

    public void teamInfo() {
        for (Human human : member) {
            System.out.println(human);
        }
    }


    public void getDistance() {
        for (Human human : member) {
            if (human.isWin) {
                System.out.println(human);
            }

        }
    }
}