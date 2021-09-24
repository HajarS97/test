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

WebUI.navigateToUrl('https://tms.airbus.e2e.mytower.fr/login')

WebUI.setText(findTestObject('Object Repository/Page_MyTower/input_Email or Username_username'), 'mytower2018+ct@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MyTower/input_Password_password'), 'cQlZAR1V2CaThNHrQfGK3Q==')

WebUI.sendKeys(findTestObject('Object Repository/Page_MyTower/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_MyTower/input'), 'mytower2018+fa')

WebUI.click(findTestObject('Object Repository/Page_MyTower/div_SALAHEDDINE Fatimazahra  (Chargeur)  my_2244af'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/button_SALAHEDDINE Fatimazahra_btn btn-sm c_f31b94'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/i_Settings_fa fa-list ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/h3_LEG 5'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/button_Save mask_btn btn-primary ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/button_Save mask_btn btn-primary ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/div_Waiting for Export Control_ng-input'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/span_License OK'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/i_Save mask_fa fa-arrow-right'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/div_EDD  2021-09-20 1038_ui-chkbox-box ui-w_887c5c'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/button_Confirm quotation'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/span_RTN-ROUTINE'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/div_Export control status_col-md-8 col-sm-1_eba740'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MyTower/input_Export control status_exportControlStatut'), 
    '')

