
// import java.util.Scanner;

public class Exam{
    int[] arr = new int[3];
    String direction;
    Exam(){
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        direction="N";
    }
    // public char[] command()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number of Commands : ");
    //     int no_cmd = sc.nextInt();
    //     char[] cmd = new char[no_cmd];

    //     for(int i=0; i<cmd.length; i++)
    //     {
    //         System.out.print("Enter Commands : ");
    //         cmd[i] = sc.nextChar();//.charAt(i);
    //     }
    //     return cmd;
    // }
    void starting(){
        // System.out.print("Starting Position : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println( " - "+direction);
        // System.out.println("Direction : "+direction);
    }
    void right(){
        if(direction=="N"){
            direction="E";
        }
        else if(direction=="E"){
            direction="S";
        }
        else if(direction=="S"){
            direction="W";
        }
        else if(direction=="W"){
            direction="N";
        }
        else if(direction=="Up")
        {
            direction="E";
        }
    }
    void left(){
        if(direction=="N"){
            direction="W";
        }
        else if(direction=="E"){
            direction="N";
        }
        else if(direction=="S"){
            direction="E";
        }
        else if(direction=="W"){
            direction="S";
        }
        else if(direction=="Up")
        {
            direction="W";
        }
    }
    void up()
    {
        direction="Up";
    }
    void back(){
        if(direction=="Up")
        {
            arr[2]--;
        }
        else if(direction=="N")
        {
            arr[2]--;
        }
        else if(direction=="S")
        {
            arr[2]++;
        }
        else if(direction=="E")
        {
            arr[0]--;
        }
        else if(direction=="W")
        {
            arr[0]++;
        }
    }
    void forward(){
        if(direction=="N"){
            arr[1]++;
        }
        else if(direction=="E")
        {
            arr[0]++;
        }
        else if(direction=="S"){
            arr[1]--;
        }
        else if(direction=="W")
        {
            arr[0]--;
        }
        else if(direction=="Up")
        {
            arr[2]++;
        }
    }
    
    void execute(char c , Exam e){
        switch (c){
            case 'f': e.forward() ; //arr[1]++
                break;
            case 'r': e.right();
                break;
            case 'u':e.up();
                break;
            case 'b': e.back();
                break;
            case 'l': e.left();
                break;
            case 'd': arr[1]++;
        }
    }
} 
class Main{
    public static void main(String[] args)
    {
        Exam e = new Exam();
        e.starting();
        // e.command();

        char[] cmd = {'f','r','u','b','l'};
        
        for(int i=0; i<cmd.length;i++)
        {
            e.execute(cmd[i],e);
            e.starting();
        }
    }
}

/*
NOTE : Since i have less knowledge in TDD, this is my code and Test Case File to the Best of My Knowledge.(I am on Learning Stage.)


Test Cases:
I have used Starting Position for Every Test.
1) 
char[] cmd = {'f','r','u','b','l'};
        /*
        OUTPUT
        0 0 0 - N
        0 1 0 - N
        0 1 0 - E
        0 1 0 - Up
        0 1 -1 - Up
        0 1 -1 - W
        
2)
char[] cmd = {'r','f'}; 
        OUTPUT  
        0 0 0 - N
        0 0 0 - E
        1 0 0 - E

3)
char[] cmd = {'f','b'};
        OUTPUT
        0 0 0 - N
        0 1 0 - N
        0 1 -1 - N

4)
char[] cmd = {'f','r','f'}; 
        OUTPUT
        0 0 0 - N
        0 1 0 - N
        0 1 0 - E
        1 1 0 - E

*/
