package com.xiaomi.fitness.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import defpackage.ni4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0012\u001a\u00020\u000e*\u00020\u000e\u001a\u0010\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u001a\u001a\u00020\u0001\u001a\u0010\u0010\u001b\u001a\u00020\u00012\b\b\u0001\u0010\u001c\u001a\u00020\u0001\u001a%\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00150\u001e\"\u0006\b\u0000\u0010\u0015\u0018\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0086\b\u001a6\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001e\"\u0006\b\u0000\u0010\u0015\u0018\u0001*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00150#H\u0086\bø\u0001\u0000\u001a\u0014\u0010$\u001a\u0004\u0018\u00010%2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030'\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"(\u0010\r\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011\"\u001f\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u0015*\u00020\u0016*\u0002H\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"dp", "", "", "getDp", "(Ljava/lang/Number;)I", "dpFloat", "", "getDpFloat", "(Ljava/lang/Number;)F", "sp", "getSp", "value", "", "isVisible", "Landroid/view/View;", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "toggleGone", "inflater", "Landroid/view/LayoutInflater;", "T", "Landroid/content/Context;", "getInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "getColor", "colorRes", "getDimension", "dimen", "intent", "Lkotlin/Lazy;", "Landroid/app/Activity;", "key", "", "default", "Lkotlin/Function0;", "getBasicValue", "", "clazz", "Ljava/lang/Class;", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtUtils.kt\ncom/xiaomi/fitness/common/utils/ExtUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class ExtUtilsKt {
    @Nullable
    public static final Object getBasicValue(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Class cls = Integer.TYPE;
        if (Intrinsics.areEqual(clazz, cls) || Intrinsics.areEqual(clazz, cls)) {
            return 0;
        }
        Class cls2 = Boolean.TYPE;
        if (Intrinsics.areEqual(clazz, cls2) || Intrinsics.areEqual(clazz, cls2)) {
            return Boolean.FALSE;
        }
        Class cls3 = Float.TYPE;
        if (Intrinsics.areEqual(clazz, cls3) || Intrinsics.areEqual(clazz, cls3)) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    public static final int getColor(int i) {
        return ni4.c(ApplicationExtKt.getApplication(), i);
    }

    public static final int getDimension(int i) {
        return ApplicationExtKt.getApplication().getResources().getDimensionPixelSize(i);
    }

    public static final int getDp(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics()));
    }

    public static final float getDpFloat(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public static final <T extends Context> LayoutInflater getInflater(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(t);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    public static final int getSp(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return MathKt__MathJVMKt.roundToInt(TypedValue.applyDimension(2, number.floatValue(), Resources.getSystem().getDisplayMetrics()));
    }

    public static final /* synthetic */ <T> Lazy<T> intent(final Activity activity, final String key) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<T>() { // from class: com.xiaomi.fitness.common.utils.ExtUtilsKt.intent.1
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                Bundle extras;
                Intent intent = activity.getIntent();
                T t = (intent == null || (extras = intent.getExtras()) == null) ? null : (T) extras.get(key);
                if (t != null) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                }
                return t;
            }
        });
    }

    public static final boolean isVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    @NotNull
    public static final View toggleGone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(view.getVisibility() != 0 ? 0 : 8);
        return view;
    }

    public static final /* synthetic */ <T> Lazy<T> intent(final Activity activity, final String key, final Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(function0, "default");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<T>() { // from class: com.xiaomi.fitness.common.utils.ExtUtilsKt.intent.2
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                Bundle extras;
                Intent intent = activity.getIntent();
                T t = (intent == null || (extras = intent.getExtras()) == null) ? null : (T) extras.get(key);
                if (t == null) {
                    return function0.invoke();
                }
                Intrinsics.reifiedOperationMarker(3, "T");
                return t;
            }
        });
    }
}
