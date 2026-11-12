package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import defpackage.gpc;
import defpackage.r7c;
import defpackage.u02;
import defpackage.w02;
import defpackage.x02;
import defpackage.z02;

/* JADX INFO: loaded from: classes4.dex */
public class BarChart extends BarLineChartBase<w02> implements x02 {
    private boolean mDrawBarShadow;
    private boolean mDrawValueAboveBar;
    private boolean mFitBars;
    protected boolean mHighlightFullBarEnabled;

    public BarChart(Context context) {
        super(context);
        this.mHighlightFullBarEnabled = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mFitBars = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
        if (this.mFitBars) {
            this.mXAxis.calculate(((w02) this.mData).s() - (((w02) this.mData).y() / 2.0f), ((w02) this.mData).r() + (((w02) this.mData).y() / 2.0f));
        } else {
            this.mXAxis.calculate(((w02) this.mData).s(), ((w02) this.mData).r());
        }
        YAxis yAxis = this.mAxisLeft;
        w02 w02Var = (w02) this.mData;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.calculate(w02Var.w(axisDependency), ((w02) this.mData).u(axisDependency));
        YAxis yAxis2 = this.mAxisRight;
        w02 w02Var2 = (w02) this.mData;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.calculate(w02Var2.w(axisDependency2), ((w02) this.mData).u(axisDependency2));
    }

    public RectF getBarBounds(BarEntry barEntry) {
        RectF rectF = new RectF();
        getBarBounds(barEntry, rectF);
        return rectF;
    }

    @Override // defpackage.x02
    public w02 getBarData() {
        return (w02) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public r7c getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            return null;
        }
        r7c r7cVarA = getHighlighter().a(f, f2);
        return (r7cVarA == null || !isHighlightFullBarEnabled()) ? r7cVarA : new r7c(r7cVarA.h(), r7cVarA.j(), r7cVarA.i(), r7cVarA.k(), r7cVarA.d(), -1, r7cVarA.b());
    }

    public void groupBars(float f, float f2, float f3) {
        if (getBarData() == null) {
            throw new RuntimeException("You need to set data for the chart before grouping bars.");
        }
        getBarData().A(f, f2, f3);
        notifyDataSetChanged();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void highlightValue(float f, int i, int i2) {
        highlightValue(new r7c(f, i, i2), false);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new u02(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new z02(this));
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    @Override // defpackage.x02
    public boolean isDrawBarShadowEnabled() {
        return this.mDrawBarShadow;
    }

    @Override // defpackage.x02
    public boolean isDrawValueAboveBarEnabled() {
        return this.mDrawValueAboveBar;
    }

    @Override // defpackage.x02
    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public void setDrawBarShadow(boolean z) {
        this.mDrawBarShadow = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.mDrawValueAboveBar = z;
    }

    public void setFitBars(boolean z) {
        this.mFitBars = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.mHighlightFullBarEnabled = z;
    }

    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        gpc gpcVar = (gpc) ((w02) this.mData).k(barEntry);
        if (gpcVar == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y = barEntry.getY();
        float x = barEntry.getX();
        float fY = ((w02) this.mData).y() / 2.0f;
        float f = x - fY;
        float f2 = x + fY;
        float f3 = y >= 0.0f ? y : 0.0f;
        if (y > 0.0f) {
            y = 0.0f;
        }
        rectF.set(f, f3, f2, y);
        getTransformer(gpcVar.m0()).p(rectF);
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHighlightFullBarEnabled = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mFitBars = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHighlightFullBarEnabled = false;
        this.mDrawValueAboveBar = true;
        this.mDrawBarShadow = false;
        this.mFitBars = false;
    }
}
