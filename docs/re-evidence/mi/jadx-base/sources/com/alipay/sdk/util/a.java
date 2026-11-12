package com.alipay.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f5875b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5876a;

    public a(Context context) {
        try {
            try {
                String macAddress = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                this.f5876a = macAddress;
                if (TextUtils.isEmpty(macAddress)) {
                    this.f5876a = "00:00:00:00:00:00";
                }
            } catch (Exception e) {
                c.d(e);
                if (TextUtils.isEmpty(this.f5876a)) {
                }
            }
        } catch (Throwable th) {
            if (TextUtils.isEmpty(this.f5876a)) {
                this.f5876a = "00:00:00:00:00:00";
            }
            throw th;
        }
    }

    public static a a(Context context) {
        if (f5875b == null) {
            f5875b = new a(context);
        }
        return f5875b;
    }

    public static d c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
                return (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) ? d.NONE : d.WIFI;
            }
            return d.a(activeNetworkInfo.getSubtype());
        } catch (Exception unused) {
            return d.NONE;
        }
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String b() {
        return "000000000000000";
    }

    public String d() {
        return "000000000000000";
    }

    public String e() {
        return this.f5876a;
    }
}
