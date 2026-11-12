package com.huawei.secure.android.common.util;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class SafeString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22932a = "SafeString";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22933b = "";

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e) {
                Log.e(f22932a, "replace: " + e.getMessage());
            }
        }
        return str;
    }

    public static String substring(String str, int i) {
        if (str == null || str.length() < i || i < 0) {
            return "";
        }
        try {
            return str.substring(i);
        } catch (Exception e) {
            Log.e(f22932a, "substring exception: " + e.getMessage());
            return "";
        }
    }

    public static String substring(String str, int i, int i2) {
        if (str == null || i < 0 || i2 > str.length() || i2 < i) {
            return "";
        }
        try {
            return str.substring(i, i2);
        } catch (Exception e) {
            Log.e(f22932a, "substring: " + e.getMessage());
            return "";
        }
    }
}
