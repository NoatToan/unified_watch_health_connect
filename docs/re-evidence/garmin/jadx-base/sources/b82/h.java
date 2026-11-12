package b82;

import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final void a(l72.f0 f0Var, h4.r rVar, l72.b2 b2Var, String str, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        p3.o0 o0Var;
        l72.b2 b2Var2;
        f0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1601970511);
        int i16 = (o0VarE.B(f0Var) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(b2Var == null ? -1 : b2Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        int i18 = i16 | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            l72.b2 b2Var3 = i17 != 0 ? l72.b2.XSMALL : b2Var;
            p3.x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            l72.f0 f0Var2 = l72.f0.f110999a;
            o0Var = o0VarE;
            f0Var.c(rVar, v62.i1.a(t62.b.f162798a), l72.c2.SECONDARY, b2Var3, false, str, null, aVar, o0Var, ((i18 >> 3) & 14) | 384 | ((i18 << 3) & 7168) | (458752 & (i18 << 6)) | ((i18 << 9) & 29360128) | ((i18 << 24) & 234881024), 80);
            b2Var2 = b2Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            b2Var2 = b2Var;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(f0Var, rVar, b2Var2, str, aVar, i14, i15, 1);
        }
    }

    public static final void b(l72.f0 f0Var, h4.r rVar, l72.b2 b2Var, String str, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        p3.o0 o0Var;
        l72.b2 b2Var2;
        f0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-869474650);
        int i16 = (o0VarE.B(f0Var) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(b2Var == null ? -1 : b2Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        int i18 = i16 | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            l72.b2 b2Var3 = i17 != 0 ? l72.b2.XSMALL : b2Var;
            p3.x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            l72.f0 f0Var2 = l72.f0.f110999a;
            o0Var = o0VarE;
            f0Var.c(rVar, v62.j1.a(t62.b.f162798a), l72.c2.SECONDARY, b2Var3, false, str, null, aVar, o0Var, ((i18 >> 3) & 14) | 384 | ((i18 << 3) & 7168) | (458752 & (i18 << 6)) | ((i18 << 9) & 29360128) | ((i18 << 24) & 234881024), 80);
            b2Var2 = b2Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            b2Var2 = b2Var;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(f0Var, rVar, b2Var2, str, aVar, i14, i15, 0);
        }
    }
}
