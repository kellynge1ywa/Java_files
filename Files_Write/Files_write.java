package Files_Write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_write {

    public static void main(String[] args)
    {
        Path path=Paths.get("File.txt");

        try{
            Files.write(path,"Hello".getBytes());
            System.out.println("Content added");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
