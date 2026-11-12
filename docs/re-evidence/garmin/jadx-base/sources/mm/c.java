package mm;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import d53.u;
import java.text.DecimalFormat;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmm/c;", "Lcom/github/mikephil/chartingv2/formatter/YAxisValueFormatter;", "", "digits", "", "hasNegativeValues", "<init>", "(IZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements YAxisValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f119492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f119493b;

    public c(int i14, boolean z14) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f119492a = new DecimalFormat("###,###,###,##0" + ((Object) stringBuffer));
        this.f119493b = z14;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        yAxis.getClass();
        String strN = this.f119492a.format(f14);
        if (u.q(strN, "-0", true)) {
            strN = "0";
        } else if (this.f119493b && Math.round(f14) > 0.0f) {
            strN = fb1.c.n(Marker.ANY_NON_NULL_MARKER, strN);
        }
        strN.getClass();
        return strN;
    }
}
