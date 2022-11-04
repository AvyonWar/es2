public class CompetitioRules {
    private static CompetitioRules competitioRules = new CompetitioRules();
    public String competitionRules1 = "Do not copy and past from StackOverflow!";
    public String competitionRules2 = "Learn every day";
    public String competitionRules3 = "Be the best team!";
    public void printRuls(){
        System.out.println(competitionRules1);
        System.out.println(competitionRules2);
        System.out.println(competitionRules3);
    }

    private CompetitioRules(){}
    public  static CompetitioRules getInstance(){
        return competitioRules;
    }
}
