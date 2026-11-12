package o4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public static final c a(f fVar) {
        Canvas canvas = d.f128822a;
        c cVar = new c();
        cVar.f128816a = new Canvas(g.a(fVar));
        return cVar;
    }

    public static final long b(float f14, float f15) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        z1.a aVar = z1.f129046b;
        return jFloatToRawIntBits;
    }

    public static final boolean c(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final q1 d(q1 q1Var, q1 q1Var2, float f14) {
        return new q1(f0.h(q1Var.f128958a, q1Var2.f128958a, f14), gl1.y.C(q1Var.f128959b, q1Var2.f128959b, f14), gl.b.J(q1Var.f128960c, q1Var2.f128960c, f14), null);
    }

    public static final void e(float[] fArr, Matrix matrix) {
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[2];
        float f17 = fArr[3];
        float f18 = fArr[4];
        float f19 = fArr[5];
        float f22 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = fArr[12];
        float f27 = fArr[13];
        float f28 = fArr[15];
        fArr[0] = f14;
        fArr[1] = f18;
        fArr[2] = f26;
        fArr[3] = f15;
        fArr[4] = f19;
        fArr[5] = f27;
        fArr[6] = f17;
        fArr[7] = f24;
        fArr[8] = f28;
        matrix.setValues(fArr);
        fArr[0] = f14;
        fArr[1] = f15;
        fArr[2] = f16;
        fArr[3] = f17;
        fArr[4] = f18;
        fArr[5] = f19;
        fArr[6] = f22;
        fArr[7] = f24;
        fArr[8] = f25;
    }

    public static final void f(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[2];
        float f17 = fArr[3];
        float f18 = fArr[4];
        float f19 = fArr[5];
        float f22 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        fArr[0] = f14;
        fArr[1] = f17;
        fArr[2] = 0.0f;
        fArr[3] = f22;
        fArr[4] = f15;
        fArr[5] = f18;
        fArr[6] = 0.0f;
        fArr[7] = f24;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f16;
        fArr[13] = f19;
        fArr[14] = 0.0f;
        fArr[15] = f25;
    }

    public static final Rect g(g6.l lVar) {
        return new Rect(lVar.f76008a, lVar.f76009b, lVar.f76010c, lVar.f76011d);
    }

    @o13.e
    public static final Rect h(n4.d dVar) {
        return new Rect((int) dVar.f123547a, (int) dVar.f123548b, (int) dVar.f123549c, (int) dVar.f123550d);
    }

    public static final RectF i(n4.d dVar) {
        return new RectF(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d);
    }

    public static final n4.d j(Rect rect) {
        return new n4.d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final n4.d k(RectF rectF) {
        return new n4.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final int l(float[] fArr, float f14, int i14) {
        float f15 = f14 >= 0.0f ? f14 : 0.0f;
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        if (Math.abs(f15 - f14) > 1.05E-6f) {
            f15 = Float.NaN;
        }
        fArr[i14] = f15;
        return !Float.isNaN(f15) ? 1 : 0;
    }
}
