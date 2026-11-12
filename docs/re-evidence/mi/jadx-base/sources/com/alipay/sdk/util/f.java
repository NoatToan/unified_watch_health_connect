package com.alipay.sdk.util;

import android.content.Context;
import android.text.TextUtils;
import defpackage.gv5;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static String a(com.alipay.sdk.sys.a aVar, Context context) {
        String strC = g.c(aVar, context, "pref_trade_token", "");
        c.b("mspl", "get trade token: " + strC);
        return strC;
    }

    public static String b(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith("result={") && strArrSplit[i].endsWith("}")) {
                String str2 = strArrSplit[i];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split(gv5.CONNECT_STR);
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    if (strArrSplit2[i2].startsWith("trade_token=\"") && strArrSplit2[i2].endsWith("\"")) {
                        String str3 = strArrSplit2[i2];
                        strSubstring = str3.substring(13, str3.length() - 1);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith("trade_token=")) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static void c(com.alipay.sdk.sys.a aVar, Context context, String str) {
        try {
            String strB = b(str);
            c.b("mspl", "trade token: " + strB);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            g.b(aVar, context, "pref_trade_token", strB);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "SaveTradeTokenError", th);
            c.d(th);
        }
    }
}
