package com.huami.module.ktx;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.PluralsRes;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a3\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0001\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "", "colorRes", "loadColor", "resId", "tint", "size", "Landroid/graphics/drawable/Drawable;", "loadDrawable", "(Landroid/content/Context;IILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "fontResId", "Landroid/graphics/Typeface;", "getFont", "id", "quality", "", "getQuantityString", "hm-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class ContextExtKt {
    @Nullable
    public static final Typeface getFont(@NotNull Context context, @FontRes int i) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 26 ? context.getResources().getFont(i) : ResourcesCompat.getFont(context, i);
    }

    @NotNull
    public static final String getQuantityString(@NotNull Context context, @PluralsRes int i, int i2) throws Resources.NotFoundException {
        return context.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    @ColorInt
    public static final int loadColor(@NotNull Context context, @ColorRes int i) {
        return ContextCompat.getColor(context, i);
    }

    @Nullable
    public static final Drawable loadDrawable(@NotNull Context context, @DrawableRes int i, @ColorRes int i2, @Nullable Integer num) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        if (i2 != 0) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(context, i2));
        }
        if (num == null) {
            return drawable;
        }
        drawable.setBounds(0, 0, num.intValue(), num.intValue());
        return drawable;
    }

    public static /* synthetic */ Drawable loadDrawable$default(Context context, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        return loadDrawable(context, i, i2, num);
    }
}
