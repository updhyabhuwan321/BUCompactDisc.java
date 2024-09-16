import java.io.*;

/**
 * This program creates a list of songs for a CD
 * by reading from a file.
 * Modified by BHUWAN UPADHYAYA
 * Date: 3/9/2024
 */
public class BUCompactDisc
{
   public static void main(String[] args) throws IOException
   {
      FileReader file = new FileReader("Classics.txt");
      BufferedReader input = new BufferedReader(file);
      String title;
      String artist;

      // TASK #2: Declare an array of Song objects, called cd, with a size of 6.
      Song[] cd = new Song[6];

      // TASK #3: Fill the array by creating a new song with the title and artist
      // and storing it in the appropriate position in the array.
      for (int i = 0; i < cd.length; i++)
      {
         title = input.readLine();
         artist = input.readLine();

         // Create a new Song object and store it in the array
         cd[i] = new Song(title, artist);
      }

      System.out.println("Contents of Classics:");
      // TASK #4: Print the contents of the array to the console.
      for (int i = 0; i < cd.length; i++)
      {
         // Print each Song in the array
         System.out.print(cd[i]);
      }

      // Close the input stream
      input.close();
   }
}
