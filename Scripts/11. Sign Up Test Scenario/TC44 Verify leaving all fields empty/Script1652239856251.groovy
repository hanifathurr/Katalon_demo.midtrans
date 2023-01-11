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

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.click(findTestObject('Home Page/button_Sign Up'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Sign Up Page/field_Bussinessname'), '')

WebUI.setText(findTestObject('Sign Up Page/field_Fullname'), '')

WebUI.setText(findTestObject('Sign Up Page/field_Email'), '')

WebUI.setText(findTestObject('Sign Up Page/field_PhoneNumber'), '')

WebUI.setText(findTestObject('Sign Up Page/field_Password'), '')

WebUI.setText(findTestObject('Sign Up Page/field_ConfirmPassword'), '')

WebUI.click(findTestObject('Sign Up Page/button_Register'))

WebUI.verifyElementPresent(findTestObject('Sign Up Page/error_blankBussinessName'), 0)

WebUI.verifyElementPresent(findTestObject('Sign Up Page/error_blankFullname'), 0)

WebUI.verifyElementPresent(findTestObject('Sign Up Page/error_blankEmail'), 0)

WebUI.verifyElementPresent(findTestObject('Sign Up Page/error_blankPhoneNumber'), 0)

WebUI.verifyElementPresent(findTestObject('Sign Up Page/error_blankPassword'), 0)

WebUI.verifyElementPresent(findTestObject('Sign Up Page/error_blankConfirmPassword'), 0)

WebUI.closeBrowser()

