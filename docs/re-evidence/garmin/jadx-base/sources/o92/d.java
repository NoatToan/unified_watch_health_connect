package o92;

import e23.l;
import f5.g0;
import h4.r;
import lc.u0;
import ls0.h;
import mw0.i;
import n23.j;
import o72.z0;
import p3.m;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import q4.f;
import q4.g;
import q4.k;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131010a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.DIAMOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f131010a = iArr;
        }
    }

    public static final void a(b bVar, r rVar, m mVar, int i14) {
        rVar.getClass();
        o0 o0VarE = mVar.E(-1964692954);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16) | 384;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = j.o(0.0f, o0VarE);
            }
            m1 m1Var = (m1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = j.o(0.0f, o0VarE);
            }
            m1 m1Var2 = (m1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new fs.c(m1Var, m1Var2, 1);
                o0VarE.K(objQ3);
            }
            r rVarG = g0.g(rVar, (l) objQ3);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new z0(22);
                o0VarE.K(objQ4);
            }
            r rVarC = v.c((l) objQ4, rVarG, false);
            boolean z14 = (i15 & 14) == 4;
            Object objQ5 = o0VarE.q();
            if (z14 || objQ5 == c2565a) {
                objQ5 = new h(bVar, 20, m1Var, m1Var2);
                o0VarE.K(objQ5);
            }
            u1.n.b(rVarC, (l) objQ5, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(bVar, rVar, i14, 26);
        }
    }

    public static final void b(f fVar, float f14, float f15, b bVar, float f16, float f17) {
        fVar.getClass();
        bVar.getClass();
        e eVar = bVar.f131004a;
        o4.j jVarB = c.b(f14, f15, eVar, f16, f17);
        c(fVar, f14, f15, bVar.f131004a, jVarB, bVar.f131005b, f16, f17, q4.j.f142560a);
        o92.a aVar = bVar.f131006c;
        if (aVar != null) {
            c(fVar, f14, f15, eVar, jVarB, aVar.f131002a, f16, f17, new k(aVar.f131003b, 0.0f, 0, 0, null, 30, null));
        }
    }

    public static final void c(f fVar, float f14, float f15, e eVar, o4.j jVar, long j8, float f16, float f17, g gVar) {
        fVar.getClass();
        eVar.getClass();
        gVar.getClass();
        int i14 = a.f131010a[eVar.ordinal()];
        if (i14 == 1) {
            float f18 = 2;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14 - (f16 / f18))) << 32) | (((long) Float.floatToRawIntBits(f15 - (f17 / f18))) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f16)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f17)));
            n4.g.a aVar2 = n4.g.f123559b;
            f.A0(fVar, j8, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, gVar, null, 104);
            return;
        }
        if (i14 == 2) {
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f15)));
            n4.c.a aVar3 = n4.c.f123541b;
            f.o0(fVar, j8, f16 / 2, jFloatToRawIntBits3, gVar, 0, 104);
            return;
        }
        if (i14 == 3) {
            f.L(fVar, jVar, j8, 0.0f, gVar, 52);
        } else if (i14 == 4) {
            f.L(fVar, jVar, j8, 0.0f, gVar, 52);
        } else {
            u0.r();
        }
    }
}
