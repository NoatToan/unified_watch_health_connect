package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class LineChart extends BarLineChartBase<LineData> implements LineDataProvider {
    public LineChart(Context context) {
        super(context);
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new LineChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        return (LineData) this.mData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.mRenderer != null && (this.mRenderer instanceof LineChartRenderer)) {
            ((LineChartRenderer) this.mRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public String getAccessibilityDescription() {
        LineData lineData = getLineData();
        int entryCount = lineData.getEntryCount();
        IAxisValueFormatter valueFormatter = getAxisLeft().getValueFormatter();
        String formattedValue = valueFormatter.getFormattedValue(lineData.getYMin(), null);
        String formattedValue2 = valueFormatter.getFormattedValue(lineData.getYMax(), null);
        IAxisValueFormatter valueFormatter2 = getXAxis().getValueFormatter();
        return String.format(Locale.getDefault(), "The line chart has %d %s. The minimum value is %s and maximum value is %s.Data ranges from %s to %s.", Integer.valueOf(entryCount), entryCount == 1 ? "entry" : "entries", formattedValue, formattedValue2, valueFormatter2.getFormattedValue(lineData.getXMin(), null), valueFormatter2.getFormattedValue(lineData.getXMax(), null));
    }
}
