package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.du3;
import defpackage.vfe;
import defpackage.yfe;

/* JADX INFO: loaded from: classes7.dex */
public class LineChartRecyclerView extends BaseChartRecyclerView<vfe, yfe> {
    public LineChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public float a() {
        int paddingTop = getPaddingTop();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        T t = this.mAttrs;
        return (measuredHeight - ((vfe) t).f625a) - (paddingTop + ((vfe) t).f626b);
    }

    public float c() {
        return (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    public vfe getAttrs(Context context, AttributeSet attributeSet) {
        return du3.c(context, attributeSet);
    }
}
