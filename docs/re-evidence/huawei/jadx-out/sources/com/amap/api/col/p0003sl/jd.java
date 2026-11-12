package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public final class jd extends lx {
    private static int g = 10000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f2867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f2868b;
    private boolean d;
    private boolean e;
    private int f;
    private long h;

    @Override // com.amap.api.col.p0003sl.lx
    public final int a() {
        return 320000;
    }

    public jd(boolean z, lx lxVar, long j, int i) {
        super(lxVar);
        this.e = false;
        this.d = z;
        this.f2867a = 600000;
        this.h = j;
        this.f = i;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(int i) {
        if (i <= 0) {
            return;
        }
        this.h += (long) i;
    }

    public final long b() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.lx
    protected final boolean c() {
        if (this.e && this.h <= this.f) {
            return true;
        }
        if (!this.d || this.h >= this.f) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2868b < this.f2867a) {
            return false;
        }
        this.f2868b = jCurrentTimeMillis;
        return true;
    }
}
