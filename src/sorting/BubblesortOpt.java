package sorting;

public class BubblesortOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int [4];
		
		array [0] =99;
		array[1]= 26;
		array[2]= 19;
		array[3]= 50;
		
		for (int i =1; i<(array.length);i++) {
			
			boolean swapped = false;
			
			for (int j=1;j<=(array.length-i);j++) {
				if (array[j-1]>array[j]) {
					int y =array[j];
					array[j]=array[j-1];
					array[j-1]=y;
					
				}
			}
		}
	    
		for (int x=0;x<4;x++) {
			System.out.println(array[x]);
		}
		}

		

	}


