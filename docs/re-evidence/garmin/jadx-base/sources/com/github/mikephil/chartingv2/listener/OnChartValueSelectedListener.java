package com.github.mikephil.chartingv2.listener;

import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface OnChartValueSelectedListener {
    void onNothingSelected();

    void onValueSelected(Entry entry, int i14, Highlight highlight);
}
