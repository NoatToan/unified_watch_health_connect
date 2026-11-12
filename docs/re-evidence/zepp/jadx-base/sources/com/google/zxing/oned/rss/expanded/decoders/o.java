package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes4.dex */
final class o extends p {
    public static final int d = 10;
    private final int b;
    private final int c;

    public o(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.b = i2;
        this.c = i3;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return (this.b * 10) + this.c;
    }

    public boolean e() {
        return this.b == 10 || this.c == 10;
    }

    public boolean f() {
        return this.b == 10;
    }

    public boolean g() {
        return this.c == 10;
    }
}
