import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.*; 

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> arrayList = new ArrayList<>();
    try {

      FileReader fr = new FileReader("names.txt");
      Scanner fileScanner = new Scanner(fr);
      while (fileScanner.hasNextLine()) {
        arrayList.add(fileScanner.nextLine());

      }
     
    } 
    catch (FileNotFoundException error) {

    }
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");

    Scanner option = new Scanner(System.in);
    int x = option.nextInt();
    while (option.hasNextLine()) {

      if (x == 1) {
        System.out.println("$98,345 average salary in South Florida!");
      }
      if (x == 2) {
        System.out.println("US News - 100 Best Jobs!");
      }
      if (x == 3) {
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      }
      if (x == 4) {
        for (int i = 0; i < arrayList.size(); i++) {
          System.out.println(arrayList.get(i));

        }

      }
      if(x > 4){
        System.exit(0);
      }

      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      //option = new Scanner(System.in);
     x = option.nextInt();
    
    }
    
  }
}
