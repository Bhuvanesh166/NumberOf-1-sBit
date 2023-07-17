import java.util.Scanner;

class CountBit{
    public int findCountBit(int num){
        int cnt=0;
        while(num>0){
            int rem=num%10;

            if(rem%2!=0){
                cnt++;
            }
            num=num/2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CountBit countBit=new CountBit();
        int num= scanner.nextInt();
        System.out.println(countBit.findCountBit(num));
    }
}
