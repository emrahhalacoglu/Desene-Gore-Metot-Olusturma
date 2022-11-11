import java.util.Scanner;
public class Code {

    static void pattern(int x){
        
        System.out.print(x+" ");
        if(x<=0){
            return;
        }
        else{
            pattern(x-5);
            System.out.print(x+" ");
            return;
        }
        
    }




    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input a Number : ");
        int x=input.nextInt();
        pattern(x);
    }
    
}
