package com.huami.watch.transdata;

import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class TLog {
    private static final String a = "_DATA";
    private static final boolean b = true;
    private static final String c = "_PRO";
    private static final String d = "sessionId:";
    private static final String e = "TRANS_SERVICE";

    public static void data(String str, String str2) {
        Log.i("TRANS_SERVICE_DATA", "[sessionId:" + str + "]" + str2, new Object[0]);
    }

    public static void pro(String str) {
        Log.i("TRANS_SERVICE_PRO", str, new Object[0]);
    }
}
