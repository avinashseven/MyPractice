public class Lab2
{
public static void main(String[] args)
{
int[]a={2,5,5,3,1,2,4,3,2,2,2,2,3,6,5,5,6,3,1};
int maxLength=0;
int temLength=1;
int startIndex=-1;
for(int i=0;i<a.length;i++)
{
if(a[i]==a[i+1])
{
temLength++;
}
else 
{
	if(temLength>maxLength)
	{
		maxLength=temLength;
		startIndex= i-temLength+1;
	}
 temLength=1;
}
 for(int j=0;j<a.length;j++)
 {
	 if(j==startIndex)
		 System.out.print(" [ ");
	 System.out.print(a[j]+" ");
	 if(j==startIndex+maxLength-1)
		 System.out.print(" ] ");
 }
}
}
}