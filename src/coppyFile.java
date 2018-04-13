import java.io.*;
import java.util.Scanner;

public class coppyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String destination = sc.nextLine();
        try {
            sourceFile(new File(source), new File(destination));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void sourceFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
