import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class randomarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rm = new Random();

        String answer;
        String random;



        ArrayList<String>subject=new ArrayList<>();
        ArrayList<String>verb=new ArrayList<>();
        ArrayList<String>object=new ArrayList<>();







        for(int x=0; x<4; x++){
            System.out.println((x+1+ ") ")+ "Enter 4 subject word: ");
            subject.add(input.nextLine());
        }
        System.out.println(subject);



        System.out.println(".......................................");
        for(int x=0; x<5; x++){
            System.out.println((x+1+ ") ")+ "Enter 5 verb words: ");
            verb.add(input.nextLine());
        }
        System.out.println(verb );



        System.out.println("........................................");
        for(int x=0; x<9; x++){
            System.out.println((x+1+ ") ")+ "Enter 9 object words: ");
            object.add(input.nextLine());
        }
        System.out.println(object);


        System.out.println("..........................................");
        System.out.println("Do you want to generate a sentence?  yes/no " );
        answer = input.nextLine();



        if(answer.equalsIgnoreCase("yes")){
            System.out.println(subject.get(rm.nextInt(subject.size()))+ " " + verb.get(rm.nextInt(verb.size()))+ " " + object.get(rm.nextInt(verb.size())));
        }










    }
}
