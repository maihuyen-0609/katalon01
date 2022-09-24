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

//open browser
WebUI.openBrowser('')

CustomKeywords.'customMethod.LoginPage.loginCRM3'('admin@demo.com', 'riseDemo')

WebUI.click(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/a_Add client'))

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Company name_company_name'), 
    Company_name)

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/textarea_Address_address'), 
    Address)

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_City_city'), 
    City)

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_State_state'), 
    'Hihi')

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Zip_zip'), 
    '456')

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Country_country'), 
    'VietNam')

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Phone_phone'), 
    '456789')

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Website_website'), 
    'FB')

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_VAT Number_vat_number'), 
    '6788')

WebUI.click(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Client groups_s2id_autogen2'))

WebUI.click(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/button_Save'))

WebUI.click(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/a_Clients'))

WebUI.setText(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/input_Clients has rejected proposals_form-c_7ab575'), 
    'Mina1')

WebUI.click(findTestObject('Object Repository/CRM/Page_Clients  RISE - Ultimate Project Manag_42ae77/a_Mina1'))

