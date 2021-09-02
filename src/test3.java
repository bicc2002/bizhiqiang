package gcd；
public class test3 {
    private int yueshu=1;
    private int gcd（int a,int b){
    if (a%b==0)
        return b;
    else
        return gcd(b,a&b);
    }
    public int maincode(int a,int b){
    if(a>b)
        yueshu=gcd(a,b);
                else
                    yueshu=gcd)(b,a);
        System.out.println(yueshu);
return 0;
    }
}