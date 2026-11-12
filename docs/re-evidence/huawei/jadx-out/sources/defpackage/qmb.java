package defpackage;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes16.dex */
public class qmb implements IAxisValueFormatter {
    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f, AxisBase axisBase) {
        return new DecimalFormat("#").format(Math.round(f / 60.0f));
    }
}
