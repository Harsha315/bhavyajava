import java.util.Arrays;


class MergeTwoArrays {
public static void main(String[] args)
{
	int[] array1= {10,20,30};
	int[] array2= {200,300,100};
	int[] merge=new int[array1.length + array2.length];
	for ( int i=0; i< array1.length; i++ )
	{
		merge[i]=array1[i];
	}
	for(int i=0; i< array2.length;i++)
	{
		merge[i + array1.length]=array2[i];
		
	}
		System.out.println(Arrays.toString(merge));
		

}
}
