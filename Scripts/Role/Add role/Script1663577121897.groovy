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

WebUI.setText(findTestObject('Object Repository/Page_salary/Page_salary/input_welcome_p-inputtext p-component w-ful_919bc2'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_salary/Page_salary/input_welcome_p-inputtext p-component p-fil_46a565'), 
    'K7sJQwqgB/E=')

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/i_welcome_show-pass pi pi-eye absolute righ_c72425'))

WebUI.setText(findTestObject('Object Repository/Page_salary/Page_salary/input_welcome_p-inputtext p-component p-fil_46a565_1'), 
    '123456')

WebUI.sendKeys(findTestObject('Object Repository/Page_salary/Page_salary/input_welcome_p-inputtext p-component p-fil_46a565_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/a_Role'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/input_Name_p-inputtext p-component'))

WebUI.setText(findTestObject('Object Repository/Page_salary/Page_salary/input_Name_p-inputtext p-component p-filled'), 'Mina1')

WebUI.click(findTestObject('Page_salary/Page_salary/Add name role'))

WebUI.setText(findTestObject('Object Repository/Page_salary/Page_salary/input_Name_p-inputtext p-component p-filled'), 'MIna2')

WebUI.click(findTestObject('Page_salary/Page_salary/Add remark'))

WebUI.setText(findTestObject('Object Repository/Page_salary/Page_salary/input_Name_p-inputtext p-component p-filled'), 'MIna3')

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/th_Name'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/td_NameMina1'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/button_'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/div_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_salary/Page_salary/input_Name_p-inputtext p-component p-filled'), 'MIna3')

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/td_Role nameMIna3'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/button_'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/div_Delete'))

WebUI.click(findTestObject('Object Repository/Page_salary/Page_salary/button_Yes'))

WebUI.acceptAlert()

Windows.clearText(findWindowsObject(null))

