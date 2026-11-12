package com.amap.api.services.core;

import android.content.Context;
import defpackage.xts;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SearchUtils {
    public static String getPkgName(Context context) {
        try {
            return context.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            xts.i(th, "SearchUtils", "getPkgName");
            return null;
        }
    }

    public static String getSHA1(Context context) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArrDigest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            xts.i(th, "SearchUtils", "getSHA1");
            return null;
        }
    }

    public static String getVersion() {
        return "9.7.4";
    }
}
