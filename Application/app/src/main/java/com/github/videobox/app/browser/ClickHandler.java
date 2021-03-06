package com.github.videobox.app.browser;

import com.github.videobox.R;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

public class ClickHandler extends Handler {

	private BrowserController mBrowserController;

	public ClickHandler(Context context) {
		try {
			mBrowserController = (BrowserController) context;
		} catch (ClassCastException e) {
			throw new ClassCastException(context.toString()
					+ " must implement BrowserController");
		}
	}

	@Override
	public void handleMessage(Message msg) {
		super.handleMessage(msg);
		String url = null;
		url = msg.getData().getString("url");
		mBrowserController.longClickPage(url);
	}
}
