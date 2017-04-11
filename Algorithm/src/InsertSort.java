


public class InsertSort {
	
	public static void main(String args[]){
		int a[]={5,2,4,6,1,3};
		//a = insertSort(a);
		a = sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}

	static int[] sort(int[] a) {
		//int temp;
		int max;
		int i, j;
		int len = a.length;
		for (i = 0; i < len-1; i++) {
			max = a[i+1];
			System.out.println((i+1)+"-0 max:"+max);
			for (j = i; j >= 0; j--) {
				System.out.println((i+1)+"-"+(i-j+1)+"-0 a[j]:"+a[j]);
				if (a[j] > max) {
					a[j+1] = a[j];
					a[j] = max;
					System.out.println("exchange");
				}else{
					System.out.println("break");
					break;
				}
			}
		}
		return a;
	}
	
	static int[] insertSort(int[] a){
		int max;
		int i,j;
		int len = a.length;
		for(i=0;i<len-1;i++){
			max=a[i+1];
			j=i;
			while(j>=0&&a[j]>max){
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = max;
		}
		return a;
		
		
	}

}
