package com.xiaomi.hm.health.watermarkcamera.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkKeeper {
    private static final String a = "WatermarkCamera";
    private static final String b = "watermark_guide_key";

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences(a, 0);
    }

    public static boolean getWatermarkGuideKey(Context context) {
        return a(context).getBoolean(b, false);
    }

    public static void setWatermarkGuideKey(Context context, boolean z) {
        a(context).edit().putBoolean(b, z).apply();
    }
}
