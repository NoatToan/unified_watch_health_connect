package com.garmin.util;

import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public final class StringRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f52810a = false;

    private static native String a(Context context);

    private static native String b(Context context);

    private static native String c(Context context, int i14);

    private static native String d(Context context, int i14);

    public static synchronized String e(int i14, Context context) {
        try {
            if (!f52810a) {
                System.loadLibrary("sr");
                f52810a = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return d(context, i14);
    }
}
