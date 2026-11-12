package com.huami.firstbeat.tha;

import fi.firstbeat.tha.ThaResults;

/* JADX INFO: loaded from: classes9.dex */
public class ThaDataWrapper {
    private long a;
    private int b;
    private ThaResults c;

    public int getSource() {
        return this.b;
    }

    public ThaResults getThaResults() {
        return this.c;
    }

    public long getTimeStamp() {
        return this.a;
    }

    public void setSource(int i) {
        this.b = i;
    }

    public void setThaResults(ThaResults thaResults) {
        this.c = thaResults;
    }

    public void setTimeStamp(long j) {
        this.a = j;
    }
}
