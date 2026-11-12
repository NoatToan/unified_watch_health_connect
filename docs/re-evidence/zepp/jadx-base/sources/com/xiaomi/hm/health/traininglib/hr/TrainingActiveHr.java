package com.xiaomi.hm.health.traininglib.hr;

import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingActiveHr {
    private Long a;
    private Long b;
    private Long c;
    private long d;
    private long e = -1;
    private int f = -1;

    public TrainingActiveHr(Long l, Long l2, Long l3) {
        this.d = 0L;
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = TrainingDBUtils.queryRecoverTrainingHrIndex(l3.longValue());
        System.out.println("recover hr index -------" + this.d);
    }

    public void generateHr(long j, int i) {
        this.f = i;
        this.e = j;
        this.d++;
    }

    public int getHr() {
        return this.f;
    }

    public long getHrRecordTimeStamp() {
        return this.e;
    }

    public long getIndex() {
        return this.d;
    }

    public Long getTrainingId() {
        return this.a;
    }

    public Long getTrainingPlanId() {
        return this.b;
    }

    public Long getTrainingStartTime() {
        return this.c;
    }

    public void setHr(int i) {
        this.f = i;
    }

    public void setHrRecordTimeStamp(long j) {
        this.e = j;
    }

    public void setIndex(long j) {
        this.d = j;
    }

    public void setTrainingId(Long l) {
        this.a = l;
    }

    public void setTrainingPlanId(Long l) {
        this.b = l;
    }

    public void setTrainingStartTime(Long l) {
        this.c = l;
    }
}
