import java.util.Arrays;

public class MainClass {
public static void main (String[] args){
    Human human1 = new Human("Joe", 400);
    Human human2 = new Human("Billy", 300);
    Human human3 = new Human("Mary", 200);
    Human human4 = new Human("Kate", 100);
    Team team = new Team("GeekSport", human1, human2, human3, human4);
    Course course = new Course(200, 300, 400);

    team.teamInfo();
    System.out.println("==========================");
    course.doIt(team);

    team.getDistance();

}
}
