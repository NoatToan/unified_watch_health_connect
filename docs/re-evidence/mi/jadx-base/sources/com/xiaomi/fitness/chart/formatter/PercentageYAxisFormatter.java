package com.xiaomi.fitness.chart.formatter;

import defpackage.onq;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/chart/formatter/PercentageYAxisFormatter;", "Lonq;", "", "value", "", "getFormattedValue", "(F)Ljava/lang/String;", "<init>", "()V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class PercentageYAxisFormatter extends onq {
    @Override // defpackage.onq
    @NotNull
    public String getFormattedValue(float value) {
        String strH = xr5.h((int) value);
        Intrinsics.checkNotNullExpressionValue(strH, "getPercentageStr(...)");
        return strH;
    }
}
