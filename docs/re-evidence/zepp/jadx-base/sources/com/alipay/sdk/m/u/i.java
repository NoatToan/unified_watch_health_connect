package com.alipay.sdk.m.u;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    public static final String a = "pref_trade_token";
    public static final String b = ";";
    public static final String c = "result={";
    public static final String d = "}";
    public static final String e = "trade_token=\"";
    public static final String f = "\"";
    public static final String g = "trade_token=";

    public static void a(com.alipay.sdk.m.s.a aVar, Context context, String str) {
        try {
            String strA = a(str);
            e.b(com.alipay.sdk.m.l.a.z, "trade token: " + strA);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            j.b(aVar, context, a, strA);
        } catch (Throwable th) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.H, th);
            e.a(th);
        }
    }

    public static String a(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith(c) && strArrSplit[i].endsWith(d)) {
                String[] strArrSplit2 = strArrSplit[i].substring(8, strArrSplit[i].length() - 1).split(com.alipay.sdk.m.s.a.l);
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    if (strArrSplit2[i2].startsWith(e) && strArrSplit2[i2].endsWith("\"")) {
                        strSubstring = strArrSplit2[i2].substring(13, strArrSplit2[i2].length() - 1);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith(g)) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static String a(com.alipay.sdk.m.s.a aVar, Context context) {
        String strA = j.a(aVar, context, a, "");
        e.b(com.alipay.sdk.m.l.a.z, "get trade token: " + strA);
        return strA;
    }
}
