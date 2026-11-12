package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public class ParamsColorUtils {
    public static int blendColor(int i, int i2) {
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        int i3 = i2 >>> 24;
        int iRed2 = Color.red(i);
        int i4 = 255 - i3;
        int iGreen2 = ((Color.green(i) * i4) / 255) + ((iGreen * i3) / 255);
        return (-16777216) | (((((iRed2 * i4) / 255) + ((iRed * i3) / 255)) << 16) + (iGreen2 << 8) + ((Color.blue(i) * i4) / 255) + ((iBlue * i3) / 255));
    }

    public static int[] get2SectionsColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.high_color), ContextCompat.getColor(context, R.color.normal_color)};
    }

    public static int[] getBodyFatColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.low_color), ContextCompat.getColor(context, R.color.slight_low_color), ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.slight_high_color), ContextCompat.getColor(context, R.color.high_color)};
    }

    public static int[] getMuscleColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.high_color), ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.excellent_color)};
    }

    public static int[] getVisceralFatColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.slight_high_color), ContextCompat.getColor(context, R.color.high_color)};
    }

    public static int[] getWaterColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.high_color), ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.excellent_color)};
    }
}
