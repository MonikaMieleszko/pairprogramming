package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello Monika :)" );
//        System.out.println( "Hello Girls!" );

        //Task 2
        String [] cities = new String [5];

        cities[0]="Paryż";
        cities[1]="Madryt";
        cities[2]="Porto";
        cities[3]="Barcelona";
        cities[4]="Londyn";

        for (int i=0; i< cities.length;i++){
            String city = cities[i];
            System.out.println(city);
        }

        for (int j= (cities.length-1); j>=0; j--){
            String city = cities[j];
            System.out.println(city);
        }

        for (int i=0; i< cities.length;i+=2) {
            String city = cities[i];
            System.out.println(city);

        }

        // Task 3: Floating point number array

        Float[] numbers = new Float [4];

        numbers[0] = 0.5f;
        numbers[1] = 1.5f;
        numbers[2] = -0.5f;
        numbers[3] = -1.5f;

        Float sum = 0.0f;

        for (int i=0; i< numbers.length;i++){
            sum+=numbers[i];
        }

        System.out.println(sum);
        Float avg = 0.0f;

        avg = sum/ numbers.length;

        if(numbers.length==0){
            System.out.println("Error: we cannot divide by 0.");
        }
        System.out.println(avg);

        //task 4
    String [] names = new String []{"Jan", "Tomasz", "Piotr", "Jan", "Maciej"};
    Integer repetitions = 0;
        String repeatedName = "Jan";
    for(int i=0; i< names.length; i++){
        String n = names[i];

        if(n==repeatedName){
            repetitions++;
        }
    }
        System.out.println("Number of repetitions of "+repeatedName+" name " +repetitions);

    //task 5
        String [] names2 = new String []{"Jan", "Tomasz", "Piotr", "Łukasz", "Maciej"};
        for(int i=0; i< names2.length; i++){
            String n = names2[i];
            String searchedName = "Jan";
            if(n==searchedName){
                System.out.println("Number of position of "+searchedName+" is " + i);
            }
            }

        //task 6

        Integer[] num = new Integer[5];

        num[0]=5;
        num[1]=10;
        num[2]=7;
        num[3]=2;
        num[4]=-2;
        Integer max = Integer.MIN_VALUE;//way to handle even an empty array
        for(int i=0; i< num.length;i++){
            if (num[i] > max){
                max = num[i];}
        }
        System.out.println(max);
        Integer min = Integer.MAX_VALUE;
        for(int i=0; i< num.length;i++){
            if (num[i] < min){
                min = num[i];}
        }
        System.out.println(min);



    }
}
