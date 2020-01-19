import java.util.*;
public class Reverse { 
  
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in);
        String s[] = "i like this program very much".split(" "); 
        String str = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            str += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        System.out.println(str.substring(0, str.length() - 1)); 
    } 
} 
