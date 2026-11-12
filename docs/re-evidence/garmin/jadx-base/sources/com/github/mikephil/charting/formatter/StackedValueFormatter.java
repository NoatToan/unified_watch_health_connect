package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes13.dex */
public class StackedValueFormatter extends ValueFormatter {
    private boolean mDrawWholeStack;
    private DecimalFormat mFormat;
    private String mSuffix;

    public StackedValueFormatter(boolean z14, String str, int i14) {
        this.mDrawWholeStack = z14;
        this.mSuffix = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public String getBarStackedLabel(float f14, BarEntry barEntry) {
        float[] yVals;
        if (this.mDrawWholeStack || (yVals = barEntry.getYVals()) == null) {
            return this.mFormat.format(f14) + this.mSuffix;
        }
        if (yVals[yVals.length - 1] != f14) {
            return "";
        }
        return this.mFormat.format(barEntry.getY()) + this.mSuffix;
    }
}
