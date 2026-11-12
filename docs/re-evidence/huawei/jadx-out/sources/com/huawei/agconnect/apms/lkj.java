package com.huawei.agconnect.apms;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lkj {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final abc bcd = new abc();

    public final class abc extends HashMap<Integer, String> {
        public abc() {
            put(1, "2G");
            put(2, "2G");
            put(4, "2G");
            put(7, "2G");
            put(11, "2G");
            put(3, "3G");
            put(8, "3G");
            put(9, "3G");
            put(10, "3G");
            put(15, "3G");
            put(5, "3G");
            put(6, "3G");
            put(12, "3G");
            put(14, "3G");
            put(13, "4G");
            if (Build.VERSION.SDK_INT >= 29) {
                put(20, "5G");
            }
        }
    }

    public static String abc(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            try {
                abc.warn("cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th.getMessage());
            } catch (Throwable unused) {
                return "unknown";
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        if (activeNetworkInfo != null) {
            int[] iArr = {1, 6, 7, 9};
            for (int i = 0; i < 4; i++) {
                if (iArr[i] == activeNetworkInfo.getType()) {
                    return "wifi";
                }
            }
        }
        if (activeNetworkInfo != null) {
            int[] iArr2 = {0, 2, 3, 4, 5};
            for (int i2 = 0; i2 < 5; i2++) {
                if (iArr2[i2] == activeNetworkInfo.getType()) {
                    int subtype = activeNetworkInfo.getSubtype();
                    abc abcVar = bcd;
                    String str = abcVar.containsKey(Integer.valueOf(subtype)) ? abcVar.get(Integer.valueOf(subtype)) : "unknown";
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
    }
}
