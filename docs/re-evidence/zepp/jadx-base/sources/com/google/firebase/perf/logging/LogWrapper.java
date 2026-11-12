package com.google.firebase.perf.logging;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    private LogWrapper() {
    }

    public static synchronized LogWrapper getInstance() {
        if (instance == null) {
            instance = new LogWrapper();
        }
        return instance;
    }

    public void d(String str) {
        Log.d(LOG_TAG, str);
    }

    public void e(String str) {
        Log.e(LOG_TAG, str);
    }

    public void i(String str) {
        Log.i(LOG_TAG, str);
    }

    public void v(String str) {
        Log.v(LOG_TAG, str);
    }

    public void w(String str) {
        Log.w(LOG_TAG, str);
    }
}
