package customMethod
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory


public class SearchTable {
	@Keyword
	def checkValuecolumn(int column, String value) {
		WebDriver driver =  DriverFactory.getWebDriver()
		if (driver.findElements(By.xpath("//span[@class='p-paginator-current']")).equals(0)) {
			List<WebElement> listItem = driver.findElements(By.xpath("//table//tbody//tr"))

			listItem.size()
			System.out.println(listItem.size())
			System.out.println(listItem)

			for(int i = 1; i<= listItem.size();i++) {
				String textTitle = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+column+"]")).getText()
				System.out.println(textTitle)

				// tr??? v??? k???t qu??? search r???i gi??? so s??nh
				//Class Assert thu???c TestNG Framework
				// C??c h??m trong class Assert n???m ??? b??i 11 Selenium Java
				Assert.assertTrue(textTitle.contains(value), "Kh??ng ch???a gi?? tr??? search ")
				// ho???c h??m c?? s???n trong katalon so s??nh b???ng
				//WebUI.verifyEqual(textTitle, value) v?? equal k d??ng cho title dc
			}
		}
	}
}
