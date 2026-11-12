package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static t3b f34262a = new dv5();

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:55:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    public static void a(cp2 cp2Var, float[] fArr) throws NotFoundException {
        int iK = cp2Var.k();
        int iH = cp2Var.h();
        boolean z = true;
        for (int i = 0; i < fArr.length && z; i += 2) {
            int i2 = (int) fArr[i];
            int i3 = i + 1;
            int i4 = (int) fArr[i3];
            if (i2 < -1 || i2 > iK || i4 < -1 || i4 > iH) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i2 == -1) {
                fArr[i] = 0.0f;
            } else {
                if (i2 == iK) {
                    fArr[i] = iK - 1;
                } else {
                    z = false;
                }
                if (i4 == -1) {
                    fArr[i3] = 0.0f;
                } else {
                    if (i4 == iH) {
                        fArr[i3] = iH - 1;
                    }
                }
                z = true;
            }
            z = true;
            if (i4 == -1) {
                fArr[i3] = 0.0f;
            } else {
                if (i4 == iH) {
                    fArr[i3] = iH - 1;
                }
            }
            z = true;
        }
        boolean z2 = true;
        for (int length = fArr.length - 2; length >= 0 && z2; length -= 2) {
            int i5 = (int) fArr[length];
            int i6 = length + 1;
            int i7 = (int) fArr[i6];
            if (i5 < -1 || i5 > iK || i7 < -1 || i7 > iH) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i5 == -1) {
                fArr[length] = 0.0f;
            } else {
                if (i5 == iK) {
                    fArr[length] = iK - 1;
                } else {
                    z2 = false;
                }
                if (i7 == -1) {
                    fArr[i6] = 0.0f;
                } else {
                    if (i7 == iH) {
                        fArr[i6] = iH - 1;
                    }
                }
                z2 = true;
            }
            z2 = true;
            if (i7 == -1) {
                fArr[i6] = 0.0f;
            } else {
                if (i7 == iH) {
                    fArr[i6] = iH - 1;
                }
            }
            z2 = true;
        }
    }

    public static t3b b() {
        return f34262a;
    }

    public abstract cp2 c(cp2 cp2Var, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException;

    public abstract cp2 d(cp2 cp2Var, int i, int i2, ath athVar) throws NotFoundException;
}
