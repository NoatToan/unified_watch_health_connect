package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class y4n {
    public static final int[] e = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f39791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39792b;
    public final float c;
    public boolean d;

    public y4n() {
        this(0.0f);
    }

    public static float[] c() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.c;
        int i2 = this.f39792b;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = e;
        if ((iArr[i] & i2) != 0) {
            return this.f39791a[i];
        }
        if (this.d) {
            char c = (i == 1 || i == 3) ? (char) 7 : (char) 6;
            if ((iArr[c] & i2) != 0) {
                return this.f39791a[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.f39791a[8];
            }
        }
        return f;
    }

    public float b(int i) {
        return this.f39791a[i];
    }

    public boolean d(int i, float f) {
        if (ey9.a(this.f39791a[i], f)) {
            return false;
        }
        this.f39791a[i] = f;
        if (j0s.a(f)) {
            this.f39792b = (~e[i]) & this.f39792b;
        } else {
            this.f39792b = e[i] | this.f39792b;
        }
        int i2 = this.f39792b;
        int[] iArr = e;
        this.d = ((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0) ? false : true;
        return true;
    }

    public y4n(float f) {
        this.f39792b = 0;
        this.c = f;
        this.f39791a = c();
    }
}
