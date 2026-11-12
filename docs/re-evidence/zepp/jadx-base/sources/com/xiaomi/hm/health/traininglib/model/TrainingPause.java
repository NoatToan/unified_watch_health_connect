package com.xiaomi.hm.health.traininglib.model;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingPause {
    private long a;
    private long b;
    private long c;
    private long d;

    public TrainingPause(long j, long j2) {
        this.b = j / 1000;
        this.d = j2 / 1000;
        this.c = j + j2;
    }

    public String generateCsvStr() {
        return this.b + "," + this.d + ";";
    }

    public void reset() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
    }

    public void setDuration(long j) {
        this.d = j;
    }

    public void setEndTime(long j) {
        long j2 = j / 1000;
        this.c = j2;
        this.d = j2 - this.b;
    }

    public void setStartTime(long j, long j2) {
        this.b = j / 1000;
        this.a = j2 / 1000;
    }

    public TrainingPause() {
    }
}
