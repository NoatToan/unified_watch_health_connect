package qx1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.Locale;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static final void a(r rVar, String str, i53.c<dy1.h> cVar, e23.p<? super String, ? super Boolean, Unit> pVar, e23.l<? super String, Unit> lVar, p3.m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        e23.l<? super String, Unit> lVar2;
        int i17;
        e23.l<? super String, Unit> lVar3;
        e23.l<? super String, Unit> lVar4;
        str.getClass();
        cVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-697872948);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i19 = i16 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024);
        int i24 = i15 & 16;
        if (i24 != 0) {
            i17 = i19 | 24576;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i17 = i19 | (o0VarE.r(lVar2) ? 16384 : 8192);
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            r rVar3 = i18 != 0 ? r.S : rVar2;
            if (i24 != 0) {
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new qv1.l(5);
                    o0VarE.K(objQ);
                }
                lVar4 = (e23.l) objQ;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            int i25 = i17;
            r rVar4 = rVar3;
            mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.C(-403746176);
            Iterator<dy1.h> it = cVar.iterator();
            while (it.hasNext()) {
                q.a(it.next(), pVar, lVar4, o0VarE, (i25 >> 6) & 1008, 0);
            }
            lVar3 = lVar4;
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = rVar4;
        } else {
            o0VarE.e();
            lVar3 = lVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a12.b(rVar2, str, cVar, pVar, lVar3, i14, i15);
        }
    }
}
