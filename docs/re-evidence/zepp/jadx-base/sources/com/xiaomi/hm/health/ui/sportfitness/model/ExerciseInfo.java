package com.xiaomi.hm.health.ui.sportfitness.model;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseInfo {
    public long costTime;
    public float distance;
    public long startTime;
    public int day = 0;
    public int count = 0;

    public String toString() {
        return "ExerciseInfo{day=" + this.day + ", count=" + this.count + ", startTime=" + this.startTime + ", costTime=" + this.costTime + ", distance=" + this.distance + '}';
    }
}
