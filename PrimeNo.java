import java.util.Scanner;


public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count=0;
		System.out.println("Please insert any numebr : ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for(i=2;i<num;i++){
			if(num%2==0){
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println(num +" is a prime number");
		}
		else{
			System.out.println(num+" is not a prime number");
		}

	}

}
