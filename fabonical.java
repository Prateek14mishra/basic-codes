class Fibonical
{
	int fun(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
		{	
			return fun(n-2)+fun(n-1);
		}
	}
	public static void main(String args[])
	{
		Fibonical ob = new Fibonical();
		for (int i=0;i<9;i++)
		{
			int x= ob.fun (i);
			System.out.println(x);
			/*it can also be weitten as 
			System.out.println(fun(i));*/
		}
	}
}