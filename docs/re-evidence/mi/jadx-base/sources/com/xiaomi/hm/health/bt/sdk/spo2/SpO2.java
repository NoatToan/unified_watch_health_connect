package com.xiaomi.hm.health.bt.sdk.spo2;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SpO2 implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<Integer> historyValue;
    private final long time;
    private final int value;

    public SpO2(long j, int i, List<Integer> list) {
        this.time = j;
        this.value = i;
        this.historyValue = list;
    }

    public List<Integer> getHistoryValue() {
        return this.historyValue;
    }

    public long getTime() {
        return this.time;
    }

    public int getValue() {
        return this.value;
    }
}
