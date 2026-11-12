package s5;

import o4.q1;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157328a;

        static {
            int[] iArr = new int[g6.o.values().length];
            try {
                iArr[g6.o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g6.o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157328a = iArr;
        }
    }

    public static final x0 a(x0 x0Var, g6.o oVar) {
        int i14;
        int i15;
        float f14;
        i0 i0Var = x0Var.f157322a;
        d6.l lVar = j0.f157231d;
        d6.l lVarC = i0Var.f157211a.c(new ro0.h(18));
        long j8 = i0Var.fontSize;
        g6.q.a aVar = g6.q.f76018b;
        if ((j8 & 1095216660480L) == 0) {
            j8 = j0.f157228a;
        }
        long j14 = j8;
        w5.f0 f0Var = i0Var.fontWeight;
        if (f0Var == null) {
            w5.f0.f182097b.getClass();
            f0Var = w5.f0.f182102g;
        }
        w5.f0 f0Var2 = f0Var;
        w5.b0 b0Var = i0Var.fontStyle;
        if (b0Var != null) {
            i14 = b0Var.f182072a;
        } else {
            w5.b0.f182070b.getClass();
            i14 = 0;
        }
        w5.b0 b0VarA = w5.b0.a(i14);
        w5.c0 c0Var = i0Var.fontSynthesis;
        if (c0Var != null) {
            i15 = c0Var.f182079a;
        } else {
            w5.c0.f182075b.getClass();
            i15 = w5.c0.f182078e;
        }
        w5.c0 c0VarA = w5.c0.a(i15);
        w5.q qVar = i0Var.fontFamily;
        if (qVar == null) {
            w5.q.f182149a.getClass();
            qVar = w5.q.f182150b;
        }
        w5.q qVar2 = qVar;
        String str = i0Var.fontFeatureSettings;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j15 = i0Var.letterSpacing;
        if ((j15 & 1095216660480L) == 0) {
            j15 = j0.f157229b;
        }
        long j16 = j15;
        d6.a aVar2 = i0Var.baselineShift;
        float f15 = 0.0f;
        if (aVar2 != null) {
            f14 = aVar2.f57704a;
        } else {
            d6.a.f57703b.getClass();
            f14 = 0.0f;
        }
        if (Float.isNaN(f14)) {
            d6.a.f57703b.getClass();
        } else {
            f15 = f14;
        }
        d6.a aVarA = d6.a.a(f15);
        d6.m mVar = i0Var.textGeometricTransform;
        if (mVar == null) {
            d6.m.f57775c.getClass();
            mVar = d6.m.f57776d;
        }
        d6.m mVar2 = mVar;
        z5.c cVarA = i0Var.localeList;
        if (cVarA == null) {
            z5.c.f202441c.getClass();
            cVarA = z5.d.f202445a.a();
        }
        z5.c cVar = cVarA;
        long j17 = i0Var.f157222l;
        if (j17 == 16) {
            j17 = j0.f157230c;
        }
        long j18 = j17;
        d6.i iVar = i0Var.background;
        if (iVar == null) {
            d6.i.f57760b.getClass();
            iVar = d6.i.f57761c;
        }
        d6.i iVar2 = iVar;
        q1 q1Var = i0Var.shadow;
        if (q1Var == null) {
            q1.f128956d.getClass();
            q1Var = q1.f128957e;
        }
        q1 q1Var2 = q1Var;
        b0 b0Var2 = i0Var.platformStyle;
        q4.g gVar = i0Var.drawStyle;
        if (gVar == null) {
            gVar = q4.j.f142560a;
        }
        i0 i0Var2 = new i0(lVarC, j14, f0Var2, b0VarA, c0VarA, qVar2, str2, j16, aVarA, mVar2, cVar, j18, iVar2, q1Var2, b0Var2, gVar, (p005kotlin.jvm.internal.j) null);
        w wVar = x0Var.f157323b;
        int i16 = x.f157319b;
        int i17 = wVar.f157306a;
        int i18 = wVar.f157313h;
        int i19 = wVar.f157312g;
        d6.h.f57752b.getClass();
        int i24 = i17 == 0 ? d6.h.f57757g : wVar.f157306a;
        int i25 = wVar.f157307b;
        d6.j.f57765b.getClass();
        if (i25 == d6.j.f57768e) {
            int i26 = a.f157328a[oVar.ordinal()];
            if (i26 == 1) {
                i25 = d6.j.f57769f;
            } else {
                if (i26 != 2) {
                    lc.u0.r();
                    return null;
                }
                i25 = d6.j.f57770g;
            }
        } else if (i25 == 0) {
            int i27 = a.f157328a[oVar.ordinal()];
            if (i27 == 1) {
                i25 = d6.j.f57766c;
            } else {
                if (i27 != 2) {
                    lc.u0.r();
                    return null;
                }
                i25 = d6.j.f57767d;
            }
        }
        int i28 = i25;
        long j19 = wVar.f157308c;
        if ((j19 & 1095216660480L) == 0) {
            j19 = x.f157318a;
        }
        d6.n nVar = wVar.f157309d;
        if (nVar == null) {
            d6.n.f57779c.getClass();
            nVar = d6.n.f57780d;
        }
        d6.n nVar2 = nVar;
        a0 a0Var = wVar.f157310e;
        d6.f fVar = wVar.f157311f;
        d6.e.f57712b.getClass();
        if (i19 == 0) {
            i19 = d6.e.f57713c;
        }
        int i29 = i19;
        d6.d.f57708b.getClass();
        if (i18 == 0) {
            i18 = d6.d.f57709c;
        }
        int i30 = i18;
        d6.o oVar2 = wVar.f157314i;
        if (oVar2 == null) {
            d6.o.f57783c.getClass();
            oVar2 = d6.o.f57784d;
        }
        return new x0(i0Var2, new w(i24, i28, j19, nVar2, a0Var, fVar, i29, i30, oVar2, (p005kotlin.jvm.internal.j) null), x0Var.platformStyle);
    }
}
