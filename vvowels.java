import java.util.*;

class vvowels{
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    String str=s.next();
	    char c[]=str.toCharArray();
	    char a[]={'a','e','i','o','u'};
	    int b=0;
	    for(int i=0;i<a.length;i++)
	     { if(c[0]==a[i])
	     {
	         	    System.out.println("vowels");
	         	    b=1;
	     }
	     } if(b==0)
	      	    {System.out.println("consonant");}

	     
	}
}
