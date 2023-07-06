package Tcs;

public class Party_curise {
    public static void main(String args[]){
        int t = 5;
        int entry[] = {7,0,5,1,3};
        int exit []= {1,2,1,3,4};
        int count = 0;
        int max = 0;
        int sum= 0;
        for(int i = 0; i<t; i++){
            sum += entry[i]-exit[i];
            max = Math.max(sum,max);



        }
        System.out.println(max);
    }
}
