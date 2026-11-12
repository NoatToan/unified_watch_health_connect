package com.huami.module.ktx;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0001\u001a3\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u00012\b\b\u0003\u0010\u000e\u001a\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0012\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\u001a%\u0010\u0018\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a=\u0010\u0018\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroid/view/View;", "", "colorRes", "loadColor", "Landroidx/fragment/app/Fragment;", "stringId", "", "getString", "Landroid/content/res/ColorStateList;", "colorStateList", "", "setViewBackgroundTint", "tintColor", "resId", "tint", "size", "Landroid/graphics/drawable/Drawable;", "loadDrawable", "(Landroid/view/View;IILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "", "visible", "setVisible", "", "radiusDp", "setShape", "(Landroid/view/View;FLjava/lang/Integer;)V", "topLeftRadiusDp", "topRightRadiusDp", "bottomRightRadiusDp", "bottomLeftRadiusDp", "(Landroid/view/View;FFFFLjava/lang/Integer;)V", "hm-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExtKt {
    @NotNull
    public static final String getString(@NotNull View view, @StringRes int i) {
        return view.getContext().getString(i);
    }

    public static final int loadColor(@NotNull View view, @ColorRes int i) {
        return ContextExtKt.loadColor(view.getContext(), i);
    }

    @Nullable
    public static final Drawable loadDrawable(@NotNull View view, @DrawableRes int i, @ColorRes int i2, @Nullable Integer num) {
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), i);
        if (drawable == null) {
            return null;
        }
        if (i2 != 0) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(view.getContext(), i2));
        }
        if (num == null) {
            return drawable;
        }
        drawable.setBounds(0, 0, num.intValue(), num.intValue());
        return drawable;
    }

    public static /* synthetic */ Drawable loadDrawable$default(View view, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        return loadDrawable(view, i, i2, num);
    }

    public static final void setShape(@NotNull View view, float f, @ColorInt @Nullable Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics()));
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        Unit unit = Unit.INSTANCE;
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void setShape$default(View view, float f, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        setShape(view, f, num);
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

    public static final int loadColor(@NotNull Fragment fragment, @ColorRes int i) {
        return ContextExtKt.loadColor(fragment.requireContext(), i);
    }

    public static /* synthetic */ void setShape$default(View view, float f, float f2, float f3, float f4, Integer num, int i, Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        setShape(view, f, f2, f3, f4, num);
    }

    public static final void setViewBackgroundTint(@NotNull View view, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(ColorStateList.valueOf(i));
        } else {
            ViewCompat.setBackgroundTintList(view, ColorStateList.valueOf(i));
        }
    }

    public static final void setShape(@NotNull View view, float f, float f2, float f3, float f4, @ColorInt @Nullable Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{NumberExtKt.getDp(f), NumberExtKt.getDp(f), NumberExtKt.getDp(f2), NumberExtKt.getDp(f2), NumberExtKt.getDp(f3), NumberExtKt.getDp(f3), NumberExtKt.getDp(f4), NumberExtKt.getDp(f4)});
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        Unit unit = Unit.INSTANCE;
        view.setBackground(gradientDrawable);
    }
}
