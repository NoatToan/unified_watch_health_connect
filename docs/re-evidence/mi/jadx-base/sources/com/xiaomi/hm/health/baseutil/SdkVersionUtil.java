package com.xiaomi.hm.health.baseutil;

import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public class SdkVersionUtil {
    public static boolean isQ() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
