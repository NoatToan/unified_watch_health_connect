package mm;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class d implements YAxisValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f119494a;

    public d(int i14) {
        this.f119494a = i14;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public final String getFormattedValue(float f14, YAxis yAxis) {
        int i14 = this.f119494a;
        if (f14 == 180.0f && (i14 == 23 || i14 == 26)) {
            return String.format("BDC %d", Integer.valueOf((int) f14));
        }
        return (f14 == 0.0f && (i14 == 24 || i14 == 25)) ? String.format("TDC %d", Integer.valueOf((int) f14)) : String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf((int) f14));
    }
}
