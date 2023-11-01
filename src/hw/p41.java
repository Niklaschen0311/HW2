package hw;

public class p41
{
		public static void main (String[] args)
		{
			int[]test = new int[5];
			
			test[0] = 80;
			test[1] = 450;
			test[2] = 564373;
			test[3] = 123;
			test[4] = 1451540;
			
			test[10] = 2133;
			
			for(int i=0;i<5;i++) {
				System.out.println("第"+ i +"個人分數是"+ test[i]+"分");
			}
		}
}
