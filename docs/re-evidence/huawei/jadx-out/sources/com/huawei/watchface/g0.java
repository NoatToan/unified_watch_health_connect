package com.huawei.watchface;

import android.content.Context;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g0 {
    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }
}
