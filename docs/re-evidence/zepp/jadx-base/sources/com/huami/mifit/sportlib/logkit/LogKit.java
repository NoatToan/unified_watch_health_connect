package com.huami.mifit.sportlib.logkit;

import com.huami.mifit.sportlib.defpractice.DefLogClient;

/* JADX INFO: loaded from: classes11.dex */
public class LogKit {
    private static ISportLogCallback a;

    public static void d(String str, String str2) {
        ISportLogCallback iSportLogCallback = a;
        if (iSportLogCallback != null) {
            iSportLogCallback.d(str, str2);
        } else {
            DefLogClient.info(str, str2);
        }
    }

    public static void e(String str, String str2) {
        ISportLogCallback iSportLogCallback = a;
        if (iSportLogCallback != null) {
            iSportLogCallback.e(str, str2);
        } else {
            DefLogClient.err(str, str2);
        }
    }

    public static void i(String str, String str2) {
        ISportLogCallback iSportLogCallback = a;
        if (iSportLogCallback != null) {
            iSportLogCallback.i(str, str2);
        } else {
            DefLogClient.info(str, str2);
        }
    }

    public static void privacyLog(String str, String str2) {
        DefLogClient.saveAsCsv(str, str2);
    }

    public static void setLogClient(ISportLogCallback iSportLogCallback) {
        a = iSportLogCallback;
    }

    public static void w(String str, String str2) {
        ISportLogCallback iSportLogCallback = a;
        if (iSportLogCallback != null) {
            iSportLogCallback.w(str, str2);
        } else {
            DefLogClient.warn(str, str2);
        }
    }

    public static void w2f(String str, String str2) {
        ISportLogCallback iSportLogCallback = a;
        if (iSportLogCallback != null) {
            iSportLogCallback.w2f(str, str2);
        } else {
            DefLogClient.fi(str, str2);
        }
    }
}
