package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ui3;
import defpackage.vi3;
import defpackage.xi3;

/* JADX INFO: loaded from: classes4.dex */
public class CandleStickChart extends BarLineChartBase<ui3> implements vi3 {
    public CandleStickChart(Context context) {
        super(context);
    }

    @Override // defpackage.vi3
    public ui3 getCandleData() {
        return (ui3) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new xi3(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
