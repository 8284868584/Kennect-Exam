package ChetanGavhaneExam;

public class For_while_continue_if_else_switch {

	public static void main(String[] args) {
		
		int arr[]= {5,4,7,9,2,10,3,8};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				continue;
			}else {
				System.out.println(arr[i]+ " is odd");
			}
		}

		int j=0;
		while(j<arr.length) {
			switch(arr[j]) {
				case 1,3,5,7 -> System.out.println(arr[j]+" odd Number");
				case 2,4,6,8 -> System.out.println(arr[j]+" even Number");
				default -> System.out.println("Invalid value");		
			}
			j++;
		}	
	}
}
