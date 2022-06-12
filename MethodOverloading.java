class Method
{
	int x;
	int y;
	void add()
	{
		System.out.println("x+y=" + (x+y));
	}
	void add(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}
}
public class MethodOverloading
{
	public static void main(String args[])
	{
		Method p=new Method();
		p.x=10;
		p.y=20;
		p.add();
		p.add(50,50);
		
	}
}