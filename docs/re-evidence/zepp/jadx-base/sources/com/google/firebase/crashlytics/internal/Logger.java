package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class Logger {
    public static final String TAG = "FirebaseCrashlytics";
    public static final Logger c = new Logger(TAG);
    private final String a;
    private int b = 4;

    public Logger(String str) {
        this.a = str;
    }

    private boolean a(int i) {
        return this.b <= i || Log.isLoggable(this.a, i);
    }

    public static Logger getLogger() {
        return c;
    }

    public void d(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.a, str, th);
        }
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.a, str, th);
        }
    }

    public void i(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.a, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    public void v(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.a, str, th);
        }
    }

    public void w(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.a, str, th);
        }
    }

    public void log(int i, String str, boolean z) {
        if (z || a(i)) {
            Log.println(i, this.a, str);
        }
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
}
