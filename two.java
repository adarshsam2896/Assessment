import java.util.Scanner;
public class two{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter the input string");
        String input_string = scanner.nextLine();  
        scanner.close();
        
        int char_ascii=0;
        boolean result=false;
        for(int i=0;i<input_string.length();i++){
            char_ascii=(int)input_string.charAt(i);
            if(char_ascii>=48 && char_ascii<=57){
                result=true;
                break;


            }
            

        }
        System.out.println(result);
    }
}