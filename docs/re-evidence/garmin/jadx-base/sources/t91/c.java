package t91;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv0.i;
import c2.j;
import c2.l;
import c2.s2;
import c2.u2;
import c2.x2;
import g6.f;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.p7;
import j92.e;
import o4.d0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import rx1.u;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(r rVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1367426272);
        int i15 = i14 | 6 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            rVar = r.S;
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            r rVarY = l.y(rVarF, eVar.f97920e);
            d.f81522a.getClass();
            g.b bVar2 = d.a.f81534l;
            j jVar = j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar, eVar.f97920e, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            y3 y3Var = p7.f89282d;
            f.f75994b.getClass();
            v.a(y3Var.c(f.a(f.f75996d)), z3.f.c(2033470788, new u(aVar, 25, u2Var, aVar2), o0VarE), o0VarE, 56);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, aVar, aVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    public static final void b(mc mcVar, i53.c cVar, r rVar, q91.b bVar, e23.a aVar, e23.l lVar, m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        mcVar.getClass();
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1445910609);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | 384 | (o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            r.a aVar2 = r.S;
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int iIndexOf = cVar.indexOf(bVar);
            if (iIndexOf == -1) {
                iIndexOf = 0;
            }
            Object[] objArr = new Object[0];
            boolean zK = o0VarE.k(iIndexOf);
            Object objQ = o0VarE.q();
            if (zK) {
                objQ = new a51.c(iIndexOf, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a51.c(iIndexOf, 9);
                    o0VarE.K(objQ);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            d0.f128823b.getClass();
            o0Var = o0VarE;
            e9.a(aVar, aVar2, mcVar, 0.0f, false, null, d0.f128831j, ds.e0.d(d92.b.f58623a, o0VarE), 0.0f, 0L, null, new t21.c((byte) 0, 29), null, z3.f.c(1460609937, new i(aVar, cVar, n1Var, lVar, iIndexOf, context), o0VarE), o0Var, ((i15 >> 12) & 14) | 1572912 | ((i15 << 6) & 896), 3078, 4920);
            rVar2 = aVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(mcVar, cVar, rVar2, bVar, aVar, lVar, i14, 29);
        }
    }
}
