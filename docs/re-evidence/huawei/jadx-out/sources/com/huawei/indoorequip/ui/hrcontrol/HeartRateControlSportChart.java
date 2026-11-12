package com.huawei.indoorequip.ui.hrcontrol;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nyr;
import defpackage.nyt;
import defpackage.qml;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class HeartRateControlSportChart extends LineChart {
    private static final int e = Color.parseColor("#33FFFFFF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17818a = Color.parseColor("#99FFFFFF");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f17820c = Color.parseColor("#FFEB4667");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f17819b = Color.parseColor("#FFEB4667");

    public HeartRateControlSportChart(Context context) {
        super(context);
        a();
        c();
    }

    public HeartRateControlSportChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
        c();
    }

    public HeartRateControlSportChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
        c();
    }

    private void a() {
        this.mRenderer = new nyr(this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererLeft = new nyt(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
    }

    private void c() {
        getDescription().setEnabled(false);
        setTouchEnabled(false);
        setDragEnabled(false);
        setScaleEnabled(false);
        setExtraLeftOffset(24.0f);
        setExtraRightOffset(24.0f);
        setExtraTopOffset(10.0f);
        XAxis xAxis = getXAxis();
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLinesBehindData(false);
        xAxis.setDrawLimitLinesBehindData(false);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new e());
        int i = f17818a;
        xAxis.setTextColor(i);
        xAxis.setTextSize(10.0f);
        getAxisRight().setEnabled(false);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setDrawZeroLine(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawTopYLabelEntry(true);
        axisLeft.setTextColor(i);
        axisLeft.setTextSize(10.0f);
        axisLeft.setGridColor(e);
        getLegend().setEnabled(false);
        if (this.mRenderer instanceof nyr) {
            ((nyr) this.mRenderer).e(b(2.0f), b(4.0f), b(3.0f));
        }
        if (this.mAxisRendererLeft instanceof nyt) {
            ((nyt) this.mAxisRendererLeft).c(b(24.0f), b(0.5f), b(2.0f), b(1.0f));
        }
    }

    public void setIntervalAreaList(List<qml> list) {
        if (this.mAxisRendererLeft instanceof nyt) {
            ((nyt) this.mAxisRendererLeft).a(list);
        }
    }

    public void d() {
        LogUtil.a("HeartRateControlSportChart", "initTvChart");
        Utils.init(BaseApplication.b());
        c();
    }

    public void setChartData(List<Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawCircles(false);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
        lineDataSet.setDrawIcons(false);
        lineDataSet.setDrawFilled(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setColor(f17820c);
        lineDataSet.setValueTextSize(10.0f);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setCircleColor(-16777216);
        lineDataSet.setCircleHoleColor(f17819b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineDataSet);
        setData(new LineData(arrayList));
        invalidate();
    }

    static class e implements IAxisValueFormatter {
        private e() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            int i = (int) f;
            int i2 = i / 3600;
            int i3 = i - (i2 * 3600);
            int i4 = i3 / 60;
            return decimalFormat.format(i2) + ":" + decimalFormat.format(i4) + ":" + decimalFormat.format(i3 - (i4 * 60));
        }
    }

    private float b(float f) {
        return Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.Chart
    public String getAccessibilityDescription() {
        LineData lineData = getLineData();
        if (lineData == null) {
            ReleaseLogUtil.d("HeartRateControlSportChart", "getAccessibilityDescription lineData == null");
            return "";
        }
        int entryCount = lineData.getEntryCount();
        IAxisValueFormatter valueFormatter = getAxisLeft().getValueFormatter();
        String formattedValue = valueFormatter.getFormattedValue(lineData.getYMin(), null);
        String formattedValue2 = valueFormatter.getFormattedValue(lineData.getYMax(), null);
        IAxisValueFormatter valueFormatter2 = getXAxis().getValueFormatter();
        return String.format(Locale.getDefault(), "The line chart has %d %s. The minimum value is %s and maximum value is %s.Data ranges from %s to %s.", Integer.valueOf(entryCount), entryCount == 1 ? "entry" : "entries", formattedValue, formattedValue2, valueFormatter2.getFormattedValue(lineData.getXMin(), null), valueFormatter2.getFormattedValue(lineData.getXMax(), null));
    }
}
