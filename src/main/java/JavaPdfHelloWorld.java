import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdfHelloWorld
{
    public static void main(String[] args) {
        Document document = new Document();
        try
        {
            // -START- Inicializacia spravneho fontu
            BaseFont baseFont = null;
            baseFont = BaseFont.createFont("Sacramento-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 12);
            // -END- Inicializacia spravneho fontu
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("A Hello World PDF document.šččťšžčýáíé", font));
            document.close();
            writer.close();
        } catch (DocumentException e) {
            System.out.println("Problém pri generovaní dokumentu");
        } catch (FileNotFoundException e) {
            System.out.println("Problém pri vytvarání súboru");
        } catch (IOException e) {
            System.out.println("Neznáma I/O chyba");
        }
    }
}
