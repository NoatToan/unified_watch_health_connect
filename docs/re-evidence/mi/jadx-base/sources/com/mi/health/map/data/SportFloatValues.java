package com.mi.health.map.data;

import android.util.LongSparseArray;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SportFloatValues implements Serializable {
    public final int sportType;
    public final long timeStamp;
    public final List<SportItemValue> valueList;
    public final LongSparseArray<SportItemValue> valueMap = new LongSparseArray<>();

    public SportFloatValues(long j, int i, List<SportItemValue> list) {
        this.timeStamp = j;
        this.sportType = i;
        this.valueList = list;
        if (list == null || list.size() == 0) {
            return;
        }
        for (SportItemValue sportItemValue : list) {
            if (sportItemValue != null) {
                this.valueMap.put(sportItemValue.f10025b, sportItemValue);
            }
        }
    }
}
