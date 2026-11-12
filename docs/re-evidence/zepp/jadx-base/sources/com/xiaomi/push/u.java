package com.xiaomi.push;

import android.os.Looper;

/* JADX INFO: loaded from: classes22.dex */
public class u {
    public static void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException("can't do this on ui thread");
        }
    }
}
