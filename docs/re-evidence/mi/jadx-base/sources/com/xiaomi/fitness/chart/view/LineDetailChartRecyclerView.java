package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.du3;
import defpackage.vfe;
import defpackage.yfe;

/* JADX INFO: loaded from: classes7.dex */
public class LineDetailChartRecyclerView extends BaseChartRecyclerView<vfe, yfe> {
    public LineDetailChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    public vfe getAttrs(Context context, AttributeSet attributeSet) {
        return du3.c(context, attributeSet);
    }
}
