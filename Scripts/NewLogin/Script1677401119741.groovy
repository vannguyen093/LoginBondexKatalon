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

Mobile.waitForElementPresent(findTestObject('New/android.widget.TextView - Log in'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.widget.TextView - Log in'), 0)

Mobile.setText(findTestObject('Object Repository/New/android.widget.EditText - Email'), id, 0)

Mobile.setText(findTestObject('Object Repository/New/android.widget.EditText - Password'), pass, 0)

Mobile.waitForElementPresent(findTestObject('New/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.view.ViewGroup'), 0)

Mobile.waitForElementPresent(findTestObject('New/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.view.ViewGroup (1)'), 0)

Mobile.waitForElementPresent(findTestObject('New/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.view.ViewGroup (4)'), 0)

Mobile.waitForElementPresent(findTestObject('New/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.view.ViewGroup (5)'), 0)

Mobile.waitForElementPresent(findTestObject('New/android.widget.TextView - Log out'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.widget.TextView - Log out'), 0)

Mobile.waitForElementPresent(findTestObject('New/android.widget.TextView - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/New/android.widget.TextView - Yes'), 0)

Mobile.closeApplication()

