import java.lang.*;
class myTime
{
	int h,m,s;
	public void getTime(int hh,int mm,int ss)
	{
		h=hh;
		m=mm;
		s=ss;
	}
	public void showTime()
	{
		System.out.print(h+":"+m+":"+s);
	}
}
class time
{
	public static void main(String args[])
	{
		myTime A=new myTime();
		A.getTime(9,10,30);
		A.showTime();
	}	
}

		
