import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String option = "";
    int num = -1;
    Scanner input = new Scanner(System.in);
    while(true){
      System.out.print( "Please select an option: \n    1. Cups to Teaspoons\n    2. Miles to Kilometers\n    3. US Gallons to Imperial Gallons\n    4. Quit\n ");

      // ensure first input
      try{
        option = input.nextLine();
        option.trim();
        num = Integer.parseInt(option);
        if (num < 1 || num > 4){
          throw new Exception(" out of range");
        }
      }catch(Exception e){
        System.out.print("Invalid option \n");
        continue;
      }
      // exit program if 4(quit) is selected
      if( num == 4){
        input.close();
        break;
      }
      System.out.println(" Please enter a number");

      // ensure second input
      try{
        String strNum = input.nextLine();
        strNum.trim();
        num = Integer.parseInt(strNum);
        

      }catch(Exception e){
        System.out.print("Invalid number\n");

        continue;

      }
      // begin computation
      switch (option){
        case "1":
          System.out.println( num * 48 + " tablespoons");
          input.close();
          return;
        case "2":
          System.out.println(num * 1.60934 + " kilometers");
          input.close();
          return;
        case "3":
          System.out.println(num * 0.832674 + " imperial gallons");
          input.close();
          return;

          

      }
        
        
      
    }
  } 
}