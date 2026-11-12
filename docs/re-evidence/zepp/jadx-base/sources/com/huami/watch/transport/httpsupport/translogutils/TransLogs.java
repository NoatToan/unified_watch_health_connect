package com.huami.watch.transport.httpsupport.translogutils;

import android.util.Log;
import clc.utils.debug.slog.SolidLogger;

/* JADX INFO: loaded from: classes9.dex */
public class TransLogs {
    public static void d(String str) {
        if (Util.DEBUG_SERVER) {
            Log.d(Util.TRANS_TAG, str);
        }
        SolidLogger.getInstance().with(Util.TRANS_TAG, str);
    }

    public static void e(String str) {
        if (Util.DEBUG_SERVER) {
            Log.e(Util.TRANS_TAG, str);
        }
        SolidLogger.getInstance().with(Util.TRANS_TAG, str);
    }

    public static void i(String str) {
        if (Util.DEBUG_SERVER) {
            Log.i(Util.TRANS_TAG, str);
        }
        SolidLogger.getInstance().with(Util.TRANS_TAG, str);
    }

    public static void ii(String str) {
        if (Util.DEBUG_SERVER) {
            Log.i(Util.TRANS_TAG_N, str);
        }
        SolidLogger.getInstance().with(Util.TRANS_TAG_N, str);
    }
}
