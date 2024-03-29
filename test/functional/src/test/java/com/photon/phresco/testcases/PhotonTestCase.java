/**
 * Archetype - phresco-dot-net-archetype
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.photon.phresco.testcases;

import java.io.IOException;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.photon.phresco.Screens.BaseScreen;
import com.photon.phresco.Screens.WelcomeScreen;
import com.photon.phresco.uiconstants.PhotonData;
import com.photon.phresco.uiconstants.PhrescoUiConstants;
import com.photon.phresco.uiconstants.UIConstants;
import com.photon.phresco.uiconstants.UserInfoConstants;

public class PhotonTestCase {

	private static UIConstants uiConstants;
	private static PhrescoUiConstants phrescoUIConstants;
	private static WelcomeScreen welcomeScreen;
	private static String methodName;
	private static String selectedBrowser;
	private static PhotonData phpConstants;
	private static UserInfoConstants userInfo;
    public BaseScreen baseScreen;

	/**
	 * Initializing the Object of a class PhrescoUiConstants, UIConstants, PhpData, UserInfoConstants
	 * @throws Exception
	 */

	@BeforeClass
	public  static void setUp() throws Exception {
		try {
			phrescoUIConstants = new PhrescoUiConstants();
			uiConstants = new UIConstants();
			phpConstants = new PhotonData();
			userInfo = new UserInfoConstants();
			
			
			launchingBrowser();
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Capturing the URL values through String & passing those values into WelcomeScreen
	 * @throws Exception
	 */

	public static  void launchingBrowser() throws Exception {
		try {
			String applicationURL = phrescoUIConstants.PROTOCOL + "://"
					+ phrescoUIConstants.HOST+":"+ phrescoUIConstants.PORT
					+ "/";
			selectedBrowser = phrescoUIConstants.BROWSER;
			welcomeScreen = new WelcomeScreen(selectedBrowser, applicationURL,
					phrescoUIConstants.CONTEXT, phpConstants, uiConstants, userInfo);
			
			
		} catch (Exception exception) {
			exception.printStackTrace();

		}

	}
	
	/**
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws Exception
	 * In this Method just triggering test case against loginPhp,Create, Update, Delete Category BaseScreeen
	 */
	@Test
	public void testFirst_icon()
			throws InterruptedException, IOException, Exception {
		try {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			System.out
					.println("---------testToVerifyTheAudioDevicesAddToCart()-------------");
			
			welcomeScreen.helloWorld(methodName);
			
		} catch (Exception t) {
			t.printStackTrace();

		}
	}
	

	
	

	
	
	
	/*@Test
	public void testContact()
			throws InterruptedException, IOException, Exception {
		try {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			System.out
					.println("---------testToVerifyTheAudioDevicesAddToCart()-------------");
			welcomeScreen.contact(methodName);
			
		} catch (Exception t) {
			t.printStackTrace();

		}
	}
	*//**
	 * 	Triggering close method in BaseScreen 
	 *//*
	*/
	@AfterClass
	public static void tearDown() {
		welcomeScreen.closeBrowser();
	}

}