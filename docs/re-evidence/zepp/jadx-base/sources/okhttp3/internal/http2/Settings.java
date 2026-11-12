package okhttp3.internal.http2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public final class Settings {
    public static final int c = 65535;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 10;
    private int a;
    private final int[] b = new int[10];

    public void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }

    public int b(int i2) {
        return this.b[i2];
    }

    public boolean c(boolean z) {
        int i2;
        if ((this.a & 4) != 0) {
            i2 = this.b[2];
        } else {
            i2 = z ? 1 : 0;
        }
        return i2 == 1;
    }

    public int d() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public int e() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public int f(int i2) {
        return (this.a & 16) != 0 ? this.b[4] : i2;
    }

    public int g(int i2) {
        return (this.a & 32) != 0 ? this.b[5] : i2;
    }

    public int h(int i2) {
        return (this.a & 64) != 0 ? this.b[6] : i2;
    }

    public boolean i(int i2) {
        return ((1 << i2) & this.a) != 0;
    }

    public void j(Settings settings) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (settings.i(i2)) {
                k(i2, settings.b(i2));
            }
        }
    }

    public Settings k(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public int l() {
        return Integer.bitCount(this.a);
    }
}
