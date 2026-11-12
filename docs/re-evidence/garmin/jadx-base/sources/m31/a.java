package m31;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import d92.b;
import d92.c;
import h4.g;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import j92.e;
import j92.f;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import tn.k;
import u1.w;
import u4.d;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:46:0x0209  */
    public static final void a(String str, String str2, String str3, d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1172840824);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(dVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.d(aVar2, 1.0f), k.b(b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            r rVarY = l.y(rVarE, eVar.f97920e);
            h4.d.f81522a.getClass();
            g.a aVar3 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            long jB = b.a(o0VarE).f().b();
            bVar.getClass();
            i7.b(dVar, null, x2.q(aVar2, j92.b.f97901d.f97906e), jB, o0VarE, ((i15 >> 9) & 14) | 48, 0);
            f fVar = b.f58624b;
            fVar.getClass();
            x0 x0VarB = c.b(f.f97930g, o0VarE);
            bVar.getClass();
            mh.c(str, l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 131068);
            fVar.getClass();
            x0 x0Var = f.f97931h;
            x0 x0VarF = c.f(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            bVar.getClass();
            mh.c(str2, l.C(aVar2, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i15 >> 3) & 14, 0, 130044);
            fVar.getClass();
            x0 x0VarA = x0.a(x0Var, b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            bVar.getClass();
            r rVarC2 = l.C(aVar2, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            boolean z14 = (57344 & i15) == 16384;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ll0.a(aVar, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ll0.a(aVar, 8);
                    o0VarE.K(objQ);
                }
            }
            mh.c(str3, w.d(rVarC2, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, (i15 >> 6) & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(str, str2, str3, dVar, aVar, i14, 23);
        }
    }
}
