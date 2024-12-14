package Buffer_Reader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class FileWriteRead{
    public static void main(String[] args)
    {
        try(BufferedWriter writer= new BufferedWriter(new FileWriter("Text.txt")))
        {
            writer.write("Kelvin Ngeiywa");
            writer.newLine();
            writer.write("kellyngeiywa@gmail.com");
            writer.newLine();
           

            System.out.println("You added content to the file");
            
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        
        try(BufferedReader reader= new BufferedReader(new FileReader("Text.txt"))) {
            String word;
            while((word=reader.readLine()) != null)
            {
                System.out.println(word);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}