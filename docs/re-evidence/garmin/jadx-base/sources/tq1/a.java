package tq1;

import c22.l3;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltq1/a;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        double d14 = f14;
        if (d14 > 999.0d) {
            return k.g(l3.f23126d.format(d14 / ((double) 1000.0f)), JWKParameterNames.OCT_KEY_VALUE);
        }
        l3.f23124b.getClass();
        return l3.a.Z0((int) d14);
    }
}
