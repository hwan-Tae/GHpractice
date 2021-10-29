
public class Soultion {
	public int [] sortArray(int [] nums)
	{
		int p=0;
		int r=nums.length-1;
		nums=quicksort(nums,p,r);
		return nums;
	}
	private int[] quicksort(int nums[],int p,int r)
	{
		if(p<r)
		{
			int q=partition(nums,p,r);
			quicksort(nums,p,q-1);
			quicksort(nums,q+1,r);
		}
		return nums;
	}
	private int partition(int nums[],int p,int r)
	{
		int item=nums[r];
		int j=p-1;
		int temp;
		for(int i=p;i<r;i++)
		{
			if(nums[i]<=item)
			{
				temp=nums[j+1];
				nums[++j]=nums[i];
				nums[i]=temp;
			}
		}
		temp=nums[j+1];
		nums[j+1]=nums[r];
		nums[r]=temp;
		return j+1;
	}
}
