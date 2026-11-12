package qm;

import c22.l3;
import com.github.mikephil.chartingv2.formatter.XAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes7.dex */
public class o implements XAxisValueFormatter {
    public o(p pVar) {
    }

    @Override // com.github.mikephil.chartingv2.formatter.XAxisValueFormatter
    public final String getXValue(String str, int i14, ViewPortHandler viewPortHandler) {
        int i15 = Integer.parseInt(str);
        if (i15 < 3600) {
            l3.f23124b.getClass();
            return l3.a.s1(i15, "%1$d:%2$02d");
        }
        l3.f23124b.getClass();
        return l3.a.n1(i15);
    }
}
