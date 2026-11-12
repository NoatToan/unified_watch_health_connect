package com.github.mikephil.chartingv2.formatter;

import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class StackedValueFormatter implements ValueFormatter {
    private String mAppendix;
    private boolean mDrawWholeStack;
    private DecimalFormat mFormat;

    public StackedValueFormatter(boolean z14, String str, int i14) {
        this.mDrawWholeStack = z14;
        this.mAppendix = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.chartingv2.formatter.ValueFormatter
    public String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler) {
        BarEntry barEntry;
        float[] vals;
        if (this.mDrawWholeStack || !(entry instanceof BarEntry) || (vals = (barEntry = (BarEntry) entry).getVals()) == null) {
            return this.mFormat.format(f14) + this.mAppendix;
        }
        if (vals[vals.length - 1] != f14) {
            return "";
        }
        return this.mFormat.format(barEntry.getVal()) + this.mAppendix;
    }
}
