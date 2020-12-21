package mavendemo1;

import java.io.FileNotFoundException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class HelloWorld {
	public static void main(String[] args) {
		Document document = new Document();
	      try {
	    	  
	    	  PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("C://Users//Hp//Downloads//HelloWorld.pdf"));
	    	  document.open();
	    	  document.add(new Paragraph("Hello World PDF"));
	    	  document.close();
	    	  writer.close();
	    	  
	    	  System.out.println("Hello");
	    	  
	      }
	      catch(DocumentException e)
	      {
	    	  e.printStackTrace();
	      }
		
	      catch(FileNotFoundException e)
	      {
	    	  e.printStackTrace();
	      }
		
		
	}

}
