package com.capgemini.cab.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ApplicationLogger {
	
	public static Logger getLogger(Class loggingClass) {
		Logger logger = null;
		logger = Logger.getLogger(loggingClass);
		PropertyConfigurator.configure("log4j.properties");
		return logger;
	}
}
