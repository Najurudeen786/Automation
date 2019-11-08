package org.test;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) {
	File loc=new File("C:\\Users\\Poo\\eclipse-workspace\\Automation\\excel\\NajuWrite.xlsx");
	
	FileOutputStream stream=new FileOutputStream(loc);

	Workbook w= new XSSFWorkbook();
	Sheet s=w.createSheet("nitish");
	Row rs.createRow(4);
	
}
}
