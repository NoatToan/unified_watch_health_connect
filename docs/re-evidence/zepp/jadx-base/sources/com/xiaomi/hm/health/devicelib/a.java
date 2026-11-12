package com.xiaomi.hm.health.devicelib;

/* JADX INFO: loaded from: classes21.dex */
class a {
    private static int d;
    private static int e;
    private long a;
    private long b = -1;
    private int c = -1;

    public a(long j) {
        this.a = -1L;
        this.a = j;
    }

    public int a() {
        int i;
        int i2 = d;
        if (i2 == 0 || (i = e) == 0) {
            return -1;
        }
        return i2 / i;
    }

    public boolean b() {
        return System.currentTimeMillis() - this.b <= 5000;
    }

    public boolean c() {
        return System.currentTimeMillis() - this.b <= 30000;
    }

    public int d() {
        return this.c;
    }

    public long e() {
        return this.b;
    }

    public long f() {
        return this.a;
    }

    public void g(long j, int i) {
        this.b = j;
        this.c = i;
        e++;
        d += i;
    }

    public void h(int i) {
        this.c = i;
    }

    public void i(long j) {
        this.b = j;
    }

    public void j(long j) {
        this.a = j;
    }

    public String toString() {
        return "GPSActiveHr{trackId=" + this.a + ", timestamp=" + this.b + ", hr=" + this.c + '}';
    }
}
