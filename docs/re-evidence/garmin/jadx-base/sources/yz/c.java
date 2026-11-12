package yz;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz/c;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getAxisLabel(float f14, AxisBase axisBase) {
        return MathKt.c(f14 / ((axisBase != null ? axisBase.mAxisMaximum : 0.0f) / (((float) (axisBase != null ? axisBase.getLabelCount() : 2)) - 1.0f))) % 2 == 0 ? String.valueOf(MathKt.c(f14)) : "";
    }
}
