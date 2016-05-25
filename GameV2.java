public class GameV2{
  private int score1 = 0;
  private int score2 = 0;
  private String teamname1, teamname2;
  private String end = "";
  private TeamList league;
  private HockeyTeam team1,team2;
  public GameV2(HockeyTeam team1,HockeyTeam team2){
    teamname1 = team1.getName();
    teamname2 = team2.getName();
    this.team1 = team1;
    this.team2 = team2;
  }
  public String toString(){
    return teamname2+ "("+score2+") at "+teamname1 + "("+score1+")" + end ;
  }
  public void ended(){
    end = " Fianl";
    if(this.score1<this.score2){
        team2.won();
        team1.lost();
      }
      if(this.score1>this.score2){
        team1.won();
        team2.lost();
      }
  }
  public void overtime(){
    end = " OT";

  }
  public void goal(HockeyTeam team){
    if( teamname1 == team.getName()){
    score1 ++;
    if (end == " OT"){
        team1.won();
        team2.lostOvertime();
        end = " OT Final";
    }
    }
    else if( teamname2 == team.getName()){
    score2 ++;
    if (end == " OT"){
        team2.won();
        team1.lostOvertime();
        end = " OT Final";
    }
    }
    else if( teamname2 != team.getName() && teamname2 != team.getName()){
    System.out.println("That team isn't playing in this game");
    }
  }
}