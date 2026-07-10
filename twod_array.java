class twod_array
{
	public static void main(String args[])
	{
		int a[][]={{23,56,78},{45,89,27},{45,98,87}};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}