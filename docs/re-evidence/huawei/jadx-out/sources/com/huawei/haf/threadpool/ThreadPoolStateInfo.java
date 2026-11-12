package com.huawei.haf.threadpool;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadPoolStateInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6090c;
    private long d;
    private int e;
    private int f;
    private int g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private int n;
    private int o;
    private long s;

    void e(ThreadPoolManager.HealthThreadPoolExecutor healthThreadPoolExecutor, int i) {
        this.i = healthThreadPoolExecutor.getMaximumPoolSize();
        this.f6089b = healthThreadPoolExecutor.getCorePoolSize();
        this.f = healthThreadPoolExecutor.getPoolSize();
        this.f6088a = healthThreadPoolExecutor.getLargestPoolSize();
        this.e = i;
        this.n = healthThreadPoolExecutor.a();
        this.o = healthThreadPoolExecutor.b();
        this.f6090c = healthThreadPoolExecutor.e();
        this.g = healthThreadPoolExecutor.d();
    }

    void e(long j, long j2, long j3, long j4) {
        this.k = j;
        this.h = j2;
        this.j = j3;
        this.m = j4;
    }

    void e(long j, long j2, long j3) {
        this.l = j;
        this.s = j2;
        this.d = j3;
    }

    public int j() {
        return this.i;
    }

    public int e() {
        return this.f6089b;
    }

    public int c() {
        return this.f6088a;
    }

    public int h() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public int m() {
        return this.n;
    }

    public int o() {
        return this.o;
    }

    public int b() {
        return this.f6090c;
    }

    public int g() {
        return this.g;
    }

    public long k() {
        return this.k;
    }

    public long i() {
        return this.h;
    }

    public long f() {
        return this.j;
    }

    public long n() {
        return this.m;
    }

    public long l() {
        return this.l;
    }

    public long q() {
        return this.s;
    }

    public long a() {
        return this.d;
    }
}
