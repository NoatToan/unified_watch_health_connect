package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String str, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        String str2 = zza(bool) ? "https" : "http";
        return v.c(v.a(str2.length() + 3, str), str2, "://", str);
    }

    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l14) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb3.append(str2);
        }
        if (zza(bool)) {
            sb3.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb3.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb3.append(";Domain=");
            sb3.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb3.append(";Path=");
            sb3.append(str4);
        }
        if (l14 != null && l14.longValue() > 0) {
            sb3.append(";Max-Age=");
            sb3.append(l14);
        }
        return sb3.toString();
    }

    private static boolean zza(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
