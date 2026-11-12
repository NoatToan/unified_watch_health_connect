package com.huawei.secure.android.common.activity;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f22733a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char f22734b = '*';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22735c = "SecurityComp21000300: ";
    private static final int d = 2;

    public static void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(b(str), a(str2, z));
    }

    private static String b(String str) {
        return f22735c + str;
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(b(str), a(str2, false));
    }

    public static void a(String str, String str2, Throwable th) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(b(str), str2 + " , throwable message : " + th.getMessage());
    }

    public static void b(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(b(str), a(str2, z));
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(b(str), a(str2, false));
    }

    private static String a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf(f22734b);
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (f22733a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i % 2 == 0) {
                    cCharAt = '*';
                }
                i++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
