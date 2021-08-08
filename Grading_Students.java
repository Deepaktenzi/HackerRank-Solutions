import java.util.*;
public class Grading_Students {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
         grades.add(73);
         grades.add(67);
         grades.add(38);
         grades.add(33);
        System.out.println(solution(grades));
     }
     private static List<Integer> solution(List<Integer> grades) {
      List<Integer> ans = new ArrayList<>();
      for(int marks : grades)
             {
                 if( marks < 38 || marks % 5 < 3)
                      {
                         ans.add(marks);
                      }
                 else
                     {
                         marks = marks + ( 5 - (marks % 5));
                         ans.add(marks);
                     }
             }
      return ans;
     }
 }
 