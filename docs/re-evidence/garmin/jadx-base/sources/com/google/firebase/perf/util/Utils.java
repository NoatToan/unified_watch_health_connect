package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.logging.AndroidLogger;
import okhttp3.HttpUrl;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int bufferToInt(byte[] bArr) {
        int i14 = 0;
        for (int i15 = 0; i15 < 4 && i15 < bArr.length; i15++) {
            i14 |= (bArr[i15] & UnsignedBytes.MAX_VALUE) << (i15 * 8);
        }
        return i14;
    }

    public static void checkArgument(boolean z14, String str) {
        if (z14) {
            return;
        }
        h.s(str);
    }

    public static boolean isDebugLoggingEnabled(Context context) {
        Boolean bool = isDebugLoggingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            isDebugLoggingEnabled = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
            AndroidLogger.getInstance().debug("No perf logcat meta data found " + e4.getMessage());
            return false;
        }
    }

    public static int saturatedIntCast(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static String stripSensitiveInfo(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        return httpUrl != null ? httpUrl.newBuilder().username("").password("").query(null).fragment(null).toString() : str;
    }

    public static String truncateURL(String str, int i14) {
        HttpUrl httpUrl;
        int iLastIndexOf;
        if (str.length() <= i14) {
            return str;
        }
        if (str.charAt(i14) != '/' && (httpUrl = HttpUrl.parse(str)) != null) {
            return (httpUrl.encodedPath().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i14 + (-1))) < 0) ? str.substring(0, i14) : str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i14);
    }
}
