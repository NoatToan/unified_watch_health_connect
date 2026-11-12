package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class hg extends jo {
    private static int g = 10000000;
    public int a;
    public long b;
    private boolean d;
    private boolean e;
    private int f;
    private long h;

    public hg(boolean z, jo joVar, long j, int i) {
        super(joVar);
        this.d = false;
        this.e = false;
        this.f = g;
        this.h = 0L;
        this.d = z;
        this.a = 600000;
        this.h = j;
        this.f = i;
    }

    @Override // com.amap.api.mapcore.util.jo
    public final int a() {
        return 320000;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final long b() {
        return this.h;
    }

    @Override // com.amap.api.mapcore.util.jo
    public final boolean c() {
        if (this.e && this.h <= this.f) {
            return true;
        }
        if (!this.d || this.h >= this.f) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b < this.a) {
            return false;
        }
        this.b = jCurrentTimeMillis;
        return true;
    }

    public final void a(int i) {
        if (i <= 0) {
            return;
        }
        this.h += (long) i;
    }
}
