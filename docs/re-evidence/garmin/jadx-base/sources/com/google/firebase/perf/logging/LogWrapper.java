package com.google.firebase.perf.logging;

/* JADX INFO: loaded from: classes2.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    private LogWrapper() {
    }

    public static synchronized LogWrapper getInstance() {
        try {
            if (instance == null) {
                instance = new LogWrapper();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return instance;
    }

    public void d(String str) {
    }

    public void e(String str) {
    }

    public void i(String str) {
    }

    public void v(String str) {
    }

    public void w(String str) {
    }
}
