package Collectionproblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CollegeLibraryy {
    public static void main(String[] args) throws Exception {
        // Creating College Library object
        CollegeLibrary bvb = new CollegeLibrary();
      // Reading the Files taken two examples
        String FileContent = getFileContents("F:\\bookList.txt");
        String FileContents1=getFileContents("G:\\nie.txt");
        String[] words= FileContents1.split(",");
        //System.out.println(bvb.CollegeLocation(words[1]));
        // Creating array of string for storing  Content of the files
        String[] Library = FileContent.split("!");
        String[] Library1=FileContent.split("\n");
        System.out.println(bvb.CollegeLocation(Library1[10]));
        int length = Library.length;

        for (int i = 0; i < length; i++) {

            String BookDetails = Library[i];
            System.out.println(bvb.Author(BookDetails.split(",")[1]));
            System.out.println(bvb.CollegeLocation(BookDetails.split(",")[3]));
            System.out.println(bvb.BookName(BookDetails.split(",")[0]));
            System.out.println(bvb.PublishPlace(BookDetails.split(",")[3]));
            System.out.println(bvb.Publisher(BookDetails.split(",")[2]));
            System.out.println(bvb.place(BookDetails.split(",")[3]));

            // storing out put in required location
            WritingFile(Library1[3] + Library1[5] + Library1[8], "F:\\file.txt");
        }


    }

    // creating method for reading Files
    public static  String getFileContents(String path) throws Exception {

        String lines = " ";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {

            lines += line + "\n ";
            line = br.readLine();
        }

        fr.close();
        br.close();
        return lines;
    }


    // Creating method for Storing output.
    public  static void WritingFile(String data, String path)throws Exception{
        FileWriter fw = new FileWriter(path,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(data);
        bw.close();
        fw.close();

    }
}
