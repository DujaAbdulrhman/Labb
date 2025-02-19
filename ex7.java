import java.util.InputMismatchException;
import java.util.Scanner;

public class ex7 {
    //TODO: throw throws catch finally
    public static void main(String[]args) throws Exception {
        Scanner input=new Scanner(System.in);
        //try q1
        /*try {
            System.out.println("Enter the 1st number: ");
            int num1=input.nextInt();
            System.out.println("Enter the 2nd number: ");
            int num2=input.nextInt();
            int sum=num1+num2;
            int sub=num1-num2;
            int multiply=num1*num2;
            int divide=num1/num2;
            int reminder=num1%num2;

            System.out.println(num1+"+"+num2+"="+sum);
            System.out.println(num1+"-"+num2+"="+sub);
            System.out.println(num1+"x"+num2+"="+multiply);
            System.out.println(num1+"/"+num2+"="+divide);
            System.out.println(num1+"mod"+num2+"="+reminder);
            System.out.println();

            *//*check1(num1,num2);
            System.out.println();*//*
        }*//*catch (ArithmeticException e){
            System.out.println("please don't enter a 0 to the 2nd number");
        }*//*
        catch (InputMismatchException e){
            System.out.println("please enter a correct number");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program ended");
        }*/

        //try q2
        /*try{
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            int i;
            for (i = 1; i <=10; i++) {
                int multipli = num * i;
                System.out.println(num + "x" + i + "=" + multipli);
            }
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }catch (InputMismatchException e){
            System.out.println("please enter a number");
        }finally {
            System.out.println("Program ended");
        }*/

        //try q3
        /*try {
            System.out.println("Enter the Radius: ");
            float radius= input.nextFloat();
            String rad= String.valueOf(radius);
            float perimeter= (float) (2*3.14*radius);
            float erea= (float) (3.14*(radius*radius));

            System.out.println("parameter is: "+perimeter);
            System.out.println("Area is: "+erea);
        }catch (InputMismatchException e){
            System.out.println("Enter a number");
        }catch (Exception e){
            System.out.println();
        }finally {
            System.out.println("program ended");
        }*/

        //try q4
        /*try{
        System.out.println("Enter the count of numbers");
        int count= input.nextInt();
        chekC(count);
        int sum=0 ;
        double average = 0;
        for (int i = 1; i <=count ; i++) {
            System.out.println("Enter an integer: ");
            int  number=input.nextInt();
            sum=number+sum;
            average= (double) sum /count;
        }
        System.out.println("The average is: "+average);
     }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next(); // Clear the invalid input
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("program ended");
        }*/

        //try q5
        /*try {
            System.out.print("Input the first number: ");
            int num1 = input.nextInt();
            check1(num1);
            System.out.print("Input thr second number: ");
            int num2 = input.nextInt();
            check2(num2);
            System.out.print("Input the third number: ");
            int num3 = input.nextInt();
            if (num1 + num2 == num3) {
                System.out.println("The result is:true");
            } else {
                System.out.println("The result is:false");
            }
        }catch (Exception e){//هذي الكاتش بتاخذ ال2 ميثودز الي تحت لو دخلت اول رقم صفر بتطلع حقت الاول ولو دخلت الثاني بتطلع رساله الثاني
            System.out.println(e.getMessage());
        }*/

        //try q6
       /* try {
            System.out.println("Input a word: ");
            String word= input.nextLine();
            rever(word);
            String reversed = "";
            for (int i = 0; i < word.length(); i++) {
                reversed = word.charAt(i)+reversed;
            }
            System.out.println("Reversed word: "+ reversed);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program ended");
        }*/

        //try7
        /*try {
            System.out.println("Enter a number: ");
            String userInput = input.nextLine();
            doublein(userInput);

            int number = Integer.parseInt(userInput);
            if (number == 0) {
                System.out.println("The number is 0");
            } else if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a number.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("program ended");
        }*/

        //try8
        /*try {
            System.out.println("Enter temperature in Centigrade:");
            int Centigrade= input.nextInt();
            tempp(Centigrade);
            double Fahrenheit=((Centigrade*9/5) +32);
            System.out.println("Temperature in Fahrenheit is:"+Fahrenheit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Have a good day");
        }*/

        //try q9
        /*try {
            System.out.print("Input a string: ");
            String sinput= input.nextLine();
            System.out.println("Enter a number");
            int number= input.nextInt();
            checkIndex(sinput, number);
            if (number>sinput.length()){
                System.out.println("that number is not valid");
            }else {System.out.println(sinput.charAt(number));}
            }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program ended");
        }*/

        //try q10
        /*try {
            System.out.println("Enter the Width: ");
            double width= input.nextDouble();
            System.out.println("Enter the height: ");
            double height= input.nextDouble();
            double area=width*height;
            ValidInt(height,width);
            double v = width + height;
            double perimeter=2*v;
            System.out.println("Area is: "+width+"*"+height+"="+area);
            System.out.println("Perimeter is: 2* "+"("+width+"+"+height+")="+perimeter);
        }
        catch (InputMismatchException e){
            System.out.println("Enter a number");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program ended");
        }*/


        //try  q11
        /*try {
            System.out.println("Enter first integer:");
            int num1= input.nextInt();
            System.out.println("Enter second number:");
            int num2= input.nextInt();

            if (num1>num2){
                System.out.println(num1+">"+num2);
                System.out.println(num1+"!="+num2);
                System.out.println(num1+"=>"+num2);
            } else if (num2>num1) {
                System.out.println(num2+">"+num1);
                System.out.println(num2+"!="+num1);
                System.out.println(num2+"=>"+num1);
            }else {
                System.out.println(num1+"="+num2);}
        }catch (InputMismatchException e){
            System.out.println("Enter an integer only");
        }*/

        //try q12
        /*try {
            System.out.print("Input seconds: ");
            int seconds =input.nextInt();
            sec(seconds);
            int second = seconds % 60;
            int hour = seconds / 60;
            int munit = hour % 60;
            hour /= 60;
            System.out.print( hour + ":" + munit + ":" + second);
        }catch (Exception e){
            System.out.println("you enter tha number of the second in the day choose shorter number");
        }finally {
            System.out.println("Have a good day !");

        }*/

        //try q13
        /*try {
            System.out.println("Enter first number:");
            int num1= input.nextInt();
            System.out.println("Enter second number:");
            int num2= input.nextInt();
            System.out.println("Enter third number:");
            int num3= input.nextInt();
            System.out.println("Enter forth number:");
            int num4= input.nextInt();

            if (num1==num2 && num2==num3 && num3==num4){
                System.out.println("Numbers are equal!");
            }else {
                System.out.println("Numbers are not equal");
            }
        }catch (InputMismatchException e){
            System.out.println("Enter an integer only");
        }finally {
            System.out.println("program endeed");
        }*/

        //try q14
        /*try {
            System.out.println("Enter a number: ");
            int number=input.nextInt();
            if (number==0){
                System.out.println("The number is Zero");
            }else if(number>0){
                System.out.println("The number is positive");
            }else {
                System.out.println("The number is negative");
            }
        }catch (InputMismatchException e){
            System.out.println("Enter an integer only");
        }finally {
            System.out.println("program endeed");
        }*/

        //try 15
        /*try {
            int number = 0;
            int positivenum = 0;
            int negativennum = 0;
            int zero = 0;
            do {
                System.out.println("Enter a numbers, enter -1 to stop:");
                number = input.nextInt();
                stop(number);
                 if (number > 0) {
                    positivenum++;
                } else if (number < 0) {
                    negativennum++;
                } else {
                    zero++;
                }
            } while (number != -1);

            System.out.println(positivenum + " positive");
            System.out.println(zero + " zero");
            System.out.println(negativennum + " negative");
        }catch (Exception e){
            System.out.println(e.getMessage());
    }finally {
            System.out.println("Have a good day");
        }*/

        //try Q16
        /*try {
            System.out.println("Input an integer number:");
            String number = input.nextLine();
            int num = Integer.valueOf(number);
            rev(num);

            String reversed = "";
            for (int i = 0; i < number.length(); i++) {
                reversed = number.charAt(i)+reversed;
            }
            System.out.println("Reversed number: " + reversed);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try it again");
        }*/

        //try Q17
        /*try {
            System.out.println("Enter the number of the inputs you will do:");
            int number= input.nextInt();
            coun(number);
            int min=0;
            int max=0;
            int i;
            for (i =1; i <=number ; i++) {
                System.out.println("Enter a number");
                int numb=input.nextInt();
                if (max < numb){
                    max=numb;
                }
                else if (min >= numb){
                    min=numb;
                }else {break;}
            }
            System.out.println("The largest number is: "+max);
            System.out.println("The smallest number is: "+min);
        }catch (InputMismatchException e){
            System.out.println("Enter an integer");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program ended");
        }*/

        //try Q18
        /*System.out.println("Enter a string: ");
        String sentence = input.nextLine();
        try {
            stringOnly(sentence);
            int counter = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == 'a') {
                    counter++;
                }
            }
            System.out.println("Number of 'a's: " + counter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I hope you like the program");
        }*/
    }
    //Q2 methode exception
    /*public static void check1(int num1 ,int num2)throws Exception{
        if (num2==0){
            throw new Exception("please don't enter 0 as a 2nd number");
        }

    }*/

    //Q4
    /*public static void chekC(int count){
        if (count==0){
            System.out.println("don't enter a 0!");
        }
    }*/

    //Q5
    /*public static void check1(int num1) throws Exception {
       if (num1==0){
           throw new Exception("don't enter 0");
       }
    }
    public static void check2(int num2)throws Exception{
        if (num2==0){
            throw new Exception("0 is not excepted");
        }
    }*/

    //Q6
    /*public static void rever(String word)throws Exception{
        if (word.trim().isEmpty() || word.contains(" ")) {
            throw new IllegalArgumentException("Enter one word only!");
        }
    }*/

    //Q7
    /*public static void doublein(String input) throws Exception {
        if (!input.matches("-?\\d+")) {
            throw new Exception("Enter an integer");
        }
    }*/

    //Q8
    /*public static void tempp(int Centigrade)throws Exception{
        if (Centigrade < -100 || Centigrade > 100) {
            throw new Exception("Temperature can't be between (-100 & 100) degrees Celsius");
    }}*/

    //Q9
    /*public static void checkIndex(String str,int index) throws Exception {
        if (index < 0 || index >= str.length()) {
            throw new Exception("choose a number between " + (str.length() - 1)+" not more than that" );
        }}*/

    //Q10
    /*public static void ValidInt(double widh,double height) throws Exception{
        if (widh==0||height==0){
         throw new Exception("The height and the width cant be zero");
        }
    }*/

    //Q12
    /*public static void sec(int seconds) throws Exception{
        if (seconds>=86.400){
            throw new Exception();
        }

    }*/

    //  Q 15
       /* public static void stop(int number)throws Exception {
            if (number == -1){
               throw new Exception("The end");
            }

            //Q16
   /* public static void rev(int number) {
        String numStr = String.valueOf(number);
        Set<Character> digitsSet = new HashSet<>();

        for (char digit : numStr.toCharArray()) {
            if (!digitsSet.add(digit)) {
                throw new IllegalArgumentException("Don't enter the same number so you can see the reverse number for it");
            }}
    }*/


    //Q17
    /*public static void coun(int number) throws Exception {
        if (number==0){
            throw new Exception("Enter a number that is grater than 0");
        } else if (number==1) {
            throw new Exception("Enter a number that is grater than 1");
        }
    }*/

    //Q18
   /* public static void stringOnly(String sentence) throws Exception {
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("You cannot enter numbers; only letters are allowed.");
            }
        }
        }*/

    




}
