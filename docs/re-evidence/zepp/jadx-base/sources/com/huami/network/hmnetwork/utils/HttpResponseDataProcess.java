package com.huami.network.hmnetwork.utils;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes6.dex */
public class HttpResponseDataProcess {
    private static final String a = "HttpResponseDataProcess";

    private static String a(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static String in(String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return in(str, new String(bArr));
    }

    public static String out(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            return e.b(d.a(a(str), str2));
        } catch (Exception e) {
            HMLog.e(a, e.toString(), new Object[0]);
            return null;
        }
    }

    public static String in(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            return d.c(a(str), e.a(str2));
        } catch (Exception e) {
            HMLog.e(a, e.toString(), new Object[0]);
            return null;
        }
    }
}
