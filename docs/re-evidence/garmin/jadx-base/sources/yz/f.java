package yz;

import c22.l3;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyz/f;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        if (f14 > 999.0f) {
            return tn.k.g(l3.f23126d.format(Float.valueOf(f14 / 1000.0f)), JWKParameterNames.OCT_KEY_VALUE);
        }
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Float.valueOf(f14));
        str.getClass();
        return str;
    }
}
