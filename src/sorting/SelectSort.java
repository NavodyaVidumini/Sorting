package sorting;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int [5];
		
		array [0] =99;
		array[1]= 26;
		array[2]= 19;
		array[3]= 50;
		array[4]=102;
		
		
		int n = 5;
		
		for(int i=0;i<n-1;i++) {
			
			int small = array[i];
			int x=i;
			
		for (int j=i;j<n-1;j++) {
			
			if (array[j+1]<small) {
				small = array[j=1];
				x = j+1;
			
		}

	}
		
		int key = array[i];
		array[i]=small;
		array [x]=key;


	for (int y=0;y<n;y++) {
		System.out.println(array[y]);
	}
		}
	}
}

	




