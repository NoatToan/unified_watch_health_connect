package com.google.android.gms.common.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.common.base.a;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        new StringBuilder(strValueOf2.length() + strValueOf.length() + 56 + 1);
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        new StringBuilder(strValueOf2.length() + strValueOf.length() + 55 + 1);
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        h.s("null reference");
    }

    @KeepForSdk
    public static void checkNull(Object obj) {
        if (obj == null) {
            return;
        }
        h.s("non-null reference");
    }

    @KeepForSdk
    public static void checkState(boolean z14, Object obj) {
        if (!z14) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        a.a(obj2);
    }

    @KeepForSdk
    public static void checkNull(Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        a.a(obj2);
    }

    @KeepForSdk
    public static void checkState(boolean z14) {
        if (z14) {
            return;
        }
        x.h();
    }
}
