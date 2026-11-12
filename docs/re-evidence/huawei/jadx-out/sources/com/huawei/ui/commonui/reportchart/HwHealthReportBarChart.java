package com.huawei.ui.commonui.reportchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.BarHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.ui.commonui.R;
import defpackage.qov;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthReportBarChart extends BarChart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RectF f23824b;
    private int d;
    private qov e;

    public HwHealthReportBarChart(Context context) {
        super(context);
        this.f23824b = new RectF();
        e();
    }

    public HwHealthReportBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23824b = new RectF();
        e();
    }

    public HwHealthReportBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23824b = new RectF();
        e();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[EDGE_INSN: B:20:0x0065->B:21:0x0066 BREAK  A[LOOP:0: B:14:0x004d->B:19:0x0062]] */
    public void setCustomValue(Context context, ArrayList<String> arrayList, int i, float f, float f2, float f3, boolean z) {
        boolean z2;
        List entriesForXValue;
        this.d = i;
        if (getData() == null) {
            z2 = true;
            break;
        }
        z2 = false;
        if (((BarData) getData()).getDataSets().get(0) == null) {
            z2 = true;
            break;
        }
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarData) getData()).getDataSets().get(0);
        if (LanguageUtil.ba(getContext())) {
            entriesForXValue = iBarDataSet.getEntriesForXValue(iBarDataSet.getXMax());
        } else {
            entriesForXValue = iBarDataSet.getEntriesForXValue(iBarDataSet.getXMin());
        }
        if (entriesForXValue != null && entriesForXValue.size() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= entriesForXValue.size()) {
                    z2 = true;
                    break;
                } else if (((BarEntry) entriesForXValue.get(i2)).getY() != f2) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z2 = true;
            break;
        }
        this.e.a(z2);
        this.e.c(this.d, f, f2, Utils.convertDpToPixel(f3), z);
        if (LanguageUtil.ba(context)) {
            Collections.reverse(arrayList);
        }
        if (arrayList != null) {
            setXAxisValueFormatter(arrayList);
            getXAxis().setLabelCount(arrayList.size());
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        float fConvertDpToPixel = Utils.convertDpToPixel(10.0f);
        calculateLegendOffsets(this.f23824b);
        float requiredWidthSpace = this.f23824b.left + 0.0f;
        float f = fConvertDpToPixel + this.f23824b.top;
        float requiredWidthSpace2 = this.f23824b.right + 0.0f;
        float f2 = this.f23824b.bottom + 0.0f;
        if (this.mAxisLeft.needsOffset()) {
            requiredWidthSpace += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.needsOffset()) {
            requiredWidthSpace2 += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
        }
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.mLabelHeight + this.mXAxis.getYOffset();
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                f2 += yOffset;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                f += yOffset;
            } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                f2 += yOffset;
                f += yOffset;
            }
        }
        float extraTopOffset = getExtraTopOffset();
        float extraRightOffset = getExtraRightOffset();
        float extraBottomOffset = getExtraBottomOffset();
        float extraLeftOffset = getExtraLeftOffset();
        float fConvertDpToPixel2 = Utils.convertDpToPixel(this.mMinOffset);
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel2, requiredWidthSpace + extraLeftOffset), Math.max(fConvertDpToPixel2, f + extraTopOffset), Math.max(fConvertDpToPixel2, requiredWidthSpace2 + extraRightOffset), Math.max(fConvertDpToPixel2, f2 + extraBottomOffset));
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    private void setXAxisValueFormatter(final List<String> list) {
        if (list == null) {
            return;
        }
        final int size = list.size();
        getXAxis().setValueFormatter(new IAxisValueFormatter() { // from class: com.huawei.ui.commonui.reportchart.HwHealthReportBarChart.2
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                int i = (int) f;
                if (i < 0 || i >= size) {
                    return "";
                }
                return (String) list.get(i);
            }
        });
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.e.c(canvas);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        qov qovVar = new qov(this, this.mAnimator, this.mViewPortHandler);
        this.e = qovVar;
        this.mRenderer = qovVar;
        setHighlighter(new BarHighlighter(this));
    }

    private void e() {
        getDescription().setEnabled(false);
        setScaleEnabled(false);
        setDrawGridBackground(false);
        setTouchEnabled(false);
        setDragXEnabled(false);
        getXAxis().setDrawGridLines(false);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setTextSize(10.0f);
        getXAxis().setTextColor(getContext().getResources().getColor(R.color.textColorTertiary));
        getXAxis().setDrawAxisLine(true);
        getXAxis().setAxisLineColor(Color.parseColor("#B1B8DC"));
        getLegend().setEnabled(false);
        getAxisLeft().setEnabled(false);
        getAxisLeft().setDrawAxisLine(false);
        getAxisRight().setDrawAxisLine(false);
        getAxisRight().setEnabled(false);
        YAxis yAxis = getYAxis();
        yAxis.setDrawAxisLine(false);
        yAxis.setLabelCount(5, true);
        yAxis.setTextSize(10.0f);
        yAxis.setTextColor(getContext().getResources().getColor(R.color.textColorTertiary));
        yAxis.setAxisMinimum(0.0f);
        yAxis.setSpaceTop(12.0f);
        yAxis.setDrawGridLines(false);
        yAxis.setDrawLabels(false);
    }

    private YAxis getYAxis() {
        return getAxisLeft();
    }
}
