package com.amazon.alexa.avs.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkUtil {
    private static final String TAG = "Util-Network";

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
        Log.d(TAG, "Is not Online!!");
        return false;
    }
}
