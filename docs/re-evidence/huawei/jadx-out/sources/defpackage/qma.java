package defpackage;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class qma implements IValueFormatter, IAxisValueFormatter {
    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewPortHandler) {
        if (UnitUtil.f()) {
            f = (float) UnitUtil.c(f, 3);
        }
        return qpe.b(f, true);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f, AxisBase axisBase) {
        if (UnitUtil.f()) {
            f = (float) UnitUtil.c(f, 3);
        }
        return qpe.b(f, true);
    }
}
