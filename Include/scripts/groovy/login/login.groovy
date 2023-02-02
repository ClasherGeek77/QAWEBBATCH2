package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to open linkedin login page")
	def I_go_to_login_page() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/go to login page'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I type email (.*) and (.*)")
	def I_type_email_password_login(String email, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/type email and password login'), [('email'):email, ('password'):password], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I click login")
	def I_click_login() {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/click login'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I verify the (.*) message in step")
	def I_verify_the_status_message_step(String status) {
		WebUI.callTestCase(findTestCase('Test Cases/pages/login/verify status message login failed'), [('status'):status], FailureHandling.STOP_ON_FAILURE)
	}
}