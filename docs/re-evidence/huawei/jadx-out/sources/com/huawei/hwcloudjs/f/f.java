package com.huawei.hwcloudjs.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.watchface.mvp.model.webview.JsNetwork;

/* JADX INFO: loaded from: classes37.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17111a = "NetUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17112b = "none";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17113c = "unknown";
    public static final String d = "2g";
    public static final String e = "3g";
    public static final String f = "4g";
    public static final String g = "wifi";
    public static final int h = 16;
    public static final int i = 17;
    public static final int j = 18;

    public static boolean b() {
        return !a().equalsIgnoreCase("none");
    }

    public static String a() {
        Context contextA = com.huawei.hwcloudjs.b.a.a();
        if (!(contextA.getSystemService("connectivity") instanceof ConnectivityManager)) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) contextA.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return "none";
        }
        if (!JsNetwork.NetworkType.MOBILE.equalsIgnoreCase(activeNetworkInfo.getTypeName())) {
            return "wifi";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return d;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
            case 18:
                return e;
            case 13:
                return f;
            default:
                return "unknown";
        }
    }
}
