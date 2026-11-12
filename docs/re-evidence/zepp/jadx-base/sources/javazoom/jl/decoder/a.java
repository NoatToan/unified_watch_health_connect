package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
final class a {
    private static final int f = 32768;
    private static final int g = 32767;
    private int e;
    private final int[] d = new int[32768];
    private int a = 0;
    private int b = 0;
    private int c = 0;

    public int a() {
        this.b++;
        int[] iArr = this.d;
        int i = this.c;
        int i2 = iArr[i];
        this.c = (i + 1) & g;
        return i2;
    }

    public int b(int i) {
        int i2;
        this.b += i;
        int i3 = this.c;
        if (i3 + i >= 32768) {
            i2 = 0;
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                i2 = (this.d[i3] != 0 ? 1 : 0) | (i2 << 1);
                i3 = (i3 + 1) & g;
                i = i4;
            }
        } else {
            i2 = 0;
            while (true) {
                int i5 = i - 1;
                if (i <= 0) {
                    break;
                }
                int i6 = i3 + 1;
                i2 = (i2 << 1) | (this.d[i3] != 0 ? 1 : 0);
                i = i5;
                i3 = i6;
            }
        }
        this.c = i3;
        return i2;
    }

    public void c(int i) {
        int i2 = this.a;
        int[] iArr = this.d;
        int i3 = i2 + 1;
        iArr[i2] = i & 128;
        int i4 = i3 + 1;
        iArr[i3] = i & 64;
        int i5 = i4 + 1;
        iArr[i4] = i & 32;
        int i6 = i5 + 1;
        iArr[i5] = i & 16;
        int i7 = i6 + 1;
        iArr[i6] = i & 8;
        int i8 = i7 + 1;
        iArr[i7] = i & 4;
        int i9 = i8 + 1;
        iArr[i8] = i & 2;
        int i10 = i9 + 1;
        iArr[i9] = i & 1;
        if (i10 == 32768) {
            this.a = 0;
        } else {
            this.a = i10;
        }
    }

    public int d() {
        return this.b;
    }

    public void e(int i) {
        this.b -= i;
        int i2 = this.c - i;
        this.c = i2;
        if (i2 < 0) {
            this.c = i2 + 32768;
        }
    }

    public void f(int i) {
        int i2 = i << 3;
        this.b -= i2;
        int i3 = this.c - i2;
        this.c = i3;
        if (i3 < 0) {
            this.c = i3 + 32768;
        }
    }
}
