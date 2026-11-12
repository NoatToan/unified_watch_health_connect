package com.xiaomi.fitness.baseui.extension;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.ni4;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u001a-\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\r¢\u0006\u0002\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004\u001a\u0012\u0010\u0015\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004¨\u0006\u0017"}, d2 = {"getDimen", "", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "dimenRes", "", "getDimensionPixelOffset", "getColor", "colorRes", "getString", "", "stringRes", "formatArgs", "", "", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;I[Ljava/lang/Object;)Ljava/lang/String;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "setStatusBarColor", "", "colorResource", "setStatusBarColor2", "color", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BaseFragmentExtKt {
    public static final int getColor(@NotNull BaseFragment baseFragment, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Context context = baseFragment.getContext();
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        return ni4.c(context, i);
    }

    public static final float getDimen(@NotNull BaseFragment baseFragment, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Context context = baseFragment.getContext();
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        return context.getResources().getDimension(i);
    }

    public static final int getDimensionPixelOffset(@NotNull BaseFragment baseFragment, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Context context = baseFragment.getContext();
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        return context.getResources().getDimensionPixelOffset(i);
    }

    @NotNull
    public static final Drawable getDrawable(@NotNull BaseFragment baseFragment, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Context context = baseFragment.getContext();
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        Drawable drawableE = ni4.e(context, i);
        Intrinsics.checkNotNull(drawableE);
        return drawableE;
    }

    @NotNull
    public static final String getString(@NotNull BaseFragment baseFragment, int i, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        Context context = baseFragment.getContext();
        if (context == null) {
            context = ApplicationExtKt.getApplication();
        }
        String string = context.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final void setStatusBarColor(@NotNull BaseFragment baseFragment, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        setStatusBarColor2(baseFragment, getColor(baseFragment, i));
    }

    public static final void setStatusBarColor2(@NotNull BaseFragment baseFragment, int i) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        FragmentActivity activity = baseFragment.getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (window != null) {
            window.clearFlags(67108864);
        }
        if (window != null) {
            window.setStatusBarColor(i);
        }
    }
}
