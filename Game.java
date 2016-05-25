public class Game{
  private int score1 = 0;
  private int score2 = 0;
  private String teamname1, teamname2;

  public Game(HockeyTeam team1,HockeyTeam team2){
    teamname1 = team1.getName();
    teamname2 = team2.getName();

      
    
    toString();
  }
  public String toString(){
    return teamname2+ "("+score2+") at "+teamname1 + "("+score1+")" ;
  }
  public void goal(HockeyTeam team){
    if( teamname1 == team.getName()){
    score1 ++;
    }
    else if( teamname2 == team.getName()){
    score2 ++;
    }
    else if( teamname2 != team.getName() && teamname2 != team.getName()){
    System.out.println("That team isn't playing in this game");
    }
  }
}