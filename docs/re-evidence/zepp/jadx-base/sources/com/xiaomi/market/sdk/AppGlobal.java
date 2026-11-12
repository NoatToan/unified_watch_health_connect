package com.xiaomi.market.sdk;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes22.dex */
class AppGlobal {
    public static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static PackageManager getPackageManager() {
        return sContext.getPackageManager();
    }

    public static void setContext(Context context) {
        sContext = context.getApplicationContext();
    }
}
