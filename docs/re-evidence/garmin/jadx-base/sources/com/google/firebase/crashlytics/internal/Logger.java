package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i14) {
        return this.logLevel <= i14 || Log.isLoggable(this.tag, i14);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    public void d(String str, Throwable th3) {
        canLog(3);
    }

    public void e(String str, Throwable th3) {
        canLog(6);
    }

    public void i(String str, Throwable th3) {
        canLog(4);
    }

    public void log(int i14, String str, boolean z14) {
        if (z14 || canLog(i14)) {
            Log.println(i14, this.tag, str);
        }
    }

    public void v(String str, Throwable th3) {
        canLog(2);
    }

    public void w(String str, Throwable th3) {
        canLog(5);
    }

    public void d(String str) {
        d(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }

    public void log(int i14, String str) {
        log(i14, str, false);
    }
}
