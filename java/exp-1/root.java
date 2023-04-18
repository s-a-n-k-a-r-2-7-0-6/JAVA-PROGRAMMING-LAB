import java.util.*;
class root
{
    int d,a,b,c;
    root(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }
    void disc(){
        d = (int)Math.pow(b,2)-4*a*c;
    }
    void roots(){
        if(d<0){
            System.out.println("Roots are Imaginary.");
        }
        else{
            if (d>0){
                System.out.println("Roots are Real and Distinct.");
                System.out.println("Roots are: "+(-b+Math.sqrt(d))/(2*a)+" "+(-b-Math.sqrt(d))/(2*a));
            }
            else{
                System.out.println("Roots are Real and Equal.");
                System.out.println("Roots are: "+(-b+Math.sqrt(d))/(2*a)+" "+(-b-Math.sqrt(d))/(2*a));

            }
        }
    }

    public static void main(String[] args){
        int a,b,c;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Coefficients: ");

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        root n = new root(a,b,c);
        n.disc();
        n.roots();
        

    }
    
}