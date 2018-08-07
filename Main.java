import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String str="AAAAAAABBABBBAAABBAAAAAAAAAAAA";
        //String str="ABABABABABABABABABABB";
        String[] arr={"0","15","30","De","Ad"};
        int i=0;
        int ptsA=0,ptsB=0,gmsA=0,gmsB=0,setsA=0,setsB=0;
        while(i<str.length())
        {
            if(str.charAt(i)=='A')
            {
                if(ptsA==4){
                    gmsA++;
                    ptsA=0;
                    ptsB=0;
                    if(gmsA>=6 && gmsA-gmsB>=2){
                        setsA++;
                        gmsA=0;
                        gmsB=0;
                    }
                }
                else if(ptsA==3){
                    if(ptsB==4) ptsB--;
                    else if(ptsB==3) ptsA++;
                    else {
                        gmsA++;
                        ptsA=0;
                        ptsB=0;
                        if(gmsA>=6 && gmsA-gmsB>=2)
                        {
                            setsA++;
                            gmsA=0;
                            gmsB=0;
                        }
                    }
                }
                else ptsA++;
            }
            else if(str.charAt(i)=='B')
            {
                if(ptsB==4){
                    gmsB++;
                    ptsA=0;
                    ptsB=0;
                    if(gmsB>=6 && gmsB-gmsA>=2){
                        setsB++;
                        gmsA=0;
                        gmsB=0;
                    }
                }
                else if(ptsB==3){
                    if(ptsA==4) ptsA--;
                    else if(ptsA==3) ptsB++;
                    else {
                        gmsB++;
                        ptsA=0;
                        ptsB=0;
                        if(gmsB>=6 && gmsB-gmsA>=2)
                        {
                            setsB++;
                            gmsA=0;
                            gmsB=0;
                        }
                    }
                }
                else ptsB++;
            }

            i++;
        }



        System.out.println(setsA+"  "+setsB);
        System.out.println(gmsA+"  "+gmsB);
        if(ptsA==4 && ptsB==3){
            System.out.println("Ad   ");
        }
        else if(ptsA==3 && ptsB==4){
            System.out.println("   Ad");
        }
        else if(ptsA==4 && ptsB==4)
        {
            System.out.println("De De");
        }
        else{
            System.out.println(arr[ptsA]+"  "+arr[ptsB]);
        }
    }
}
