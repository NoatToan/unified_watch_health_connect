package dg1;

import c22.l3;
import c22.m3;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.formatter.ValueFormatter;
import f12.l;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldg1/b;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LineChart f59520a;

    public b(LineChart lineChart) {
        this.f59520a = lineChart;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        m3 m3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23125c;
        aVar.getClass();
        return l3.a.P(this.f59520a.getContext(), f14, m3Var, decimalFormat, false, "");
    }
}
