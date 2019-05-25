 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String star = "";
        for (int i =0; i <numberOfStars; i++ ){
            star+="*";
        }
        return star;
    }
    
    public static String getTriangle(int numberOfRows) {
        String trian= "";
        
        for (int i =1; i <=numberOfRows; i++ ){
        trian = trian + getRow(i)+ "\n";
        }
        return trian;
    }


    public static String getSmallTriangle() {
        String result = "";
        for (int i = 1; i <=4;i++){
           
            result = result+getRow(i) + "\n";
            
        }
        
        return result;
    }

    public static String getLargeTriangle() {
        String large = "";
        for (int i = 1; i<=9;i++){
        large = large+getRow(i)+ "\n";    
        }
        return large;
    }
}
