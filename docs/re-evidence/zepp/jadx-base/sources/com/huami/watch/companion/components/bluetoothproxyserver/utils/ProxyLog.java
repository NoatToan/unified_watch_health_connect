package com.huami.watch.companion.components.bluetoothproxyserver.utils;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class ProxyLog {
    private static final String a = "HttpProxy";
    private static final boolean b = Log.isLoggable(a, 2);
    private static final boolean c = Log.isLoggable(a, 3);

    public static void D(String str, String str2) {
        if (c) {
            Log.d("HttpProxy_" + str, str2);
        }
    }

    public static void E(String str, String str2) {
        Log.e("HttpProxy_" + str, str2);
    }

    public static void I(String str, String str2) {
        Log.i("HttpProxy_" + str, str2);
    }

    public static void V(String str, String str2) {
        if (b) {
            Log.d("HttpProxy_" + str, str2);
        }
    }

    public static void W(String str, String str2) {
        Log.w("HttpProxy_" + str, str2);
    }
}
