package com.huami.module.ktx;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a1\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\f\u001a1\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\f\u001a1\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\f\u001a1\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0007\u0010\f\u001a'\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/widget/TextView;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setDrawableStart", "setDrawableTop", "setDrawableEnd", "setDrawableBottom", "", "resId", "tint", "size", "(Landroid/widget/TextView;IILjava/lang/Integer;)V", "colorResId", "", "alpha", "setTextColorRes", "(Landroid/widget/TextView;ILjava/lang/Double;)V", "hm-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class TextViewExtKt {
    public static final void setDrawableBottom(@NotNull TextView textView, @Nullable Drawable drawable) {
        textView.setCompoundDrawablesRelative(null, null, null, drawable);
    }

    public static /* synthetic */ void setDrawableBottom$default(TextView textView, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        setDrawableBottom(textView, i, i2, num);
    }

    public static final void setDrawableEnd(@NotNull TextView textView, @Nullable Drawable drawable) {
        textView.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public static /* synthetic */ void setDrawableEnd$default(TextView textView, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        setDrawableEnd(textView, i, i2, num);
    }

    public static final void setDrawableStart(@NotNull TextView textView, @Nullable Drawable drawable) {
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public static /* synthetic */ void setDrawableStart$default(TextView textView, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        setDrawableStart(textView, i, i2, num);
    }

    public static final void setDrawableTop(@NotNull TextView textView, @Nullable Drawable drawable) {
        textView.setCompoundDrawablesRelative(null, drawable, null, null);
    }

    public static /* synthetic */ void setDrawableTop$default(TextView textView, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        setDrawableTop(textView, i, i2, num);
    }

    public static final void setTextColorRes(@NotNull TextView textView, @ColorRes int i, @Nullable Double d) {
        int iLoadColor = ViewExtKt.loadColor(textView, i);
        if (d != null) {
            NumberExtKt.addAlpha(iLoadColor, d.doubleValue());
        }
        Unit unit = Unit.INSTANCE;
        textView.setTextColor(iLoadColor);
    }

    public static /* synthetic */ void setTextColorRes$default(TextView textView, int i, Double d, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d = null;
        }
        setTextColorRes(textView, i, d);
    }

    public static final void setDrawableBottom(@NotNull TextView textView, @DrawableRes int i, @ColorRes int i2, @Nullable Integer num) {
        textView.setCompoundDrawablesRelative(null, null, null, ViewExtKt.loadDrawable(textView, i, i2, num));
    }

    public static final void setDrawableEnd(@NotNull TextView textView, @DrawableRes int i, @ColorRes int i2, @Nullable Integer num) {
        textView.setCompoundDrawablesRelative(null, null, ViewExtKt.loadDrawable(textView, i, i2, num), null);
    }

    public static final void setDrawableStart(@NotNull TextView textView, @DrawableRes int i, @ColorRes int i2, @Nullable Integer num) {
        textView.setCompoundDrawablesRelative(ViewExtKt.loadDrawable(textView, i, i2, num), null, null, null);
    }

    public static final void setDrawableTop(@NotNull TextView textView, @DrawableRes int i, @ColorRes int i2, @Nullable Integer num) {
        textView.setCompoundDrawablesRelative(null, ViewExtKt.loadDrawable(textView, i, i2, num), null, null);
    }
}
