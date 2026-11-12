package com.huami.discovery.bridge.util;

import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes8.dex */
public class ImageUtils {
    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > i || i4 > i2) {
            return Math.max(Math.round((i3 * 1.0f) / i), Math.round((i4 * 1.0f) / i2));
        }
        return 1;
    }
}
