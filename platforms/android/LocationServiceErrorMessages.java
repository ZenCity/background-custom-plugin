package com.zencity.cordova.backgroundlocation;

import android.content.Context;

import com.google.android.gms.common.ConnectionResult;

/**
 * Map error codes to error messages.
 */
public class LocationServiceErrorMessages {

	// Don't allow instantiation
	private LocationServiceErrorMessages() {
		 throw new AssertionError();
	}

	public static String getErrorString(Context context, int errorCode) {

		String errorString;

		// Decide which error message to get, based on the error code.
		switch (errorCode) {
		case ConnectionResult.DEVELOPER_ERROR:
			errorString = "The application is misconfigured";
			break;

		case ConnectionResult.INTERNAL_ERROR:
			errorString = "An internal error occurred";
			break;

		case ConnectionResult.INVALID_ACCOUNT:
			errorString = "The specified account name is invalid";
			break;

		case ConnectionResult.LICENSE_CHECK_FAILED:
			errorString = "The app is not licensed to the user";
			break;

		case ConnectionResult.NETWORK_ERROR:
			errorString = "A network error occurred";
			break;

		case ConnectionResult.RESOLUTION_REQUIRED:
			errorString = "Additional resolution is required";
			break;

		case ConnectionResult.SERVICE_DISABLED:
			errorString = "Google Play services is disabled";
			break;

		case ConnectionResult.SERVICE_INVALID:
			errorString = "The version of Google Play services on this device is not authentic";
			break;

		case ConnectionResult.SERVICE_MISSING:
			errorString = "Google Play services is missing";
			break;

		case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED:
			errorString = "Google Play services is out of date";
			break;

		case ConnectionResult.SIGN_IN_REQUIRED:
			errorString = "The user is not signed in";
			break;

		default:
			errorString = "An unknown error occurred";
			break;
		}

		// Return the error message
		return errorString;
	}
}