package ek0;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import dk0.f;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i53.c;
import j92.e;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.q2;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(c<bk0.a> cVar, f fVar, m mVar, int i14) {
        f fVar2;
        cVar.getClass();
        fVar.getClass();
        o0 o0VarE = mVar.E(1185943694);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.B(fVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarC = x2.c(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97921f;
            r rVarD = l.D(l.A(rVarC, f14, 0.0f, 2));
            j.i iVarG = q2.g(bVar, j.f22691a, f15);
            d.f81522a.getClass();
            z zVarA = y.a(iVarG, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarD, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            tn.k.n(bVar, aVar, f15, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.with_gcplus);
            bk0.b bVar3 = bk0.b.CHECK_MARK;
            d92.b.f58624b.getClass();
            bk0.c.a(strQ, cVar, bVar3, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, ((i15 << 3) & 112) | 384, 0);
            o0VarE = o0VarE;
            d6.h.f57752b.getClass();
            fVar2 = fVar;
            dk0.a.a(null, fVar2, d6.h.f57757g, o0VarE, i15 & 112, 1);
            o0VarE.g0(true);
        } else {
            fVar2 = fVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(cVar, fVar2, i14, 17);
        }
    }
}
