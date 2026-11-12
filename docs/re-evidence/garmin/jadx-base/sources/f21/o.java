package f21;

import c2.x2;
import i3.e5;
import i3.mh;
import java.util.Locale;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public static final void a(e23.p pVar, z3.e eVar, z3.e eVar2, e23.p pVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(413541094);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(552215120, new n(eVar2, pVar2), o0VarE), z3.f.c(-2137049706, new e11.c0(9, pVar, eVar), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(pVar, eVar, eVar2, pVar2, i14, 20);
        }
    }

    public static final void b(String str, String str2, i53.c cVar, z3.e eVar, z3.e eVar2, p3.m mVar, int i14) {
        cVar.getClass();
        p3.o0 o0VarE = mVar.E(1730346810);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            a(z3.f.c(1203369350, new b82.o(str, str2, 10), o0VarE), z3.f.c(-1031675449, new b82.p(cVar, 6), o0VarE), eVar, eVar2, o0VarE, 3510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p(str, str2, cVar, eVar, eVar2, i14, 4);
        }
    }

    public static final void c(String str, String str2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        h4.r.a aVar;
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(120540372);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (str != null) {
                o0VarE.C(456103089);
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                z14 = false;
                z15 = true;
                aVar = aVar2;
                mh.c(upperCase, x2.f(aVar2, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 48, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                aVar = aVar2;
                z14 = false;
                z15 = true;
                o0Var.C(456285028);
                o0Var.g0(false);
            }
            if (str2 != null) {
                o0Var.C(456332551);
                if (str != null) {
                    o0Var.C(456363303);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar, j92.b.f97899b.f97919d, o0Var, z14);
                } else {
                    o0Var.C(456452676);
                    o0Var.g0(z14);
                }
                String upperCase2 = str2.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                p3.o0 o0Var2 = o0Var;
                mh.c(upperCase2, x2.f(aVar, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97927d), o0Var), o0Var2, 48, 0, 131068);
                o0Var = o0Var2;
                o0Var.g0(z14);
            } else {
                o0Var.C(456667940);
                o0Var.g0(z14);
            }
            o0Var.g0(z15);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str, str2, i14, 11);
        }
    }
}
