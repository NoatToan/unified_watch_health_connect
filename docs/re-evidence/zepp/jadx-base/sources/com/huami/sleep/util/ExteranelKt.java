package com.huami.sleep.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import com.xiaomi.hm.health.Constant;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00072\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0001\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\r\u001a\u00020\f\u001a\u0014\u0010\u0012\u001a\u00020\u000e*\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u001a\u0006\u0010\u0013\u001a\u00020\f\u001a\u001e\u0010\u0016\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0017\u001a\u00020\fH\u0000\"\u0017\u0010\u001b\u001a\u00020\u0018*\u00020\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0017\u0010\u001b\u001a\u00020\u0001*\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001c\"\u0017\u0010\u001e\u001a\u00020\u0001*\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroid/content/Context;", "", "colorRes", "color", "", "alpha", "addAlpha", "Landroid/view/View;", "loadColor", "stringId", "", "getString", "", "visible", "", "setVisible", "Landroid/content/res/ColorStateList;", "colorStateList", "setViewBackgroundTint", "isRtl", "id", "quality", "getQuantityString", "isChineseLanguage", "", "getDp", "(F)F", Constant.PAI_KEY_DAILY_PAI, "(I)I", "getSp", "sp", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class ExteranelKt {
    public static final int addAlpha(@ColorInt int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    public static final int color(@NotNull Context context, @ColorRes int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static final float getDp(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public static final String getQuantityString(@NotNull Context context, @PluralsRes int i, int i2) {
        return context.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    public static final int getSp(int i) {
        return (int) TypedValue.applyDimension(2, i, Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public static final String getString(@NotNull View view, @StringRes int i) {
        return view.getContext().getString(i);
    }

    public static final boolean isChineseLanguage() {
        return Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage());
    }

    public static final boolean isRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final int loadColor(@NotNull View view, @ColorRes int i) {
        return color(view.getContext(), i);
    }

    public static final void setViewBackgroundTint(@NotNull View view, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
        } else {
            ViewCompat.setBackgroundTintList(view, colorStateList);
        }
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final int getDp(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }
}
