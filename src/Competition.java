public class Competition {
    public static  void main(String[]args){
        CompetitioRules competitioRules = CompetitioRules.getInstance();
        System.out.println(competitioRules.competitionRules1 + " - " + competitioRules.competitionRules2 + " - " + competitioRules.competitionRules3);

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "java back-end";
        teamB.teamName = "Android";

        teamA.p1.name = "Giorgio";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 4;
        teamA.p2.name = "Carla";
        teamA.p2.programmingLanguage = "Java, c++";
        teamA.p2.yearsOfExperience = 2;

        teamB.p1.name = "Sofy";
        teamB.p1.programmingLanguage = "Kotlin, java";
        teamB.p1.yearsOfExperience = 7;
        teamB.p2.name = "Luigi";
        teamB.p2.programmingLanguage = "c++, c";
        teamB.p2.yearsOfExperience = 3;

        System.out.println("TeamA - p1 : " + teamA.teamName + " - " + teamA.p1.name + " - " + teamA.p1.programmingLanguage + " - " + teamA.p1.yearsOfExperience );
        System.out.println("TeamA - p2 : " + teamA.teamName + " - " + teamA.p2.name + " - " + teamA.p2.programmingLanguage + " - " + teamA.p2.yearsOfExperience );
        System.out.println("TeamB - p1 : " + teamB.teamName + " - " + teamB.p1.name + " - " + teamB.p1.programmingLanguage + " - " + teamB.p1.yearsOfExperience );
        System.out.println("TeamB - p2 : " + teamB.teamName + " - " + teamB.p2.name + " - " + teamB.p2.programmingLanguage + " - " + teamB.p2.yearsOfExperience );


    }
}
