package com.xiaomi.fitness.sport_eco.utils;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0004\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003¨\u0006\r"}, d2 = {"dp", "", "getDp", "(F)F", "", "(I)F", "px", "getPx", "sp", "getSp", "parseMinute", "", "parseOnDecimal", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionsKt {
    public static final float getDp(float f) {
        return TypedValue.applyDimension(1, f + 0.5f, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getPx(int i) {
        return TypedValue.applyDimension(0, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getSp(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public static final String parseMinute(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        return (i2 >= 10 ? "" : "0") + i2 + ":" + (i3 >= 10 ? "" : "0") + i3 + ":00";
    }

    @NotNull
    public static final String parseOnDecimal(float f) {
        int iIntValue = ((Integer) Float.valueOf(10 * f)).intValue() % 10;
        Intrinsics.checkNotNull(Float.valueOf(f), "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) Float.valueOf(f)) + "." + iIntValue;
    }

    public static final float getDp(int i) {
        return TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getPx(float f) {
        return TypedValue.applyDimension(0, f + 0.5f, Resources.getSystem().getDisplayMetrics());
    }
}
