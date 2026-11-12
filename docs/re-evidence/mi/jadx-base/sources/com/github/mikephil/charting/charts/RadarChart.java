package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import defpackage.aaj;
import defpackage.baj;
import defpackage.caj;
import defpackage.err;
import defpackage.fmq;
import defpackage.vtr;

/* JADX INFO: loaded from: classes4.dex */
public class RadarChart extends PieRadarChartBase<baj> {
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7782k;
    public YAxis l;
    public vtr m;
    public err n;

    public RadarChart(Context context) {
        super(context);
        this.e = 2.5f;
        this.f = 1.5f;
        this.g = Color.rgb(122, 122, 122);
        this.h = Color.rgb(122, 122, 122);
        this.i = 150;
        this.j = true;
        this.f7782k = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int c(float f) {
        float fQ = fmq.q(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int iO0 = ((baj) this.mData).q().O0();
        int i = 0;
        while (i < iO0) {
            int i2 = i + 1;
            if ((i2 * sliceAngle) - (sliceAngle / 2.0f) > fQ) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        super.calcMinMax();
        YAxis yAxis = this.l;
        baj bajVar = (baj) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(bajVar.w(axisDependency), ((baj) this.mData).u(axisDependency));
        this.mXAxis.calculate(0.0f, ((baj) this.mData).q().O0());
    }

    public float getFactor() {
        RectF rectFP = this.mViewPortHandler.p();
        return Math.min(rectFP.width() / 2.0f, rectFP.height() / 2.0f) / this.l.mAxisRange;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectFP = this.mViewPortHandler.p();
        return Math.min(rectFP.width() / 2.0f, rectFP.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        return (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) ? this.mXAxis.mLabelRotatedWidth : fmq.e(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.mLegendRenderer.d().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.f7782k;
    }

    public float getSliceAngle() {
        return 360.0f / ((baj) this.mData).q().O0();
    }

    public int getWebAlpha() {
        return this.i;
    }

    public int getWebColor() {
        return this.g;
    }

    public int getWebColorInner() {
        return this.h;
    }

    public float getWebLineWidth() {
        return this.e;
    }

    public float getWebLineWidthInner() {
        return this.f;
    }

    public YAxis getYAxis() {
        return this.l;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public float getYChartMax() {
        return this.l.mAxisMaximum;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart, defpackage.hu3
    public float getYChartMin() {
        return this.l.mAxisMinimum;
    }

    public float getYRange() {
        return this.l.mAxisRange;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        YAxis yAxis = new YAxis(YAxis.AxisDependency.LEFT);
        this.l = yAxis;
        yAxis.s(10.0f);
        this.e = fmq.e(1.5f);
        this.f = fmq.e(0.75f);
        this.mRenderer = new aaj(this, this.mAnimator, this.mViewPortHandler);
        this.m = new vtr(this.mViewPortHandler, this.l, this);
        this.n = new err(this.mViewPortHandler, this.mXAxis, this);
        this.mHighlighter = new caj(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            return;
        }
        calcMinMax();
        vtr vtrVar = this.m;
        YAxis yAxis = this.l;
        vtrVar.computeAxis(yAxis.mAxisMinimum, yAxis.mAxisMaximum, yAxis.o());
        err errVar = this.n;
        XAxis xAxis = this.mXAxis;
        errVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        Legend legend = this.mLegend;
        if (legend != null && !legend.w()) {
            this.mLegendRenderer.a(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        if (this.mXAxis.isEnabled()) {
            err errVar = this.n;
            XAxis xAxis = this.mXAxis;
            errVar.computeAxis(xAxis.mAxisMinimum, xAxis.mAxisMaximum, false);
        }
        this.n.renderAxisLabels(canvas);
        if (this.j) {
            this.mRenderer.drawExtras(canvas);
        }
        if (this.l.isEnabled() && this.l.isDrawLimitLinesBehindDataEnabled()) {
            this.m.renderLimitLines(canvas);
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        if (this.l.isEnabled() && !this.l.isDrawLimitLinesBehindDataEnabled()) {
            this.m.renderLimitLines(canvas);
        }
        this.m.renderAxisLabels(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.e(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public void setDrawWeb(boolean z) {
        this.j = z;
    }

    public void setSkipWebLineCount(int i) {
        this.f7782k = Math.max(0, i);
    }

    public void setWebAlpha(int i) {
        this.i = i;
    }

    public void setWebColor(int i) {
        this.g = i;
    }

    public void setWebColorInner(int i) {
        this.h = i;
    }

    public void setWebLineWidth(float f) {
        this.e = fmq.e(f);
    }

    public void setWebLineWidthInner(float f) {
        this.f = fmq.e(f);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 2.5f;
        this.f = 1.5f;
        this.g = Color.rgb(122, 122, 122);
        this.h = Color.rgb(122, 122, 122);
        this.i = 150;
        this.j = true;
        this.f7782k = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 2.5f;
        this.f = 1.5f;
        this.g = Color.rgb(122, 122, 122);
        this.h = Color.rgb(122, 122, 122);
        this.i = 150;
        this.j = true;
        this.f7782k = 0;
    }
}
