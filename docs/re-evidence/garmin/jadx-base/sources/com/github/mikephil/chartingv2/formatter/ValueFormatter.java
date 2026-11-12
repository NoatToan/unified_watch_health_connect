package com.github.mikephil.chartingv2.formatter;

import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface ValueFormatter {
    String getFormattedValue(float f14, Entry entry, int i14, ViewPortHandler viewPortHandler);
}
