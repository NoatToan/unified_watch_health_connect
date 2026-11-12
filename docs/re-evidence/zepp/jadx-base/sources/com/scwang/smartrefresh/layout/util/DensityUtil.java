package com.scwang.smartrefresh.layout.util;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes18.dex */
public class DensityUtil {
    public float a = Resources.getSystem().getDisplayMetrics().density;

    public static int dp2px(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static float px2dp(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    public int dip2px(float f) {
        return (int) ((f * this.a) + 0.5f);
    }

    public float px2dip(float f) {
        return f / this.a;
    }
}
