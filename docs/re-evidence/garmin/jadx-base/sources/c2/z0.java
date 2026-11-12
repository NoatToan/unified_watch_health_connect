package c2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface z0 extends o2 {
    @Override // c2.o2
    default int a(f5.v1 v1Var) {
        return isHorizontal() ? v1Var.m0() : v1Var.n0();
    }

    @Override // c2.o2
    default int b(f5.v1 v1Var) {
        return isHorizontal() ? v1Var.n0() : v1Var.m0();
    }

    @Override // c2.o2
    default long d(int i14, int i15, int i16, int i17, boolean z14) {
        if (isHorizontal()) {
            s2 s2Var = q2.f22847a;
            if (!z14) {
                return g6.b.a(i14, i16, i15, i17);
            }
            g6.a.f75987b.getClass();
            return g6.a.C1525a.b(i14, i16, i15, i17);
        }
        z zVar = y.f22939a;
        if (!z14) {
            return g6.b.a(i15, i17, i14, i16);
        }
        g6.a.f75987b.getClass();
        return g6.a.C1525a.a(i15, i17, i14, i16);
    }

    @Override // c2.o2
    default f5.a1 e(final f5.v1[] v1VarArr, f5.b1 b1Var, final int i14, final int[] iArr, int i15, final int i16, final int[] iArr2, final int i17, final int i18, final int i19) {
        int i24;
        int i25;
        if (isHorizontal()) {
            i25 = i15;
            i24 = i16;
        } else {
            i24 = i15;
            i25 = i16;
        }
        final g6.o f69049a = isHorizontal() ? g6.o.Ltr : b1Var.getF69049a();
        return f5.b1.h0(b1Var, i25, i24, new e23.l() { // from class: c2.y0
            @Override // e23.l
            public final Object invoke(Object obj) {
                f0 f0VarM;
                f5.v1.a aVar = (f5.v1.a) obj;
                int[] iArr3 = iArr2;
                int i26 = iArr3 != null ? iArr3[i17] : 0;
                int i27 = i18;
                for (int i28 = i27; i28 < i19; i28++) {
                    f5.v1 v1Var = v1VarArr[i28];
                    v1Var.getClass();
                    z0 z0Var = this;
                    z0Var.getClass();
                    Object a14 = v1Var.getA();
                    p2 p2Var = a14 instanceof p2 ? (p2) a14 : null;
                    if (p2Var == null || (f0VarM = p2Var.f22813c) == null) {
                        f0VarM = z0Var.m();
                    }
                    int iA = f0VarM.a(i16, f69049a, v1Var, i14) + i26;
                    boolean zIsHorizontal = z0Var.isHorizontal();
                    int[] iArr4 = iArr;
                    if (zIsHorizontal) {
                        aVar.r(v1Var, iArr4[i28 - i27], iA, 0.0f);
                    } else {
                        aVar.r(v1Var, iA, iArr4[i28 - i27], 0.0f);
                    }
                }
                return Unit.INSTANCE;
            }
        });
    }

    boolean isHorizontal();

    @Override // c2.o2
    default void j(int i14, int[] iArr, int[] iArr2, f5.b1 b1Var) {
        if (isHorizontal()) {
            l().b(b1Var, i14, iArr, b1Var.getF69049a(), iArr2);
        } else {
            k().c(b1Var, i14, iArr, iArr2);
        }
    }

    j.l k();

    j.e l();

    f0 m();
}
