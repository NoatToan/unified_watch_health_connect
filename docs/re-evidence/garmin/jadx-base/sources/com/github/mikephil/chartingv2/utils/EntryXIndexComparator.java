package com.github.mikephil.chartingv2.utils;

import com.github.mikephil.chartingv2.data.Entry;
import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class EntryXIndexComparator implements Comparator<Entry> {
    @Override // java.util.Comparator
    public int compare(Entry entry, Entry entry2) {
        return entry.getXIndex() - entry2.getXIndex();
    }
}
