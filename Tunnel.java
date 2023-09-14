import java.util.Scanner;

public class Tunnel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dist=s.nextInt();
        int height=s.nextInt();
        int[] base=new int[dist];
        int[] top= new int[dist];
        for(int i=0;i<dist;i++)
        {
            base[i]=s.nextInt();
        }
        for(int i=0;i<dist;i++)
        {
            top[i]=s.nextInt();
        }
        String ans=WillPass(base,top,height,base);
        System.out.println(ans);

    }

    private static String WillPass(int[] base, int[] top, int height, int[] base1) {
       int count=0;
        for(int i=0;i<base.length;i++)
        {
            if(base[i]+top[i]<height)
            {
                count++;
            }
            else
            {
                return "No";
            }
        }
        if(count==base.length)
        {
            return "Yes" ;
        }
        return "No";
    }
}