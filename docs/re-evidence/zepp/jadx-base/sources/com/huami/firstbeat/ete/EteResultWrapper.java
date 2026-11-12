package com.huami.firstbeat.ete;

import fi.firstbeat.ete.EteResults;

/* JADX INFO: loaded from: classes9.dex */
public class EteResultWrapper {
    private long a;
    private int b;
    private EteResults c;
    private long d;

    public long getEndTime() {
        return this.d;
    }

    public EteResults getEteResults() {
        return this.c;
    }

    public int getExerciseType() {
        return this.b;
    }

    public long getTrackId() {
        return this.a;
    }

    public void setEndTime(long j) {
        this.d = j;
    }

    public void setEteResults(EteResults eteResults) {
        this.c = eteResults;
    }

    public void setExerciseType(int i) {
        this.b = i;
    }

    public void setTrackId(long j) {
        this.a = j;
    }
}
