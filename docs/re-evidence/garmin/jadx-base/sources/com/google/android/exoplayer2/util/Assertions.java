package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;
import j20.x;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class Assertions {
    private Assertions() {
    }

    public static void checkArgument(boolean z14) {
        if (z14) {
            return;
        }
        h.w();
    }

    public static int checkIndex(int i14, int i15, int i16) {
        if (i14 >= i15 && i14 < i16) {
            return i14;
        }
        c.q();
        return 0;
    }

    public static void checkMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        h.z("Not in applications main thread");
    }

    public static String checkNotEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        h.w();
        return null;
    }

    public static <T> T checkNotNull(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z14, Object obj) {
        if (!z14) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T checkStateNotNull(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void checkArgument(boolean z14, Object obj) {
        if (z14) {
            return;
        }
        com.google.common.base.a.a(obj);
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        com.google.common.base.a.a(obj);
        return null;
    }

    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }

    public static void checkState(boolean z14) {
        if (z14) {
            return;
        }
        x.h();
    }

    public static <T> T checkStateNotNull(T t7) {
        if (t7 != null) {
            return t7;
        }
        x.h();
        return null;
    }
}
