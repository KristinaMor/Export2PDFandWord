import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaWordHelloWorld {
    public static void main(String[] args) {
        XWPFDocument document = new XWPFDocument();

        XWPFParagraph paragraph = document.createParagraph();

        XWPFRun run = paragraph.createRun();
        run.setText("Hello, World!");

        try {
            FileOutputStream out = new FileOutputStream("HelloWorld.docx");
            document.write(out);
            out.close();
            System.out.println("Word document created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
