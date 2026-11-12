package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.n53;
import defpackage.o53;
import defpackage.p53;

/* JADX INFO: loaded from: classes4.dex */
public class BubbleChart extends BarLineChartBase<o53> implements p53 {
    public BubbleChart(Context context) {
        super(context);
    }

    @Override // defpackage.p53
    public o53 getBubbleData() {
        return (o53) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new n53(this, this.mAnimator, this.mViewPortHandler);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
