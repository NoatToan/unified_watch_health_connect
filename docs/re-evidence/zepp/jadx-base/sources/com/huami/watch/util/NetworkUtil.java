package com.huami.watch.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkUtil {
    private static final String a = "Util-Network";

    public static boolean isOffline(Context context) {
        return !isOnline(context);
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTED) {
            return true;
        }
        Log.d(a, "Is not Online!!", new Object[0]);
        return false;
    }
}
