package com.unionpay.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static String a() {
        String str = Build.VERSION.RELEASE;
        return !TextUtils.isEmpty(str) ? str.trim() : "";
    }

    public static String b() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!TextUtils.isEmpty(strTrim)) {
                return strTrim.replace(" ", "");
            }
        }
        return "";
    }

    public static String a(Context context) {
        try {
            String packageName = context instanceof Activity ? ((Activity) context).getPackageName() : "";
            return packageName == null ? "" : packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String strA = UPUtils.a(context, "merchant_id");
            if (TextUtils.isEmpty(strA)) {
                strA = UUID.randomUUID().toString();
                if (!TextUtils.isEmpty(strA)) {
                    strA = strA.replaceAll("-", "");
                    UPUtils.a(context, strA, "merchant_id");
                }
            }
            return strA;
        } catch (Exception unused) {
            return "";
        }
    }
}
