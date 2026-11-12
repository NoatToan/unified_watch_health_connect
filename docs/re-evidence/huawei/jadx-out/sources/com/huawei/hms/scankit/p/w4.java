package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class w4 {
    public static final w4 f = new w4(929, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f16398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x4 f16399c;
    private final x4 d;
    private final int e;

    private w4(int i, int i2) {
        this.e = i;
        this.f16397a = new int[i];
        this.f16398b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f16397a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f16398b[this.f16397a[i5]] = i5;
        }
        this.f16399c = new x4(this, new int[]{0});
        this.d = new x4(this, new int[]{1});
    }

    x4 c() {
        return this.f16399c;
    }

    x4 b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f16399c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new x4(this, iArr);
    }

    int a(int i, int i2) {
        return (i + i2) % this.e;
    }

    int d(int i, int i2) {
        int i3 = this.e;
        return ((i + i3) - i2) % i3;
    }

    int c(int i) {
        if (i != 0) {
            return this.f16398b[i];
        }
        throw new IllegalArgumentException();
    }

    int a(int i) {
        return this.f16397a[i];
    }

    int b() {
        return this.e;
    }

    x4 a() {
        return this.d;
    }

    int c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return 0;
        }
        int[] iArr = this.f16397a;
        int[] iArr2 = this.f16398b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    int b(int i) {
        if (i != 0) {
            return this.f16397a[(this.e - this.f16398b[i]) - 1];
        }
        throw new ArithmeticException();
    }
}
