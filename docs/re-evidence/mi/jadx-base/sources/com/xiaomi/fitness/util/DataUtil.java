package com.xiaomi.fitness.util;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/util/DataUtil;", "", "<init>", "()V", "computePercentage", "", "value", "", "sumValue", "type", "getSpeed", "", "seconds", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataUtil {

    @NotNull
    public static final DataUtil INSTANCE = new DataUtil();

    private DataUtil() {
    }

    @JvmStatic
    public static final int computePercentage(@NotNull Number value, @NotNull Number sumValue, int type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(sumValue, "sumValue");
        return type == 0 ? Math.max(0, Math.round((value.intValue() * 100) / (sumValue.intValue() * 1.0f))) : Math.max(0, MathKt__MathJVMKt.roundToInt((value.floatValue() * 100) / sumValue.floatValue()));
    }

    public static /* synthetic */ int computePercentage$default(Number number, Number number2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return computePercentage(number, number2, i);
    }

    @JvmStatic
    public static final float getSpeed(int seconds) {
        return 1.0f / ((seconds * 1.0f) / TimeDateUtil.TIME_HOUR);
    }
}
