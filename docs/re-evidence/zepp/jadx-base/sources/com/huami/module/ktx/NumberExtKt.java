package com.huami.module.ktx;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b\"\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t\"\u0017\u0010\u000b\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0017\u0010\u000b\u001a\u00020\u0004*\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\"\u0017\u0010\u000b\u001a\u00020\u0004*\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"", "", "alpha", "addAlpha", "", "getDp", "(F)F", Constant.PAI_KEY_DAILY_PAI, "(I)I", "(D)F", "getSp", "sp", "hm-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class NumberExtKt {
    public static final int addAlpha(@ColorInt int i, double d) {
        return Color.argb((int) (((double) ((i >> 24) & 255)) * d), (i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    public static final float getDp(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final int getSp(int i) {
        return (int) TypedValue.applyDimension(2, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final int getDp(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getSp(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getDp(double d) {
        return TypedValue.applyDimension(1, (float) d, Resources.getSystem().getDisplayMetrics());
    }

    public static final float getSp(double d) {
        return TypedValue.applyDimension(2, (float) d, Resources.getSystem().getDisplayMetrics());
    }
}
