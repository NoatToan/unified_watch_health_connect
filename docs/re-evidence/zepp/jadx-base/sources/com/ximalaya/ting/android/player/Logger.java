package com.ximalaya.ting.android.player;

import android.os.Environment;
import android.os.Process;
import android.util.Log;
import com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes22.dex */
public class Logger {
    public static final String JSON_ERROR = "解析json异常";
    private static final int LOG_LEVEL = 0;
    private static SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static boolean isJavaLog = false;

    public static void d(String str, String str2) {
        if (isJavaLog) {
            printJava(str, str2);
        } else {
            if (str2 == null || !isLoggable(str, 3)) {
                return;
            }
            Log.d(str, str2);
        }
    }

    public static void e(Exception exc) {
        e("解析json异常", "解析json异常" + exc.getMessage() + getLineInfo());
    }

    public static String getLineInfo() {
        if (!XMediaPlayerConstants.isDebug) {
            return "";
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return "@" + stackTraceElement.getFileName() + ": Line " + stackTraceElement.getLineNumber();
    }

    public static File getLogFilePath() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        File file = new File("/sdcard/ting/errorLog/infor.log");
        if (!file.getParentFile().getParentFile().exists()) {
            file.getParentFile().getParentFile().mkdir();
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        return file;
    }

    public static void i(String str, String str2) {
        if (str2 == null || !isLoggable(str, 4)) {
            return;
        }
        Log.i(str, str2);
    }

    public static boolean isLoggable(String str, int i) {
        return XMediaPlayerConstants.isDebug && i >= 0;
    }

    public static void log(Object obj) {
        if (isJavaLog) {
            System.out.println(obj);
        } else if (XMediaPlayerConstants.isDebug) {
            Log.i(XmNotificationCreater.IMG_NOTIFYICON_DRAWABLE_S, obj + "");
        }
    }

    public static void logToSd(String str) {
        File logFilePath;
        if (!XMediaPlayerConstants.isDebug || (logFilePath = getLogFilePath()) == null) {
            return;
        }
        PrintWriter printWriter = null;
        try {
            String str2 = dateformat.format(Long.valueOf(System.currentTimeMillis()));
            PrintWriter printWriter2 = new PrintWriter(new FileWriter(logFilePath, true));
            try {
                printWriter2.println(str + " time:" + str2);
                printWriter2.close();
            } catch (Throwable unused) {
                printWriter = printWriter2;
                if (printWriter != null) {
                    printWriter.close();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void printJava(String str, String str2) {
        System.out.println(str + "  " + str2);
    }

    public static void throwRuntimeException(Object obj) {
        if (XMediaPlayerConstants.isDebug) {
            throw new RuntimeException("出现异常：" + obj);
        }
    }

    public static void v(String str, String str2) {
        if (str2 == null || !isLoggable(str, 2)) {
            return;
        }
        Log.v(str, str2);
    }

    public static void w(String str, String str2) {
        if (str2 == null || !isLoggable(str, 5)) {
            return;
        }
        Log.w(str, str2);
    }

    public static void i(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 4)) {
            return;
        }
        Log.i(str, str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 2)) {
            return;
        }
        Log.v(str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 5)) {
            return;
        }
        Log.w(str, str2, th);
    }

    public static void e(String str, String str2) {
        if (str2 == null || !isLoggable(str, 6)) {
            return;
        }
        Log.e(str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 3)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static void log(String str, Object obj) {
        if (!XMediaPlayerConstants.isDebug || obj == null) {
            return;
        }
        if (!str.equals("dl_mp3") || XMediaPlayerConstants.isDebugPlayer) {
            logToSd(str + "JTid(" + Long.toString(Thread.currentThread().getId()) + ")SPid(" + Process.myPid() + ")" + obj);
        }
    }

    public static void w(String str, Throwable th) {
        if (th == null || !isLoggable(str, 5)) {
            return;
        }
        Log.w(str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 == null || !isLoggable(str, 6)) {
            return;
        }
        Log.e(str, str2, th);
    }
}
