package defpackage;

import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class cya {
    public static final cya h = new cya(4201, 4096, 1);
    public static final cya i = new cya(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS, 1024, 1);
    public static final cya j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final cya f14857k;
    public static final cya l;
    public static final cya m;
    public static final cya n;
    public static final cya o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f14858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14859b;
    public final dya c;
    public final dya d;
    public final int e;
    public final int f;
    public final int g;

    static {
        cya cyaVar = new cya(67, 64, 1);
        j = cyaVar;
        f14857k = new cya(19, 16, 1);
        l = new cya(285, 256, 0);
        cya cyaVar2 = new cya(301, 256, 1);
        m = cyaVar2;
        n = cyaVar2;
        o = cyaVar;
    }

    public cya(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.f14858a = new int[i3];
        this.f14859b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f14858a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f14859b[this.f14858a[i7]] = i7;
        }
        this.c = new dya(this, new int[]{0});
        this.d = new dya(this, new int[]{1});
    }

    public static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    public dya b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new dya(this, iArr);
    }

    public int c(int i2) {
        return this.f14858a[i2];
    }

    public int d() {
        return this.g;
    }

    public dya e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public dya g() {
        return this.c;
    }

    public int h(int i2) {
        if (i2 != 0) {
            return this.f14858a[(this.e - this.f14859b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i2) {
        if (i2 != 0) {
            return this.f14859b[i2];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f14858a;
        int[] iArr2 = this.f14859b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
