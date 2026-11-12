package com.xiaomi.hm.health.training.media;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingRest {
    public static final long TRAINING_REST_END = -1;
    private long a;

    public TrainingRest(long j) {
        this.a = j;
    }

    public long getCurrentRemainRestTime() {
        return this.a;
    }

    public void setCurrentRemainRestTime(long j) {
        this.a = j;
    }
}
