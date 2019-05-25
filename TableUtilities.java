
 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
       
        
        for (int i = 1; i<=5; i++){
           
            
            for (int b= 1;b<=5; b++ ) {
                for (int j= 0; j< 3-String.valueOf(i*b).length();j++)
               {
                table +=" ";
                }  
                table += b* i +" |";
         }
            table +="\n";
          
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        
        
        for (int i = 1; i<=10; i++){
           
            
            for (int b= 1;b<=10; b++ ) {
                for (int j= 0; j< 3-String.valueOf(i*b).length();j++)
               {
                table +=" ";
                }  
                table += b* i +" |";
         }
            table +="\n";
          
        }
        return table;
        
    }

    public static String getMultiplicationTable(int tableSize) {
       String table = "";
        
        
        for (int i = 1; i<=tableSize; i++){
           
            
            for (int b= 1;b<=tableSize; b++ ) {
                for (int j= 0; j< 3-String.valueOf(i*b).length();j++)
               {
                table +=" ";
                }  
                table += b* i +" |";
         }
            table +="\n";
          
        }
        return table;
        
    }
}
