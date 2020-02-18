package construction;

public class construction {
	public double cost(char standard,double area,char automation)
	{
		double house_cost=0;
		if(automation=='n')
		{
			if(standard=='s')
				house_cost=area*1200;
			else if(standard=='a')
				house_cost=area*1500;
			else if(standard=='h')
				house_cost=area*1000;
		}
		else if(standard=='h' && automation=='y')
			house_cost=area*2500;
	return house_cost;
	}
}
