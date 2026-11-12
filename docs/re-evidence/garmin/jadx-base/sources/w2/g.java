package w2;

import lc.u0;
import p006l2.l1;
import s5.q0;
import s5.w0;
import v2.g2;
import v2.h2;
import z2.p1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181333a;

        static {
            int[] iArr = new int[l1.values().length];
            try {
                iArr[l1.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l1.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f181333a = iArr;
        }
    }

    public static final long a(h2 h2Var, n nVar, g2 g2Var, long j8) {
        long j14;
        long jS = nVar.s();
        if ((9223372034707292159L & jS) == 9205357640488583168L || h2Var.d().f167839c.length() == 0) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        long j15 = h2Var.d().f167840d;
        l1 l1VarQ = nVar.q();
        int i14 = l1VarQ == null ? -1 : a.f181333a[l1VarQ.ordinal()];
        if (i14 == -1) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        if (i14 == 1 || i14 == 2) {
            w0.a aVar = w0.f157315b;
            j14 = j15 >> 32;
        } else {
            if (i14 != 3) {
                u0.r();
                return 0L;
            }
            w0.a aVar2 = w0.f157315b;
            j14 = j15 & 4294967295L;
        }
        int i15 = (int) j14;
        q0 q0VarC = g2Var.c();
        if (q0VarC == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        s5.o oVar = q0VarC.f157281b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jS >> 32));
        int iD = oVar.d(i15);
        float fG = q0VarC.g(iD);
        float fH = q0VarC.h(iD);
        float fD = j23.t.d(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
        g6.m.f76012b.getClass();
        if (!g6.m.c(j8, 0L) && Math.abs(fIntBitsToFloat - fD) > ((int) (j8 >> 32)) / 2) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        float f14 = oVar.f(iD);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((oVar.b(iD) - f14) / 2) + f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(fD)) << 32);
        f5.c0 c0VarE = g2Var.e();
        n4.c cVarA = null;
        if (c0VarE != null) {
            if (!c0VarE.isAttached()) {
                c0VarE = null;
            }
            if (c0VarE != null) {
                jFloatToRawIntBits = v2.i.c(jFloatToRawIntBits, p1.c(c0VarE));
            }
        }
        f5.c0 c0VarE2 = g2Var.e();
        if (c0VarE2 == null) {
            return jFloatToRawIntBits;
        }
        if (!c0VarE2.isAttached()) {
            c0VarE2 = null;
        }
        if (c0VarE2 == null) {
            return jFloatToRawIntBits;
        }
        f5.c0 c0Var = (f5.c0) g2Var.f174999e.getF182175a();
        if (c0Var != null) {
            if (!c0Var.isAttached()) {
                c0Var = null;
            }
            if (c0Var != null) {
                cVarA = n4.c.a(c0Var.b0(c0VarE2, jFloatToRawIntBits));
            }
        }
        return cVarA != null ? cVarA.f123544a : jFloatToRawIntBits;
    }
}
