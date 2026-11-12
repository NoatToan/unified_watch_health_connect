package com.github.mikephil.chartingv2.formatter;

import com.github.mikephil.chartingv2.components.YAxis;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class DefaultYAxisValueFormatter implements YAxisValueFormatter {
    private DecimalFormat mFormat;

    public DefaultYAxisValueFormatter(int i14) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public String getFormattedValue(float f14, YAxis yAxis) {
        return this.mFormat.format(f14);
    }
}
