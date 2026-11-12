package com.github.mikephil.chartingv2.formatter;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class PercentFormatter implements ValueFormatter, YAxisValueFormatter {
    protected DecimalFormat mFormat;

    public PercentFormatter() {
        this.mFormat = new DecimalFormat("###,###,##0.0");
    }

    @Override // com.github.mikephil.chartingv2.formatter.ValueFormatter
    public String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler) {
        return this.mFormat.format(f14) + " %";
    }

    public PercentFormatter(DecimalFormat decimalFormat) {
        this.mFormat = decimalFormat;
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public String getFormattedValue(float f14, YAxis yAxis) {
        return this.mFormat.format(f14) + " %";
    }
}
