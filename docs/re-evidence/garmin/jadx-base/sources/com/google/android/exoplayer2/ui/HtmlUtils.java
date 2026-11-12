package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes14.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        StringBuilder sbD = v.d(v.a(v.a(5, str), str), ".", str, ",.", str);
        sbD.append(" *");
        return sbD.toString();
    }

    public static String toCssRgba(int i14) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i14)), Integer.valueOf(Color.green(i14)), Integer.valueOf(Color.blue(i14)), Double.valueOf(((double) Color.alpha(i14)) / 255.0d));
    }
}
