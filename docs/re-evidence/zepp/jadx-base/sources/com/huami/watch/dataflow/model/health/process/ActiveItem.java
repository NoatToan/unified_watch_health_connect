package com.huami.watch.dataflow.model.health.process;

/* JADX INFO: loaded from: classes16.dex */
public class ActiveItem {
    private int a;
    private int b;
    private int c = 0;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public int getActiveTime() {
        return this.j;
    }

    public int getBasalCalories() {
        return this.l + this.m;
    }

    public int getDistance() {
        return this.e;
    }

    public int getKey() {
        return (this.a << 16) | this.b;
    }

    public int getMode() {
        return this.c;
    }

    public double getRunCalories() {
        return this.n;
    }

    public int getRunDistance() {
        return this.f;
    }

    public int getRuntime() {
        return this.i;
    }

    public int getSportCalories() {
        return this.k;
    }

    public int getStart() {
        return this.a;
    }

    public int getSteps() {
        return this.d;
    }

    public int getStop() {
        return this.b;
    }

    public double getWalkCalories() {
        return this.p;
    }

    public int getWalkDistance() {
        return this.g;
    }

    @NoProguard
    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
        this.p = i16;
        this.q = i17;
    }

    public String toString() {
        return "ActiveItem{start=" + this.a + ", stop=" + this.b + ", mode=" + this.c + ", steps=" + this.d + ", distance=" + this.e + ", runDistance=" + this.f + ", walkDistance=" + this.g + ", flag=" + this.h + ", runtime=" + this.i + ", activeTime=" + this.j + ", pureSportCalories=" + this.k + ", basalCaloriesDuringSport=" + this.l + ", basalCaloriesNonSport=" + this.m + ", pureRunSportCalories=" + this.n + ", basalCaloriesDuringRun=" + this.o + ", pureWalkSportCalories=" + this.p + ", basalCaloriesDuringWalk=" + this.q + '}';
    }
}
