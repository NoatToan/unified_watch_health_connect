package com.google.zxing.oned.rss;

/* JADX INFO: loaded from: classes4.dex */
final class a extends DataCharacter {
    private final FinderPattern c;
    private int d;

    public a(int i, int i2, FinderPattern finderPattern) {
        super(i, i2);
        this.c = finderPattern;
    }

    public int a() {
        return this.d;
    }

    public FinderPattern b() {
        return this.c;
    }

    public void c() {
        this.d++;
    }
}
