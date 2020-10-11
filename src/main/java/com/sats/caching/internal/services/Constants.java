package com.sats.caching.internal.services;

/**
 * Contains constants of library.
 * 
 * @version 1.0.0
 * @author Sats17
 *
 */
class Constants {
	
	private Constants() {}

	public static final long CACHE_EXPIRY_TIME_LIMIT = 300; 
	public static final long SCHEDULAR_INTIAL_DELAY = 0;
	public static final long SCHEDULAR_PERIOD = 1;
	public static final int bucketCapacity = 200;
	public static final long bucketTTL = 14400000;
	public static final int keyLength = 30;
	
}
