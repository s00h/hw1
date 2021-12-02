public class Course {
    int[] obstacle = new int[3];

    public Course(int o1, int o2, int o3 ) {
        obstacle[0] = o1;
        obstacle[1] = o2;
        obstacle[2] = o3;
        this.obstacle = obstacle;
    }

    public void doIt (Team team){
for (Human human: team.member) {
    for (int distance: obstacle) {
        if (human.maxDistance >= distance) {
            human.isWin = true;
        }
        else human.isWin = false;
        break;
    }
}
    }
}
