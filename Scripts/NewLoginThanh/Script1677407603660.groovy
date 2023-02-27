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

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup (2)'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup (2)'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Admin Support'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Admin Support'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup (3)'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup (3)'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Market Research  Product Reviews'), 
        0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Market Research  Product Reviews'), 
        0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Next'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Next'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup (4)'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup (4)'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Next (1)'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Next (1)'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/No Button'), 0)

    Mobile.tap(findTestObject('BondexThanh/No Button'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Close'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Close'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup (6)'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup (6)'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.view.ViewGroup (7)'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.view.ViewGroup (7)'), 0)

    Mobile.waitForElementPresent(findTestObject('BondexThanh/android.widget.TextView - Yes'), 0)

    Mobile.tap(findTestObject('Object Repository/BondexThanh/android.widget.TextView - Yes'), 0)

Mobile.closeApplication()

