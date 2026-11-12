package com.huami.wallet.ui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class TintUtils {
    private static Drawable a(Drawable drawable, @ColorInt int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }

    public static Drawable tintDrawable(Context context, @DrawableRes int i, @ColorRes int i2) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        int color = ContextCompat.getColor(context, i2);
        Objects.requireNonNull(drawable);
        return a(drawable, color);
    }
}
