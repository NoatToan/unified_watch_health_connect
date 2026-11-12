package com.huawei.phoneservice.faq.base.tracker;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static WeakReference<Context> d;

    private static void c(Context context, boolean z) {
        d = new WeakReference<>(context.getApplicationContext());
    }

    public static void d(Context context, boolean z) {
        c(context, z);
    }
}
