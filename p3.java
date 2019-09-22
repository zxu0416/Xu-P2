import java.util.Scanner;
public class p3 {
	public static void main(String[] args) {
    	   	 Scanner scnr = new Scanner(System.in);
             String[] topics = {"political issues", "global environmental issues", "food", "video games","car"};
             int [][] ratings = new int [topics.length][];
             int i;
             int j;
             int people;
             int rating;
             for( i=0;i<ratings.length;i++)
             {		ratings[i] = new int[10];
                    for( j=0;j<ratings[i].length;j++)
                    ratings[i][j] = 0;
             }
             System.out.print("How many people rated? ");
             people = scnr.nextInt();
             for( i=0;i<people;i++)
             {		System.out.println("Please rate from 1-10 below");
                    for(j=0;j<topics.length;j++)
                    {
                           System.out.print("Enter your rating for "+topics[j]+" : ");
                           rating = scnr.nextInt();
                           while(rating < 1 || rating > 10)
                           {
                                 System.out.println("Invalid rating, must be between 1-10");
                                 System.out.print("Enter your rating for "+topics[j]+" : ");
                                 rating = scnr.nextInt();
                           }
                           ratings[j][rating-1]++; 
                    }
             }
             int avgRating[] = new int[topics.length];
             String hpi="" , lpi="" ;
             int hpt = 0 , lpt= 0;
             for(i=0;i<ratings.length;i++)
             {
                    avgRating[i] = 0;
                    for(j=0;j<ratings[i].length;j++)
                           avgRating[i] += (ratings[i][j]*(j+1));
                     if(i == 0) 
                    {
                           hpt = avgRating[i];
                           lpt= avgRating[i];
                           hpi = topics[i];
                           lpi = topics[i];
                    }else
                    {
                           if(avgRating[i] > hpt)
                           {
                                 hpi = topics[i];
                                 hpt = avgRating[i];
                           }
                           if(avgRating[i] < lpt)
                           {
                                 lpi = topics[i];
                                 lpt= avgRating[i];
                           }
                    }
                    avgRating[i] = avgRating[i]/people;
             }
             System.out.printf("\n%-20s","");
             for(i=0;i<10;i++)
                    System.out.printf("%-10d",(i+1));
             System.out.printf("%20s","Average Rating");
             System.out.println();
             for(i=0;i<ratings.length;i++)
             {
                    System.out.printf("\n%-20s",topics[i]);
                    for(j=0;j<ratings[i].length;j++)
                    System.out.printf("%-10d",ratings[i][j]);
                    System.out.printf("%20d",avgRating[i]);
             }
             System.out.println("\nHighest Point total : "+hpt+" Issue : "+hpt);
             System.out.println("Lowest Point total : "+lpt+" Issue : "+lpt);
             scnr.close();
       		}
}