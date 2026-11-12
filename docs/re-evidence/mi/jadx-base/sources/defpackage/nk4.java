package defpackage;

import android.util.Pair;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class nk4 {
    public static int a(s7d s7dVar, int i) {
        if (s7dVar == null) {
            return 0;
        }
        return s7dVar.f() == Orientation.HORIZONTAL ? e(s7dVar, i) : f(s7dVar, i);
    }

    public static int b(s7d s7dVar, int i) {
        int iC = s7dVar.c();
        int iL = s7dVar.l();
        int iR = s7dVar.r();
        int iG = s7dVar.g();
        int i2 = 0;
        for (int i3 = 0; i3 < iC; i3++) {
            int i4 = iR / 2;
            int i5 = i2 + iL + i4;
            if (i == i3) {
                return i5;
            }
            i2 = i5 + iL + iG + i4;
        }
        return s7dVar.b() == AnimationType.DROP ? i2 + (iL * 2) : i2;
    }

    public static Pair<Integer, Float> c(s7d s7dVar, int i, float f, boolean z) {
        int iC = s7dVar.c();
        int iP = s7dVar.p();
        if (z) {
            i = (iC - 1) - i;
        }
        boolean z2 = false;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = iC - 1;
            if (i > i2) {
                i = i2;
            }
        }
        boolean z3 = i > iP;
        if (!z ? i + 1 < iP : i - 1 < iP) {
            z2 = true;
        }
        if (z3 || z2) {
            s7dVar.T(i);
            iP = i;
        }
        float f2 = 1.0f;
        if (iP != i || f == 0.0f) {
            f = 1.0f - f;
        } else {
            i = z ? i - 1 : i + 1;
        }
        if (f <= 1.0f) {
            f2 = f < 0.0f ? 0.0f : f;
        }
        return new Pair<>(Integer.valueOf(i), Float.valueOf(f2));
    }

    public static int d(s7d s7dVar) {
        int iL = s7dVar.l();
        return s7dVar.b() == AnimationType.DROP ? iL * 3 : iL;
    }

    public static int e(s7d s7dVar, int i) {
        if (s7dVar == null) {
            return 0;
        }
        return (s7dVar.f() == Orientation.HORIZONTAL ? b(s7dVar, i) : d(s7dVar)) + s7dVar.i();
    }

    public static int f(s7d s7dVar, int i) {
        if (s7dVar == null) {
            return 0;
        }
        return (s7dVar.f() == Orientation.HORIZONTAL ? d(s7dVar) : b(s7dVar, i)) + s7dVar.k();
    }
}
