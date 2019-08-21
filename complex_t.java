import java.lang.*;
class Complex
{
	int r,i;
	static Complex getComplex(int x,int y)
	{
		Complex c=new Complex();
		c.r=x;c.i=y;
		return c;
	}
	static Complex addComplex(Complex a,Complex b)
	{
		Complex c=new Complex();
		c.r=a.r+b.r;
		c.i=a.i+b.i;
		return c;
	}
	static void showComplex(Complex a)
	{
		System.out.print(a.r+"+"+a.i+"i");
	}
}
class complex_t
{
	public static void main(String args[])
	{
		Complex p=new Complex();
		Complex q=new Complex();
		Complex r=new Complex();
		p=Complex.getComplex(7,9);
		q=Complex.getComplex(5,2);
		r=Complex.addComplex(p,q);
		Complex.showComplex(r);
	}
}

