package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ValueFormatter implements IAxisValueFormatter, IValueFormatter {
    public String getAxisLabel(float f14, AxisBase axisBase) {
        return getFormattedValue(f14);
    }

    public String getBarLabel(BarEntry barEntry) {
        return getFormattedValue(barEntry.getY());
    }

    public String getBarStackedLabel(float f14, BarEntry barEntry) {
        return getFormattedValue(f14);
    }

    public String getBubbleLabel(BubbleEntry bubbleEntry) {
        return getFormattedValue(bubbleEntry.getSize());
    }

    public String getCandleLabel(CandleEntry candleEntry) {
        return getFormattedValue(candleEntry.getHigh());
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    @Deprecated
    public String getFormattedValue(float f14, AxisBase axisBase) {
        return getFormattedValue(f14);
    }

    public String getPieLabel(float f14, PieEntry pieEntry) {
        return getFormattedValue(f14);
    }

    public String getPointLabel(Entry entry) {
        return getFormattedValue(entry.getY());
    }

    public String getRadarLabel(RadarEntry radarEntry) {
        return getFormattedValue(radarEntry.getY());
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    @Deprecated
    public String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler) {
        return getFormattedValue(f14);
    }

    public String getFormattedValue(float f14) {
        return String.valueOf(f14);
    }
}
