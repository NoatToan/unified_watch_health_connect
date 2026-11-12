package yz;

import c22.l3;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz/i;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        if (f14 == 0.0f) {
            return "0";
        }
        l3.f23124b.getClass();
        String str = l3.f23133k.format(Float.valueOf(f14));
        str.getClass();
        return str;
    }
}
