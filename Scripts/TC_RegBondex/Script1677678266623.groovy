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

Mobile.startExistingApplication('com.bondex.origin')

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.TextView - Sign up'), 0)

Mobile.tap(findTestObject('Reg/android.widget.TextView - Sign up'), 0)

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Reg/android.widget.EditText - Email'), email, 0)

Mobile.setText(findTestObject('Object Repository/Reg/android.widget.EditText - Password'), pass1, 0)

Mobile.setText(findTestObject('Object Repository/Reg/android.widget.EditText - Confirm Password'), pass2, 0)

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.TextView - Sign up (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Reg/android.widget.TextView - Sign up (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Reg/android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.EditText - Invitation Code'), 0)

Mobile.setText(findTestObject('Object Repository/Reg/android.widget.EditText - Invitation Code'), '5YFQD', 0)

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Reg/android.widget.TextView - Continue'), 0)

Mobile.waitForElementPresent(findTestObject('Reg/android.widget.TextView - Continue (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Reg/android.widget.TextView - Continue (1)'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.closeApplication()

