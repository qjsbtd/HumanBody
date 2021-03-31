package com.shine.humanbody.base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLog("onCreate...");
        setContentView(getLayoutResId());
        init();
    }

    protected abstract int getLayoutResId();

    protected void init() {
        printLog("init...");
    }

    @Override
    protected void onDestroy() {
        printLog("onDestroy...");
        super.onDestroy();
    }

    protected void printLog(String content) {
        Log.e(getClass().getSimpleName(), "Shine..." + content);
    }
}