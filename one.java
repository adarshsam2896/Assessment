import java.util.Scanner;
public class one{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter the input string");
        String input_string = scanner.nextLine();
        
        scanner.close();
        int length_of_digits =input_string.length()-1;
        
        int char_ascii=0;
        double answer=0;
        boolean isNegative=false;
        int start_pos=0;
        if(input_string.charAt(0)=='-'){
            isNegative=true;
            start_pos=1;
            length_of_digits-=1;
            
        }
        else if(input_string.charAt(0)=='+'){
            start_pos=1;
            length_of_digits-=1;
        }

    
    try{
        for(int i=start_pos;i<input_string.length();i++){
            
            char_ascii=(int)input_string.charAt(i) -48;
            if(char_ascii<0 || char_ascii>9){

                
                throw new Exception("Input is not integer");
            }
            
            answer=answer+(char_ascii*Math.pow(10,length_of_digits));
            length_of_digits=length_of_digits-1;

        }
    
    
        System.out.println("The input in integer is:");
        if(isNegative==true){
            answer=(int)answer*-1;
        }
    
        System.out.println((int)answer);
    }
    catch(Exception e){
        System.out.println(e.getMessage());

    }
        
    }
}