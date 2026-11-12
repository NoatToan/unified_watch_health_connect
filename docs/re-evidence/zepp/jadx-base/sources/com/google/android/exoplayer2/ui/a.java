package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    private a() {
    }

    public static String a(String className) {
        StringBuilder sb = new StringBuilder(String.valueOf(className).length() + 5 + String.valueOf(className).length());
        sb.append(".");
        sb.append(className);
        sb.append(",.");
        sb.append(className);
        sb.append(" *");
        return sb.toString();
    }

    public static String b(@ColorInt int color) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color)), Double.valueOf(((double) Color.alpha(color)) / 255.0d));
    }
}
