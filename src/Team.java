public class Team {
    public String teamName;

    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println(teamName);
        System.out.println("p1 - " + p1.name + " - " + p1.programmingLanguage + " - " + p1.yearsOfExperience);
        System.out.println("p2 - " + p2.name + " - " + p2.programmingLanguage + " - " + p2.yearsOfExperience);
    }
}
