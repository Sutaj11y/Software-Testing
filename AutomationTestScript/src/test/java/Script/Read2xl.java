package Script;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Read2xl {
		public static void fetchdata(WebDriver driver) throws Exception {
			
			File file=new File("C:\\Users\\SURAJ YADAV\\Desktop\\AutomationTestScript\\testdat\\Testdata.xlsx");
			FileInputStream readfile=new FileInputStream(file);
			
			try (
			XSSFWorkbook workbook = new XSSFWorkbook(readfile)) {
				
				XSSFSheet sheet1 =(XSSFSheet) workbook.getSheetAt(0);
				
				
				for(int i=1;i <= sheet1.getLastRowNum(); i++) 
				{
					String u=sheet1.getRow(i).getCell(0).getStringCellValue();    
					String p=sheet1.getRow(i).getCell(1).getStringCellValue();   
					String N=sheet1.getRow(i).getCell(2).getStringCellValue();
				
				XSSFSheet sheet2=(XSSFSheet) workbook.getSheet("keywords");
				
				
				for(int j=0; j<= sheet2.getLastRowNum(); j++) 
				{   
				    String keywords=sheet2.getRow(j).getCell(0).getStringCellValue();
				    if(keywords.equalsIgnoreCase("openurl"))
				    {
				    	Methods.open(driver);
				    }
				    if(keywords.equalsIgnoreCase("email")) 
				    {
				    	Methods.email(driver,u);
				    }
				    if(keywords.equalsIgnoreCase("password"))
				    {
				    	Methods.password(driver,p);
				    }
				    if(keywords.equalsIgnoreCase("signin")) {
				    	Methods.login(driver);
				    }
				    if(keywords.equalsIgnoreCase("validate")) {
				    	Methods.validation(driver);
				    	driver.findElement(By.xpath("//span[normalize-space()='My Customers']")).click();
				    	driver.findElement(By.xpath("//span[normalize-space()='New Customer']")).click();
				    }
				    if(keywords.equalsIgnoreCase("name")) {
				    	Methods.Name(driver,N);
				    }
				    if(keywords.equalsIgnoreCase("save")) {
				    	Methods.s(driver);
				    }
				    if(keywords.equalsIgnoreCase("punch")) {
				    	Methods.punchin(driver);
				    }
				}
				}
			}
		}}

