package com.xiaomi.hm.health.watermarkcamera.utils;

import android.content.Context;
import android.util.TypedValue;
import com.huami.view.basetitle.IdGetter;

/* JADX INFO: loaded from: classes22.dex */
public class ViewUtils {
    private static float a = 0.0f;
    private static final String b = "status_bar_height";

    public static float dp2px(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float getDensityValue(Context context) {
        if (a == 0.0f) {
            a = context.getResources().getDisplayMetrics().density;
        }
        return a;
    }

    public static int getStatusBarHeight(Context context) {
        try {
            return context.getResources().getDimensionPixelSize(IdGetter.getIdSys(context, b, "dimen"));
        } catch (Exception unused) {
            return (int) dp2px(context, 24.0f);
        }
    }

    public static int parse2RealPxBy1080(Context context, int i) {
        return (int) (i * (context.getResources().getDisplayMetrics().widthPixels / 1080.0f));
    }
}
