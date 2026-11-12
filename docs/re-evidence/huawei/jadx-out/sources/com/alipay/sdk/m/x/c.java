package com.alipay.sdk.m.x;

import android.content.Context;
import android.net.NetworkInfo;
import defpackage.pd;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static c d;

    public c(Context context) {
    }

    public static c d(Context context) {
        if (d == null) {
            d = new c(context);
        }
        return d;
    }

    public String b() {
        return "00:00:00:00:00:00";
    }

    public String d() {
        return "000000000000000";
    }

    public static h a(Context context) {
        try {
            NetworkInfo networkInfoB = pd.b(null, context);
            if (networkInfoB == null || networkInfoB.getType() != 0) {
                return (networkInfoB == null || networkInfoB.getType() != 1) ? h.NONE : h.WIFI;
            }
            return h.a(networkInfoB.getSubtype());
        } catch (Exception unused) {
            return h.NONE;
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String c() {
        return "000000000000000";
    }
}
