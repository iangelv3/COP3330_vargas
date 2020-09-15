import java.util.Scanner ;
import java.util.Arrays;

class Encrypter{
    public String encrypt(int number)
    {
        int one,two,three,four,temp,rem;
        one = number/1000;
        number = number% 1000;
        one = (one+7) % 10;

        two=number/100;
        number = number % 100;
        two = (two+7)%10;

        three = number/10;
        number = number% 1000;
        three=(three+7)% 10;

        four=number/ 1;
        number = number% 1;
        four=(four+7)%10;
        // changing my digits here to get a final outcome of 1 and 2
        temp = one;
        one = three;
        three = temp;
        // changing my digits here to get my outcome of 3 and 4
        temp = three;
        three = four;
        four = temp;

        rem = three * 1000 + three * 100 + three * 10 + four;
        String s=Integer.toString(rem);
        return s;


    }

}
class Decryption{

    public String decrypt(int number)
    {
        int one,two,three,four,temp,rem;
        one = number/1000;
        number = number%1000;


        two = number/100;
        number = number %100;


        three = number /10;
        number = number%1000;


        four = number / 1;
        number = number % 1;

        // changed around for the first and third

        temp = one;
        one = three;
        three =temp;

        // changing the numbers around for the second and fourth

        temp = two;
        two  = four;
        four = temp;

        //creating if statements to meet the requirements for each setting of numbers and its percentile

        if(one<=7)
        {
            one=(one+10-7)%10;

        }
        else
        {
            one=(one-7)%10;
        }
        if(two<=7)
        {
            two=(two+10-7)%10;
        }
        else
        {
            two=(two-7)%10;
        }
        if(three<=7)
        {
            three=(three+10-7)%10;
        }
        else
        {
            three=(three-7)%10;
        }
        if(four<=7)
        {
            four=(four+10-7)%10;
        }
        else
        {
            four=(four-7)%10;
        }




        rem = one*1000 + two*100 + three*10+four;

        //creating coversion signs

        String s=Integer.toString(rem);
        return s;


    }



}
class TestClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Message here : ");
        int num = scan.nextInt();
        System.out.println(" What kind of operation do you want to perform : ");
        System.out.println(" 1. Encryption : ");
        System.out.println(" 2. Decryption : ");
        System.out.println("Now Enter 1 or 2 here ...");
        int n = scan.nextInt();
        String s1,s2;
        if(n==1)
        {
            Encrypter encry = new Encrypter();

            s1= encry.encrypt(num);
            System.out.println(" The Encrypted message is : "+s1);
        }
        else if(n==2)
        {
            Decryption decry = new Decryption();
            s2 = decry.decrypt(num);
            System.out.println(" The Decrypted message is : "+s2);
        }
        else
        {
            System.out.println(" Invalid try again ");
        }



    }

}