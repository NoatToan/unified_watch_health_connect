package com.huami.wallet.ui.utils;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes16.dex */
public class ViewUtils {
    public static float dpToPx(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float spToPx(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
