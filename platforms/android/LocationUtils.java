package com.zencity.cordova.backgroundlocation;

/**
 * Defines app-wide constants and utilities
 */
public final class LocationUtils {

	// Debugging tag for the application
	public static final String APPTAG = "CDVNativeGeolocPlugin";
	/*
	 * Define a request code to send to Google Play services This code is
	 * returned in Activity.onActivityResult
	 */
	public final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;

	/*
	 * Constants for location update parameters
	 */
	// Milliseconds per second
	public static final int MILLISECONDS_PER_SECOND = 1000;

	// The update interval
	public static final int UPDATE_INTERVAL_IN_SECONDS = 6;
	// Update interval in milliseconds
	public static final long UPDATE_INTERVAL_IN_MILLISECONDS = MILLISECONDS_PER_SECOND
			* UPDATE_INTERVAL_IN_SECONDS;
	// A fast interval ceiling
	public static final int FAST_CEILING_IN_SECONDS = 1;
	// A fast ceiling of update intervals, used when the app is visible
	public static final long FAST_INTERVAL_CEILING_IN_MILLISECONDS = MILLISECONDS_PER_SECOND
			* FAST_CEILING_IN_SECONDS;

	// Create an empty string for initializing strings
	public static final String EMPTY_STRING = new String();
}