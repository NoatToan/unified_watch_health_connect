package yz;

import com.github.mikephil.charting.formatter.ValueFormatter;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz/e;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        if (Float.isNaN(f14)) {
            return "";
        }
        x0 x0Var = x0.f105818a;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(MathKt.c(f14))}, 1));
    }
}
