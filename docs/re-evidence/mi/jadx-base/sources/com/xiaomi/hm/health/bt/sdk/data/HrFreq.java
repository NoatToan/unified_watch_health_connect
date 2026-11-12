package com.xiaomi.hm.health.bt.sdk.data;

/* JADX INFO: loaded from: classes11.dex */
public enum HrFreq {
    FREQ_1(1),
    FREQ_5(5),
    FREQ_10(10),
    FREQ_30(30),
    FREQ_SMART(255);

    private int freq;

    HrFreq(int i) {
        this.freq = i;
    }

    public int getFreq() {
        return this.freq;
    }
}
