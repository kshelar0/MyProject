package LearnMaven.L_Maven1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class KsTest {
	ExtentReports extent;
	@BeforeTest
	public void config(){
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new 	ExtentSparkReporter(path);
	
	reporter.config().setReportName("Learn Mevan project Report");
	reporter.config().setDocumentTitle("Test Result");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Kshitij");
	
		
	}
	@Test
	public void KTest(){
		
		ExtentTest test = extent.createTest("KTest");
		Assert.assertTrue(true);
		System.out.println("Extent Report test");
		extent.flush();
		
	}
	

}
