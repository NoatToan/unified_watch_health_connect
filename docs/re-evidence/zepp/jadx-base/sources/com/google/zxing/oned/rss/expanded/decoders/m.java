package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes4.dex */
final class m extends p {
    public static final char c = '$';
    private final char b;

    public m(int i, char c2) {
        super(i);
        this.b = c2;
    }

    public char b() {
        return this.b;
    }

    public boolean c() {
        return this.b == '$';
    }
}
