import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String x = "";
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                x+=Character.toLowerCase(c);                    
            }else{
                x+=Character.toUpperCase(c);
            }
        }
        System.out.print(x);
    }
}