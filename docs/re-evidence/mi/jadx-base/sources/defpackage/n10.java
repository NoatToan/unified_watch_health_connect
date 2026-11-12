package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n10 extends mah {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f27428b;
    public final int[] e;
    public final int[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f27427a = new int[4];
    public final float[] c = new float[4];
    public final float[] d = new float[4];

    public n10() {
        int[] iArr = new int[8];
        this.f27428b = iArr;
        this.e = new int[iArr.length / 2];
        this.f = new int[iArr.length / 2];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean o(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = i / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int p(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (mah.d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] h() {
        return this.f27428b;
    }

    public final int[] i() {
        return this.f27427a;
    }

    public final int[] j() {
        return this.f;
    }

    public final float[] k() {
        return this.d;
    }

    public final int[] l() {
        return this.e;
    }

    public final float[] m() {
        return this.c;
    }
}
