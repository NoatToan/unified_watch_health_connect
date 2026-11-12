package w52;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {
    public static final void a(com.garmin.android.apps.connectmobile.workouts.presentation.edit.k kVar, String str, String str2, e23.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1715174822);
        if ((i14 & 48) == 0) {
            i16 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1169) != 1168)) {
            if (i17 != 0) {
                str2 = null;
            }
            if (i18 != 0) {
                aVar = null;
            }
            p3.x1 x1Var = p3.n.f135158a;
            c(str, str2, aVar, o0VarE, (i16 >> 3) & 1022);
        } else {
            o0VarE.e();
        }
        String str3 = str2;
        e23.a aVar2 = aVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(i14, i15, 27, kVar, str, str3, aVar2);
        }
    }

    public static final void b(v0 v0Var, String str, p3.m mVar, int i14) {
        int i15;
        v0Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-594031947);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            c(str, null, null, o0VarE, ((i15 >> 3) & 14) | 432);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(v0Var, str, i14, 5);
        }
    }

    public static final void c(String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-676791192);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            float f16 = eVar.f97920e;
            int i16 = i15;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            bVar.getClass();
            h4.r rVarZ = c2.l.z(aVar2, f16, f15);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, i16 & 14, 0, 131068);
            o0Var = o0VarE;
            if (str2 == null || aVar == null) {
                o0Var.C(-590305218);
                o0Var.g0(false);
            } else {
                o0Var.C(-590634190);
                h4.r rVarD = u1.w.d(aVar2, false, null, null, aVar, 15);
                bVar.getClass();
                bVar.getClass();
                h4.r rVarZ2 = c2.l.z(rVarD, f16, f15);
                fVar.getClass();
                mh.c(str2, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, (i16 >> 3) & 14, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.d(str, str2, aVar, i14, 2);
        }
    }
}
