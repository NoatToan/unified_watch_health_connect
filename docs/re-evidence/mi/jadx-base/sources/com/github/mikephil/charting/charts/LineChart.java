package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.age;
import defpackage.bge;
import defpackage.cge;
import defpackage.dn5;

/* JADX INFO: loaded from: classes4.dex */
public class LineChart extends BarLineChartBase<bge> implements cge {
    public LineChart(Context context) {
        super(context);
    }

    @Override // defpackage.cge
    public bge getLineData() {
        return (bge) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new age(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dn5 dn5Var = this.mRenderer;
        if (dn5Var != null && (dn5Var instanceof age)) {
            ((age) dn5Var).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
