package com.unicom.online.account.kernel;

import android.content.Context;

/* JADX INFO: loaded from: classes20.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31199a = "l";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f31200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f31201c;

    private static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(f31199a);
        sb.append((f31200b + f31201c) - 1);
        return sb.toString();
    }

    public static boolean a(Context context, String str) {
        if (f31201c >= 20) {
            if (f31200b > 2147483627) {
                m.d(context, "OAlog");
                f31200b = 0;
                f31201c = 0;
            } else {
                a(context, 0);
                f31200b++;
            }
        }
        int i = f31201c;
        if (i >= 0) {
            f31201c = i + 1;
        } else {
            f31201c = 0;
        }
        String strB = b();
        if (an.b(str).booleanValue()) {
            String strA = a(strB, strB);
            if (an.b(strA).booleanValue()) {
                boolean zA = m.a(context, strA, str);
                if (!zA) {
                    a();
                }
                return zA;
            }
        }
        return false;
    }

    public static void a(Context context, int i) {
        String strB = b();
        if (i == 0) {
            strB = f31199a + f31200b;
        }
        m.c(context, a(strB, strB));
        a();
    }

    private static void a() {
        int i = f31201c;
        f31201c = i > 0 ? i - 1 : 0;
    }

    private static String a(String str, String str2) {
        return "OAlog" + str + str2;
    }

    public static String a(Context context) {
        if (f31201c <= 0) {
            return null;
        }
        String strB = b();
        try {
            return m.a(context, a(strB, strB));
        } catch (Exception unused) {
            f31201c = 0;
            return null;
        }
    }
}
