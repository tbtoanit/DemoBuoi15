package imic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemostration {
    public static void main(String[] args) {
        try{
            demoException();
        }catch (FileNotFoundException e){
            System.out.println("Loi roi");
        }
    }

    public static void demoException() throws FileNotFoundException{
        String pathOfFile = "D:\\abc.txt";
        FileInputStream fis = new FileInputStream(pathOfFile);
    }
}
