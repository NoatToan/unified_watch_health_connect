package org.cybergarage.util;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class DebugLog {
    private static final String CONFIG_FILE = ".app-debug";
    private static final String TAG = "DebugLog";
    public static boolean isLoggable = false;

    public static void d(String str, String str2) {
        if (isLoggable) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        Log.e(str, str2);
    }

    public static void i(String str, String str2) {
        if (isLoggable) {
            Log.i(str, str2);
        }
    }

    public static void init() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        isLoggable = true;
        AlwaysLog.d(TAG, "init debug log time " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static void setLoggable(boolean z) {
        File file = new File(Environment.getExternalStorageDirectory(), CONFIG_FILE);
        isLoggable = z;
        if (!z) {
            file.delete();
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            AlwaysLog.e(TAG, "setDebuggable failed " + e.getLocalizedMessage());
        }
    }

    public static void w(String str, String str2) {
        if (isLoggable) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static void d(String str, String str2, Throwable th) {
        if (isLoggable) {
            Log.d(str, str2, th);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (isLoggable) {
            Log.i(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isLoggable) {
            Log.w(str, str2, th);
        }
    }
}
