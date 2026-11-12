package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.fp;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dc extends dq {
    public static void a(Context context, Runnable runnable) {
        if (context == null || !fp.b(context).aX()) {
            f20650a.a(runnable);
        } else {
            f20650a.a(runnable, null);
        }
    }
}
