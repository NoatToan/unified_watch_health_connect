package ub;

import bb.c0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends bb.h implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f169662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f169663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f169664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f169665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f169666l;

    public a(long j8, long j14, int i14, int i15, boolean z14) {
        super(j8, j14, i14, i15, z14);
        long j15 = j8;
        this.f169662h = j14;
        this.f169663i = i14;
        this.f169664j = i15;
        this.f169665k = z14;
        this.f169666l = j15 == -1 ? -1L : j15;
    }

    @Override // ub.e
    public final int f() {
        return this.f169663i;
    }

    @Override // ub.e
    public final long getDataEndPosition() {
        return this.f169666l;
    }

    @Override // ub.e
    public final long getTimeUs(long j8) {
        return (Math.max(0L, j8 - this.f17179b) * 8000000) / ((long) this.f17182e);
    }

    public a(long j8, long j14, c0.a aVar, boolean z14) {
        this(j8, j14, aVar.f17130f, aVar.f17127c, z14);
    }
}
