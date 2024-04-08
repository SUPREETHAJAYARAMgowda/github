package package2;

public class script4 {

	
	public static void main(String[] args) {
	int[] a= {9,8,1,2,0};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int mul=1;
	for(int i=0;i<3;i++)
	{
		mul=mul*a[i];
	}
	System.out.print(mul);
	}

}
