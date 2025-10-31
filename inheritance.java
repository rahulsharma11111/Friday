class Parent
{
	public void sound()
	{
		System.out.println("Hello my name is Arya");
	}
	
	public Parent()
	{
		System.out.println("Default Constructor always called ");
	}
}
class Child extends Parent
{
	public void sound()
	{
       System.out.println("Hello my name is Amit");
	}
	
	public Child()
	{
		System.out.println("Default Constructor always called  Baby ");
	}
}
public class Class3
{
	public static void main(String args[])
	{
		Parent b=new Parent();
		b.sound();
		Child a=new Child();
		a.sound();
	}		
}