package com.alipay.sdk.m.b;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static b a = null;
    public static boolean b = false;

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            b bVar = a;
            if (bVar != null) {
                try {
                    return bVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void b(Context context) {
        if (a != null || b) {
            return;
        }
        synchronized (c.class) {
            if (a == null && !b) {
                a = com.alipay.sdk.m.c.a.a(context);
                b = true;
            }
        }
    }
}
