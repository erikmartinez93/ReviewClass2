
public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Explicit/Narrowing/Manual
		short largerBox=129;
		byte smallerbox=(byte)largerBox;
		System.out.println(smallerbox); 
		
		//Explicit/Narrowing/Manual
		//As we can fit 129 in short we will get proper results
		int largerBox1=129;
		short smallerBox2=(short)largerBox;
		System.out.println(smallerBox2);
		
		//Implicit/Widening/Automatic
		short smallerbox3=45;
		long largerBox3=smallerbox3;
		System.out.println(largerBox3);
		
		

	}

}
