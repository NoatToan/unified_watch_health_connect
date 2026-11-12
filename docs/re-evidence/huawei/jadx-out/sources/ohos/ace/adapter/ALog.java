package ohos.ace.adapter;

import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes20.dex */
public class ALog {
    private static ILogger logger;
    private static final ReentrantLock loggerLock = new ReentrantLock();
    private static int logLevel = 0;

    private ALog() {
    }

    public static ILogger getLogger() {
        return logger;
    }

    public static int getLoggerLevel() {
        return logLevel;
    }

    public static void setLogger(ILogger iLogger) {
        if (iLogger == null) {
            return;
        }
        ReentrantLock reentrantLock = loggerLock;
        reentrantLock.lock();
        logger = iLogger;
        reentrantLock.unlock();
    }

    public static void setLoggerLevel(int i) {
        logLevel = i;
    }

    public static boolean isDebuggable() {
        ILogger iLogger = logger;
        if (iLogger == null) {
            return false;
        }
        return iLogger.isDebuggable();
    }

    public static void d(String str, String str2) {
        ILogger iLogger = logger;
        if (iLogger != null && logLevel <= 0) {
            iLogger.d(str, str2);
        } else {
            Log.d(str, str2);
        }
    }

    public static void i(String str, String str2) {
        ILogger iLogger = logger;
        if (iLogger != null && logLevel <= 1) {
            iLogger.i(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public static void w(String str, String str2) {
        ILogger iLogger = logger;
        if (iLogger != null && logLevel <= 2) {
            iLogger.w(str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2) {
        ILogger iLogger = logger;
        if (iLogger != null && logLevel <= 3) {
            iLogger.e(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public static void jankLog(int i, String str) {
        ILogger iLogger = logger;
        if (iLogger == null) {
            return;
        }
        iLogger.jankLog(i, str);
    }
}
