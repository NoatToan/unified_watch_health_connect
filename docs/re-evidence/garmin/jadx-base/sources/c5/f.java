package c5;

import b5.a0;
import b5.r;
import java.util.List;
import p13.j0;
import p13.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(e eVar, a0 a0Var, long j8) {
        b bVar = eVar.f24464a;
        bVar.getClass();
        d dVar = bVar.f24448b;
        d dVar2 = bVar.f24447a;
        boolean zB = r.b(a0Var);
        long j14 = a0Var.f15749b;
        if (zB) {
            a[] aVarArr = dVar2.f24455d;
            s.m(0, aVarArr.length, null, aVarArr);
            dVar2.f24456e = 0;
            a[] aVarArr2 = dVar.f24455d;
            s.m(0, aVarArr2.length, null, aVarArr2);
            dVar.f24456e = 0;
            bVar.f24449c = 0L;
        }
        if (!r.d(a0Var)) {
            List list = a0Var.f15760m;
            if (list == null) {
                list = j0.f134944a;
            }
            int i14 = 0;
            for (int size = list.size(); i14 < size; size = size) {
                b5.e eVar2 = (b5.e) list.get(i14);
                bVar.a(eVar2.f15788a, n4.c.j(eVar2.f15792e, j8));
                i14++;
            }
            bVar.a(j14, n4.c.j(a0Var.f15761n, j8));
        }
        if (r.d(a0Var) && j14 - bVar.f24449c > 40) {
            a[] aVarArr3 = dVar2.f24455d;
            s.m(0, aVarArr3.length, null, aVarArr3);
            dVar2.f24456e = 0;
            a[] aVarArr4 = dVar.f24455d;
            s.m(0, aVarArr4.length, null, aVarArr4);
            dVar.f24456e = 0;
            bVar.f24449c = 0L;
        }
        bVar.f24449c = j14;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f14 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            f14 += fArr[i14] * fArr2[i14];
        }
        return f14;
    }

    public static final void c(float[] fArr, float[] fArr2, int i14, float[] fArr3) {
        if (i14 == 0) {
            e5.a.a("At least one point must be provided");
        }
        int i15 = 2 >= i14 ? i14 - 1 : 2;
        int i16 = i15 + 1;
        float[][] fArr4 = new float[i16][];
        for (int i17 = 0; i17 < i16; i17++) {
            fArr4[i17] = new float[i14];
        }
        for (int i18 = 0; i18 < i14; i18++) {
            fArr4[0][i18] = 1.0f;
            for (int i19 = 1; i19 < i16; i19++) {
                fArr4[i19][i18] = fArr4[i19 - 1][i18] * fArr[i18];
            }
        }
        float[][] fArr5 = new float[i16][];
        for (int i24 = 0; i24 < i16; i24++) {
            fArr5[i24] = new float[i14];
        }
        float[][] fArr6 = new float[i16][];
        for (int i25 = 0; i25 < i16; i25++) {
            fArr6[i25] = new float[i16];
        }
        int i26 = 0;
        while (i26 < i16) {
            float[] fArr7 = fArr5[i26];
            float[] fArr8 = fArr4[i26];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i14);
            for (int i27 = 0; i27 < i26; i27++) {
                float[] fArr9 = fArr5[i27];
                float fB = b(fArr7, fArr9);
                for (int i28 = 0; i28 < i14; i28++) {
                    fArr7[i28] = fArr7[i28] - (fArr9[i28] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f14 = 1.0f / fSqrt;
            for (int i29 = 0; i29 < i14; i29++) {
                fArr7[i29] = fArr7[i29] * f14;
            }
            float[] fArr10 = fArr6[i26];
            int i30 = 0;
            while (i30 < i16) {
                fArr10[i30] = i30 < i26 ? 0.0f : b(fArr7, fArr4[i30]);
                i30++;
            }
            i26++;
        }
        for (int i34 = i15; -1 < i34; i34--) {
            float fB2 = b(fArr5[i34], fArr2);
            float[] fArr11 = fArr6[i34];
            int i35 = i34 + 1;
            if (i35 <= i15) {
                int i36 = i15;
                while (true) {
                    fB2 -= fArr11[i36] * fArr3[i36];
                    if (i36 != i35) {
                        i36--;
                    }
                }
            }
            fArr3[i34] = fB2 / fArr11[i34];
        }
    }
}
