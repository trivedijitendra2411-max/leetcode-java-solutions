import java.util.*;
public class Findingduplicate {
   public static boolean solution(int arr[]){
        HashSet <Integer> set = new HashSet<>();

        for(int num:arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
   } 
}
