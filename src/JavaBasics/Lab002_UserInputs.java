package JavaBasics;

public class Lab002_UserInputs {
    public static void main(String[] args) {

    String age1 = args[0]; // user input in arguments
    System.out.println(age1);

    int age = Integer.parseInt(age1);

    String result = (age < 18) ? "Minor" :  "Major";
    System.out.println(result);


    }

}
