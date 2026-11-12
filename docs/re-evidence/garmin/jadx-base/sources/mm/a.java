package mm;

import c22.l3;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmm/a;", "Lcom/github/mikephil/chartingv2/formatter/YAxisValueFormatter;", "Lcom/github/mikephil/chartingv2/formatter/ValueFormatter;", "", "precision", "<init>", "(I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements YAxisValueFormatter, ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f119491a;

    public a(int i14) {
        DecimalFormat decimalFormat;
        if (i14 > 0) {
            StringBuilder sb3 = new StringBuilder(i14 + 2);
            sb3.append("#.");
            for (int i15 = 0; i15 < i14; i15++) {
                sb3.append("0");
            }
            decimalFormat = new DecimalFormat(sb3.toString());
        } else {
            l3.f23124b.getClass();
            decimalFormat = l3.f23131i;
        }
        this.f119491a = decimalFormat;
    }

    @Override // com.github.mikephil.chartingv2.formatter.ValueFormatter
    public final String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler) {
        entry.getClass();
        viewPortHandler.getClass();
        DecimalFormat decimalFormat = this.f119491a;
        if (decimalFormat != null) {
            return decimalFormat.format(Float.valueOf(f14));
        }
        return null;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        DecimalFormat decimalFormat = this.f119491a;
        if (decimalFormat != null) {
            return decimalFormat.format(Float.valueOf(f14));
        }
        return null;
    }
}
