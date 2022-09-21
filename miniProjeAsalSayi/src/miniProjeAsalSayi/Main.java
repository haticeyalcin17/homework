package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//Herhangi bir sayının asal olup olmadığı bulunur.
		int number = 3;
		int remainder = number % 2 ; 
		 boolean isPrime = true;
		 
		 if(number==1) {
		
			 System.out.println("sayı asal değildir.");
			 return;
		 }
		 
		
		 if(number<1) {
			 System.out.println("geçersiz bir sayıdır.");
		 }
		 for(int i = 2; i <number; i++)
		 {
			 if(number % i ==0)
			 { 
				 isPrime=false;
				 
			 }
		 }
		 if(isPrime) {
			 System.out.println("asal sayıdır.");
		 }
		 
		 else {
			 System.out.println("sayı asal değildir.");
		 }
	}

}
