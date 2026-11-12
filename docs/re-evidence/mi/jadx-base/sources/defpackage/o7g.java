package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class o7g {
    public static final o7g f = new o7g(929, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f28819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f28820b;
    public final p7g c;
    public final p7g d;
    public final int e;

    public o7g(int i, int i2) {
        this.e = i;
        this.f28819a = new int[i];
        this.f28820b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f28819a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f28820b[this.f28819a[i5]] = i5;
        }
        this.c = new p7g(this, new int[]{0});
        this.d = new p7g(this, new int[]{1});
    }

    public int a(int i, int i2) {
        return (i + i2) % this.e;
    }

    public p7g b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new p7g(this, iArr);
    }

    public int c(int i) {
        return this.f28819a[i];
    }

    public p7g d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public p7g f() {
        return this.c;
    }

    public int g(int i) {
        if (i != 0) {
            return this.f28819a[(this.e - this.f28820b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i) {
        if (i != 0) {
            return this.f28820b[i];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f28819a;
        int[] iArr2 = this.f28820b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    public int j(int i, int i2) {
        int i3 = this.e;
        return ((i + i3) - i2) % i3;
    }
}
