package p008y1;

import b5.a0;
import b5.q;
import java.util.List;
import n4.c;

/* JADX INFO: loaded from: classes.dex */
public final class w3 {
    public static final float a(long j8) {
        int i14 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i14) == 0.0f && Float.intBitsToFloat((int) (j8 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j8 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long b(q qVar, boolean z14) {
        c.f123541b.getClass();
        List<a0> list = qVar.f15870a;
        int size = list.size();
        long j8 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            a0 a0Var = list.get(i15);
            if (a0Var.f15751d && a0Var.f15755h) {
                j8 = c.j(j8, z14 ? a0Var.f15750c : a0Var.f15754g);
                i14++;
            }
        }
        if (i14 != 0) {
            return c.c(i14, j8);
        }
        c.f123541b.getClass();
        return c.f123543d;
    }

    public static final float c(q qVar, boolean z14) {
        long jB = b(qVar, z14);
        c.f123541b.getClass();
        float fE = 0.0f;
        if (c.d(jB, c.f123543d)) {
            return 0.0f;
        }
        List<a0> list = qVar.f15870a;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            a0 a0Var = list.get(i15);
            if (a0Var.f15751d && a0Var.f15755h) {
                i14++;
                fE = c.e(c.i(z14 ? a0Var.f15750c : a0Var.f15754g, jB)) + fE;
            }
        }
        return fE / i14;
    }

    public static final long d(q qVar) {
        long jB = b(qVar, true);
        c.a aVar = c.f123541b;
        aVar.getClass();
        if (!c.d(jB, c.f123543d)) {
            return c.i(jB, b(qVar, false));
        }
        aVar.getClass();
        return 0L;
    }

    public static final float e(q qVar) {
        List<a0> list = qVar.f15870a;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = 1;
            if (i14 >= size) {
                break;
            }
            a0 a0Var = list.get(i14);
            if (!a0Var.f15755h || !a0Var.f15751d) {
                i16 = 0;
            }
            i15 += i16;
            i14++;
        }
        if (i15 >= 2) {
            long jB = b(qVar, true);
            long jB2 = b(qVar, false);
            int size2 = list.size();
            float f14 = 0.0f;
            float f15 = 0.0f;
            for (int i17 = 0; i17 < size2; i17++) {
                a0 a0Var2 = list.get(i17);
                if (a0Var2.f15751d && a0Var2.f15755h) {
                    long j8 = a0Var2.f15750c;
                    long jI = c.i(a0Var2.f15754g, jB2);
                    long jI2 = c.i(j8, jB);
                    float fA = a(jI2) - a(jI);
                    float fE = c.e(c.j(jI2, jI)) / 2.0f;
                    if (fA > 180.0f) {
                        fA -= 360.0f;
                    } else if (fA < -180.0f) {
                        fA += 360.0f;
                    }
                    f15 += fA * fE;
                    f14 += fE;
                }
            }
            if (f14 != 0.0f) {
                return f15 / f14;
            }
        }
        return 0.0f;
    }
}
