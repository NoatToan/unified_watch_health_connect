package com.huawei.hianalytics.visual;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes33.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f11663a = new l0();

    public static NetworkInfo a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            HiLog.e("NetworkTypeUtils", "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th.getMessage());
            return null;
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            NetworkInfo networkInfoA = a(context);
            if (networkInfoA == null || !networkInfoA.isConnected()) {
                return "none";
            }
            if (networkInfoA != null) {
                int[] iArr = {1, 6, 7, 9};
                for (int i = 0; i < 4; i++) {
                    if (iArr[i] == networkInfoA.getType()) {
                        return "wifi";
                    }
                }
            }
            if (networkInfoA != null) {
                int[] iArr2 = {0, 2, 3, 4, 5};
                for (int i2 = 0; i2 < 5; i2++) {
                    if (iArr2[i2] == networkInfoA.getType()) {
                        int subtype = networkInfoA.getSubtype();
                        l0 l0Var = f11663a;
                        String str = l0Var.containsKey(Integer.valueOf(subtype)) ? (String) l0Var.get(Integer.valueOf(subtype)) : "unknown";
                        if (str == null) {
                            str = "unknown";
                        }
                        if (!str.equals("unknown")) {
                            return str;
                        }
                        if (subtype != 16) {
                            return subtype != 17 ? "unknown" : "3G";
                        }
                        return "2G";
                    }
                }
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }
}
