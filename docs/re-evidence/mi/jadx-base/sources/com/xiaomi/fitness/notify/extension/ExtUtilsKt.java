package com.xiaomi.fitness.notify.extension;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"dp2px", "", "", "getDp2px", "(F)I", "(I)I", "notify_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtUtilsKt {
    public static final int getDp2px(float f) {
        return MathKt__MathJVMKt.roundToInt((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int getDp2px(int i) {
        return MathKt__MathJVMKt.roundToInt((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
