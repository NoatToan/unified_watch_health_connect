package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class dv5 extends t3b {
    @Override // defpackage.t3b
    public cp2 c(cp2 cp2Var, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return d(cp2Var, i, i2, ath.b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // defpackage.t3b
    public cp2 d(cp2 cp2Var, int i, int i2, ath athVar) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        cp2 cp2Var2 = new cp2(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            athVar.f(fArr);
            t3b.a(cp2Var, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (cp2Var.e((int) fArr[i6], (int) fArr[i6 + 1])) {
                        cp2Var2.n(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return cp2Var2;
    }
}
