
public class TestReal {

	public static void main(String[] args) {
		int [] nums= {5,1,1,2,0,0};
		int [] real_nums=new int[nums.length];
		Soultion so=new Soultion();
		real_nums=so.sortArray(nums);
		System.out.println(real_nums[5]);

	}

}
