import java.util.Arrays;
public class test4{
    public static void main(String[] args){
        int length=(int)(Math.random()*51+50);
        char[] strs=new char[length];
        for(int i=0;i<length;i++){
            char ch=(char)(Math.random()*26+97);
            strs[i]=ch;
        }
        System.out.println(Arrays.toString(strs));
        char[] dic=new char[26];
        for(int i=0;i<dic.length;i++){
            dic[i]=(char)(i+97);
        }
        int[] counts=new int[26];
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<dic.length;j++){
                if(strs[i]==dic[j]){
                    counts[j]++;
                }
            }
        }
        for(int i=0;i<counts.length;i++){
            System.out.println(dic[i]+":"+counts[i]);
        }
    }
}