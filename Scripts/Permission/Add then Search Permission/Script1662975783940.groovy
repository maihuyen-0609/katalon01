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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.18.0.246:9292/#/login')

WebUI.setText(findTestObject('Object Repository/Page_salary/input_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Page_salary/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_salary/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_salary/Menu_Permission'))

WebUI.click(findTestObject('Object Repository/Page_salary/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_salary/input_Name'))

WebUI.setText(findTestObject('Page_salary/enter_Name'), Name_and_permission)

WebUI.click(findTestObject('Page_salary/input_permission name'))

WebUI.setText(findTestObject('Page_salary/enter_Permission Name'), Name_and_permission)

WebUI.click(findTestObject('Object Repository/Page_salary/input_Name'))

WebUI.setText(findTestObject('Page_salary/enter_Remark'), Name_and_permission)

WebUI.click(findTestObject('Page_salary/button_submit'))

WebUI.click(findTestObject('Object Repository/Page_salary/noti_SuccessAdded successfully'))

WebUI.click(findTestObject('Page_salary/button_filter Name'))

WebUI.setText(findTestObject('Object Repository/Page_salary/input_search'), Name_and_permission)

WebUI.click(findTestObject('Object Repository/Page_salary/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_salary/view_NameMina1'))

WebUI.click(findTestObject('Page_salary/Menu_Role'))

WebUI.click(findTestObject('Object Repository/Page_salary/td_Namecatalog_manager'))

WebUI.click(findTestObject('Page_salary/button_add permission to role'))

WebUI.setText(findTestObject('Object Repository/Page_salary/input_Not configured permission'), Name_and_permission)

WebUI.click(findTestObject('Object Repository/Page_salary/textfield_Mina1'))

