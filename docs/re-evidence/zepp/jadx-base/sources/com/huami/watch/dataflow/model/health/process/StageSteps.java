package com.huami.watch.dataflow.model.health.process;

/* JADX INFO: loaded from: classes16.dex */
public class StageSteps implements Comparable<StageSteps> {
    private int a;
    private int b;
    private int c;
    public int count;
    public int distance;
    public int steps;
    public int time;

    public StageSteps() {
    }

    public int getCalories() {
        return this.a + this.b + this.c;
    }

    @NoProguard
    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.time = i;
        this.steps = i2;
        this.count = i3;
        this.distance = i4;
        this.a = i5;
        this.b = i6;
        this.c = i7;
    }

    public String toString() {
        return "StageSteps{time=" + this.time + ", steps=" + this.steps + ", count=" + this.count + ", distance=" + this.distance + ", pureSportCalories=" + this.a + ", basalCaloriesDuringSport=" + this.b + ", basalCaloriesNonSport=" + this.c + '}';
    }

    public StageSteps(int i) {
        this.time = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(StageSteps stageSteps) {
        int i = this.time;
        int i2 = stageSteps.time;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }
}
