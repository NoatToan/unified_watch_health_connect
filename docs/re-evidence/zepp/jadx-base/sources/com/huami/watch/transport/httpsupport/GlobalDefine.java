package com.huami.watch.transport.httpsupport;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class GlobalDefine {
    public static final boolean DEBUG;
    public static final boolean DEBUG_BLT;
    public static final boolean DEBUG_CLIENT;
    public static final boolean DEBUG_COMPANION;
    public static final boolean DEBUG_CRASH_MONITOR;
    public static final boolean DEBUG_HTTP;
    public static final boolean DEBUG_LD;
    public static final boolean DEBUG_SERIAL_MODE;
    public static final boolean DEBUG_SERVER;
    public static final boolean DEBUG_SRV;
    public static final long INTERNAL_ALARM_FOR_WEAR_ASSIST = 28800000;
    public static final long INTERNAL_ALARM_FOR_WEAR_SERVICE = 7200000;
    public static final String KEY_OF_VER_FOR_REPORT_LIST_PROTOCOL = "ver";
    public static final boolean SPRING_LOG_ENALBE = true;
    public static final String TAG_BLT = "WH-BLT";
    public static final String TAG_CLIENT = "WH-APP";
    public static final String TAG_COMPANION = "WH-ASSIST";
    public static final String TAG_CRASH = "WH-CRASH";
    public static final String TAG_HTTP = "WH-HTTP";
    public static final String TAG_LD = "WH-LD";
    public static final String TAG_PREFIX = "WH-";
    public static final String TAG_SERIAL_MODE = "WH-SERIAL_MODE";
    public static final String TAG_SRV = "WH-SRV";
    public static final String VER_OF_REPORT_LIST_PROTOCOL = "1";
    private static boolean a = false;
    private static boolean b;
    public static int CURR_REPORT_LIST_VER = Integer.valueOf("1").intValue();
    public static final boolean IS_WATCH = TextUtils.equals(Build.DEVICE, "watch");

    static {
        boolean zExists = new File(Environment.getExternalStorageDirectory() + "/springchannel.ini").exists();
        DEBUG = zExists;
        boolean z = zExists & true;
        DEBUG_CLIENT = z;
        DEBUG_SERVER = z;
        DEBUG_COMPANION = z;
        DEBUG_CRASH_MONITOR = z;
        DEBUG_SERIAL_MODE = z;
        DEBUG_LD = z;
        DEBUG_BLT = z;
        DEBUG_SRV = z;
        DEBUG_HTTP = z;
        a = true;
        b = false;
    }

    public static boolean isOverSea() {
        return b;
    }

    public static void saveSyncSupport(boolean z) {
        a = z;
    }

    public static void setIsOversea(boolean z) {
        b = z;
    }

    public static boolean supportNewSync() {
        return a;
    }
}
