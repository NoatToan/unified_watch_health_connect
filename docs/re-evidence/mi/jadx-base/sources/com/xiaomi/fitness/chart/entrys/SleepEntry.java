package com.xiaomi.fitness.chart.entrys;

import defpackage.aji;
import defpackage.c0n;
import defpackage.x44;

/* JADX INFO: loaded from: classes7.dex */
public class SleepEntry extends RecyclerBarEntry {
    public static final int STAGE_BAD = 1;
    public static final int STAGE_BEST = 4;
    public static final int STAGE_BETTER = 3;
    public static final int STAGE_NONE = 0;
    public static final int STAGE_NORMAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0n f11762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11763b;
    public int c;
    public int d;

    public SleepEntry() {
    }

    public void a(int i) {
        this.d = i;
        this.c = x44.a(aji.P);
        this.f11763b = x44.a(aji.O);
    }

    public SleepEntry(float f, float f2, long j, int i) {
        super(f, f2, j, i);
    }
}
