package p008y1;

import c5.e;
import java.util.ArrayList;
import n4.c;
import p13.h0;
import y4.b;
import y4.d;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final void a(e eVar, d dVar, b2 b2Var, b bVar, k1 k1Var, long j8) {
        float fIntBitsToFloat;
        ArrayList arrayList = k1Var.f193354b;
        long j14 = dVar.f194384c;
        boolean z14 = dVar.f194385d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (dVar.f194384c & 4294967295L));
        boolean z15 = dVar.f194389h;
        if (!z15 && z14) {
            k1Var.f193353a = 0;
            arrayList.clear();
        }
        if (!b(dVar) && (z15 || !z14)) {
            if (arrayList.size() == 3) {
                int i14 = k1Var.f193353a;
                k1Var.f193353a = i14 + 1;
                arrayList.set(i14, dVar);
            } else {
                arrayList.add(dVar);
            }
            if (k1Var.f193353a == 3) {
                k1Var.f193353a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((d) arrayList.get(i15)).f194384c >> 32))));
            }
            fIntBitsToFloat2 = (float) h0.O(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((d) arrayList.get(i16)).f194384c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) h0.O(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        c.a aVar = c.f123541b;
        if (b2Var != null) {
            b.f194373b.getClass();
            int i17 = b.f194374c;
            int i18 = bVar.f194376a;
            if (i18 == i17) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i18 == b.f194375d) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = b2Var == b2.Horizontal ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        eVar.f24464a.a(dVar.f194383b, c.j(jFloatToRawIntBits, j8));
    }

    public static final boolean b(d dVar) {
        return dVar.f194389h && !dVar.f194385d;
    }

    public static final long c(d dVar, b2 b2Var, b bVar) {
        float fIntBitsToFloat;
        if (b2Var == null) {
            return dVar.f194384c;
        }
        b.f194373b.getClass();
        int i14 = b.f194374c;
        int i15 = bVar.f194376a;
        if (i15 == i14) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f194384c >> 32));
        } else {
            if (i15 != b.f194375d) {
                return dVar.f194384c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f194384c & 4294967295L));
        }
        if (b2Var == b2.Horizontal) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            c.a aVar = c.f123541b;
            return jFloatToRawIntBits;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        c.a aVar2 = c.f123541b;
        return jFloatToRawIntBits2;
    }

    public static final long d(d dVar, b2 b2Var, b bVar) {
        float fIntBitsToFloat;
        long j8 = dVar.f194388g;
        if (b2Var == null) {
            return j8;
        }
        b.f194373b.getClass();
        int i14 = b.f194374c;
        int i15 = bVar.f194376a;
        if (i15 == i14) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        } else {
            if (i15 != b.f194375d) {
                return j8;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        if (b2Var == b2.Horizontal) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            c.a aVar = c.f123541b;
            return jFloatToRawIntBits;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        c.a aVar2 = c.f123541b;
        return jFloatToRawIntBits2;
    }
}
