package com.github.videobox.app.browser;

import com.github.videobox.R;

public class SettingsController {

	static boolean clearHistory = false;

	/**
	 * The purpose of this class is so that I can clear the dropdown history in the main activities if the user selects
	 * to clear the history from the disk in advanced settings
	 */
	static void setClearHistory(boolean choice) {
		clearHistory = choice;
	}

	/**
	 * return the choice
	 */
	static boolean getClearHistory() {
		if (clearHistory) {
			clearHistory = false;
			return true;
		}
		return clearHistory;
	}
}
