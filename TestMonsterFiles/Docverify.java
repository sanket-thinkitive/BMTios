package com.testmonster.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testmonster.commons.Library;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Docverify {
	public AppiumDriver<MobileElement> driver;
	public Library lib;

	@BeforeClass
	public void setup() throws MalformedURLException {
		lib = new Library("Test Started");
		driver = lib.launchDriver();

	}

	@Test
	public void DocverifyTest() throws Exception {
                  lib.findMobileElement("id:just-logo");
lib.findMobileElement("xpath://XCUIElementTypeButton[@name='Log In with SSO']");
lib.findMobileElement("xpath://XCUIElementTypeButton[@name='(888) 577 -7409']");

	}

	@AfterClass
	public void afterClass() {
		lib.quitBrowser();
	}

}
