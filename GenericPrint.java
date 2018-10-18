class PrintArray
{
	public <E> void print(E str[])
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
public class GenericPrint {

	public static void main(String[] args) {
		String st[]={"A","B","C","D"};
		Integer in[]={1,2,3,4,5};
		PrintArray pa=new PrintArray();
		pa.print(st);
		System.out.println();
		pa.print(in);

	}
}
