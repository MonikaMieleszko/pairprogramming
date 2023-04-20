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
    }
}
