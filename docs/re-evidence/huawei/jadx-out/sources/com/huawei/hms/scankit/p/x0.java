package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16410c;
    private final int d;
    private int e = -1;

    public String toString() {
        return this.e + "|" + this.d;
    }

    x0(int i, int i2, int i3, int i4) {
        this.f16408a = i;
        this.f16409b = i2;
        this.f16410c = i3;
        this.d = i4;
    }

    boolean g() {
        return a(this.e);
    }

    void h() {
        this.e = ((this.d / 30) * 3) + (this.f16410c / 3);
    }

    int f() {
        return this.f16409b - this.f16408a;
    }

    int d() {
        return this.f16408a;
    }

    int b() {
        return this.f16409b;
    }

    int a() {
        return this.f16410c;
    }

    int e() {
        return this.d;
    }

    int c() {
        return this.e;
    }

    boolean a(int i) {
        return i != -1 && this.f16410c == (i % 3) * 3;
    }

    void b(int i) {
        this.e = i;
    }
}
