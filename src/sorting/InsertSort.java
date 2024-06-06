package sorting;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int [5];
		
		array [0] =99;
		array[1]= 26;
		array[2]= 19;
		array[3]= 50;
		array[4]=102;
		
		int i,key,j;
		
		int n = 4;
		
		for(i=1;i<n;i++) {
			key = array[i];
			j=i-1;
			
			while (j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1; 
			}
			array[j+1]=key;
			
			
		}
		for (int y=0;y<5;y++) {
			System.out.println(array[y]);
		}

	}

}
