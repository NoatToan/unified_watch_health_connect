package com.xiaomi.fitness.chart.entrys;

import defpackage.aji;
import defpackage.gni;
import defpackage.x44;

/* JADX INFO: loaded from: classes7.dex */
public class CurseEntry extends RecyclerBarEntry {
    public static final int CURSE_STATUE_DANGER = 3;
    public static final int CURSE_STATUE_FORECAST = 2;
    public static final int CURSE_STATUE_NORMAL = 0;
    public static final int CURSE_STATUE_OVUM = 4;
    public static final int CURSE_STATUE_SIGN = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11749b;
    public int c;
    public int d;

    public CurseEntry(float f, float f2, long j, int i, int i2) {
        super(f, f2, j, i);
        this.f11748a = i2;
        this.f11749b = d(i2);
        this.c = e(i2);
        this.d = a(i2);
    }

    public static int c(int i) {
        if (i == 2) {
            return gni.f19164b;
        }
        return i == 3 ? gni.c : gni.f19163a;
    }

    public int a(int i) {
        if (i != 1) {
            return i != 2 ? 8 : 26;
        }
        return 96;
    }

    public int d(int i) {
        if (i != 1) {
            return i != 2 ? x44.a(aji.u) : x44.a(aji.B);
        }
        return x44.a(aji.A);
    }

    public int e(int i) {
        if (i == 1 || i == 2) {
            return x44.a(aji.C);
        }
        return 0;
    }
}
