package com.xiaomi.smarthome.library.bluetooth.utils;

import android.os.Handler;
import android.util.Log;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothLog {
    private static final String LOG_TAG = "miio-bluetooth";
    private static Handler mHandlerLog;

    public static void d(String str) {
        if (isLogEnabled()) {
            BluetoothService.getBleCoreProvider().writeLogOnDebug(LOG_TAG, str);
        }
    }

    public static void debug(String str) {
        w(Log.getStackTraceString(new Throwable(str)));
    }

    public static void e(String str) {
        if (isLogEnabled()) {
            BluetoothService.getBleCoreProvider().writeLogOnDebug(LOG_TAG, str);
        }
    }

    public static void formatLog(String str, Object... objArr) {
        if (isLogEnabled()) {
            BluetoothService.getBleCoreProvider().writeLogOnDebug(LOG_TAG, String.format(str, objArr));
        }
    }

    private static String getThrowableString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        while (th != null) {
            th.printStackTrace(printWriter);
            th = th.getCause();
        }
        String string = stringWriter.toString();
        printWriter.close();
        return StringUtil.getNonNullString(string);
    }

    public static void i(String str) {
        if (isLogEnabled()) {
            BluetoothService.getBleCoreProvider().writeLogOnDebug(LOG_TAG, str);
        }
    }

    private static boolean isLogEnabled() {
        return !BluetoothContextManager.isReleaseBuild();
    }

    public static boolean isShowSearchLog() {
        return false;
    }

    public static void v(String str) {
        if (isLogEnabled()) {
            BluetoothService.getBleCoreProvider().writeLogOnDebug(LOG_TAG, str);
        }
    }

    public static void w(String str) {
        if (isLogEnabled()) {
            BluetoothService.getBleCoreProvider().writeLogOnDebug(LOG_TAG, str);
        }
    }

    public static void e(Throwable th) {
        e(getThrowableString(th));
    }

    public static void w(Throwable th) {
        w(getThrowableString(th));
    }
}
