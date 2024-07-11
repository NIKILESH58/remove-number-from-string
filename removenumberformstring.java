import java.util.*;
public class removenumberformstring
{
   public static void main(String[] args)
   {    
        Scanner in=new Scanner(System.in);
        String finalline="";
        String line=in.nextLine();
        int length=line.length();
         for(int i=0;i<length;i++)
        {
            char character = line.charAt(i);
            if(character>='A'&&character<='Z'||character>='a'&&character<='z'||character==' ')
            finalline=finalline+character;
        }
        System.out.println(finalline);
    }
}