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
        for (int j=4; j>=0; j--){
            String city = cities[j];
            System.out.println(city);
        }
        for (int i=0; i< cities.length;i+=2) {
            String city = cities[i];
            System.out.println(city);
        //    System.out.println(((i+1)+ ". "+city));
        }

        // Floating point number array

        Float[] numbers = new Float [4];

        numbers[0] = 0.5f;
        numbers[1] = 1.5f;
        numbers[2] = -0.5f;
        numbers[3] = -1.5f;

        Float sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];

        System.out.println(sum);

        Float avg = (numbers[0] + numbers[1] + numbers[2] + numbers[3]) / 4;

        System.out.println(avg);

        //task 4
    String [] names = new String []{"Jan", "Tomasz", "Piotr", "Jan", "Maciej"};
    Integer repetitions = 0;
    for(int i=0; i< names.length; i++){
        String n = names[i];
        if(n=="Jan"){
            repetitions++;
        }
    }
        System.out.println("Number of repetitions of Jan name: " +repetitions);

    //task 5
        String [] names2 = new String []{"Jan", "Tomasz", "Piotr", "Łukasz", "Maciej"};
        for(int i=0; i< names2.length; i++){
            String n = names2[i];
            if(n=="Jan"){
                System.out.println("Number of position of Jan name: " + i);
            }
            }
    }
}
