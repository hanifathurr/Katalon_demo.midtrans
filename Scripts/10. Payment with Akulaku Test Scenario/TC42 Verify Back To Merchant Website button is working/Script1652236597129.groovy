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

WebUI.click(findTestObject('Home Page/button_Buy Now'))

WebUI.setText(findTestObject('Shopping Cart/input_Name'), GlobalVariable.Name)

WebUI.setText(findTestObject('Shopping Cart/input_Email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Shopping Cart/input_PhoneNo'), GlobalVariable.Phone)

WebUI.setText(findTestObject('Shopping Cart/input_City'), GlobalVariable.City)

WebUI.setText(findTestObject('Shopping Cart/input_Address'), GlobalVariable.Address)

WebUI.setText(findTestObject('Shopping Cart/input_Postal'), GlobalVariable.PostalCode)

WebUI.click(findTestObject('Shopping Cart/button_Checkout'))

WebUI.click(findTestObject('Payment Checkout/Akulaku/select_Akulaku'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payment Checkout/Akulaku/button_PayNow'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Payment Checkout/Akulaku/field_PhoneNumber'), 0)

WebUI.setText(findTestObject('Payment Checkout/Akulaku/field_PhoneNumber'), '08122222222')

WebUI.click(findTestObject('Payment Checkout/Akulaku/button_Next'))

WebUI.verifyElementPresent(findTestObject('Payment Checkout/Akulaku/text_RefNo'), 0)

WebUI.click(findTestObject('Payment Checkout/Akulaku/button_Pay'))

WebUI.verifyElementPresent(findTestObject('Payment Checkout/Akulaku/transaksiSukses'), 0)

WebUI.click(findTestObject('Payment Checkout/Akulaku/button_BackToHome'))

WebUI.waitForPageLoad(0)

String homeUrl = WebUI.getUrl()

WebUI.verifyEqual(homeUrl, GlobalVariable.baseUrl)

WebUI.closeBrowser()
