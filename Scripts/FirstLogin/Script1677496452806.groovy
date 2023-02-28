import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject

Mobile.startExistingApplication('com.bondex.origin')

Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Log in'), 0)

Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Log in'), 0)

Mobile.setText(findTestObject('Object Repository/BondexThanh/android.widget.EditText - Email'), id, 0)

Mobile.setText(findTestObject('Object Repository/BondexThanh/android.widget.EditText - Password'), pass, 0)

Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup'), 0)

Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup (1)'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnIndustrySelect'), 0)

Mobile.tap(findTestObject('FirstLogin/btnIndustrySelect'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnAdminSupport'), 0)

Mobile.tap(findTestObject('FirstLogin/btnAdminSupport'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnSubindustrySelect'), 0)

Mobile.tap(findTestObject('FirstLogin/btnSubindustrySelect'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnDataEntry'), 0)

Mobile.tap(findTestObject('FirstLogin/btnDataEntry'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnNext'), 0)

Mobile.tap(findTestObject('FirstLogin/btnNext'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnFulltime'), 0)

Mobile.tap(findTestObject('FirstLogin/btnFulltime'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnNext2'), 0)

Mobile.tap(findTestObject('FirstLogin/btnNext2'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnNo'), 0)

Mobile.tap(findTestObject('FirstLogin/btnNo'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnClose'), 0)

Mobile.tap(findTestObject('FirstLogin/btnClose'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnSetting'), 0)

Mobile.tap(findTestObject('FirstLogin/btnSetting'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnLogout'), 0)

Mobile.tap(findTestObject('FirstLogin/btnLogout'), 0)

Mobile.waitForElementPresent(findTestObject('FirstLogin/btnYes'), 0)

Mobile.tap(findTestObject('FirstLogin/btnYes'), 0)

Mobile.closeApplication()

