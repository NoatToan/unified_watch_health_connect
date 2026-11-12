package com.xiaomi.fitness.chart.entrys;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MultiBarEntry extends RecyclerBarEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<a> f11755a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11757b;
        public boolean c;

        public a(int i, int i2, boolean z) {
            this.f11756a = i;
            this.f11757b = i2;
            this.c = z;
        }
    }

    public MultiBarEntry(float f, float f2, long j, int i) {
        super(f, f2, j, i);
    }

    public List<a> a() {
        return this.f11755a;
    }

    public void c(List<a> list) {
        this.f11755a = list;
    }
}
