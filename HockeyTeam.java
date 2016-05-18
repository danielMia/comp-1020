package newLab1;

class HockeyTeam {
	private String name;
	private int win;
	private int loss;
	private int lostOvertime;
	private int points;
	private String strwin, strloss, strlostOvertime, strpoints;
	private static int counter = 0;
	public static HockeyTeam[] arr = new HockeyTeam[64];
	
	

	public HockeyTeam(String Name, int numWin, int numLoss, int numOvertime)
	{
		this.name = Name;
		this.win = numWin;
		this.loss = numLoss;
		this.lostOvertime = numOvertime;
		counter++;
	}

//	
	
//	public void listTeams()
//	{
//		arr[counter] = ;
//	}
	public void won()
	{
		win ++;
	}
	
	public void lost()
	{
		loss++;
	}
	public void lostOvertime()
	{
		lostOvertime ++;
	}
	

	public String teamname()
	{
		return name;
	}
	public int Getwin()
	{
		return win;
	}
	public int Getloss()
	{
		return loss;
	}
	public int Getovertime()
	{
		return lostOvertime;
	}
	public int points()
	{
		points = win * 2 + lostOvertime;
		return points;
	}
	public String toString()
	{
		points();
		strwin = Integer.toString(win);
		strloss = Integer.toString(loss);
		strlostOvertime = Integer.toString(lostOvertime);
		strpoints = Integer.toString(points);
		return name+"(" + strwin + "," + strloss+ "," + strlostOvertime +"="+ strpoints+")";
	}
	public void listTeams()
	{
		arr[counter] = new HockeyTeam(name, win, loss, lostOvertime);
	}
	public void print()
	{
		for(int i =0; i<counter ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
