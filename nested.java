public class nested {
    public static void main(String[]args ) {


           for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 5; j++){
                    if (i == j){
                        break;
                    }else if ((i>4) && (i-j) > 5){
                        System.out.print("  ");
                        continue;
                    }
                    System.out.print("* ");
                }
                System.out.print("\n");
           } 
        
    }
}



        

        
       
    


   


           
        
        
        
        
    


    


        
    