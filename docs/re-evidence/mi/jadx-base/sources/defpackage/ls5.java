package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes5.dex */
public final class ls5 extends ms5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25392b;
    public final int c;

    public ls5(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f25392b = i2;
        this.c = i3;
    }

    public int b() {
        return this.f25392b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.f25392b == 10;
    }

    public boolean e() {
        return this.c == 10;
    }
}
