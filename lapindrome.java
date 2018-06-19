import java.util.*;
public class lapindrome {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		ArrayList<String> arr2=new ArrayList<String>();
		int t=0;
		t=s.nextInt();
		String input="";
		
         for(int p=-1;p<t;p++) {
		 input=s.nextLine();
		int len=input.length();
		int count=0;
		int count1=0;
		String out1="";
		String out2="";
		
		   if(len%2==0) {
			out1=input.substring(0, len/2);
			out2=input.substring(len/2);}
		   else
		   {
			    out1=input.substring(0, len/2);
				out2=input.substring(len/2+1);  
		   }
			int arr[]=new int[out1.length()];
			int arr1[]=new int[out2.length()];
			int i=0,j=0;
			for(i=0;i<out1.length();i++)
			{
				arr[i]=out1.charAt(i);
				
			}
			for(j=0;j<out2.length();j++)
			{
				arr1[j]=out2.charAt(j);
			}
			for(i=0;i<out1.length();i++)
			{
				for(j=0;j<out2.length();j++)
				{
					if(arr[i]==arr1[j])
					{
						count++;
						arr[i]=Integer.MIN_VALUE;
						arr1[j]=Integer.MIN_VALUE;
						break;
					}
				}
			}

		
		
		
		if(count==len/2) {
			
			arr2.add("YES");
			}
		else if(count1==len/2)
			{arr2.add("YES");
			   }else
			   {
				   arr2.add("NO");
			   }
			
         }	
		
		for(int l=1;l<arr2.size();l++)
		{
			System.out.println(arr2.get(l));
		}
		
	

	}

}
