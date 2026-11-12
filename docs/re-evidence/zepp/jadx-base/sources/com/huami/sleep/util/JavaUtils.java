package com.huami.sleep.util;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes13.dex */
public class JavaUtils {
    public static int addAlpha(Context mContext, @ColorRes int colorRes) {
        int color = ContextCompat.getColor(mContext.getApplicationContext(), colorRes);
        return Color.argb((int) (((double) ((color >> 24) & 255)) * 0.13d), (color >> 16) & 255, (color >> 8) & 255, color & 255);
    }
}
