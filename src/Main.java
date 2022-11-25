import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
readFile();
writeFile();
readFile();

    }
    public static void createFile(){
        File file = new File("C://Users//ayhan//Desktop//workingwithfiles//files//stundents.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya oluştu");
            }else{
                System.out.println("dosya zaten var");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  void  getFileInfo(){
        File file = new File("C://Users//ayhan//Desktop//workingwithfiles//files//stundents.txt");
        if(file.exists()){
            System.out.println("Dosya adı :"+file.getName());
System.out.println("Dosya yolu :"+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi :"+file.canWrite());
            System.out.println("Dosya okunur mu :"+file.canRead());
            System.out.println("Dosya boyutu (byte) :"+file.length());
        }


    }
    public static void readFile(){
        File file = new File("C://Users//ayhan//Desktop//workingwithfiles//files//stundents.txt");
        try{
            Scanner reader=new Scanner(file);
            while ((reader.hasNextLine())){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static  void writeFile(){
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("C://Users//ayhan//Desktop//workingwithfiles//files//stundents.txt",true));
       writer.newLine();
       writer.write("ahmet");
       System.out.println("dosya yazıldı");
       writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}