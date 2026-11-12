package qm;

import c22.l3;
import c22.m3;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;

/* JADX INFO: loaded from: classes7.dex */
public class n implements YAxisValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f145415a;

    public n(p pVar) {
        this.f145415a = pVar;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        float f15 = this.f145415a.f145426c;
        boolean zY = lVarA.y();
        l3.f23124b.getClass();
        String strN = l3.a.N(f15 - f14, zY ? m3.METER : m3.FOOT, l3.f23131i);
        return strN.startsWith("-") ? "" : strN;
    }
}
