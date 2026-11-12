package com.huawei.hianalytics.visual;

import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class l0 extends HashMap {
    public l0() {
        put(1, "2G");
        put(2, "2G");
        put(4, "2G");
        put(7, "2G");
        put(11, "2G");
        put(3, "3G");
        put(8, "3G");
        put(9, "3G");
        put(10, "3G");
        put(15, "3G");
        put(5, "3G");
        put(6, "3G");
        put(12, "3G");
        put(14, "3G");
        put(13, "4G");
        if (Build.VERSION.SDK_INT >= 29) {
            put(20, "5G");
        }
    }
}
