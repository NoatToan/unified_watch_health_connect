package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.du3;
import defpackage.r02;
import defpackage.s02;

/* JADX INFO: loaded from: classes7.dex */
public class BarChartRecyclerView extends BaseChartRecyclerView<r02, s02> {
    public BarChartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r02 getAttrs(Context context, AttributeSet attributeSet) {
        return du3.a(context, attributeSet);
    }
}
