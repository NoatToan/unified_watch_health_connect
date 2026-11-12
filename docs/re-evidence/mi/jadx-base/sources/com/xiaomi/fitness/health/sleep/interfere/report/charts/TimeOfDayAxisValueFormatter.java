package com.xiaomi.fitness.health.sleep.interfere.report.charts;

import defpackage.fpc;
import defpackage.ft1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/TimeOfDayAxisValueFormatter;", "Lfpc;", "", "value", "Lft1;", "axis", "", "getAxisLabel", "(FLft1;)Ljava/lang/String;", "getFormattedValue", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TimeOfDayAxisValueFormatter implements fpc {
    @Nullable
    public final String getAxisLabel(float value, @Nullable ft1 axis) {
        int i;
        int i2 = ((int) value) % 24;
        float f = (value - i2) * 60.0f;
        if (f < 30.0f) {
            i = 0;
        } else {
            i = f >= 30.0f ? 30 : (int) f;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // defpackage.fpc
    @Nullable
    public String getFormattedValue(float value, @Nullable ft1 axis) {
        return getAxisLabel(value, axis);
    }
}
