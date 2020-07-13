package com.jimmysalazar.tesseractdemo;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Tesseract tesseract = getTesseract();

		File file = new File("example.jpg");

		try {

			String result = tesseract.doOCR(file);
			System.out.println(result);

		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Tesseract getTesseract() {

		Tesseract instance = new Tesseract();

//		instance.setDatapath("/usr/local/Cellar/tesseract/4.0.0/share/tessdata");
		instance.setDatapath("D:/tessdata");
		instance.setLanguage("eng");
		instance.setHocr(false);
		return instance;

	}
}
