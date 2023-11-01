package hw;

public class p49
{
		public static void main (String[] args)
		{
			int[][]test = new int[2][5];
			
			test[0][0] = 80;
			test[0][1] = 450;
			test[0][2] = 564373;
			test[0][3] = 123;
			test[0][4] = 1451540;
			test[1][0] = 3240;
			test[1][1] = 243;
			test[1][2] = 3;
			test[1][3] = 1;
			test[1][4] = 23131;
			

			
			for(int i=0;i<test[1].length;i++) {
				System.out.println("第"+ (i+1) +"個人的國文分數是"+ test[0][i]+"分");
				System.out.println("第"+ (i+1) +"個人的數學分數是"+ test[1][i]+"分");
			}
		}
}
