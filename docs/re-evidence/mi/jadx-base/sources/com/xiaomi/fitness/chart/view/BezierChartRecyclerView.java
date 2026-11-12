package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.du3;
import defpackage.ji2;

/* JADX INFO: loaded from: classes7.dex */
public class BezierChartRecyclerView extends BaseChartRecyclerView<ji2, Object> {
    public BezierChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ji2 getAttrs(Context context, AttributeSet attributeSet) {
        return du3.b(context, attributeSet);
    }
}
