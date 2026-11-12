package kotlin;

import a5.j;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n4.c;
import p005kotlin.math.MathKt;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    public static final int a(long j8) {
        int i14 = Math.abs(Float.intBitsToFloat((int) (j8 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j8 & 4294967295L))) >= 0.5f ? i14 | 2 : i14;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r11
      0x004c: PHI (r11v11 float) = (r11v4 float), (r11v12 float) binds: [B:16:0x0059, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[PHI: r11
      0x0073: PHI (r11v9 float) = (r11v6 float), (r11v10 float) binds: [B:24:0x0080, B:21:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long b(int i14, int i15, int[] iArr, long j8) {
        float f14;
        float fIntBitsToFloat;
        float f15;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j8 >> 32)) - (i14 * (-1.0f));
        float fIntBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j8 & 4294967295L)) - (i15 * (-1.0f));
        int i16 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i16) >= 0.0f) {
            f14 = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i16);
            if (f14 > fIntBitsToFloat) {
                f14 = fIntBitsToFloat;
            }
        } else {
            f14 = (iArr[0] * (-1.0f)) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i16);
            if (f14 < fIntBitsToFloat) {
                f14 = fIntBitsToFloat;
            }
        }
        int i17 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i17) >= 0.0f) {
            f15 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i17);
            if (f15 > fIntBitsToFloat2) {
                f15 = fIntBitsToFloat2;
            }
        } else {
            f15 = (iArr[1] * (-1.0f)) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i17);
            if (f15 < fIntBitsToFloat2) {
                f15 = fIntBitsToFloat2;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        c.a aVar = c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final int c(int i14) {
        j.f1233b.getClass();
        return (i14 == j.f1234c ? 1 : 0) ^ 1;
    }

    public static final int d(float f14) {
        return MathKt.c(f14) * (-1);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
    public static final w2 e(m mVar) {
        View view2 = (View) mVar.A(AndroidCompositionLocals_androidKt.f6046f);
        x1 x1Var = n.f135158a;
        a4 a4Var = (a4) mVar.A(t1.f91502t);
        boolean zB = mVar.B(view2) | mVar.B(a4Var);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new w2(view2, a4Var.f());
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new w2(view2, a4Var.f());
                mVar.K(objQ);
            }
        }
        return (w2) objQ;
    }
}
