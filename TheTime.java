import java.util.*;
public class TheTime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String time=sc.next();
        int hour=Integer.parseInt(time.substring(0, 2));
        int minute=Integer.parseInt(time.substring(3, 5));
        int min_pass=sc.nextInt();
        hour+=min_pass/60; //Implementing the hour variable based on the given passed minutes 
        minute+=min_pass%60; //Implementing the minute variable based on the given passed minutes 
        if(minute>59){ //Taking care of the case when the `minute` variable gets past 59 
            hour++;
            minute%=60;
        }
        if(hour>23){ //Taking care of the case when the `hour` variable gets past 23 
            hour%=24;
        }
        System.out.printf("%02d:%02d%n", hour, minute); //Printing the final time in HH:MM format 
    }
}