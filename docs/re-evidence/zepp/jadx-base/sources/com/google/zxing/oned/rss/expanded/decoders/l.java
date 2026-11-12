package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes4.dex */
final class l {
    private int a = 0;
    private a b = a.NUMERIC;

    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.a;
    }

    public void b(int i) {
        this.a += i;
    }

    public boolean c() {
        return this.b == a.ALPHA;
    }

    public boolean d() {
        return this.b == a.ISO_IEC_646;
    }

    public boolean e() {
        return this.b == a.NUMERIC;
    }

    public void f() {
        this.b = a.ALPHA;
    }

    public void g() {
        this.b = a.ISO_IEC_646;
    }

    public void h() {
        this.b = a.NUMERIC;
    }

    public void i(int i) {
        this.a = i;
    }
}
