import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class MultiTable {
    public int x;
    public int y;
    public boolean multiply;
    
    public boolean checkPosInt(String s){
    	return Pattern.compile("^[0-9]*[1-9][0-9]*$").matcher(s).matches();
        }  
    public void getInput(){
           try{  
              String str;
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
              do{
                 System.out.print("Input a positive integer for x: ");  
                 str = reader.readLine();
                 }
                 while(!checkPosInt(str));
                 x = Integer.parseInt(str);
              do{
                 System.out.print("Input a positive integer for y: ");  
                 str = reader.readLine();
                 }
                 while(!checkPosInt(str));
                 y= Integer.parseInt(str);              
              do{
                 System.out.print("Input 0 for Multiplication Table or 1 for Addition Table: ");  
                 str = reader.readLine();
                 }
                 while((!str.equals("0"))&&(!str.equals("1")));
                 multiply=(str.equals("0"))?true:false;
              }catch(IOException e){  
                e.printStackTrace();  
              }  
         }   
    public void showTable(){
        if(multiply){
            for(int i=1;i<=y;i++){
                System.out.println();
                for(int j=1;j<=x;j++)
                    System.out.printf(j+"*"+i+"="+j*i+"\t"); 
            }
        }
        else{
            for(int i=1;i<=y;i++){
                System.out.println();
                for(int j=1;j<=x;j++)
                    System.out.printf(j+"+"+i+"="+(j+i)+"\t"); 
                }
            }
        }
    public static void main(String[] args) {
        MultiTable m=new MultiTable();
        m.getInput();
        m.showTable();
       }
}