import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n----------------question  4----------------------\n ");
/*        Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and
        reversed string.*/
        System.out.println("Enter your Text : ");
        String bushra_text = input.nextLine();
        StringBuilder bushra_str =new StringBuilder(bushra_text);
        System.out.println("from your inputs \nText = "+bushra_str+"\nnumber of character  = "
                +bushra_str.toString().length()+"\nthe reverses is:"+ bushra_str.reverse() );

        System.out.println("\n----------------question  1---------------------- \n");
        //Develop a program that takes the weight (in kilograms) and height (in meters)
        //as input and calculates the BMI, then prints it.
        System.out.println("Enter your weight in K: ");
        double w = input.nextDouble();
        System.out.println("Enter your height in M: ");
        double h = input.nextDouble();
        double bmi = w / (h*h);
        System.out.println("from your inputs \nweight = "+w+" height = "+h+" Your BMI is:"+ bmi);

        System.out.println("\n----------------question  2----------------------\n");
        //Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.
        System.out.println("Enter your Marks : ");
        double mark = input.nextDouble();
        System.out.println("Enter the Total : ");
        double total_Marks = input.nextDouble();
        double result  = (mark / total_Marks)*100;
        System.out.println("from your inputs \nmarks = "+mark+" of  = "+total_Marks+" Your percentage is:"+ result +"%");

        System.out.println("\n----------------question  3----------------------\n ");
//        Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
        System.out.println("Enter your amount : ");
        double amount = input.nextDouble();
        System.out.println("Enter the exchange_rate : ");
        double exchange_rate = input.nextDouble();
        System.out.println("from your inputs \namount = "+amount
                +" of  = "+exchange_rate+" Your exchange_amount is:"+  (amount * exchange_rate) );


        System.out.println("\n----------------question  5----------------------\n ");
//        Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
        System.out.println("Enter your sentence : ");
        String sentence = input.nextLine();
        System.out.println("Enter your start position : ");
        int start_index = input.nextInt();
        System.out.println("Enter your end position : ");
        int end_index = input.nextInt();

        System.out.println("from your inputs \nsentence = "+sentence+"\nstart with index : "
                +start_index+"\nend with index :"+end_index +
                "\nthe result"+sentence.substring(start_index,end_index) );

        System.out.println("\n----------------question  6----------------------\n ");
//        Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
        System.out.println("Enter your sentence : ");
         sentence = input.nextLine();
        System.out.println("Enter your keyword : ");
        String keyword = input.nextLine();

        System.out.println("from your inputs \nsentence = "+sentence+"\nkeyword : "
                +keyword+"\nthe result "+sentence.contains(keyword) );

        System.out.println("\n----------------question  7----------------------\n ");
//        Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.

        System.out.println("Enter your sentence : ");
         sentence = input.nextLine();
        System.out.println("Enter your keyword : ");
         keyword = input.nextLine();
        System.out.println("Enter your replace word : ");
        String replace = input.nextLine();

        System.out.println("from your inputs \nsentence = "+sentence+"\nword : "
                +keyword+"\nreplace word : "+replace+"\nthe result "
                +sentence.replace(keyword,replace) );


        System.out.println("\n----------------question  8----------------------\n ");
//        Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or no
        System.out.println("Enter your first sentence : ");
        sentence = input.nextLine();
        System.out.println("Enter your second  sentence : ");
        keyword = input.nextLine();


        System.out.println("from your inputs \nsentence 1 = "+sentence+"\nsentence 2 : "
                +keyword+"\nthe result "+sentence.equalsIgnoreCase(keyword) );





    }
    }
