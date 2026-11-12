package com.github.mikephil.chartingv2.listener;

import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.data.Entry;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface OnDrawListener {
    void onDrawFinished(DataSet<?> dataSet);

    void onEntryAdded(Entry entry);

    void onEntryMoved(Entry entry);
}
