 public class ArmstrongNumber{
	public static void main(String args[]) {
			 for(int number=0; number<=1000; number++){
        	 int result=0;
        	 int temp=number;
        	 int remainder=0;
        	 
        	 while(temp !=0) {
        		 remainder=temp%10;
        		 result=(int)(result+Math.pow(remainder,3));
        		 temp=temp/10;
        	 }
        	 if(result == number) {
        		 System.out.println(number);
        	 }
			 }
	}
 }