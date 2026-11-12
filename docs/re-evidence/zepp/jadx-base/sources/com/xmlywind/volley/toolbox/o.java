package com.xmlywind.volley.toolbox;

import android.os.Looper;

/* JADX INFO: loaded from: classes22.dex */
final class o {
    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
