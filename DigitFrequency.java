import java.util.*;
public class DigitFrequency
{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        int freq=getdigitfreq(n,d);
        System.out.println(freq);
    }
    public static int getdigitfreq(int n,int d){
        int rv=0;
        while(n>0){
           int dig=n%10;
           n=n/10;
           if(dig==d){
                rv++;
           }
        }
        return rv;
    }
}
